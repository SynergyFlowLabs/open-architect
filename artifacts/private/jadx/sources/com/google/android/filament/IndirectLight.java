package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class IndirectLight {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f103939a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0947a f103940a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103941b;

        /* JADX INFO: renamed from: com.google.android.filament.IndirectLight$a$a, reason: collision with other inner class name */
        private static class C0947a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103942a;

            C0947a(long j10) {
                this.f103942a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                IndirectLight.nDestroyBuilder(this.f103942a);
            }
        }

        public a() {
            long jNCreateBuilder = IndirectLight.nCreateBuilder();
            this.f103941b = jNCreateBuilder;
            this.f103940a = new C0947a(jNCreateBuilder);
        }

        @NonNull
        public IndirectLight a(@NonNull Engine engine) {
            long jNBuilderBuild = IndirectLight.nBuilderBuild(this.f103941b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new IndirectLight(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create IndirectLight");
        }

        @NonNull
        public a b(float f10) {
            IndirectLight.nIntensity(this.f103941b, f10);
            return this;
        }

        @NonNull
        public a c(@g0(from = 1, to = 3) int i10, @NonNull float[] fArr) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nIrradiance(this.f103941b, i10, fArr);
            return this;
        }

        @NonNull
        public a d(@NonNull Texture texture) {
            IndirectLight.nIrradianceAsTexture(this.f103941b, texture.getNativeObject());
            return this;
        }

        @NonNull
        public a e(@g0(from = 1, to = 3) int i10, @NonNull float[] fArr) {
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 3) {
                        throw new IllegalArgumentException("bands must be 1, 2 or 3");
                    }
                    if (fArr.length < 27) {
                        throw new ArrayIndexOutOfBoundsException("3 bands SH, array must be at least 9 x float3");
                    }
                } else if (fArr.length < 12) {
                    throw new ArrayIndexOutOfBoundsException("2 bands SH, array must be at least 4 x float3");
                }
            } else if (fArr.length < 3) {
                throw new ArrayIndexOutOfBoundsException("1 band SH, array must be at least 1 x float3");
            }
            IndirectLight.nRadiance(this.f103941b, i10, fArr);
            return this;
        }

        @NonNull
        public a f(@NonNull Texture texture) {
            IndirectLight.nBuilderReflections(this.f103941b, texture.getNativeObject());
            return this;
        }

        @NonNull
        public a g(@NonNull @d1(min = 9) float[] fArr) {
            IndirectLight.nRotation(this.f103941b, fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
            return this;
        }
    }

    public IndirectLight(long j10) {
        this.f103939a = j10;
    }

    @NonNull
    @d1(min = 4)
    public static float[] l(@d1(min = 4) @p0 float[] fArr, @NonNull float[] fArr2, float f10, float f11, float f12) {
        if (fArr2.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrE = c.e(fArr);
        nGetColorEstimateStatic(fArrE, fArr2, f10, f11, f12);
        return fArrE;
    }

    @NonNull
    @d1(min = 3)
    public static float[] n(@NonNull float[] fArr, @d1(min = 3) @p0 float[] fArr2) {
        if (fArr.length < 27) {
            throw new ArrayIndexOutOfBoundsException("3 bands SH required, array must be at least 9 x float3");
        }
        float[] fArrC = c.c(fArr2);
        nGetDirectionEstimateStatic(fArr, fArrC);
        return fArrC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderReflections(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetColorEstimate(long j10, float[] fArr, float f10, float f11, float f12);

    private static native void nGetColorEstimateStatic(float[] fArr, float[] fArr2, float f10, float f11, float f12);

    private static native void nGetDirectionEstimate(long j10, float[] fArr);

    private static native void nGetDirectionEstimateStatic(float[] fArr, float[] fArr2);

    private static native float nGetIntensity(long j10);

    private static native long nGetIrradianceTexture(long j10);

    private static native long nGetReflectionsTexture(long j10);

    private static native void nGetRotation(long j10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradiance(long j10, int i10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nIrradianceAsTexture(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRadiance(long j10, int i10, float[] fArr);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nRotation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    private static native void nSetIntensity(long j10, float f10);

    private static native void nSetRotation(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18);

    void j() {
        this.f103939a = 0L;
    }

    @NonNull
    @d1(min = 4)
    @Deprecated
    public float[] k(@d1(min = 4) @p0 float[] fArr, float f10, float f11, float f12) {
        float[] fArrE = c.e(fArr);
        nGetColorEstimate(q(), fArrE, f10, f11, f12);
        return fArrE;
    }

    @NonNull
    @d1(min = 3)
    @Deprecated
    public float[] m(@d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = c.c(fArr);
        nGetDirectionEstimate(q(), fArrC);
        return fArrC;
    }

    public float o() {
        return nGetIntensity(q());
    }

    @p0
    public Texture p() {
        long jNGetIrradianceTexture = nGetIrradianceTexture(q());
        if (jNGetIrradianceTexture == 0) {
            return null;
        }
        return new Texture(jNGetIrradianceTexture);
    }

    public long q() {
        long j10 = this.f103939a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed IndirectLight");
    }

    @p0
    public Texture r() {
        long jNGetReflectionsTexture = nGetReflectionsTexture(q());
        if (jNGetReflectionsTexture == 0) {
            return null;
        }
        return new Texture(jNGetReflectionsTexture);
    }

    @NonNull
    @d1(min = 9)
    public float[] s(@d1(min = 9) @p0 float[] fArr) {
        float[] fArrG = c.g(fArr);
        nGetRotation(q(), fArrG);
        return fArrG;
    }

    public void t(float f10) {
        nSetIntensity(q(), f10);
    }

    public void u(@NonNull @d1(min = 9) float[] fArr) {
        c.h(fArr);
        int i10 = 5 & 3;
        nSetRotation(q(), fArr[0], fArr[1], fArr[2], fArr[3], fArr[4], fArr[5], fArr[6], fArr[7], fArr[8]);
    }
}
