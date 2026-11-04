package com.google.android.filament;

/* JADX INFO: loaded from: classes4.dex */
public class ToneMapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final long f104436a;

    public static class a extends ToneMapper {
        public a() {
            super(ToneMapper.nCreateACESToneMapper());
        }
    }

    public static class b extends ToneMapper {
        public b() {
            super(ToneMapper.nCreateACESLegacyToneMapper());
        }
    }

    public static class c extends ToneMapper {

        public enum a {
            NONE,
            PUNCHY,
            GOLDEN
        }

        public c() {
            this(a.NONE);
        }

        public c(a aVar) {
            super(ToneMapper.nCreateAgxToneMapper(aVar.ordinal()));
        }
    }

    public static class d extends ToneMapper {
        public d() {
            super(ToneMapper.nCreateFilmicToneMapper());
        }
    }

    public static class e extends ToneMapper {
        public e() {
            this(1.55f, 0.18f, 0.215f, 10.0f);
        }

        public float q() {
            return ToneMapper.nGenericGetContrast(p());
        }

        public float r() {
            return ToneMapper.nGenericGetHdrMax(p());
        }

        public float s() {
            return ToneMapper.nGenericGetMidGrayIn(p());
        }

        public float t() {
            return ToneMapper.nGenericGetMidGrayOut(p());
        }

        public void u(float f10) {
            ToneMapper.nGenericSetContrast(p(), f10);
        }

        public void v(float f10) {
            ToneMapper.nGenericSetHdrMax(p(), f10);
        }

        public void w(float f10) {
            ToneMapper.nGenericSetMidGrayIn(p(), f10);
        }

        public void x(float f10) {
            ToneMapper.nGenericSetMidGrayOut(p(), f10);
        }

        public e(float f10, float f11, float f12, float f13) {
            super(ToneMapper.nCreateGenericToneMapper(f10, f11, f12, f13));
        }
    }

    public static class f extends ToneMapper {
        public f() {
            super(ToneMapper.nCreateLinearToneMapper());
        }
    }

    public static class g extends ToneMapper {
        public g() {
            super(ToneMapper.nCreatePBRNeutralToneMapper());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESLegacyToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateACESToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateAgxToneMapper(int i10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateFilmicToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateGenericToneMapper(float f10, float f11, float f12, float f13);

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreateLinearToneMapper();

    /* JADX INFO: Access modifiers changed from: private */
    public static native long nCreatePBRNeutralToneMapper();

    private static native void nDestroyToneMapper(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetContrast(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetHdrMax(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayIn(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native float nGenericGetMidGrayOut(long j10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetContrast(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetHdrMax(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayIn(long j10, float f10);

    /* JADX INFO: Access modifiers changed from: private */
    public static native void nGenericSetMidGrayOut(long j10, float f10);

    protected void finalize() throws Throwable {
        try {
            super.finalize();
            long j10 = this.f104436a;
        } finally {
            nDestroyToneMapper(this.f104436a);
        }
    }

    public long p() {
        long j10 = this.f104436a;
        if (j10 != 0) {
            return j10;
        }
        throw new IllegalStateException("Calling method on destroyed ToneMapper");
    }

    private ToneMapper(long j10) {
        this.f104436a = j10;
    }
}
