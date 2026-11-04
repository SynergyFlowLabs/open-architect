package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ReadOnlyBufferException;

/* JADX INFO: loaded from: classes4.dex */
public class Renderer {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f104163f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f104164g = 2;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f104165h = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Engine f104166a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f104167b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private b f104168c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f104169d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private a f104170e;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public float[] f104171a = {0.0f, 0.0f, 0.0f, 0.0f};

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f104172b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f104173c = true;
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104174a = 60.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Deprecated
        public long f104175b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Deprecated
        public long f104176c = 0;
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104177a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104178b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104179c = 0.06666667f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104180d = 15;
    }

    Renderer(@NonNull Engine engine, long j10) {
        this.f104166a = engine;
        this.f104167b = j10;
    }

    private static native boolean nBeginFrame(long j10, long j11, long j12);

    private static native void nCopyFrame(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18);

    private static native void nEndFrame(long j10);

    private static native double nGetUserTime(long j10);

    private static native int nReadPixels(long j10, long j11, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native int nReadPixelsEx(long j10, long j11, long j12, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native void nRender(long j10, long j11);

    private static native void nRenderStandaloneView(long j10, long j11);

    private static native void nResetUserTime(long j10);

    private static native void nSetClearOptions(long j10, float f10, float f11, float f12, float f13, boolean z10, boolean z11);

    private static native void nSetDisplayInfo(long j10, float f10);

    private static native void nSetFrameRateOptions(long j10, float f10, float f11, float f12, int i10);

    private static native void nSetPresentationTime(long j10, long j11);

    private static native void nSetVsyncTime(long j10, long j11);

    private static native void nSkipFrame(long j10, long j11);

    public boolean a(@NonNull SwapChain swapChain, long j10) {
        return nBeginFrame(i(), swapChain.b(), j10);
    }

    void b() {
        this.f104167b = 0L;
    }

    public void c(@NonNull SwapChain swapChain, @NonNull w wVar, @NonNull w wVar2, int i10) {
        nCopyFrame(i(), swapChain.b(), wVar.f105023a, wVar.f105024b, wVar.f105025c, wVar.f105026d, wVar2.f105023a, wVar2.f105024b, wVar2.f105025c, wVar2.f105026d, i10);
    }

    public void d() {
        nEndFrame(i());
    }

    @NonNull
    public a e() {
        if (this.f104170e == null) {
            this.f104170e = new a();
        }
        return this.f104170e;
    }

    @NonNull
    public b f() {
        if (this.f104168c == null) {
            this.f104168c = new b();
        }
        return this.f104168c;
    }

    @NonNull
    public Engine g() {
        return this.f104166a;
    }

    @NonNull
    public c h() {
        if (this.f104169d == null) {
            this.f104169d = new c();
        }
        return this.f104169d;
    }

    public long i() {
        long j10 = this.f104167b;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Renderer");
    }

    public double j() {
        return nGetUserTime(i());
    }

    @Deprecated
    public void k(@NonNull SwapChain swapChain, @NonNull w wVar, @NonNull w wVar2, int i10) {
        c(swapChain, wVar, wVar2, i10);
    }

    public void l(@g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @NonNull Texture.g gVar) {
        if (gVar.f104356a.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        long jI = i();
        long nativeObject = this.f104166a.getNativeObject();
        Buffer buffer = gVar.f104356a;
        if (nReadPixels(jI, nativeObject, i10, i11, i12, i13, buffer, buffer.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104361f, gVar.f104362g.ordinal(), gVar.f104365j, gVar.f104366k) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void m(@NonNull RenderTarget renderTarget, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @NonNull Texture.g gVar) {
        if (gVar.f104356a.isReadOnly()) {
            throw new ReadOnlyBufferException();
        }
        long jI = i();
        long nativeObject = this.f104166a.getNativeObject();
        long jM = renderTarget.m();
        Buffer buffer = gVar.f104356a;
        if (nReadPixelsEx(jI, nativeObject, jM, i10, i11, i12, i13, buffer, buffer.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104361f, gVar.f104362g.ordinal(), gVar.f104365j, gVar.f104366k) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void n(@NonNull View view) {
        nRender(i(), view.s());
    }

    public void o(@NonNull View view) {
        nRenderStandaloneView(i(), view.s());
    }

    public void p() {
        nResetUserTime(i());
    }

    public void q(@NonNull a aVar) {
        this.f104170e = aVar;
        long jI = i();
        float[] fArr = aVar.f104171a;
        nSetClearOptions(jI, fArr[0], fArr[1], fArr[2], fArr[3], aVar.f104172b, aVar.f104173c);
    }

    public void r(@NonNull b bVar) {
        this.f104168c = bVar;
        nSetDisplayInfo(i(), bVar.f104174a);
    }

    public void s(@NonNull c cVar) {
        this.f104169d = cVar;
        nSetFrameRateOptions(i(), cVar.f104177a, cVar.f104178b, cVar.f104179c, cVar.f104180d);
    }

    public void t(long j10) {
        nSetPresentationTime(i(), j10);
    }

    public void u(long j10) {
        nSetVsyncTime(i(), j10);
    }

    public void v(long j10) {
        nSkipFrame(i(), j10);
    }
}
