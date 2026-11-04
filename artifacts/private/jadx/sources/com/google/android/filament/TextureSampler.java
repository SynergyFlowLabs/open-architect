package com.google.android.filament;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes4.dex */
public class TextureSampler {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    long f104403a;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f104404a;

        static {
            int[] iArr = new int[e.values().length];
            f104404a = iArr;
            try {
                iArr[e.NEAREST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f104404a[e.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public enum b {
        LESS_EQUAL,
        GREATER_EQUAL,
        LESS,
        GREATER,
        EQUAL,
        NOT_EQUAL,
        ALWAYS,
        NEVER
    }

    public enum c {
        NONE,
        COMPARE_TO_TEXTURE
    }

    static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final f[] f104417a = f.values();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final e[] f104418b = e.values();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final g[] f104419c = g.values();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        static final c[] f104420d = c.values();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        static final b[] f104421e = b.values();

        d() {
        }
    }

    public enum e {
        NEAREST,
        LINEAR
    }

    public enum f {
        NEAREST,
        LINEAR,
        NEAREST_MIPMAP_NEAREST,
        LINEAR_MIPMAP_NEAREST,
        NEAREST_MIPMAP_LINEAR,
        LINEAR_MIPMAP_LINEAR;

        static {
            int i10 = 7 ^ 5;
        }
    }

    public enum g {
        CLAMP_TO_EDGE,
        REPEAT,
        MIRRORED_REPEAT;

        static {
            int i10 = 3 >> 2;
        }
    }

    public TextureSampler() {
        this(f.LINEAR_MIPMAP_LINEAR, e.LINEAR, g.REPEAT);
    }

    private static f i(@NonNull e eVar) {
        return a.f104404a[eVar.ordinal()] != 1 ? f.LINEAR : f.NEAREST;
    }

    private static native long nCreateCompareSampler(int i10, int i11);

    private static native long nCreateSampler(int i10, int i11, int i12, int i13, int i14);

    private static native float nGetAnisotropy(long j10);

    private static native int nGetCompareFunction(long j10);

    private static native int nGetCompareMode(long j10);

    private static native int nGetMagFilter(long j10);

    private static native int nGetMinFilter(long j10);

    private static native int nGetWrapModeR(long j10);

    private static native int nGetWrapModeS(long j10);

    private static native int nGetWrapModeT(long j10);

    private static native long nSetAnisotropy(long j10, float f10);

    private static native long nSetCompareFunction(long j10, int i10);

    private static native long nSetCompareMode(long j10, int i10);

    private static native long nSetMagFilter(long j10, int i10);

    private static native long nSetMinFilter(long j10, int i10);

    private static native long nSetWrapModeR(long j10, int i10);

    private static native long nSetWrapModeS(long j10, int i10);

    private static native long nSetWrapModeT(long j10, int i10);

    public float a() {
        return nGetAnisotropy(this.f104403a);
    }

    public b b() {
        return d.f104421e[nGetCompareFunction(this.f104403a)];
    }

    public c c() {
        return d.f104420d[nGetCompareMode(this.f104403a)];
    }

    public e d() {
        return d.f104418b[nGetMagFilter(this.f104403a)];
    }

    public f e() {
        return d.f104417a[nGetMinFilter(this.f104403a)];
    }

    public g f() {
        return d.f104419c[nGetWrapModeR(this.f104403a)];
    }

    public g g() {
        return d.f104419c[nGetWrapModeS(this.f104403a)];
    }

    public g h() {
        return d.f104419c[nGetWrapModeT(this.f104403a)];
    }

    public void j(float f10) {
        this.f104403a = nSetAnisotropy(this.f104403a, f10);
    }

    public void k(b bVar) {
        this.f104403a = nSetCompareFunction(this.f104403a, bVar.ordinal());
    }

    public void l(c cVar) {
        this.f104403a = nSetCompareMode(this.f104403a, cVar.ordinal());
    }

    public void m(e eVar) {
        this.f104403a = nSetMagFilter(this.f104403a, eVar.ordinal());
    }

    public void n(f fVar) {
        this.f104403a = nSetMinFilter(this.f104403a, fVar.ordinal());
    }

    public void o(g gVar) {
        this.f104403a = nSetWrapModeR(this.f104403a, gVar.ordinal());
    }

    public void p(g gVar) {
        this.f104403a = nSetWrapModeS(this.f104403a, gVar.ordinal());
    }

    public void q(g gVar) {
        this.f104403a = nSetWrapModeT(this.f104403a, gVar.ordinal());
    }

    public TextureSampler(@NonNull e eVar) {
        this(eVar, g.CLAMP_TO_EDGE);
    }

    public TextureSampler(@NonNull e eVar, @NonNull g gVar) {
        this(i(eVar), eVar, gVar);
    }

    public TextureSampler(@NonNull f fVar, @NonNull e eVar, @NonNull g gVar) {
        this(fVar, eVar, gVar, gVar, gVar);
    }

    public TextureSampler(@NonNull f fVar, @NonNull e eVar, @NonNull g gVar, @NonNull g gVar2, @NonNull g gVar3) {
        this.f104403a = 0L;
        this.f104403a = nCreateSampler(fVar.ordinal(), eVar.ordinal(), gVar.ordinal(), gVar2.ordinal(), gVar3.ordinal());
    }

    public TextureSampler(@NonNull c cVar) {
        this(cVar, b.LESS_EQUAL);
    }

    public TextureSampler(@NonNull c cVar, @NonNull b bVar) {
        this.f104403a = 0L;
        this.f104403a = nCreateCompareSampler(cVar.ordinal(), bVar.ordinal());
    }
}
