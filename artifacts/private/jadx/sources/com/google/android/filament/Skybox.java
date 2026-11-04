package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;

/* JADX INFO: loaded from: classes4.dex */
public class Skybox {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104188a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0952a f104189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104190b;

        /* JADX INFO: renamed from: com.google.android.filament.Skybox$a$a, reason: collision with other inner class name */
        private static class C0952a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104191a;

            C0952a(long j10) {
                this.f104191a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Skybox.nDestroyBuilder(this.f104191a);
            }
        }

        public a() {
            long jNCreateBuilder = Skybox.nCreateBuilder();
            this.f104190b = jNCreateBuilder;
            this.f104189a = new C0952a(jNCreateBuilder);
        }

        @NonNull
        public Skybox a(@NonNull Engine engine) {
            long jNBuilderBuild = Skybox.nBuilderBuild(this.f104190b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Skybox(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Skybox");
        }

        @NonNull
        public a b(float f10, float f11, float f12, float f13) {
            Skybox.nBuilderColor(this.f104190b, f10, f11, f12, f13);
            return this;
        }

        @NonNull
        public a c(@NonNull @d1(min = 4) float[] fArr) {
            Skybox.nBuilderColor(this.f104190b, fArr[0], fArr[1], fArr[2], fArr[3]);
            return this;
        }

        @NonNull
        public a d(@NonNull Texture texture) {
            Skybox.nBuilderEnvironment(this.f104190b, texture.getNativeObject());
            return this;
        }

        @NonNull
        public a e(float f10) {
            Skybox.nBuilderIntensity(this.f104190b, f10);
            return this;
        }

        @NonNull
        public a f(boolean z10) {
            Skybox.nBuilderShowSun(this.f104190b, z10);
            return this;
        }
    }

    public Skybox(long j10) {
        this.f104188a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j10, float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderEnvironment(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShowSun(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native float nGetIntensity(long j10);

    private static native int nGetLayerMask(long j10);

    private static native long nGetTexture(long j10);

    private static native void nSetColor(long j10, float f10, float f11, float f12, float f13);

    private static native void nSetLayerMask(long j10, int i10, int i11);

    void h() {
        this.f104188a = 0L;
    }

    public float i() {
        return nGetIntensity(k());
    }

    public int j() {
        return nGetLayerMask(k());
    }

    public long k() {
        long j10 = this.f104188a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Skybox");
    }

    @p0
    public Texture l() {
        long jNGetTexture = nGetTexture(k());
        if (jNGetTexture != 0) {
            return new Texture(jNGetTexture);
        }
        int i10 = 7 ^ 0;
        return null;
    }

    public void m(float f10, float f11, float f12, float f13) {
        nSetColor(k(), f10, f11, f12, f13);
    }

    public void n(@NonNull @d1(min = 4) float[] fArr) {
        nSetColor(k(), fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    public void o(@g0(from = 0, to = b3.f12144d) int i10, @g0(from = 0, to = b3.f12144d) int i11) {
        nSetLayerMask(k(), i10 & 255, i11 & 255);
    }
}
