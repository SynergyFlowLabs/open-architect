package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;

/* JADX INFO: loaded from: classes4.dex */
public class ColorGrading {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f103839a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0945a f103840a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103841b;

        /* JADX INFO: renamed from: com.google.android.filament.ColorGrading$a$a, reason: collision with other inner class name */
        private static class C0945a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103842a;

            C0945a(long j10) {
                this.f103842a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                ColorGrading.nDestroyBuilder(this.f103842a);
            }
        }

        public a() {
            long jNCreateBuilder = ColorGrading.nCreateBuilder();
            this.f103841b = jNCreateBuilder;
            this.f103840a = new C0945a(jNCreateBuilder);
        }

        @NonNull
        public ColorGrading a(@NonNull Engine engine) {
            long jNBuilderBuild = ColorGrading.nBuilderBuild(this.f103841b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new ColorGrading(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create ColorGrading");
        }

        public a b(@NonNull @d1(min = 3) float[] fArr, @NonNull @d1(min = 3) float[] fArr2, @NonNull @d1(min = 3) float[] fArr3) {
            com.google.android.filament.c.d(fArr);
            com.google.android.filament.c.d(fArr2);
            com.google.android.filament.c.d(fArr3);
            ColorGrading.nBuilderChannelMixer(this.f103841b, fArr, fArr2, fArr3);
            return this;
        }

        public a c(float f10) {
            ColorGrading.nBuilderContrast(this.f103841b, f10);
            return this;
        }

        public a d(@NonNull @d1(min = 3) float[] fArr, @NonNull @d1(min = 3) float[] fArr2, @NonNull @d1(min = 3) float[] fArr3) {
            com.google.android.filament.c.d(fArr);
            com.google.android.filament.c.d(fArr2);
            com.google.android.filament.c.d(fArr3);
            ColorGrading.nBuilderCurves(this.f103841b, fArr, fArr2, fArr3);
            return this;
        }

        public a e(int i10) {
            ColorGrading.nBuilderDimensions(this.f103841b, i10);
            return this;
        }

        public a f(float f10) {
            ColorGrading.nBuilderExposure(this.f103841b, f10);
            return this;
        }

        public a g(b bVar) {
            ColorGrading.nBuilderFormat(this.f103841b, bVar.ordinal());
            return this;
        }

        public a h(boolean z10) {
            ColorGrading.nBuilderGamutMapping(this.f103841b, z10);
            return this;
        }

        public a i(boolean z10) {
            ColorGrading.nBuilderLuminanceScaling(this.f103841b, z10);
            return this;
        }

        public a j(float f10) {
            ColorGrading.nBuilderNightAdaptation(this.f103841b, f10);
            return this;
        }

        public a k(c cVar) {
            ColorGrading.nBuilderQuality(this.f103841b, cVar.ordinal());
            return this;
        }

        public a l(float f10) {
            ColorGrading.nBuilderSaturation(this.f103841b, f10);
            return this;
        }

        public a m(@NonNull @d1(min = 4) float[] fArr, @NonNull @d1(min = 4) float[] fArr2, @NonNull @d1(min = 4) float[] fArr3, @NonNull @d1(min = 4) float[] fArr4) {
            com.google.android.filament.c.f(fArr);
            com.google.android.filament.c.f(fArr2);
            com.google.android.filament.c.f(fArr3);
            com.google.android.filament.c.f(fArr4);
            ColorGrading.nBuilderShadowsMidtonesHighlights(this.f103841b, fArr, fArr2, fArr3, fArr4);
            return this;
        }

        public a n(@NonNull @d1(min = 3) float[] fArr, @NonNull @d1(min = 3) float[] fArr2, @NonNull @d1(min = 3) float[] fArr3) {
            com.google.android.filament.c.d(fArr);
            com.google.android.filament.c.d(fArr2);
            com.google.android.filament.c.d(fArr3);
            ColorGrading.nBuilderSlopeOffsetPower(this.f103841b, fArr, fArr2, fArr3);
            return this;
        }

        public a o(ToneMapper toneMapper) {
            ColorGrading.nBuilderToneMapper(this.f103841b, toneMapper.p());
            return this;
        }

        @Deprecated
        public a p(d dVar) {
            ColorGrading.nBuilderToneMapping(this.f103841b, dVar.ordinal());
            return this;
        }

        public a q(float f10) {
            ColorGrading.nBuilderVibrance(this.f103841b, f10);
            return this;
        }

        public a r(float f10, float f11) {
            ColorGrading.nBuilderWhiteBalance(this.f103841b, f10, f11);
            return this;
        }
    }

    public enum b {
        INTEGER,
        FLOAT
    }

    public enum c {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    @Deprecated
    public enum d {
        LINEAR,
        ACES_LEGACY,
        ACES,
        FILMIC,
        DISPLAY_RANGE
    }

    public ColorGrading(long j10) {
        this.f103839a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderChannelMixer(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderContrast(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCurves(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDimensions(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExposure(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderGamutMapping(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLuminanceScaling(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderNightAdaptation(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderQuality(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSaturation(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowsMidtonesHighlights(long j10, float[] fArr, float[] fArr2, float[] fArr3, float[] fArr4);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSlopeOffsetPower(long j10, float[] fArr, float[] fArr2, float[] fArr3);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapper(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderToneMapping(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderVibrance(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWhiteBalance(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    void u() {
        this.f103839a = 0L;
    }

    public long v() {
        long j10 = this.f103839a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed ColorGrading");
    }
}
