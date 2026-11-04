package com.google.vr.ndk.base;

/* JADX INFO: loaded from: classes5.dex */
public final class p implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f127199b = "Event";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f127200a = GvrApi.nativeCreateEvent();

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127201a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127202b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127203c = 3;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f127204d = 4;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f127205e = 5;

        private a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f127206a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f127207b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f127208c = 3;

        private b() {
        }
    }

    public final long a() {
        return GvrApi.nativeGetEventFlags(this.f127200a);
    }

    public final long b() {
        return GvrApi.nativeGetRecenterEventFlags(this.f127200a);
    }

    public final void c(float[] fArr) {
        GvrApi.nativeGetRecenterEventStartSpaceFromTrackingSpaceTransform(this.f127200a, fArr);
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        GvrApi.nativeDestroyEvent(this.f127200a);
        this.f127200a = 0L;
    }

    public final int d() {
        return GvrApi.nativeGetRecenterEventType(this.f127200a);
    }

    public final long e() {
        return GvrApi.nativeGetEventTimestamp(this.f127200a);
    }

    public final int f() {
        return GvrApi.nativeGetEventType(this.f127200a);
    }

    protected final void finalize() {
        if (this.f127200a != 0) {
            close();
        }
    }
}
