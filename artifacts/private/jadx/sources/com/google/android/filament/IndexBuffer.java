package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes4.dex */
public class IndexBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103932a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0946a f103933a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103934b;

        /* JADX INFO: renamed from: com.google.android.filament.IndexBuffer$a$a, reason: collision with other inner class name */
        private static class C0946a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103935a;

            C0946a(long j10) {
                this.f103935a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                IndexBuffer.nDestroyBuilder(this.f103935a);
            }
        }

        public enum b {
            USHORT,
            UINT
        }

        public a() {
            long jNCreateBuilder = IndexBuffer.nCreateBuilder();
            this.f103934b = jNCreateBuilder;
            this.f103933a = new C0946a(jNCreateBuilder);
        }

        @NonNull
        public a a(@NonNull b bVar) {
            IndexBuffer.nBuilderBufferType(this.f103934b, bVar.ordinal());
            return this;
        }

        @NonNull
        public IndexBuffer b(@NonNull Engine engine) {
            long jNBuilderBuild = IndexBuffer.nBuilderBuild(this.f103934b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndexBuffer");
        }

        @NonNull
        public a c(@g0(from = 1) int i10) {
            IndexBuffer.nBuilderIndexCount(this.f103934b, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferType(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIndexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetIndexCount(long j10);

    private static native int nSetBuffer(long j10, long j11, Buffer buffer, int i10, int i11, int i12, Object obj, Runnable runnable);

    void f() {
        this.f103932a = 0L;
    }

    @g0(from = 0)
    public int g() {
        return nGetIndexCount(h());
    }

    public long h() {
        long j10 = this.f103932a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void i(@NonNull Engine engine, @NonNull Buffer buffer) {
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

    private IndexBuffer(long j10) {
        this.f103932a = j10;
    }
}
