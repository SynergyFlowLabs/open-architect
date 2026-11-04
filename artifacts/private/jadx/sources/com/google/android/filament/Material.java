package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import com.google.android.filament.proguard.UsedByNative;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
@UsedByNative("AssetLoader.cpp")
public class Material {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f103977a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final MaterialInstance f103978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Set<VertexBuffer.c> f103979c;

    @UsedByNative("Material.cpp")
    public static class Parameter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        public final String f103981a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NonNull
        public final b f103982b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NonNull
        public final a f103983c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @g0(from = 1)
        public final int f103984d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final b[] f103980e = b.values();

        @UsedByNative("Material.cpp")
        private static final int SAMPLER_OFFSET = b.MAT4.ordinal() + 1;

        @UsedByNative("Material.cpp")
        private static final int SUBPASS_OFFSET = b.SAMPLER_3D.ordinal() + 1;

        public enum a {
            LOW,
            MEDIUM,
            HIGH,
            DEFAULT
        }

        public enum b {
            BOOL,
            BOOL2,
            BOOL3,
            BOOL4,
            FLOAT,
            FLOAT2,
            FLOAT3,
            FLOAT4,
            INT,
            INT2,
            INT3,
            INT4,
            UINT,
            UINT2,
            UINT3,
            UINT4,
            MAT3,
            MAT4,
            SAMPLER_2D,
            SAMPLER_2D_ARRAY,
            SAMPLER_CUBEMAP,
            SAMPLER_EXTERNAL,
            SAMPLER_3D,
            SUBPASS_INPUT;

            static {
                int i10 = 4 | 5;
            }
        }

        private Parameter(@NonNull String str, @NonNull b bVar, @NonNull a aVar, @g0(from = 1) int i10) {
            this.f103981a = str;
            this.f103982b = bVar;
            this.f103983c = aVar;
            this.f103984d = i10;
        }

        @UsedByNative("Material.cpp")
        private static void add(@NonNull List<Parameter> list, @NonNull String str, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 1) int i12) {
            list.add(new Parameter(str, f103980e[i10], a.values()[i11], i12));
        }
    }

    public enum a {
        OPAQUE,
        TRANSPARENT,
        ADD,
        MASKED,
        FADE,
        MULTIPLY,
        SCREEN
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Buffer f104019a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f104020b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f104021c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private a f104022d = a.LOW;

        public enum a {
            HARD,
            LOW
        }

        @NonNull
        public Material a(@NonNull Engine engine) {
            long jNBuilderBuild = Material.nBuilderBuild(engine.getNativeObject(), this.f104019a, this.f104020b, this.f104021c, this.f104022d.ordinal());
            if (jNBuilderBuild != 0) {
                return new Material(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Material");
        }

        @NonNull
        public b b(@NonNull Buffer buffer, @g0(from = 0) int i10) {
            this.f104019a = buffer;
            this.f104020b = i10;
            return this;
        }

        @NonNull
        public b c(a aVar) {
            this.f104022d = aVar;
            return this;
        }

        @NonNull
        public b d(@g0(from = 0) int i10) {
            this.f104021c = i10;
            return this;
        }
    }

    public enum c {
        HIGH,
        LOW;

        static {
            boolean z10 = true | true;
        }
    }

    public enum d {
        NONE,
        FRONT,
        BACK,
        FRONT_AND_BACK
    }

    static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final j[] f104034a = j.values();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final f[] f104035b = f.values();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final a[] f104036c = a.values();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final h[] f104037d = h.values();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final i[] f104038e = i.values();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        static final g[] f104039f = g.values();

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        static final Engine.d[] f104040g = Engine.d.values();

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        static final l[] f104041h = l.values();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final d[] f104042i = d.values();

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        static final VertexBuffer.c[] f104043j = VertexBuffer.c.values();

        private e() {
        }
    }

    public enum f {
        SMOOTH,
        FLAT
    }

    public enum g {
        DEFAULT,
        SCREEN_SPACE
    }

    public enum h {
        NONE,
        CUBEMAP,
        SCREEN_SPACE
    }

    public enum i {
        SOLID,
        THIN
    }

    public enum j {
        UNLIT,
        LIT,
        SUBSURFACE,
        CLOTH,
        SPECULAR_GLOSSINESS
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static int f104063a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static int f104064b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static int f104065c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static int f104066d = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static int f104067e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static int f104068f = 32;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static int f104069g = 64;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static int f104070h = 128;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static int f104071i = 255;
    }

    public enum l {
        OBJECT,
        WORLD,
        VIEW,
        DEVICE
    }

    public Material(long j10) {
        this.f103977a = j10;
        this.f103978b = new MaterialInstance(this, nGetDefaultInstance(j10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, @NonNull Buffer buffer, int i10, int i11, int i12);

    private static native void nCompile(long j10, int i10, int i11, Object obj, Runnable runnable);

    private static native long nCreateInstance(long j10);

    private static native long nCreateInstanceWithName(long j10, @NonNull String str);

    private static native int nGetBlendingMode(long j10);

    private static native int nGetCullingMode(long j10);

    private static native long nGetDefaultInstance(long j10);

    private static native int nGetFeatureLevel(long j10);

    private static native int nGetInterpolation(long j10);

    private static native float nGetMaskThreshold(long j10);

    private static native String nGetName(long j10);

    private static native int nGetParameterCount(long j10);

    private static native void nGetParameters(long j10, @NonNull List<Parameter> list, @g0(from = 1) int i10);

    private static native int nGetReflectionMode(long j10);

    private static native int nGetRefractionMode(long j10);

    private static native int nGetRefractionType(long j10);

    private static native int nGetRequiredAttributes(long j10);

    private static native int nGetShading(long j10);

    private static native float nGetSpecularAntiAliasingThreshold(long j10);

    private static native float nGetSpecularAntiAliasingVariance(long j10);

    private static native int nGetVertexDomain(long j10);

    private static native boolean nHasParameter(long j10, @NonNull String str);

    private static native boolean nIsAlphaToCoverageEnabled(long j10);

    private static native boolean nIsColorWriteEnabled(long j10);

    private static native boolean nIsDepthCullingEnabled(long j10);

    private static native boolean nIsDepthWriteEnabled(long j10);

    private static native boolean nIsDoubleSided(long j10);

    public boolean A() {
        return nIsColorWriteEnabled(m());
    }

    public boolean B() {
        return nIsDepthCullingEnabled(m());
    }

    public boolean C() {
        return nIsDepthWriteEnabled(m());
    }

    public boolean D() {
        return nIsDoubleSided(m());
    }

    public void E(@NonNull String str, float f10) {
        this.f103978b.y(str, f10);
    }

    public void F(@NonNull String str, float f10, float f11) {
        this.f103978b.z(str, f10, f11);
    }

    public void G(@NonNull String str, float f10, float f11, float f12) {
        this.f103978b.A(str, f10, f11, f12);
    }

    public void H(@NonNull String str, float f10, float f11, float f12, float f13) {
        this.f103978b.B(str, f10, f11, f12, f13);
    }

    public void I(@NonNull String str, int i10) {
        this.f103978b.C(str, i10);
    }

    public void J(@NonNull String str, int i10, int i11) {
        this.f103978b.D(str, i10, i11);
    }

    public void K(@NonNull String str, int i10, int i11, int i12) {
        this.f103978b.E(str, i10, i11, i12);
    }

    public void L(@NonNull String str, int i10, int i11, int i12, int i13) {
        this.f103978b.F(str, i10, i11, i12, i13);
    }

    public void M(@NonNull String str, @NonNull Colors.d dVar, float f10, float f11, float f12) {
        this.f103978b.G(str, dVar, f10, f11, f12);
    }

    public void N(@NonNull String str, @NonNull Colors.e eVar, float f10, float f11, float f12, float f13) {
        this.f103978b.H(str, eVar, f10, f11, f12, f13);
    }

    public void O(@NonNull String str, @NonNull MaterialInstance.a aVar, @NonNull @d1(min = 1) boolean[] zArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        this.f103978b.I(str, aVar, zArr, i10, i11);
    }

    public void P(@NonNull String str, @NonNull MaterialInstance.b bVar, @NonNull @d1(min = 1) float[] fArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        this.f103978b.J(str, bVar, fArr, i10, i11);
    }

    public void Q(@NonNull String str, @NonNull MaterialInstance.c cVar, @NonNull @d1(min = 1) int[] iArr, @g0(from = 0) int i10, @g0(from = 1) int i11) {
        this.f103978b.K(str, cVar, iArr, i10, i11);
    }

    public void R(@NonNull String str, @NonNull Texture texture, @NonNull TextureSampler textureSampler) {
        this.f103978b.L(str, texture, textureSampler);
    }

    public void S(@NonNull String str, boolean z10) {
        this.f103978b.M(str, z10);
    }

    public void T(@NonNull String str, boolean z10, boolean z11) {
        this.f103978b.N(str, z10, z11);
    }

    public void U(@NonNull String str, boolean z10, boolean z11, boolean z12) {
        this.f103978b.O(str, z10, z11, z12);
    }

    public void V(@NonNull String str, boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f103978b.P(str, z10, z11, z12, z13);
    }

    void b() {
        this.f103977a = 0L;
    }

    public void c(@NonNull c cVar, int i10, @p0 Object obj, @p0 Runnable runnable) {
        nCompile(m(), cVar.ordinal(), i10, obj, runnable);
    }

    @NonNull
    public MaterialInstance d() {
        long jNCreateInstance = nCreateInstance(m());
        if (jNCreateInstance != 0) {
            return new MaterialInstance(this, jNCreateInstance);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    @NonNull
    public MaterialInstance e(@NonNull String str) {
        long jNCreateInstanceWithName = nCreateInstanceWithName(m(), str);
        if (jNCreateInstanceWithName != 0) {
            return new MaterialInstance(this, jNCreateInstanceWithName);
        }
        throw new IllegalStateException("Couldn't create MaterialInstance");
    }

    public a f() {
        return e.f104036c[nGetBlendingMode(m())];
    }

    public d g() {
        return e.f104042i[nGetCullingMode(m())];
    }

    @NonNull
    public MaterialInstance h() {
        return this.f103978b;
    }

    public Engine.d i() {
        return e.f104040g[nGetFeatureLevel(m())];
    }

    public f j() {
        return e.f104035b[nGetInterpolation(m())];
    }

    public float k() {
        return nGetMaskThreshold(m());
    }

    public String l() {
        return nGetName(m());
    }

    public long m() {
        long j10 = this.f103977a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Material");
    }

    public int n() {
        return nGetParameterCount(m());
    }

    public List<Parameter> o() {
        int iN = n();
        ArrayList arrayList = new ArrayList(iN);
        if (iN > 0) {
            nGetParameters(m(), arrayList, iN);
        }
        return arrayList;
    }

    public g p() {
        return e.f104039f[nGetReflectionMode(m())];
    }

    public h q() {
        return e.f104037d[nGetRefractionMode(m())];
    }

    public i r() {
        return e.f104038e[nGetRefractionType(m())];
    }

    public Set<VertexBuffer.c> s() {
        if (this.f103979c == null) {
            int iNGetRequiredAttributes = nGetRequiredAttributes(m());
            this.f103979c = EnumSet.noneOf(VertexBuffer.c.class);
            VertexBuffer.c[] cVarArr = e.f104043j;
            for (int i10 = 0; i10 < cVarArr.length; i10++) {
                if (((1 << i10) & iNGetRequiredAttributes) != 0) {
                    this.f103979c.add(cVarArr[i10]);
                }
            }
            this.f103979c = Collections.unmodifiableSet(this.f103979c);
        }
        return this.f103979c;
    }

    int t() {
        return nGetRequiredAttributes(m());
    }

    public j u() {
        return e.f104034a[nGetShading(m())];
    }

    public float v() {
        return nGetSpecularAntiAliasingThreshold(m());
    }

    public float w() {
        return nGetSpecularAntiAliasingVariance(m());
    }

    public l x() {
        return e.f104041h[nGetVertexDomain(m())];
    }

    public boolean y(@NonNull String str) {
        return nHasParameter(m(), str);
    }

    public boolean z() {
        return nIsAlphaToCoverageEnabled(m());
    }
}
