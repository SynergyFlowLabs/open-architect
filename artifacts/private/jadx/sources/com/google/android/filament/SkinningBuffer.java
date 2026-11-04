package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.collection.b3;
import java.nio.Buffer;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes4.dex */
public class SkinningBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104184a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0951a f104185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104186b;

        /* JADX INFO: renamed from: com.google.android.filament.SkinningBuffer$a$a, reason: collision with other inner class name */
        private static class C0951a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104187a;

            C0951a(long j10) {
                this.f104187a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                SkinningBuffer.nDestroyBuilder(this.f104187a);
            }
        }

        public a() {
            long jNCreateBuilder = SkinningBuffer.nCreateBuilder();
            this.f104186b = jNCreateBuilder;
            this.f104185a = new C0951a(jNCreateBuilder);
        }

        @NonNull
        public a a(@g0(from = 1) int i10) {
            SkinningBuffer.nBuilderBoneCount(this.f104186b, i10);
            return this;
        }

        @NonNull
        public SkinningBuffer b(@NonNull Engine engine) {
            long jNBuilderBuild = SkinningBuffer.nBuilderBuild(this.f104186b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new SkinningBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create SkinningBuffer");
        }

        @NonNull
        public a c(boolean z10) {
            SkinningBuffer.nBuilderInitialize(this.f104186b, z10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderBoneCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderInitialize(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetBoneCount(long j10);

    private static native int nSetBonesAsMatrices(long j10, long j11, Buffer buffer, int i10, int i11, int i12);

    private static native int nSetBonesAsQuaternions(long j10, long j11, Buffer buffer, int i10, int i11, int i12);

    void f() {
        this.f104184a = 0L;
    }

    public int g() {
        return nGetBoneCount(this.f104184a);
    }

    public long h() {
        long j10 = this.f104184a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndexBuffer");
    }

    public void i(@NonNull Engine engine, @NonNull Buffer buffer, @g0(from = 0, to = b3.f12144d) int i10, @g0(from = 0) int i11) {
        if (nSetBonesAsMatrices(this.f104184a, engine.getNativeObject(), buffer, buffer.remaining(), i10, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void j(@NonNull Engine engine, @NonNull Buffer buffer, @g0(from = 0, to = b3.f12144d) int i10, @g0(from = 0) int i11) {
        if (nSetBonesAsQuaternions(this.f104184a, engine.getNativeObject(), buffer, buffer.remaining(), i10, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    private SkinningBuffer(long j10) {
        this.f104184a = j10;
    }
}
