package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class Stream {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b[] f104192c = b.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104193a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f104194b;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0953a f104195a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104196b;

        /* JADX INFO: renamed from: com.google.android.filament.Stream$a$a, reason: collision with other inner class name */
        private static class C0953a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104197a;

            C0953a(long j10) {
                this.f104197a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Stream.nDestroyBuilder(this.f104197a);
            }
        }

        public a() {
            long jNCreateBuilder = Stream.nCreateBuilder();
            this.f104196b = jNCreateBuilder;
            this.f104195a = new C0953a(jNCreateBuilder);
        }

        @NonNull
        public Stream a(@NonNull Engine engine) {
            long jNBuilderBuild = Stream.nBuilderBuild(this.f104196b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Stream(jNBuilderBuild, engine);
            }
            throw new IllegalStateException("Couldn't create Stream");
        }

        @NonNull
        public a b(int i10) {
            Stream.nBuilderHeight(this.f104196b, i10);
            return this;
        }

        @NonNull
        public a c(@NonNull Object obj) {
            if (n.a().i(obj)) {
                Stream.nBuilderStreamSource(this.f104196b, obj);
                return this;
            }
            throw new IllegalArgumentException("Invalid stream source: " + obj);
        }

        @NonNull
        public a d(int i10) {
            Stream.nBuilderWidth(this.f104196b, i10);
            return this;
        }
    }

    public enum b {
        NATIVE,
        ACQUIRED
    }

    Stream(long j10, Engine engine) {
        this.f104193a = j10;
        this.f104194b = engine.getNativeObject();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderStreamSource(long j10, Object obj);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetStreamType(long j10);

    private static native long nGetTimestamp(long j10);

    private static native int nReadPixels(long j10, long j11, int i10, int i11, int i12, int i13, Buffer buffer, int i14, int i15, int i16, int i17, int i18, int i19, int i20, Object obj, Runnable runnable);

    private static native void nSetAcquiredImage(long j10, long j11, Object obj, Object obj2, Runnable runnable);

    private static native void nSetDimensions(long j10, int i10, int i11);

    void g() {
        this.f104193a = 0L;
    }

    public long h() {
        long j10 = this.f104193a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Stream");
    }

    public b i() {
        return f104192c[nGetStreamType(h())];
    }

    public long j() {
        return nGetTimestamp(h());
    }

    public void k(Object obj, Object obj2, Runnable runnable) {
        nSetAcquiredImage(h(), this.f104194b, obj, obj2, runnable);
    }

    public void l(@g0(from = 0) int i10, @g0(from = 0) int i11) {
        nSetDimensions(h(), i10, i11);
    }
}
