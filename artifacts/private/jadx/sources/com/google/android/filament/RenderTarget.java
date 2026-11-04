package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class RenderTarget {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f104128c = a.values().length;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Texture.d[] f104129d = Texture.d.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104130a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Texture[] f104131b;

    public enum a {
        COLOR,
        COLOR1,
        COLOR2,
        COLOR3,
        COLOR4,
        COLOR5,
        COLOR6,
        COLOR7,
        DEPTH
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f104142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Texture[] f104144c = new Texture[RenderTarget.f104128c];

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104145a;

            a(long j10) {
                this.f104145a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                RenderTarget.nDestroyBuilder(this.f104145a);
            }
        }

        public b() {
            long jNCreateBuilder = RenderTarget.nCreateBuilder();
            this.f104143b = jNCreateBuilder;
            this.f104142a = new a(jNCreateBuilder);
        }

        @NonNull
        public RenderTarget b(@NonNull Engine engine) {
            long jNBuilderBuild = RenderTarget.nBuilderBuild(this.f104143b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new RenderTarget(jNBuilderBuild, this);
            }
            throw new IllegalStateException("Couldn't create RenderTarget");
        }

        @NonNull
        public b c(@NonNull a aVar, Texture.d dVar) {
            RenderTarget.nBuilderFace(this.f104143b, aVar.ordinal(), dVar.ordinal());
            return this;
        }

        @NonNull
        public b d(@NonNull a aVar, @g0(from = 0) int i10) {
            RenderTarget.nBuilderLayer(this.f104143b, aVar.ordinal(), i10);
            return this;
        }

        @NonNull
        public b e(@NonNull a aVar, @g0(from = 0) int i10) {
            RenderTarget.nBuilderMipLevel(this.f104143b, aVar.ordinal(), i10);
            return this;
        }

        @NonNull
        public b f(@NonNull a aVar, @p0 Texture texture) {
            this.f104144c[aVar.ordinal()] = texture;
            RenderTarget.nBuilderTexture(this.f104143b, aVar.ordinal(), texture != null ? texture.getNativeObject() : 0L);
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFace(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLayer(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderMipLevel(long j10, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTexture(long j10, int i10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native int nGetFace(long j10, int i10);

    private static native int nGetLayer(long j10, int i10);

    private static native int nGetMipLevel(long j10, int i10);

    void i() {
        this.f104130a = 0L;
    }

    public Texture.d j(a aVar) {
        return f104129d[nGetFace(m(), aVar.ordinal())];
    }

    @g0(from = 0)
    public int k(@NonNull a aVar) {
        return nGetLayer(m(), aVar.ordinal());
    }

    @g0(from = 0)
    public int l(@NonNull a aVar) {
        return nGetMipLevel(m(), aVar.ordinal());
    }

    public long m() {
        long j10 = this.f104130a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed RenderTarget");
    }

    @p0
    public Texture n(@NonNull a aVar) {
        return this.f104131b[aVar.ordinal()];
    }

    private RenderTarget(long j10, b bVar) {
        int i10 = f104128c;
        Texture[] textureArr = new Texture[i10];
        this.f104131b = textureArr;
        this.f104130a = j10;
        System.arraycopy(bVar.f104144c, 0, textureArr, 0, i10);
    }
}
