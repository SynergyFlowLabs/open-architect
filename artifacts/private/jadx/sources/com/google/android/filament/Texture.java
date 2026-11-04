package com.google.android.filament;

import androidx.annotation.NonNull;
import androidx.annotation.d1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import com.google.android.filament.proguard.UsedByReflection;
import java.nio.Buffer;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes4.dex */
public class Texture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final i[] f104216b = i.values();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final f[] f104217c = f.values();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f104218d = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private long f104219a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f104221b;

        static {
            int[] iArr = new int[k.values().length];
            f104221b = iArr;
            try {
                iArr[k.UBYTE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104221b[k.BYTE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f104221b[k.COMPRESSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f104221b[k.USHORT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f104221b[k.SHORT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f104221b[k.HALF.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f104221b[k.UINT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f104221b[k.INT.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f104221b[k.FLOAT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f104221b[k.UINT_10F_11F_11F_REV.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f104221b[k.USHORT_565.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            int[] iArr2 = new int[e.values().length];
            f104220a = iArr2;
            try {
                iArr2[e.R.ordinal()] = 1;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f104220a[e.R_INTEGER.ordinal()] = 2;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f104220a[e.DEPTH_COMPONENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f104220a[e.ALPHA.ordinal()] = 4;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f104220a[e.RG.ordinal()] = 5;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f104220a[e.RG_INTEGER.ordinal()] = 6;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f104220a[e.DEPTH_STENCIL.ordinal()] = 7;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f104220a[e.STENCIL_INDEX.ordinal()] = 8;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f104220a[e.RGB.ordinal()] = 9;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f104220a[e.RGB_INTEGER.ordinal()] = 10;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f104220a[e.RGBA.ordinal()] = 11;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f104220a[e.RGBA_INTEGER.ordinal()] = 12;
            } catch (NoSuchFieldError unused23) {
            }
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f104222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f104223b;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final long f104224a;

            a(long j10) {
                this.f104224a = j10;
            }

            public void finalize() {
                try {
                    super.finalize();
                } catch (Throwable unused) {
                }
                Texture.nDestroyBuilder(this.f104224a);
            }
        }

        public b() {
            long jNCreateBuilder = Texture.nCreateBuilder();
            this.f104223b = jNCreateBuilder;
            this.f104222a = new a(jNCreateBuilder);
        }

        @NonNull
        public Texture a(@NonNull Engine engine) {
            long jNBuilderBuild = Texture.nBuilderBuild(this.f104223b, engine.getNativeObject());
            if (jNBuilderBuild != 0) {
                return new Texture(jNBuilderBuild);
            }
            throw new IllegalStateException("Couldn't create Texture");
        }

        @NonNull
        public b b(@g0(from = 1) int i10) {
            Texture.nBuilderDepth(this.f104223b, i10);
            return this;
        }

        @NonNull
        public b c() {
            Texture.nBuilderExternal(this.f104223b);
            return this;
        }

        @NonNull
        public b d(@NonNull f fVar) {
            Texture.nBuilderFormat(this.f104223b, fVar.ordinal());
            return this;
        }

        @NonNull
        public b e(@g0(from = 1) int i10) {
            Texture.nBuilderHeight(this.f104223b, i10);
            return this;
        }

        @NonNull
        public b f(long j10) {
            Texture.nBuilderImportTexture(this.f104223b, j10);
            return this;
        }

        @NonNull
        public b g(@g0(from = 1) int i10) {
            Texture.nBuilderLevels(this.f104223b, i10);
            return this;
        }

        @NonNull
        public b h(@NonNull i iVar) {
            Texture.nBuilderSampler(this.f104223b, iVar.ordinal());
            return this;
        }

        @NonNull
        public b i(@NonNull j jVar, @NonNull j jVar2, @NonNull j jVar3, @NonNull j jVar4) {
            Texture.nBuilderSwizzle(this.f104223b, jVar.ordinal(), jVar2.ordinal(), jVar3.ordinal(), jVar4.ordinal());
            return this;
        }

        @NonNull
        public b j(int i10) {
            Texture.nBuilderUsage(this.f104223b, i10);
            return this;
        }

        @NonNull
        public b k(@g0(from = 1) int i10) {
            Texture.nBuilderWidth(this.f104223b, i10);
            return this;
        }
    }

    public enum c {
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12,
        RED_RGTC1,
        SIGNED_RED_RGTC1,
        RED_GREEN_RGTC2,
        SIGNED_RED_GREEN_RGTC2,
        RGB_BPTC_SIGNED_FLOAT,
        RGB_BPTC_UNSIGNED_FLOAT,
        RGBA_BPTC_UNORM,
        SRGB_ALPHA_BPTC_UNORM;

        static {
            int i10 = 6 << 5;
        }
    }

    public enum d {
        POSITIVE_X,
        NEGATIVE_X,
        POSITIVE_Y,
        NEGATIVE_Y,
        POSITIVE_Z,
        NEGATIVE_Z
    }

    public enum e {
        R,
        R_INTEGER,
        RG,
        RG_INTEGER,
        RGB,
        RGB_INTEGER,
        RGBA,
        RGBA_INTEGER,
        UNUSED,
        DEPTH_COMPONENT,
        DEPTH_STENCIL,
        STENCIL_INDEX,
        ALPHA;

        static {
            int i10 = 2 & 3;
        }
    }

    public enum f {
        R8,
        R8_SNORM,
        R8UI,
        R8I,
        STENCIL8,
        R16F,
        R16UI,
        R16I,
        RG8,
        RG8_SNORM,
        RG8UI,
        RG8I,
        RGB565,
        RGB9_E5,
        RGB5_A1,
        RGBA4,
        DEPTH16,
        RGB8,
        SRGB8,
        RGB8_SNORM,
        RGB8UI,
        RGB8I,
        DEPTH24,
        R32F,
        R32UI,
        R32I,
        RG16F,
        RG16UI,
        RG16I,
        R11F_G11F_B10F,
        RGBA8,
        SRGB8_A8,
        RGBA8_SNORM,
        UNUSED,
        RGB10_A2,
        RGBA8UI,
        RGBA8I,
        DEPTH32F,
        DEPTH24_STENCIL8,
        DEPTH32F_STENCIL8,
        RGB16F,
        RGB16UI,
        RGB16I,
        RG32F,
        RG32UI,
        RG32I,
        RGBA16F,
        RGBA16UI,
        RGBA16I,
        RGB32F,
        RGB32UI,
        RGB32I,
        RGBA32F,
        RGBA32UI,
        RGBA32I,
        EAC_R11,
        EAC_R11_SIGNED,
        EAC_RG11,
        EAC_RG11_SIGNED,
        ETC2_RGB8,
        ETC2_SRGB8,
        ETC2_RGB8_A1,
        ETC2_SRGB8_A1,
        ETC2_EAC_RGBA8,
        ETC2_EAC_SRGBA8,
        DXT1_RGB,
        DXT1_RGBA,
        DXT3_RGBA,
        DXT5_RGBA,
        DXT1_SRGB,
        DXT1_SRGBA,
        DXT3_SRGBA,
        DXT5_SRGBA,
        RGBA_ASTC_4x4,
        RGBA_ASTC_5x4,
        RGBA_ASTC_5x5,
        RGBA_ASTC_6x5,
        RGBA_ASTC_6x6,
        RGBA_ASTC_8x5,
        RGBA_ASTC_8x6,
        RGBA_ASTC_8x8,
        RGBA_ASTC_10x5,
        RGBA_ASTC_10x6,
        RGBA_ASTC_10x8,
        RGBA_ASTC_10x10,
        RGBA_ASTC_12x10,
        RGBA_ASTC_12x12,
        SRGB8_ALPHA8_ASTC_4x4,
        SRGB8_ALPHA8_ASTC_5x4,
        SRGB8_ALPHA8_ASTC_5x5,
        SRGB8_ALPHA8_ASTC_6x5,
        SRGB8_ALPHA8_ASTC_6x6,
        SRGB8_ALPHA8_ASTC_8x5,
        SRGB8_ALPHA8_ASTC_8x6,
        SRGB8_ALPHA8_ASTC_8x8,
        SRGB8_ALPHA8_ASTC_10x5,
        SRGB8_ALPHA8_ASTC_10x6,
        SRGB8_ALPHA8_ASTC_10x8,
        SRGB8_ALPHA8_ASTC_10x10,
        SRGB8_ALPHA8_ASTC_12x10,
        SRGB8_ALPHA8_ASTC_12x12,
        RED_RGTC1,
        SIGNED_RED_RGTC1,
        RED_GREEN_RGTC2,
        SIGNED_RED_GREEN_RGTC2,
        RGB_BPTC_SIGNED_FLOAT,
        RGB_BPTC_UNSIGNED_FLOAT,
        RGBA_BPTC_UNORM,
        SRGB_ALPHA_BPTC_UNORM;

        static {
            int i10 = 0 ^ 3;
        }
    }

    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f104367a = 8;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f104368b = true;
    }

    public enum i {
        SAMPLER_2D,
        SAMPLER_2D_ARRAY,
        SAMPLER_CUBEMAP,
        SAMPLER_EXTERNAL,
        SAMPLER_3D
    }

    public enum j {
        SUBSTITUTE_ZERO,
        SUBSTITUTE_ONE,
        CHANNEL_0,
        CHANNEL_1,
        CHANNEL_2,
        CHANNEL_3
    }

    public enum k {
        UBYTE,
        BYTE,
        USHORT,
        SHORT,
        UINT,
        INT,
        HALF,
        FLOAT,
        COMPRESSED,
        UINT_10F_11F_11F_REV,
        USHORT_565
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f104394a = 1;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final int f104395b = 2;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final int f104396c = 4;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f104397d = 8;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f104398e = 16;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final int f104399f = 32;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final int f104400g = 64;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final int f104401h = 128;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f104402i = 24;
    }

    public Texture(long j10) {
        this.f104219a = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nBuilderBuild(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderDepth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderExternal(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderFormat(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderHeight(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderImportTexture(long j10, long j11);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderLevels(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSampler(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderSwizzle(long j10, int i10, int i11, int i12, int i13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderUsage(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nBuilderWidth(long j10, int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateBuilder();

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nDestroyBuilder(long j10);

    private static native void nGenerateMipmaps(long j10, long j11);

    private static native int nGeneratePrefilterMipmap(long j10, long j11, int i10, int i11, Buffer buffer, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int[] iArr, Object obj, Runnable runnable, int i19, boolean z10);

    private static native int nGetDepth(long j10, int i10);

    private static native int nGetHeight(long j10, int i10);

    private static native int nGetInternalFormat(long j10);

    private static native int nGetLevels(long j10);

    private static native int nGetTarget(long j10);

    private static native int nGetWidth(long j10, int i10);

    private static native boolean nIsStreamValidForTexture(long j10, long j11);

    private static native boolean nIsTextureFormatSupported(long j10, int i10);

    private static native boolean nIsTextureSwizzleSupported(long j10);

    private static native void nSetExternalImage(long j10, long j11, long j12);

    private static native void nSetExternalStream(long j10, long j11, long j12);

    private static native int nSetImage3D(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj, Runnable runnable);

    private static native int nSetImage3DCompressed(long j10, long j11, int i10, int i11, int i12, int i13, int i14, int i15, int i16, Buffer buffer, int i17, int i18, int i19, int i20, int i21, int i22, int i23, Object obj, Runnable runnable);

    private static native int nSetImageCubemap(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, Object obj, Runnable runnable);

    private static native int nSetImageCubemapCompressed(long j10, long j11, int i10, Buffer buffer, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int[] iArr, Object obj, Runnable runnable);

    public static boolean w(@NonNull Engine engine, @NonNull f fVar) {
        return nIsTextureFormatSupported(engine.getNativeObject(), fVar.ordinal());
    }

    public static boolean x(@NonNull Engine engine) {
        return nIsTextureSwizzleSupported(engine.getNativeObject());
    }

    public void A(@NonNull Engine engine, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @g0(from = 0) int i14, @g0(from = 0) int i15, @g0(from = 0) int i16, @NonNull g gVar) {
        int iNSetImage3D;
        if (gVar.f104357b == k.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = gVar.f104356a;
            iNSetImage3D = nSetImage3DCompressed(nativeObject, nativeObject2, i10, i11, i12, i13, i14, i15, i16, buffer, buffer.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104363h, gVar.f104364i.ordinal(), gVar.f104365j, gVar.f104366k);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = gVar.f104356a;
            iNSetImage3D = nSetImage3D(nativeObject3, nativeObject4, i10, i11, i12, i13, i14, i15, i16, buffer2, buffer2.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104361f, gVar.f104362g.ordinal(), gVar.f104365j, gVar.f104366k);
        }
        if (iNSetImage3D < 0) {
            throw new BufferOverflowException();
        }
    }

    public void B(@NonNull Engine engine, @g0(from = 0) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @g0(from = 0) int i14, @NonNull g gVar) {
        A(engine, i10, i11, i12, 0, i13, i14, 1, gVar);
    }

    public void C(@NonNull Engine engine, @g0(from = 0) int i10, @NonNull g gVar) {
        A(engine, i10, 0, 0, 0, v(i10), s(i10), 1, gVar);
    }

    @Deprecated
    public void D(@NonNull Engine engine, @g0(from = 0) int i10, @NonNull g gVar, @NonNull @d1(min = 6) int[] iArr) {
        int iNSetImageCubemap;
        if (gVar.f104357b == k.COMPRESSED) {
            long nativeObject = getNativeObject();
            long nativeObject2 = engine.getNativeObject();
            Buffer buffer = gVar.f104356a;
            iNSetImageCubemap = nSetImageCubemapCompressed(nativeObject, nativeObject2, i10, buffer, buffer.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104363h, gVar.f104364i.ordinal(), iArr, gVar.f104365j, gVar.f104366k);
        } else {
            long nativeObject3 = getNativeObject();
            long nativeObject4 = engine.getNativeObject();
            Buffer buffer2 = gVar.f104356a;
            iNSetImageCubemap = nSetImageCubemap(nativeObject3, nativeObject4, i10, buffer2, buffer2.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104361f, gVar.f104362g.ordinal(), iArr, gVar.f104365j, gVar.f104366k);
        }
        if (iNSetImageCubemap < 0) {
            throw new BufferOverflowException();
        }
    }

    @UsedByReflection("TextureHelper.java")
    public long getNativeObject() {
        long j10 = this.f104219a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed Texture");
    }

    void n() {
        this.f104219a = 0L;
    }

    public void o(@NonNull Engine engine) {
        nGenerateMipmaps(getNativeObject(), engine.getNativeObject());
    }

    public void p(@NonNull Engine engine, @NonNull g gVar, @NonNull @d1(min = 6) int[] iArr, h hVar) {
        int i10;
        boolean z10;
        int iV = v(0);
        int iS = s(0);
        if (hVar != null) {
            i10 = hVar.f104367a;
            z10 = hVar.f104368b;
        } else {
            i10 = 8;
            z10 = true;
        }
        boolean z11 = z10;
        int i11 = i10;
        long nativeObject = getNativeObject();
        long nativeObject2 = engine.getNativeObject();
        Buffer buffer = gVar.f104356a;
        if (nGeneratePrefilterMipmap(nativeObject, nativeObject2, iV, iS, buffer, buffer.remaining(), gVar.f104359d, gVar.f104360e, gVar.f104357b.ordinal(), gVar.f104358c, gVar.f104361f, gVar.f104362g.ordinal(), iArr, gVar.f104365j, gVar.f104366k, i11, z11) < 0) {
            throw new BufferOverflowException();
        }
    }

    public int q(@g0(from = 0) int i10) {
        return nGetDepth(getNativeObject(), i10);
    }

    @NonNull
    public f r() {
        return f104217c[nGetInternalFormat(getNativeObject())];
    }

    public int s(@g0(from = 0) int i10) {
        return nGetHeight(getNativeObject(), i10);
    }

    public int t() {
        return nGetLevels(getNativeObject());
    }

    @NonNull
    public i u() {
        return f104216b[nGetTarget(getNativeObject())];
    }

    public int v(@g0(from = 0) int i10) {
        return nGetWidth(getNativeObject(), i10);
    }

    public void y(@NonNull Engine engine, long j10) {
        nSetExternalImage(getNativeObject(), engine.getNativeObject(), j10);
    }

    public void z(@NonNull Engine engine, @NonNull Stream stream) {
        long nativeObject = getNativeObject();
        long jH = stream.h();
        if (!nIsStreamValidForTexture(nativeObject, jH)) {
            throw new IllegalStateException("Invalid texture sampler: When used with a stream, a texture must use a SAMPLER_EXTERNAL");
        }
        nSetExternalStream(nativeObject, engine.getNativeObject(), jH);
    }

    public static class g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Buffer f104356a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public k f104357b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f104358c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f104359d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f104360e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f104361f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public e f104362g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f104363h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public c f104364i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        @p0
        public Object f104365j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        @p0
        public Runnable f104366k;

        public g(@NonNull Buffer buffer, @NonNull e eVar, @NonNull k kVar, @g0(from = 1, to = 8) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12, @g0(from = 0) int i13, @p0 Object obj, @p0 Runnable runnable) {
            this.f104356a = buffer;
            this.f104359d = i11;
            this.f104360e = i12;
            this.f104357b = kVar;
            this.f104358c = i10;
            this.f104361f = i13;
            this.f104362g = eVar;
            this.f104365j = obj;
            this.f104366k = runnable;
        }

        public static int a(@NonNull e eVar, @NonNull k kVar, int i10, int i11, @g0(from = 1, to = 8) int i12) {
            int i13;
            if (kVar == k.COMPRESSED) {
                return 0;
            }
            int i14 = 2;
            switch (a.f104220a[eVar.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    i13 = 1;
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                    i13 = 2;
                    break;
                case 9:
                case 10:
                    i13 = 3;
                    break;
                case 11:
                case 12:
                    i13 = 4;
                    break;
                default:
                    throw new IllegalStateException("unsupported format enum");
            }
            switch (a.f104221b[kVar.ordinal()]) {
                case 4:
                case 5:
                case 6:
                    i14 = i13 * 2;
                    break;
                case 7:
                case 8:
                case 9:
                    i14 = i13 * 4;
                    break;
                case 10:
                    i14 = 4;
                    break;
                case 11:
                    break;
                default:
                    i14 = i13;
                    break;
            }
            return ((-i12) & ((i14 * i10) + (i12 - 1))) * i11;
        }

        public void b(@p0 Object obj, @p0 Runnable runnable) {
            this.f104365j = obj;
            this.f104366k = runnable;
        }

        public g(@NonNull Buffer buffer, @NonNull e eVar, @NonNull k kVar) {
            this(buffer, eVar, kVar, 1, 0, 0, 0, null, null);
        }

        /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
        public g(@NonNull Buffer buffer, @NonNull e eVar, @NonNull k kVar, @g0(from = 1, to = 8) int i10) {
            this(buffer, eVar, kVar, i10, 0, 0, 0, null, null);
            int i11 = 0 << 0;
        }

        public g(@NonNull Buffer buffer, @NonNull e eVar, @NonNull k kVar, @g0(from = 1, to = 8) int i10, @g0(from = 0) int i11, @g0(from = 0) int i12) {
            this(buffer, eVar, kVar, i10, i11, i12, 0, null, null);
        }

        public g(@NonNull ByteBuffer byteBuffer, @NonNull c cVar, @g0(from = 0) int i10) {
            this.f104358c = 1;
            this.f104359d = 0;
            this.f104360e = 0;
            this.f104361f = 0;
            this.f104356a = byteBuffer;
            this.f104357b = k.COMPRESSED;
            this.f104358c = 1;
            this.f104364i = cVar;
            this.f104363h = i10;
        }
    }
}
