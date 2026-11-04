package com.google.vr.sdk.audio;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
public class GvrAudioSurround {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static UnsatisfiedLinkError f127447d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f127448e = "GvrAudioSurround";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f127449f = 2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f127450g = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f127451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f127452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f127453c;

    public static abstract class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127454a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127455b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127456c = 2;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127457d = 3;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127458e = 10;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f127459f = 4;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f127460g = 5;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f127461h = 6;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f127462i = 7;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final int f127463j = 8;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final int f127464k = 9;
    }

    static {
        try {
            System.loadLibrary("gvr_audio");
        } catch (UnsatisfiedLinkError e10) {
            f127447d = e10;
        }
    }

    public GvrAudioSurround(int i10, int i11, int i12, int i13) {
        this.f127451a = 0L;
        UnsatisfiedLinkError unsatisfiedLinkError = f127447d;
        if (unsatisfiedLinkError != null) {
            throw unsatisfiedLinkError;
        }
        this.f127451a = nativeInitialize(i10, i11, i12, i13);
        this.f127452b = i13;
        this.f127453c = i12;
    }

    private native int nativeAddInput(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private native void nativeFlush(long j10);

    private native int nativeGetAvailableInputSize(long j10);

    private native int nativeGetAvailableOutputSize(long j10);

    private native int nativeGetOutput(long j10, ByteBuffer byteBuffer, int i10, int i11);

    private native long nativeInitialize(int i10, int i11, int i12, int i13);

    private native void nativeRelease(long j10);

    private native void nativeSetOrientationQuaternion(long j10, float f10, float f11, float f12, float f13);

    private native boolean nativeTriggerProcessing(long j10);

    public int a(ByteBuffer byteBuffer, int i10, int i11) {
        return nativeAddInput(this.f127451a, byteBuffer, i10, i11);
    }

    public void b() {
        nativeFlush(this.f127451a);
    }

    public int c() {
        return nativeGetAvailableInputSize(this.f127451a);
    }

    public int d() {
        return nativeGetAvailableOutputSize(this.f127451a);
    }

    public int e(ByteBuffer byteBuffer, int i10, int i11) {
        return nativeGetOutput(this.f127451a, byteBuffer, i10, i11);
    }

    public void f() {
        nativeRelease(this.f127451a);
        this.f127451a = 0L;
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f127451a != 0) {
                f();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public boolean g() {
        return nativeTriggerProcessing(this.f127451a);
    }

    public void h(float f10, float f11, float f12, float f13) {
        nativeSetOrientationQuaternion(this.f127451a, f10, f11, f12, f13);
    }
}
