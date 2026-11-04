package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.g0;
import java.nio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class SurfaceOrientation {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104201a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f104202a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f104203b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Buffer f104204c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f104205d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Buffer f104206e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f104207f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Buffer f104208g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f104209h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private Buffer f104210i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f104211j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private Buffer f104212k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private Buffer f104213l;

        @NonNull
        public SurfaceOrientation a() {
            long jNCreateBuilder = SurfaceOrientation.nCreateBuilder();
            SurfaceOrientation.nBuilderVertexCount(jNCreateBuilder, this.f104202a);
            SurfaceOrientation.nBuilderTriangleCount(jNCreateBuilder, this.f104203b);
            Buffer buffer = this.f104204c;
            if (buffer != null) {
                SurfaceOrientation.nBuilderNormals(jNCreateBuilder, buffer, buffer.remaining(), this.f104205d);
            }
            Buffer buffer2 = this.f104206e;
            if (buffer2 != null) {
                SurfaceOrientation.nBuilderTangents(jNCreateBuilder, buffer2, buffer2.remaining(), this.f104207f);
            }
            Buffer buffer3 = this.f104208g;
            if (buffer3 != null) {
                SurfaceOrientation.nBuilderUVs(jNCreateBuilder, buffer3, buffer3.remaining(), this.f104209h);
            }
            Buffer buffer4 = this.f104210i;
            if (buffer4 != null) {
                SurfaceOrientation.nBuilderPositions(jNCreateBuilder, buffer4, buffer4.remaining(), this.f104211j);
            }
            Buffer buffer5 = this.f104212k;
            if (buffer5 != null) {
                SurfaceOrientation.nBuilderTriangles16(jNCreateBuilder, buffer5, buffer5.remaining());
            }
            Buffer buffer6 = this.f104213l;
            if (buffer6 != null) {
                SurfaceOrientation.nBuilderTriangles32(jNCreateBuilder, buffer6, buffer6.remaining());
            }
            long jNBuilderBuild = SurfaceOrientation.nBuilderBuild(jNCreateBuilder);
            SurfaceOrientation.nDestroyBuilder(jNCreateBuilder);
            if (jNBuilderBuild != 0) {
                return new SurfaceOrientation(jNBuilderBuild);
            }
            throw new IllegalStateException("Could not create SurfaceOrientation");
        }

        @NonNull
        public a b(@NonNull Buffer buffer) {
            this.f104204c = buffer;
            this.f104205d = 0;
            return this;
        }

        @NonNull
        public a c(@NonNull Buffer buffer) {
            this.f104210i = buffer;
            this.f104211j = 0;
            return this;
        }

        @NonNull
        public a d(@NonNull Buffer buffer) {
            this.f104206e = buffer;
            this.f104207f = 0;
            return this;
        }

        @NonNull
        public a e(int i10) {
            this.f104203b = i10;
            return this;
        }

        @NonNull
        public a f(@NonNull Buffer buffer) {
            this.f104212k = buffer;
            return this;
        }

        @NonNull
        public a g(@NonNull Buffer buffer) {
            this.f104213l = buffer;
            return this;
        }

        @NonNull
        public a h(@NonNull Buffer buffer) {
            this.f104208g = buffer;
            this.f104209h = 0;
            return this;
        }

        @NonNull
        public a i(@g0(from = 1) int i10) {
            this.f104202a = i10;
            return this;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNormals(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPositions(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTangents(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangleCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles16(long j10, Buffer buffer, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderTriangles32(long j10, Buffer buffer, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUVs(long j10, Buffer buffer, int i10, int i11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVertexCount(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    private static native void nDestroy(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetQuatsAsFloat(long j10, Buffer buffer, int i10);

    private static native void nGetQuatsAsHalf(long j10, Buffer buffer, int i10);

    private static native void nGetQuatsAsShort(long j10, Buffer buffer, int i10);

    private static native int nGetVertexCount(long j10);

    public void l() {
        nDestroy(this.f104201a);
        this.f104201a = 0L;
    }

    public long m() {
        long j10 = this.f104201a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed SurfaceOrientation");
    }

    @NonNull
    public void n(@NonNull Buffer buffer) {
        nGetQuatsAsFloat(this.f104201a, buffer, buffer.remaining());
    }

    @NonNull
    public void o(@NonNull Buffer buffer) {
        nGetQuatsAsHalf(this.f104201a, buffer, buffer.remaining());
    }

    @NonNull
    public void p(@NonNull Buffer buffer) {
        nGetQuatsAsShort(this.f104201a, buffer, buffer.remaining());
    }

    @g0(from = 0)
    public int q() {
        return nGetVertexCount(this.f104201a);
    }

    private SurfaceOrientation(long j10) {
        this.f104201a = j10;
    }
}
