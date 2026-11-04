package androidx.media3.extractor;

import androidx.media3.common.util.b1;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List<byte[]> f67347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f67348b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f67349c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f67350d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f67351e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f67352f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f67353g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f67354h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f67355i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f67356j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f67357k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f67358l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f67359m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.p0
    public final String f67360n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.p0
    public final androidx.media3.container.f.k f67361o;

    private h0(List<byte[]> list, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19, float f10, int i20, @androidx.annotation.p0 String str, @androidx.annotation.p0 androidx.media3.container.f.k kVar) {
        this.f67347a = list;
        this.f67348b = i10;
        this.f67349c = i11;
        this.f67350d = i12;
        this.f67351e = i13;
        this.f67352f = i14;
        this.f67353g = i15;
        this.f67354h = i16;
        this.f67355i = i17;
        this.f67356j = i18;
        this.f67357k = i19;
        this.f67358l = f10;
        this.f67359m = i20;
        this.f67360n = str;
        this.f67361o = kVar;
    }

    public static h0 a(androidx.media3.common.util.o0 o0Var) throws androidx.media3.common.v0 {
        return b(o0Var, false, null);
    }

    private static h0 b(androidx.media3.common.util.o0 o0Var, boolean z10, @androidx.annotation.p0 androidx.media3.container.f.k kVar) throws androidx.media3.common.v0 {
        boolean z11;
        int i10;
        androidx.media3.container.f.g gVarV;
        try {
            if (z10) {
                o0Var.b0(4);
            } else {
                o0Var.b0(21);
            }
            int iL = o0Var.L() & 3;
            int iL2 = o0Var.L();
            int iF = o0Var.f();
            int i11 = 0;
            int i12 = 0;
            int i13 = 0;
            while (true) {
                z11 = true;
                if (i12 >= iL2) {
                    break;
                }
                o0Var.b0(1);
                int iT = o0Var.T();
                for (int i14 = 0; i14 < iT; i14++) {
                    int iT2 = o0Var.T();
                    i13 += iT2 + 4;
                    o0Var.b0(iT2);
                }
                i12++;
            }
            o0Var.a0(iF);
            byte[] bArr = new byte[i13];
            androidx.media3.container.f.k kVar2 = kVar;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            int i18 = -1;
            int i19 = -1;
            int i20 = -1;
            int i21 = -1;
            int i22 = -1;
            int i23 = -1;
            int i24 = -1;
            float f10 = 1.0f;
            String strG = null;
            int i25 = 0;
            int i26 = 0;
            while (i25 < iL2) {
                int iL3 = o0Var.L() & 63;
                int iT3 = o0Var.T();
                int i27 = i11;
                androidx.media3.container.f.k kVarA = kVar2;
                while (i27 < iT3) {
                    int iT4 = o0Var.T();
                    boolean z12 = z11;
                    byte[] bArr2 = androidx.media3.container.f.C;
                    int i28 = iL;
                    System.arraycopy(bArr2, i11, bArr, i26, bArr2.length);
                    int length = i26 + bArr2.length;
                    System.arraycopy(o0Var.e(), o0Var.f(), bArr, length, iT4);
                    if (iL3 == 32 && i27 == 0) {
                        kVarA = androidx.media3.container.f.A(bArr, length, length + iT4);
                        i10 = iL2;
                    } else {
                        if (iL3 == 33 && i27 == 0) {
                            androidx.media3.container.f.h hVarW = androidx.media3.container.f.w(bArr, length, length + iT4, kVarA);
                            i15 = hVarW.f62164b + 1;
                            i16 = hVarW.f62170h;
                            int i29 = hVarW.f62171i;
                            i18 = hVarW.f62167e + 8;
                            i19 = hVarW.f62168f + 8;
                            int i30 = hVarW.f62174l;
                            i10 = iL2;
                            int i31 = hVarW.f62175m;
                            int i32 = hVarW.f62176n;
                            float f11 = hVarW.f62172j;
                            int i33 = hVarW.f62173k;
                            androidx.media3.container.f.c cVar = hVarW.f62165c;
                            if (cVar != null) {
                                strG = androidx.media3.common.util.k.g(cVar.f62139a, cVar.f62140b, cVar.f62141c, cVar.f62142d, cVar.f62143e, cVar.f62144f);
                            }
                            f10 = f11;
                            i24 = i33;
                            i21 = i31;
                            i22 = i32;
                            i20 = i30;
                            i17 = i29;
                        } else {
                            i10 = iL2;
                            if (iL3 == 39 && i27 == 0 && (gVarV = androidx.media3.container.f.v(bArr, length, length + iT4)) != null && kVarA != null) {
                                i11 = 0;
                                i23 = gVarV.f62157d == kVarA.f62183b.get(0).f62135b ? 4 : 5;
                            }
                        }
                        i11 = 0;
                    }
                    i26 = length + iT4;
                    o0Var.b0(iT4);
                    i27++;
                    z11 = z12;
                    iL = i28;
                    iL2 = i10;
                }
                i25++;
                kVar2 = kVarA;
            }
            return new h0(i13 == 0 ? Collections.EMPTY_LIST : Collections.singletonList(bArr), iL + 1, i15, i16, i17, i18, i19, i20, i21, i22, i23, f10, i24, strG, kVar2);
        } catch (ArrayIndexOutOfBoundsException e10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Error parsing");
            sb2.append(z10 ? "L-HEVC config" : "HEVC config");
            throw androidx.media3.common.v0.a(sb2.toString(), e10);
        }
    }

    public static h0 c(androidx.media3.common.util.o0 o0Var, androidx.media3.container.f.k kVar) throws androidx.media3.common.v0 {
        return b(o0Var, true, kVar);
    }
}
