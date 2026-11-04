package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public class LightManager {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d[] f103943b = d.values();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f103944c = 0.022f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f103945d = 0.0707f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f103946e = 0.0878f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float f103947f = 0.1171f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103948a;

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final C0948a f103949a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f103950b;

        /* JADX INFO: renamed from: com.google.android.filament.LightManager$a$a, reason: collision with other inner class name */
        private static class C0948a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f103951a;

            C0948a(long j10) {
                this.f103951a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                LightManager.nDestroyBuilder(this.f103951a);
            }
        }

        public a(@NonNull d dVar) {
            long jNCreateBuilder = LightManager.nCreateBuilder(dVar.ordinal());
            this.f103950b = jNCreateBuilder;
            this.f103949a = new C0948a(jNCreateBuilder);
        }

        public void a(@NonNull Engine engine, @h int i10) {
            if (LightManager.nBuilderBuild(this.f103950b, engine.getNativeObject(), i10)) {
                return;
            }
            throw new IllegalStateException("Couldn't create Light component for entity " + i10 + ", see log.");
        }

        @NonNull
        public a b(boolean z10) {
            LightManager.nBuilderCastLight(this.f103950b, z10);
            return this;
        }

        @NonNull
        public a c(boolean z10) {
            LightManager.nBuilderCastShadows(this.f103950b, z10);
            return this;
        }

        @NonNull
        public a d(float f10, float f11, float f12) {
            LightManager.nBuilderColor(this.f103950b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a e(float f10, float f11, float f12) {
            LightManager.nBuilderDirection(this.f103950b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a f(float f10) {
            LightManager.nBuilderFalloff(this.f103950b, f10);
            return this;
        }

        @NonNull
        public a g(float f10) {
            LightManager.nBuilderIntensity(this.f103950b, f10);
            return this;
        }

        @NonNull
        public a h(float f10, float f11) {
            LightManager.nBuilderIntensity(this.f103950b, f10, f11);
            return this;
        }

        @NonNull
        public a i(float f10) {
            LightManager.nBuilderIntensityCandela(this.f103950b, f10);
            return this;
        }

        @NonNull
        public a j(@g0(from = 0, to = 7) int i10, boolean z10) {
            LightManager.nBuilderLightChannel(this.f103950b, i10, z10);
            return this;
        }

        @NonNull
        public a k(float f10, float f11, float f12) {
            LightManager.nBuilderPosition(this.f103950b, f10, f11, f12);
            return this;
        }

        @NonNull
        public a l(@NonNull c cVar) {
            LightManager.nBuilderShadowOptions(this.f103950b, cVar.f103952a, cVar.f103953b, cVar.f103954c, cVar.f103955d, cVar.f103956e, cVar.f103957f, cVar.f103958g, cVar.f103959h, cVar.f103960i, cVar.f103961j, cVar.f103962k, cVar.f103963l, cVar.f103964m, cVar.f103965n, cVar.f103966o, cVar.f103967p, cVar.f103968q, cVar.f103969r, cVar.f103970s);
            return this;
        }

        @NonNull
        public a m(float f10, float f11) {
            LightManager.nBuilderSpotLightCone(this.f103950b, f10, f11);
            return this;
        }

        @NonNull
        public a n(float f10) {
            LightManager.nBuilderAngularRadius(this.f103950b, f10);
            return this;
        }

        @NonNull
        public a o(float f10) {
            LightManager.nBuilderHaloFalloff(this.f103950b, f10);
            return this;
        }

        @NonNull
        public a p(float f10) {
            LightManager.nBuilderHaloSize(this.f103950b, f10);
            return this;
        }
    }

    public static class b {
        public static void a(@NonNull @d1(min = 1) float[] fArr, @g0(from = 1, to = 4) int i10, float f10, float f11) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputeLogSplits(fArr, i10, f10, f11);
        }

        public static void b(@NonNull @d1(min = 1) float[] fArr, @g0(from = 1, to = 4) int i10, float f10, float f11, float f12) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputePracticalSplits(fArr, i10, f10, f11, f12);
        }

        public static void c(@NonNull @d1(min = 1) float[] fArr, @g0(from = 1, to = 4) int i10) {
            int i11 = i10 - 1;
            if (fArr.length < i11) {
                throw new ArrayIndexOutOfBoundsException(String.format("splitPositions array length must be at least %d", Integer.valueOf(i11)));
            }
            LightManager.nComputeUniformSplits(fArr, i10);
        }
    }

    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f103952a = 1024;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @g0(from = 1, to = 4)
        public int f103953b = 1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        @d1(min = 3)
        public float[] f103954c = {0.125f, 0.25f, 0.5f};

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f103955d = 0.001f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f103956e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f103957f = 0.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f103958g = 1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f103959h = 100.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f103960i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f103961j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f103962k = 0.5f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f103963l = 2.0f;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f103964m = false;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f103965n = 8;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f103966o = 0.3f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f103967p = false;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f103968q = 0.0f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f103969r = 0.02f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @NonNull
        @d1(max = 4, min = 4)
        public float[] f103970s = {0.0f, 0.0f, 0.0f, 1.0f};
    }

    public enum d {
        SUN,
        DIRECTIONAL,
        POINT,
        FOCUSED_SPOT,
        SPOT;

        static {
            int i10 = 4 << 1;
        }
    }

    LightManager(long j10) {
        this.f103948a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderAngularRadius(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native boolean nBuilderBuild(long j10, long j11, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastLight(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderCastShadows(long j10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderColor(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDirection(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFalloff(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloFalloff(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHaloSize(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensity(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderIntensityCandela(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLightChannel(long j10, int i10, boolean z10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderPosition(long j10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderShadowOptions(long j10, int i10, int i11, float[] fArr, float f10, float f11, float f12, float f13, float f14, boolean z10, boolean z11, float f15, float f16, boolean z12, int i12, float f17, boolean z13, float f18, float f19, float[] fArr2);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSpotLightCone(long j10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeLogSplits(float[] fArr, int i10, float f10, float f11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputePracticalSplits(float[] fArr, int i10, float f10, float f11, float f12);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nComputeUniformSplits(float[] fArr, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder(int i10);

    private static native void nDestroy(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGetColor(long j10, int i10, float[] fArr);

    private static native int nGetComponentCount(long j10);

    private static native void nGetDirection(long j10, int i10, float[] fArr);

    private static native float nGetFalloff(long j10, int i10);

    private static native float nGetInnerConeAngle(long j10, int i10);

    private static native int nGetInstance(long j10, int i10);

    private static native float nGetIntensity(long j10, int i10);

    private static native boolean nGetLightChannel(long j10, int i10, int i11);

    private static native float nGetOuterConeAngle(long j10, int i10);

    private static native void nGetPosition(long j10, int i10, float[] fArr);

    private static native float nGetSunAngularRadius(long j10, int i10);

    private static native float nGetSunHaloFalloff(long j10, int i10);

    private static native float nGetSunHaloSize(long j10, int i10);

    private static native int nGetType(long j10, int i10);

    private static native boolean nHasComponent(long j10, int i10);

    private static native boolean nIsShadowCaster(long j10, int i10);

    private static native void nSetColor(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetDirection(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetFalloff(long j10, int i10, float f10);

    private static native void nSetIntensity(long j10, int i10, float f10);

    private static native void nSetIntensity(long j10, int i10, float f10, float f11);

    private static native void nSetIntensityCandela(long j10, int i10, float f10);

    private static native void nSetLightChannel(long j10, int i10, int i11, boolean z10);

    private static native void nSetPosition(long j10, int i10, float f10, float f11, float f12);

    private static native void nSetShadowCaster(long j10, int i10, boolean z10);

    private static native void nSetSpotLightCone(long j10, int i10, float f10, float f11);

    private static native void nSetSunAngularRadius(long j10, int i10, float f10);

    private static native void nSetSunHaloFalloff(long j10, int i10, float f10);

    private static native void nSetSunHaloSize(long j10, int i10, float f10);

    public float A(@i int i10) {
        return nGetInnerConeAngle(this.f103948a, i10);
    }

    @i
    public int B(@h int i10) {
        return nGetInstance(this.f103948a, i10);
    }

    public float C(@i int i10) {
        return nGetIntensity(this.f103948a, i10);
    }

    public boolean D(@i int i10, @g0(from = 0, to = 7) int i11) {
        return nGetLightChannel(this.f103948a, i10, i11);
    }

    public long E() {
        return this.f103948a;
    }

    public float F(@i int i10) {
        return nGetOuterConeAngle(this.f103948a, i10);
    }

    @NonNull
    public float[] G(@i int i10, @d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = com.google.android.filament.c.c(fArr);
        nGetPosition(this.f103948a, i10, fArrC);
        return fArrC;
    }

    public float H(@i int i10) {
        return nGetSunAngularRadius(this.f103948a, i10);
    }

    public float I(@i int i10) {
        return nGetSunHaloFalloff(this.f103948a, i10);
    }

    public float J(@i int i10) {
        return nGetSunHaloSize(this.f103948a, i10);
    }

    @NonNull
    public d K(@i int i10) {
        return f103943b[nGetType(this.f103948a, i10)];
    }

    public boolean L(@h int i10) {
        return nHasComponent(this.f103948a, i10);
    }

    boolean M(@i int i10) {
        d dVarK = K(i10);
        if (dVarK != d.DIRECTIONAL && dVarK != d.SUN) {
            return false;
        }
        return true;
    }

    boolean N(@i int i10) {
        return K(i10) == d.POINT;
    }

    public boolean O(@i int i10) {
        return nIsShadowCaster(this.f103948a, i10);
    }

    boolean P(@i int i10) {
        d dVarK = K(i10);
        return dVarK == d.SPOT || dVarK == d.FOCUSED_SPOT;
    }

    public void Q(@i int i10, float f10, float f11, float f12) {
        nSetColor(this.f103948a, i10, f10, f11, f12);
    }

    public void R(@i int i10, float f10, float f11, float f12) {
        nSetDirection(this.f103948a, i10, f10, f11, f12);
    }

    public void S(@i int i10, float f10) {
        nSetFalloff(this.f103948a, i10, f10);
    }

    public void T(@i int i10, float f10) {
        nSetIntensity(this.f103948a, i10, f10);
    }

    public void U(@i int i10, float f10, float f11) {
        nSetIntensity(this.f103948a, i10, f10, f11);
    }

    public void V(@i int i10, float f10) {
        nSetIntensityCandela(this.f103948a, i10, f10);
    }

    public void W(@i int i10, @g0(from = 0, to = 7) int i11, boolean z10) {
        nSetLightChannel(this.f103948a, i10, i11, z10);
    }

    public void X(@i int i10, float f10, float f11, float f12) {
        nSetPosition(this.f103948a, i10, f10, f11, f12);
    }

    public void Y(@i int i10, boolean z10) {
        nSetShadowCaster(this.f103948a, i10, z10);
    }

    public void Z(@i int i10, float f10, float f11) {
        nSetSpotLightCone(this.f103948a, i10, f10, f11);
    }

    public void a0(@i int i10, float f10) {
        nSetSunAngularRadius(this.f103948a, i10, f10);
    }

    public void b0(@i int i10, float f10) {
        nSetSunHaloFalloff(this.f103948a, i10, f10);
    }

    public void c0(@i int i10, float f10) {
        nSetSunHaloSize(this.f103948a, i10, f10);
    }

    public void v(@h int i10) {
        nDestroy(this.f103948a, i10);
    }

    @NonNull
    public float[] w(@i int i10, @d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = com.google.android.filament.c.c(fArr);
        nGetColor(this.f103948a, i10, fArrC);
        return fArrC;
    }

    public int x() {
        return nGetComponentCount(this.f103948a);
    }

    @NonNull
    public float[] y(@i int i10, @d1(min = 3) @p0 float[] fArr) {
        float[] fArrC = com.google.android.filament.c.c(fArr);
        nGetDirection(this.f103948a, i10, fArrC);
        return fArrC;
    }

    public float z(@i int i10) {
        return nGetFalloff(this.f103948a, i10);
    }
}
