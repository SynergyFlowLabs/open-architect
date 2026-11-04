package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public final class n0 implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127190b = "Value";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f127191a = GvrApi.nativeCreateValue();

    public final long a() {
        return GvrApi.nativeValueAsFlags(this.f127191a);
    }

    public final float b() {
        return GvrApi.nativeValueAsFloat(this.f127191a);
    }

    public final int c() {
        return GvrApi.nativeValueAsInt(this.f127191a);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        GvrApi.nativeDestroyValue(this.f127191a);
        this.f127191a = 0L;
    }

    public final void d(float[] fArr) {
        GvrApi.nativeValueAsMat4f(this.f127191a, fArr);
    }

    public final long e() {
        return GvrApi.nativeValueGetFlags(this.f127191a);
    }

    protected final void finalize() {
        if (this.f127191a != 0) {
            close();
        }
    }
}
