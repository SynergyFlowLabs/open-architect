package com.google.vr.ndk.base;

import android.os.Handler;
import android.view.Surface;

/* JADX INFO: loaded from: classes5.dex */
public class r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127248b = "r";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f127249a;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f127250a;

        a(u.a aVar) {
            this.f127250a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            Surface surfaceD = r.this.d();
            if (surfaceD == null || !surfaceD.isValid()) {
                String unused = r.f127248b;
            } else {
                this.f127250a.b(surfaceD);
            }
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u.a f127252a;

        b(r rVar, u.a aVar) {
            this.f127252a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f127252a.a();
        }
    }

    r(long j10) {
        this.f127249a = j10;
    }

    public int b() {
        return GvrApi.nativeExternalSurfaceGetId(this.f127249a);
    }

    long c() {
        return this.f127249a;
    }

    public Surface d() {
        return GvrApi.nativeExternalSurfaceGetSurface(this.f127249a);
    }

    public void e() {
        long j10 = this.f127249a;
        if (j10 != 0) {
            GvrApi.nativeExternalSurfaceDestroy(j10);
            this.f127249a = 0L;
        }
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127249a != 0) {
                e();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    r(GvrApi gvrApi, u.a aVar, Handler handler) {
        if (aVar == null) {
            throw new IllegalArgumentException("ExternalSurface creation requires a valid listener.");
        }
        if (handler != null) {
            long jNativeExternalSurfaceCreateWithListeners = GvrApi.nativeExternalSurfaceCreateWithListeners(gvrApi.v(), new a(aVar), new b(this, aVar), handler);
            this.f127249a = jNativeExternalSurfaceCreateWithListeners;
            if (jNativeExternalSurfaceCreateWithListeners == 0) {
                throw new IllegalStateException("ExternalSurface creation failed. Is reprojection enabled?");
            }
            return;
        }
        throw new IllegalArgumentException("ExternalSurface creation requires a valid Handler.");
    }
}
