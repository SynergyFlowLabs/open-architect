package com.google.android.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class SwapChain {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f104214a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f104215b;

    SwapChain(long j10, Object obj) {
        this.f104215b = j10;
        this.f104214a = obj;
    }

    public static boolean d(@NonNull Engine engine) {
        return nIsProtectedContentSupported(engine.getNativeObject());
    }

    public static boolean e(@NonNull Engine engine) {
        return nIsSRGBSwapChainSupported(engine.getNativeObject());
    }

    private static native boolean nIsProtectedContentSupported(long j10);

    private static native boolean nIsSRGBSwapChainSupported(long j10);

    private static native void nSetFrameCompletedCallback(long j10, Object obj, Runnable runnable);

    void a() {
        this.f104215b = 0L;
    }

    public long b() {
        long j10 = this.f104215b;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed SwapChain");
    }

    public Object c() {
        return this.f104214a;
    }

    public void f(@NonNull Object obj, @NonNull Runnable runnable) {
        nSetFrameCompletedCallback(b(), obj, runnable);
    }
}
