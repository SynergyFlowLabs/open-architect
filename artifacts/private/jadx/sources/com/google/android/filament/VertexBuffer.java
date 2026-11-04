package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes4.dex */
public class VertexBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104442a;

    public enum a {
        BYTE,
        BYTE2,
        BYTE3,
        BYTE4,
        UBYTE,
        UBYTE2,
        UBYTE3,
        UBYTE4,
        SHORT,
        SHORT2,
        SHORT3,
        SHORT4,
        USHORT,
        USHORT2,
        USHORT3,
        USHORT4,
        INT,
        UINT,
        FLOAT,
        FLOAT2,
        FLOAT3,
        FLOAT4,
        HALF,
        HALF2,
        HALF3,
        HALF4
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f104466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104467b;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104468a;

            a(long j10) {
                this.f104468a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                VertexBuffer.nDestroyBuilder(this.f104468a);
            }
        }

        public b() {
            long jNCreateBuilder = VertexBuffer.nCreateBuilder();
            this.f104467b = jNCreateBuilder;
            this.f104466a = new a(jNCreateBuilder);
        }

        @NonNull
        public b a(@NonNull c cVar, @g0(from = 0) int i10, @NonNull a aVar) {
            return b(cVar, i10, aVar, 0, 0);
        }

        @NonNull
        public b b(@NonNull c cVar, @g0(from = 0) int i10, @NonNull a aVar, @g0(from = 0) int i11, @g0(from = 0) int i12) {
            VertexBuffer.nBuilderAttribute(this.f104467b, cVar.ordinal(), i10, aVar.ordinal(), i11, i12);
            return this;
        }

        @NonNull
        public b c(@g0(from = 1) int i10) {
            VertexBuffer.nBuilderBufferCount(this.f104467b, i10);
            return this;
        }

        @NonNull
        public VertexBuffer d(@NonNull Engine engine) {
            long jNBuilderBuild = VertexBuffer.nBuilderBuild(this.f104467b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new VertexBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create VertexBuffer");
        }

        @NonNull
        public b e(boolean z10) {
            VertexBuffer.nBuilderEnableBufferObjects(this.f104467b, z10);
            return this;
        }

        @NonNull
        public b f(@NonNull c cVar) {
            VertexBuffer.nBuilderNormalized(this.f104467b, cVar.ordinal(), true);
            return this;
        }

        @NonNull
        public b g(@NonNull c cVar, boolean z10) {
            VertexBuffer.nBuilderNormalized(this.f104467b, cVar.ordinal(), z10);
            return this;
        }

        @NonNull
        public b h(@g0(from = 1) int i10) {
            VertexBuffer.nBuilderVertexCount(this.f104467b, i10);
            return this;
        }
    }

    public enum c {
        POSITION,
        TANGENTS,
        COLOR,
        UV0,
        UV1,
        BONE_INDICES,
        BONE_WEIGHTS,
        UNUSED,
        CUSTOM0,
        CUSTOM1,
        CUSTOM2,
        CUSTOM3,
        CUSTOM4,
        CUSTOM5,
        CUSTOM6,
        CUSTOM7
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAttribute(long j10, int i10, int i11, int i12, int i13, int i14);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBufferCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnableBufferObjects(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormalized(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetVertexCount(long j10);

    private static native int nSetBufferAt(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, Object obj, Runnable runnable);

    private static native void nSetBufferObjectAt(long j10, long j11, int i10, long j12);

    void i() {
        this.f104442a = 0L;
    }

    public long j() {
        long j10 = this.f104442a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed VertexBuffer");
    }

    @g0(from = 0)
    public int k() {
        return nGetVertexCount(j());
    }

    public void l(@NonNull Engine engine, int i10, @NonNull Buffer buffer) {
        n(engine, i10, buffer, 0, 0, null, null);
    }

    public void m(@NonNull Engine engine, int i10, @NonNull Buffer buffer, @g0(from = 0) int i11, @g0(from = 0) int i12) {
        n(engine, i10, buffer, i11, i12, null, null);
    }

    public void n(@NonNull Engine engine, int i10, @NonNull Buffer buffer, @g0(from = 0) int i11, @g0(from = 0) int i12, @p0 Object obj, @p0 Runnable runnable) {
        if (nSetBufferAt(j(), engine.getNativeObject(), i10, buffer, buffer.remaining(), i11, i12 == 0 ? buffer.remaining() : i12, obj, runnable) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void o(@NonNull Engine engine, int i10, @NonNull BufferObject bufferObject) {
        nSetBufferObjectAt(j(), engine.getNativeObject(), i10, bufferObject.h());
    }

    private VertexBuffer(long j10) {
        this.f104442a = j10;
    }
}
