package com.google.vr.ndk.base;

import android.graphics.Point;

/* JADX INFO: loaded from: classes5.dex */
public class d {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127023b = "d";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f127024a;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127025a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127026b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127027c = 2;
    }

    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127028a = 255;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127029b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127030c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127031d = 2;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127032e = 3;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127033f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f127034g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f127035h = 6;
    }

    d(long j10) {
        this.f127024a = j10;
    }

    public static boolean c(int i10) {
        return i10 >= 0 && i10 < 2;
    }

    public static boolean d(int i10) {
        if (i10 != 255) {
            return i10 >= 0 && i10 < 6;
        }
        return true;
    }

    public int a() {
        return GvrApi.nativeBufferSpecGetSamples(this.f127024a);
    }

    public void b(Point point) {
        GvrApi.nativeBufferSpecGetSize(this.f127024a, point);
    }

    public void e(int i10) {
        if (!c(i10)) {
            throw new IllegalArgumentException("Invalid color format.");
        }
        GvrApi.nativeBufferSpecSetColorFormat(this.f127024a, i10);
    }

    public void f(int i10) {
        if (!d(i10)) {
            throw new IllegalArgumentException("Invalid depth-stencil format.");
        }
        GvrApi.nativeBufferSpecSetDepthStencilFormat(this.f127024a, i10);
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127024a != 0) {
                j();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public void g(int i10) {
        GvrApi.nativeBufferSpecSetMultiviewLayers(this.f127024a, i10);
    }

    public void h(int i10) {
        GvrApi.nativeBufferSpecSetSamples(this.f127024a, i10);
    }

    public void i(Point point) {
        GvrApi.nativeBufferSpecSetSize(this.f127024a, point.x, point.y);
    }

    public void j() {
        long j10 = this.f127024a;
        if (j10 != 0) {
            GvrApi.nativeBufferSpecDestroy(j10);
            this.f127024a = 0L;
        }
    }
}
