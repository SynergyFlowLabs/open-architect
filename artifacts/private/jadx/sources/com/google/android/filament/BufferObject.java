package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes4.dex */
public class BufferObject {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103825a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f103826a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103827b;

        /* JADX INFO: renamed from: com.google.android.filament.BufferObject$a$a, reason: collision with other inner class name */
        public enum EnumC0944a {
            VERTEX
        }

        private static class b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103830a;

            b(long j10) {
                this.f103830a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                BufferObject.nDestroyBuilder(this.f103830a);
            }
        }

        public a() {
            long jNCreateBuilder = BufferObject.nCreateBuilder();
            this.f103827b = jNCreateBuilder;
            this.f103826a = new b(jNCreateBuilder);
        }

        @NonNull
        public a a(@NonNull EnumC0944a enumC0944a) {
            BufferObject.nBuilderBindingType(this.f103827b, enumC0944a.ordinal());
            return this;
        }

        @NonNull
        public BufferObject b(@NonNull Engine engine) {
            long jNBuilderBuild = BufferObject.nBuilderBuild(this.f103827b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new BufferObject(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create BufferObject");
        }

        @NonNull
        public a c(@g0(from = 1) int i10) {
            BufferObject.nBuilderSize(this.f103827b, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBindingType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSize(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetByteCount(long j10);

    private static native int nSetBuffer(long j10, long j11, Buffer buffer, int i10, int i11, int i12, Object obj, Runnable runnable);

    void f() {
        this.f103825a = 0L;
    }

    @g0(from = 0)
    public int g() {
        return nGetByteCount(h());
    }

    public long h() {
        long j10 = this.f103825a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed BufferObject");
    }

    public void i(@NonNull Engine engine, @NonNull Buffer buffer) {
        int i10 = 1 << 0;
        k(engine, buffer, 0, 0, null, null);
    }

    public void j(@NonNull Engine engine, @NonNull Buffer buffer, @g0(from = 0) int i10, @g0(from = 0) int i11) {
        k(engine, buffer, i10, i11, null, null);
    }

    public void k(@NonNull Engine engine, @NonNull Buffer buffer, @g0(from = 0) int i10, @g0(from = 0) int i11, @p0 Object obj, @p0 Runnable runnable) {
        long jH = h();
        long nativeObject = engine.getNativeObject();
        int iRemaining = buffer.remaining();
        if (i11 == 0) {
            i11 = buffer.remaining();
        }
        if (nSetBuffer(jH, nativeObject, buffer, iRemaining, i10, i11, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }

    private BufferObject(long j10) {
        this.f103825a = j10;
    }
}
