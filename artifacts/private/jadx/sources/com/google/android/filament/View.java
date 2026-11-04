package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.collection.b3;
import androidx.media3.exoplayer.a5;
import com.google.android.filament.proguard.UsedByNative;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class View {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final c[] f104486w = c.values();

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final g[] f104487x = g.values();

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final a[] f104488y = a.values();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104489a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f104490b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Scene f104491c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Camera f104492d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.google.android.filament.w f104493e = new com.google.android.filament.w(0, 0, 0, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private h f104494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private o f104495g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private b f104496h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private e f104497i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private i f104498j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private s f104499k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private RenderTarget f104500l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private d f104501m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private f f104502n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private w f104503o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ColorGrading f104504p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private u f104505q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private p f104506r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private k f104507s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private x f104508t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private r f104509u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private j f104510v;

    @UsedByNative("View.cpp")
    private static class InternalOnPickCallback implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final l f104511a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final m f104512b = new m();

        @UsedByNative("View.cpp")
        float mDepth;

        @UsedByNative("View.cpp")
        float mFragCoordsX;

        @UsedByNative("View.cpp")
        float mFragCoordsY;

        @UsedByNative("View.cpp")
        float mFragCoordsZ;

        @com.google.android.filament.h
        @UsedByNative("View.cpp")
        int mRenderable;

        public InternalOnPickCallback(l lVar) {
            this.f104511a = lVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            m mVar = this.f104512b;
            mVar.f104606a = this.mRenderable;
            mVar.f104607b = this.mDepth;
            float[] fArr = mVar.f104608c;
            fArr[0] = this.mFragCoordsX;
            fArr[1] = this.mFragCoordsY;
            fArr[2] = this.mFragCoordsZ;
            this.f104511a.a(mVar);
        }
    }

    @Deprecated
    public enum a {
        NONE,
        SSAO
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104516a = 0.3f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104517b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104518c = 5.0E-4f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f104519d = 0.5f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f104520e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f104521f = 0.05f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @NonNull
        public n f104522g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @NonNull
        public n f104523h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @NonNull
        public n f104524i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f104525j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f104526k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public float f104527l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f104528m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public float f104529n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f104530o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f104531p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        @NonNull
        @d1(min = 3)
        public float[] f104532q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f104533r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f104534s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f104535t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f104536u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f104537v;

        public b() {
            n nVar = n.LOW;
            this.f104522g = nVar;
            this.f104523h = n.MEDIUM;
            this.f104524i = nVar;
            this.f104525j = false;
            this.f104526k = false;
            this.f104527l = 0.0f;
            this.f104528m = 1.0f;
            this.f104529n = 0.3f;
            this.f104530o = 1.0f;
            this.f104531p = 0.8f;
            this.f104532q = new float[]{0.0f, -1.0f, 0.0f};
            this.f104533r = 0.01f;
            this.f104534s = 0.01f;
            this.f104535t = 4;
            this.f104536u = 1;
            this.f104537v = false;
        }
    }

    public enum c {
        NONE,
        FXAA
    }

    public enum d {
        OPAQUE,
        TRANSLUCENT
    }

    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @p0
        public Texture f104544a = null;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104545b = 0.2f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104546c = 0.1f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104547d = a5.S0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f104548e = 6;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public a f104549f = a.ADD;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f104550g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f104551h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f104552i = 1000.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public n f104553j = n.LOW;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public boolean f104554k = false;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f104555l = true;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f104556m = 0.005f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f104557n = 4;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f104558o = 0.6f;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public float f104559p = 10.0f;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public float f104560q = 0.1f;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public float f104561r = 0.4f;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public float f104562s = 10.0f;

        public enum a {
            ADD,
            INTERPOLATE
        }
    }

    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104566a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104567b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104568c = 0.01f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f104569d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NonNull
        public a f104570e = a.MEDIAN;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f104571f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f104572g = 0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f104573h = 0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f104574i = 0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f104575j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f104576k = 0;

        public enum a {
            NONE,
            UNUSED,
            MEDIAN
        }
    }

    public enum g {
        NONE,
        TEMPORAL
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104584a = 0.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104585b = 1.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104586c = 0.9f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f104587d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f104588e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        public n f104589f = n.LOW;
    }

    public static class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104590a = 0.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104591b = Float.POSITIVE_INFINITY;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104592c = 1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f104593d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f104594e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @NonNull
        @d1(min = 3)
        public float[] f104595f = {1.0f, 1.0f, 1.0f};

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f104596g = 0.1f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f104597h = 0.0f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f104598i = -1.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public boolean f104599j = false;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        public Texture f104600k = null;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f104601l = false;

        public i() {
            int i10 = 2 << 0;
        }
    }

    public static class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f104602a = false;
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f104603a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f104604b = 4;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f104605c = false;
    }

    public interface l {
        void a(@NonNull m mVar);
    }

    public static class m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @com.google.android.filament.h
        public int f104606a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104607b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public float[] f104608c = new float[3];
    }

    public enum n {
        LOW,
        MEDIUM,
        HIGH,
        ULTRA
    }

    public static class o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public n f104614a = n.HIGH;
    }

    public static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104615a = 0.1f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104616b = 0.01f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104617c = 3.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f104618d = 2.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f104619e = false;
    }

    public enum q {
        PCF,
        VSM,
        DPCF,
        PCSS,
        PCFd;

        static {
            boolean z10 = true | false;
        }
    }

    public static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104626a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104627b = 1.0f;
    }

    public static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f104628a = false;
    }

    /* JADX WARN: Enum visitor error
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r1v1 com.google.android.filament.View$t, still in use, count: 1, list:
      (r1v1 com.google.android.filament.View$t) from 0x005e: INVOKE 
      (r0v0 com.google.android.filament.View$t)
      (r1v1 com.google.android.filament.View$t)
      (r2v2 com.google.android.filament.View$t)
      (r3v3 com.google.android.filament.View$t)
     STATIC call: java.util.EnumSet.of(java.lang.Enum, java.lang.Enum, java.lang.Enum, java.lang.Enum):java.util.EnumSet A[MD:<E extends java.lang.Enum<E>>:(E extends java.lang.Enum<E>, E extends java.lang.Enum<E>, E extends java.lang.Enum<E>, E extends java.lang.Enum<E>):java.util.EnumSet<E extends java.lang.Enum<E>> (c), WRAPPED]
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1612)
    	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
    	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
    	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
    	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
     */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    public static final class t {
        COLOR0(1),
        COLOR1(2),
        COLOR2(4),
        COLOR3(8),
        DEPTH(16),
        STENCIL(32);


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static EnumSet<t> f104635h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static EnumSet<t> f104636i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static EnumSet<t> f104637j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static EnumSet<t> f104638k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f104640a;

        static {
            t tVar = COLOR0;
            t tVar2 = STENCIL;
            f104635h = EnumSet.noneOf(t.class);
            f104636i = EnumSet.of(tVar, tVar, tVar, tVar);
            f104637j = EnumSet.of(tVar, tVar2);
            f104638k = EnumSet.range(tVar, tVar2);
        }

        private t(int i10) {
            super(str, i);
            this.f104640a = i10;
        }

        static int l(EnumSet<t> enumSet) {
            Iterator<t> it = enumSet.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                i10 |= it.next().f104640a;
            }
            return i10;
        }

        public static t valueOf(String str) {
            return (t) Enum.valueOf(t.class, str);
        }

        public static t[] values() {
            return (t[]) f104639l.clone();
        }
    }

    public static class u {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104641a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104642b = 0.12f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104643c = -1.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f104644d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f104645e = false;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f104646f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public boolean f104647g = true;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f104648h = true;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public boolean f104649i = false;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @NonNull
        public b f104650j = b.AABB;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @NonNull
        public a f104651k = a.ACCURATE;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        @NonNull
        public c f104652l = c.HALTON_23_X16;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f104653m = 1.0f;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f104654n = false;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f104655o = true;

        public enum a {
            ACCURATE,
            CLAMP,
            NONE
        }

        public enum b {
            AABB,
            VARIANCE,
            AABB_VARIANCE;

            static {
                int i10 = 7 | 1;
            }
        }

        public enum c {
            RGSS_X4,
            UNIFORM_HELIX_X4,
            HALTON_23_X8,
            HALTON_23_X16,
            HALTON_23_X32
        }
    }

    @Deprecated
    public enum v {
        LINEAR,
        ACES
    }

    public static class w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f104673a = 0.5f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f104674b = 0.5f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f104675c = 0.5f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @NonNull
        @d1(min = 4)
        public float[] f104676d = {0.0f, 0.0f, 0.0f, 1.0f};

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f104677e = false;
    }

    public static class x {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104678a = 0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f104679b = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104680c = 1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f104681d = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f104682e = 0.5f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f104683f = 0.15f;
    }

    View(long j10) {
        this.f104489a = j10;
    }

    private static native void nClearFrameHistory(long j10, long j11);

    private static native int nGetAmbientOcclusion(long j10);

    private static native int nGetAntiAliasing(long j10);

    private static native int nGetDithering(long j10);

    private static native int nGetFogEntity(long j10);

    private static native void nGetMaterialGlobal(long j10, int i10, float[] fArr);

    private static native int nGetSampleCount(long j10);

    private static native boolean nHasCamera(long j10);

    private static native boolean nIsFrontFaceWindingInverted(long j10);

    private static native boolean nIsPostProcessingEnabled(long j10);

    private static native boolean nIsScreenSpaceRefractionEnabled(long j10);

    private static native boolean nIsShadowingEnabled(long j10);

    private static native boolean nIsStencilBufferEnabled(long j10);

    private static native boolean nIsTransparentPickingEnabled(long j10);

    private static native void nPick(long j10, int i10, int i11, Object obj, InternalOnPickCallback internalOnPickCallback);

    private static native void nSetAmbientOcclusion(long j10, int i10);

    private static native void nSetAmbientOcclusionOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, int i10, int i11, int i12, boolean z10, boolean z11, float f16);

    private static native void nSetAntiAliasing(long j10, int i10);

    private static native void nSetBlendMode(long j10, int i10);

    private static native void nSetBloomOptions(long j10, long j11, float f10, float f11, int i10, int i11, int i12, boolean z10, boolean z11, float f12, boolean z12, boolean z13, float f13, int i13, float f14, float f15, float f16, float f17, float f18);

    private static native void nSetCamera(long j10, long j11);

    private static native void nSetColorGrading(long j10, long j11);

    private static native void nSetDepthOfFieldOptions(long j10, float f10, float f11, boolean z10, int i10, boolean z11, int i11, int i12, int i13, int i14, int i15);

    private static native void nSetDithering(long j10, int i10);

    private static native void nSetDynamicLightingOptions(long j10, float f10, float f11);

    private static native void nSetDynamicResolutionOptions(long j10, boolean z10, boolean z11, float f10, float f11, float f12, int i10);

    private static native void nSetFogOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, float f19, float f20, boolean z10, long j11, boolean z11);

    private static native void nSetFrontFaceWindingInverted(long j10, boolean z10);

    private static native void nSetGuardBandOptions(long j10, boolean z10);

    private static native void nSetMaterialGlobal(long j10, int i10, float f10, float f11, float f12, float f13);

    private static native void nSetMultiSampleAntiAliasingOptions(long j10, boolean z10, int i10, boolean z11);

    private static native void nSetName(long j10, String str);

    private static native void nSetPostProcessingEnabled(long j10, boolean z10);

    private static native void nSetRenderQuality(long j10, int i10);

    private static native void nSetRenderTarget(long j10, long j11);

    private static native void nSetSSCTOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, float f17, float f18, int i10, int i11, boolean z10);

    private static native void nSetSampleCount(long j10, int i10);

    private static native void nSetScene(long j10, long j11);

    private static native void nSetScreenSpaceReflectionsOptions(long j10, float f10, float f11, float f12, float f13, boolean z10);

    private static native void nSetScreenSpaceRefractionEnabled(long j10, boolean z10);

    private static native void nSetShadowType(long j10, int i10);

    private static native void nSetShadowingEnabled(long j10, boolean z10);

    private static native void nSetSoftShadowOptions(long j10, float f10, float f11);

    private static native void nSetStencilBufferEnabled(long j10, boolean z10);

    private static native void nSetStereoscopicOptions(long j10, boolean z10);

    private static native void nSetTemporalAntiAliasingOptions(long j10, float f10, float f11, boolean z10);

    private static native void nSetTransparentPickingEnabled(long j10, boolean z10);

    private static native void nSetViewport(long j10, int i10, int i11, int i12, int i13);

    private static native void nSetVignetteOptions(long j10, float f10, float f11, float f12, float f13, float f14, float f15, float f16, boolean z10);

    private static native void nSetVisibleLayers(long j10, int i10, int i11);

    private static native void nSetVsmShadowOptions(long j10, int i10, boolean z10, boolean z11, float f10, float f11);

    @NonNull
    public u A() {
        if (this.f104505q == null) {
            this.f104505q = new u();
        }
        return this.f104505q;
    }

    @NonNull
    @Deprecated
    public v B() {
        return v.ACES;
    }

    @NonNull
    public com.google.android.filament.w C() {
        return this.f104493e;
    }

    @NonNull
    public w D() {
        if (this.f104503o == null) {
            this.f104503o = new w();
        }
        return this.f104503o;
    }

    @NonNull
    public x E() {
        if (this.f104508t == null) {
            this.f104508t = new x();
        }
        return this.f104508t;
    }

    public boolean F() {
        return nHasCamera(s());
    }

    public boolean G() {
        return nIsFrontFaceWindingInverted(s());
    }

    public boolean H() {
        return nIsPostProcessingEnabled(s());
    }

    boolean I() {
        return nIsScreenSpaceRefractionEnabled(s());
    }

    boolean J() {
        return nIsShadowingEnabled(s());
    }

    public boolean K() {
        return nIsStencilBufferEnabled(s());
    }

    public boolean L() {
        return nIsTransparentPickingEnabled(s());
    }

    public void M(int i10, int i11, @p0 Object obj, @p0 l lVar) {
        nPick(s(), i10, i11, obj, new InternalOnPickCallback(lVar));
    }

    @Deprecated
    public void N(@NonNull a aVar) {
        nSetAmbientOcclusion(s(), aVar.ordinal());
    }

    public void O(@NonNull b bVar) {
        this.f104496h = bVar;
        nSetAmbientOcclusionOptions(s(), bVar.f104516a, bVar.f104518c, bVar.f104517b, bVar.f104519d, bVar.f104520e, bVar.f104521f, bVar.f104522g.ordinal(), bVar.f104523h.ordinal(), bVar.f104524i.ordinal(), bVar.f104525j, bVar.f104526k, bVar.f104527l);
        long jS = s();
        float f10 = bVar.f104528m;
        float f11 = bVar.f104529n;
        float f12 = bVar.f104530o;
        float f13 = bVar.f104531p;
        float[] fArr = bVar.f104532q;
        nSetSSCTOptions(jS, f10, f11, f12, f13, fArr[0], fArr[1], fArr[2], bVar.f104533r, bVar.f104534s, bVar.f104535t, bVar.f104536u, bVar.f104537v);
    }

    public void P(@NonNull c cVar) {
        nSetAntiAliasing(s(), cVar.ordinal());
    }

    public void Q(d dVar) {
        this.f104501m = dVar;
        nSetBlendMode(s(), dVar.ordinal());
    }

    public void R(@NonNull e eVar) {
        this.f104497i = eVar;
        long jS = s();
        Texture texture = eVar.f104544a;
        nSetBloomOptions(jS, texture != null ? texture.getNativeObject() : 0L, eVar.f104545b, eVar.f104546c, eVar.f104547d, eVar.f104548e, eVar.f104549f.ordinal(), eVar.f104550g, eVar.f104551h, eVar.f104552i, eVar.f104554k, eVar.f104555l, eVar.f104556m, eVar.f104557n, eVar.f104558o, eVar.f104559p, eVar.f104560q, eVar.f104561r, eVar.f104562s);
    }

    public void S(@p0 Camera camera) {
        this.f104492d = camera;
        nSetCamera(s(), camera == null ? 0L : camera.n());
    }

    public void T(@p0 ColorGrading colorGrading) {
        nSetColorGrading(s(), colorGrading != null ? colorGrading.v() : 0L);
        this.f104504p = colorGrading;
    }

    public void U(@NonNull f fVar) {
        this.f104502n = fVar;
        nSetDepthOfFieldOptions(s(), fVar.f104566a, fVar.f104568c, fVar.f104569d, fVar.f104570e.ordinal(), fVar.f104571f, fVar.f104572g, fVar.f104573h, fVar.f104574i, fVar.f104575j, fVar.f104576k);
    }

    public void V(@NonNull g gVar) {
        nSetDithering(s(), gVar.ordinal());
    }

    public void W(float f10, float f11) {
        nSetDynamicLightingOptions(s(), f10, f11);
    }

    public void X(@NonNull h hVar) {
        this.f104494f = hVar;
        nSetDynamicResolutionOptions(s(), hVar.f104587d, hVar.f104588e, hVar.f104584a, hVar.f104585b, hVar.f104586c, hVar.f104589f.ordinal());
    }

    public void Y(@NonNull i iVar) {
        com.google.android.filament.c.d(iVar.f104595f);
        this.f104498j = iVar;
        long jS = s();
        float f10 = iVar.f104590a;
        float f11 = iVar.f104592c;
        float f12 = iVar.f104593d;
        float f13 = iVar.f104594e;
        float f14 = iVar.f104591b;
        float[] fArr = iVar.f104595f;
        float f15 = fArr[0];
        float f16 = fArr[1];
        float f17 = fArr[2];
        float f18 = iVar.f104596g;
        float f19 = iVar.f104597h;
        float f20 = iVar.f104598i;
        boolean z10 = iVar.f104599j;
        Texture texture = iVar.f104600k;
        nSetFogOptions(jS, f10, f11, f12, f13, f14, f15, f16, f17, f18, f19, f20, z10, texture == null ? 0L : texture.getNativeObject(), iVar.f104601l);
    }

    public void Z(boolean z10) {
        nSetFrontFaceWindingInverted(s(), z10);
    }

    public void a(Engine engine) {
        nClearFrameHistory(s(), engine.getNativeObject());
    }

    public void a0(@NonNull j jVar) {
        this.f104510v = jVar;
        nSetGuardBandOptions(s(), jVar.f104602a);
    }

    void b() {
        this.f104489a = 0L;
    }

    public void b0(int i10, @NonNull @d1(min = 4) float[] fArr) {
        com.google.android.filament.c.f(fArr);
        nSetMaterialGlobal(s(), i10, fArr[0], fArr[1], fArr[2], fArr[3]);
    }

    @NonNull
    @Deprecated
    public a c() {
        return f104488y[nGetAmbientOcclusion(s())];
    }

    public void c0(@NonNull k kVar) {
        this.f104507s = kVar;
        nSetMultiSampleAntiAliasingOptions(s(), kVar.f104603a, kVar.f104604b, kVar.f104605c);
    }

    @NonNull
    public b d() {
        if (this.f104496h == null) {
            this.f104496h = new b();
        }
        return this.f104496h;
    }

    public void d0(@NonNull String str) {
        this.f104490b = str;
        nSetName(s(), str);
    }

    @NonNull
    public c e() {
        return f104486w[nGetAntiAliasing(s())];
    }

    public void e0(boolean z10) {
        nSetPostProcessingEnabled(s(), z10);
    }

    public d f() {
        return this.f104501m;
    }

    public void f0(@NonNull o oVar) {
        this.f104495g = oVar;
        nSetRenderQuality(s(), oVar.f104614a.ordinal());
    }

    @NonNull
    public e g() {
        if (this.f104497i == null) {
            this.f104497i = new e();
        }
        return this.f104497i;
    }

    public void g0(@p0 RenderTarget renderTarget) {
        this.f104500l = renderTarget;
        nSetRenderTarget(s(), renderTarget != null ? renderTarget.m() : 0L);
    }

    @p0
    public Camera h() {
        return this.f104492d;
    }

    @Deprecated
    public void h0(int i10) {
        nSetSampleCount(s(), i10);
    }

    public ColorGrading i() {
        return this.f104504p;
    }

    public void i0(@p0 Scene scene) {
        this.f104491c = scene;
        nSetScene(s(), scene == null ? 0L : scene.j());
    }

    @NonNull
    public f j() {
        if (this.f104502n == null) {
            this.f104502n = new f();
        }
        return this.f104502n;
    }

    public void j0(@NonNull p pVar) {
        this.f104506r = pVar;
        nSetScreenSpaceReflectionsOptions(s(), pVar.f104615a, pVar.f104616b, pVar.f104617c, pVar.f104618d, pVar.f104619e);
    }

    @NonNull
    public g k() {
        return f104487x[nGetDithering(s())];
    }

    public void k0(boolean z10) {
        nSetScreenSpaceRefractionEnabled(s(), z10);
    }

    @NonNull
    public h l() {
        if (this.f104494f == null) {
            this.f104494f = new h();
        }
        return this.f104494f;
    }

    public void l0(q qVar) {
        nSetShadowType(s(), qVar.ordinal());
    }

    @com.google.android.filament.h
    public int m() {
        return nGetFogEntity(s());
    }

    public void m0(boolean z10) {
        nSetShadowingEnabled(s(), z10);
    }

    @NonNull
    public i n() {
        if (this.f104498j == null) {
            this.f104498j = new i();
        }
        return this.f104498j;
    }

    public void n0(@NonNull r rVar) {
        this.f104509u = rVar;
        nSetSoftShadowOptions(s(), rVar.f104626a, rVar.f104627b);
    }

    @NonNull
    public j o() {
        if (this.f104510v == null) {
            this.f104510v = new j();
        }
        return this.f104510v;
    }

    public void o0(boolean z10) {
        nSetStencilBufferEnabled(s(), z10);
    }

    @NonNull
    @d1(min = 4)
    public float[] p(int i10, @d1(min = 4) @p0 float[] fArr) {
        float[] fArrE = com.google.android.filament.c.e(fArr);
        nGetMaterialGlobal(s(), i10, fArrE);
        return fArrE;
    }

    public void p0(@NonNull s sVar) {
        this.f104499k = sVar;
        nSetStereoscopicOptions(s(), sVar.f104628a);
    }

    @NonNull
    public k q() {
        if (this.f104507s == null) {
            this.f104507s = new k();
        }
        return this.f104507s;
    }

    public void q0(@NonNull u uVar) {
        this.f104505q = uVar;
        nSetTemporalAntiAliasingOptions(s(), uVar.f104642b, uVar.f104641a, uVar.f104645e);
    }

    @p0
    public String r() {
        return this.f104490b;
    }

    @Deprecated
    public void r0(@NonNull v vVar) {
    }

    public long s() {
        long j10 = this.f104489a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed View");
    }

    public void s0(boolean z10) {
        nSetTransparentPickingEnabled(s(), z10);
    }

    @NonNull
    public o t() {
        if (this.f104495g == null) {
            this.f104495g = new o();
        }
        return this.f104495g;
    }

    public void t0(@NonNull com.google.android.filament.w wVar) {
        this.f104493e = wVar;
        long jS = s();
        com.google.android.filament.w wVar2 = this.f104493e;
        nSetViewport(jS, wVar2.f105023a, wVar2.f105024b, wVar2.f105025c, wVar2.f105026d);
    }

    @p0
    public RenderTarget u() {
        return this.f104500l;
    }

    public void u0(@NonNull w wVar) {
        com.google.android.filament.c.f(wVar.f104676d);
        this.f104503o = wVar;
        long jS = s();
        float f10 = wVar.f104673a;
        float f11 = wVar.f104674b;
        float f12 = wVar.f104675c;
        float[] fArr = wVar.f104676d;
        nSetVignetteOptions(jS, f10, f11, f12, fArr[0], fArr[1], fArr[2], fArr[3], wVar.f104677e);
    }

    @Deprecated
    public int v() {
        return nGetSampleCount(s());
    }

    public void v0(@g0(from = 0, to = b3.f12144d) int i10, @g0(from = 0, to = b3.f12144d) int i11) {
        nSetVisibleLayers(s(), i10 & 255, i11 & 255);
    }

    @p0
    public Scene w() {
        return this.f104491c;
    }

    public void w0(@NonNull x xVar) {
        this.f104508t = xVar;
        nSetVsmShadowOptions(s(), xVar.f104678a, xVar.f104679b, xVar.f104681d, xVar.f104682e, xVar.f104683f);
    }

    @NonNull
    public p x() {
        if (this.f104506r == null) {
            this.f104506r = new p();
        }
        return this.f104506r;
    }

    @NonNull
    public r y() {
        if (this.f104509u == null) {
            this.f104509u = new r();
        }
        return this.f104509u;
    }

    @NonNull
    public s z() {
        if (this.f104499k == null) {
            this.f104499k = new s();
        }
        return this.f104499k;
    }
}
