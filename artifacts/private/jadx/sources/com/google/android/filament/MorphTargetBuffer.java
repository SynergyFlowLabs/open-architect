package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import java.nio.BufferOverflowException;

/* JADX INFO: loaded from: classes4.dex */
public class MorphTargetBuffer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104113a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0949a f104114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104115b;

        /* JADX INFO: renamed from: com.google.android.filament.MorphTargetBuffer$a$a, reason: collision with other inner class name */
        private static class C0949a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104116a;

            C0949a(long j10) {
                this.f104116a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                MorphTargetBuffer.nDestroyBuilder(this.f104116a);
            }
        }

        public a() {
            long jNCreateBuilder = MorphTargetBuffer.nCreateBuilder();
            this.f104115b = jNCreateBuilder;
            this.f104114a = new C0949a(jNCreateBuilder);
        }

        @NonNull
        public MorphTargetBuffer a(@NonNull Engine engine) {
            long jNBuilderBuild = MorphTargetBuffer.nBuilderBuild(this.f104115b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new MorphTargetBuffer(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create MorphTargetBuffer");
        }

        @NonNull
        public a b(@g0(from = 1) int i10) {
            MorphTargetBuffer.nBuilderCount(this.f104115b, i10);
            return this;
        }

        @NonNull
        public a c(@g0(from = 1) int i10) {
            MorphTargetBuffer.nBuilderVertexCount(this.f104115b, i10);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetCount(long j10);

    private static native int nGetVertexCount(long j10);

    private static native int nSetPositionsAt(long j10, long j11, int i10, float[] fArr, int i11);

    private static native int nSetTangentsAt(long j10, long j11, int i10, short[] sArr, int i11);

    void f() {
        this.f104113a = 0L;
    }

    public int g() {
        return nGetCount(this.f104113a);
    }

    public long h() {
        long j10 = this.f104113a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed MorphTargetBuffer");
    }

    public int i() {
        return nGetVertexCount(this.f104113a);
    }

    public void j(@NonNull Engine engine, @g0(from = 0) int i10, @NonNull float[] fArr, @g0(from = 0, to = okhttp3.internal.ws.g.f334650q) int i11) {
        if (nSetPositionsAt(this.f104113a, engine.getNativeObject(), i10, fArr, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public void k(@NonNull Engine engine, @g0(from = 0) int i10, @NonNull short[] sArr, @g0(from = 0, to = okhttp3.internal.ws.g.f334650q) int i11) {
        if (nSetTangentsAt(this.f104113a, engine.getNativeObject(), i10, sArr, i11) < 0) {
            throw new BufferOverflowException();
        }
    }

    private MorphTargetBuffer(long j10) {
        this.f104113a = j10;
    }
}
