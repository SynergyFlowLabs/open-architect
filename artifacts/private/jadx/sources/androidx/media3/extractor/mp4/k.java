package androidx.media3.extractor.mp4;

import androidx.annotation.p0;
import androidx.media3.common.r0;
import androidx.media3.common.s0;
import androidx.media3.common.util.o0;
import androidx.media3.extractor.g0;
import com.google.common.collect.l6;

/* JADX INFO: loaded from: classes3.dex */
final class k {
    private static final int A = 1885823344;
    private static final int B = 1936683886;
    private static final int C = 1953919848;
    private static final int D = 757935405;
    private static final int E = 3;
    private static final int F = 169;
    private static final int G = 253;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f68011a = "MetadataUtil";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f68012b = 7233901;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f68013c = 7631467;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f68014d = 6516084;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f68015e = 6578553;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f68016f = 4280916;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f68017g = 7630703;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f68018h = 6384738;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f68019i = 6516589;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f68020j = 7828084;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f68021k = 7108978;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f68022l = 6776174;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f68023m = 1668249202;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f68024n = 1735291493;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f68025o = 6779504;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f68026p = 1684632427;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f68027q = 1953655662;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f68028r = 1953329263;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f68029s = 1668311404;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f68030t = 1631670868;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f68031u = 1936682605;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f68032v = 1936679276;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f68033w = 1936679282;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f68034x = 1936679265;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f68035y = 1936679791;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f68036z = 1920233063;

    private k() {
    }

    @p0
    public static androidx.media3.container.a a(r0 r0Var, String str) {
        for (int i10 = 0; i10 < r0Var.e(); i10++) {
            r0.a aVarD = r0Var.d(i10);
            if (aVarD instanceof androidx.media3.container.a) {
                androidx.media3.container.a aVar = (androidx.media3.container.a) aVarD;
                if (aVar.f62018a.equals(str)) {
                    return aVar;
                }
            }
        }
        return null;
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.e b(int i10, o0 o0Var) {
        int iS = o0Var.s();
        if (o0Var.s() == 1684108385) {
            o0Var.b0(8);
            String strG = o0Var.G(iS - 16);
            return new androidx.media3.extractor.metadata.id3.e("und", strG, strG);
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse comment attribute: " + androidx.media3.container.b.a(i10));
        return null;
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.a c(o0 o0Var) {
        String str;
        int iS = o0Var.s();
        if (o0Var.s() != 1684108385) {
            androidx.media3.common.util.z.n(f68011a, "Failed to parse cover art attribute");
            return null;
        }
        int iM = b.m(o0Var.s());
        if (iM == 13) {
            str = "image/jpeg";
        } else {
            str = iM == 14 ? s0.X0 : null;
        }
        if (str == null) {
            androidx.media3.common.util.z.n(f68011a, "Unrecognized cover art flags: " + iM);
            return null;
        }
        o0Var.b0(4);
        int i10 = iS - 16;
        byte[] bArr = new byte[i10];
        o0Var.n(bArr, 0, i10);
        return new androidx.media3.extractor.metadata.id3.a(str, null, 3, bArr);
    }

    @p0
    public static r0.a d(o0 o0Var) {
        int iF = o0Var.f() + o0Var.s();
        int iS = o0Var.s();
        int i10 = (iS >> 24) & 255;
        try {
            if (i10 == F || i10 == 253) {
                int i11 = 16777215 & iS;
                if (i11 == f68014d) {
                    androidx.media3.extractor.metadata.id3.e eVarB = b(iS, o0Var);
                    o0Var.a0(iF);
                    return eVarB;
                }
                if (i11 == f68012b || i11 == f68013c) {
                    androidx.media3.extractor.metadata.id3.n nVarK = k(iS, "TIT2", o0Var);
                    o0Var.a0(iF);
                    return nVarK;
                }
                if (i11 != f68019i && i11 != f68020j) {
                    if (i11 == f68015e) {
                        androidx.media3.extractor.metadata.id3.n nVarK2 = k(iS, "TDRC", o0Var);
                        o0Var.a0(iF);
                        return nVarK2;
                    }
                    if (i11 == f68016f) {
                        androidx.media3.extractor.metadata.id3.n nVarK3 = k(iS, "TPE1", o0Var);
                        o0Var.a0(iF);
                        return nVarK3;
                    }
                    if (i11 == f68017g) {
                        androidx.media3.extractor.metadata.id3.n nVarK4 = k(iS, "TSSE", o0Var);
                        o0Var.a0(iF);
                        return nVarK4;
                    }
                    if (i11 == f68018h) {
                        androidx.media3.extractor.metadata.id3.n nVarK5 = k(iS, "TALB", o0Var);
                        o0Var.a0(iF);
                        return nVarK5;
                    }
                    if (i11 == f68021k) {
                        androidx.media3.extractor.metadata.id3.n nVarK6 = k(iS, "USLT", o0Var);
                        o0Var.a0(iF);
                        return nVarK6;
                    }
                    if (i11 == f68022l) {
                        androidx.media3.extractor.metadata.id3.n nVarK7 = k(iS, "TCON", o0Var);
                        o0Var.a0(iF);
                        return nVarK7;
                    }
                    if (i11 == f68025o) {
                        androidx.media3.extractor.metadata.id3.n nVarK8 = k(iS, "TIT1", o0Var);
                        o0Var.a0(iF);
                        return nVarK8;
                    }
                }
                androidx.media3.extractor.metadata.id3.n nVarK9 = k(iS, "TCOM", o0Var);
                o0Var.a0(iF);
                return nVarK9;
            }
            if (iS == f68024n) {
                androidx.media3.extractor.metadata.id3.n nVarJ = j(o0Var);
                o0Var.a0(iF);
                return nVarJ;
            }
            if (iS == f68026p) {
                androidx.media3.extractor.metadata.id3.n nVarE = e(iS, "TPOS", o0Var);
                o0Var.a0(iF);
                return nVarE;
            }
            if (iS == f68027q) {
                androidx.media3.extractor.metadata.id3.n nVarE2 = e(iS, "TRCK", o0Var);
                o0Var.a0(iF);
                return nVarE2;
            }
            if (iS == f68028r) {
                androidx.media3.extractor.metadata.id3.i iVarG = g(iS, "TBPM", o0Var, true, false);
                o0Var.a0(iF);
                return iVarG;
            }
            if (iS == f68029s) {
                androidx.media3.extractor.metadata.id3.i iVarG2 = g(iS, "TCMP", o0Var, true, true);
                o0Var.a0(iF);
                return iVarG2;
            }
            if (iS == f68023m) {
                androidx.media3.extractor.metadata.id3.a aVarC = c(o0Var);
                o0Var.a0(iF);
                return aVarC;
            }
            if (iS == f68030t) {
                androidx.media3.extractor.metadata.id3.n nVarK10 = k(iS, "TPE2", o0Var);
                o0Var.a0(iF);
                return nVarK10;
            }
            if (iS == f68031u) {
                androidx.media3.extractor.metadata.id3.n nVarK11 = k(iS, "TSOT", o0Var);
                o0Var.a0(iF);
                return nVarK11;
            }
            if (iS == f68032v) {
                androidx.media3.extractor.metadata.id3.n nVarK12 = k(iS, "TSOA", o0Var);
                o0Var.a0(iF);
                return nVarK12;
            }
            if (iS == f68033w) {
                androidx.media3.extractor.metadata.id3.n nVarK13 = k(iS, "TSOP", o0Var);
                o0Var.a0(iF);
                return nVarK13;
            }
            if (iS == f68034x) {
                androidx.media3.extractor.metadata.id3.n nVarK14 = k(iS, "TSO2", o0Var);
                o0Var.a0(iF);
                return nVarK14;
            }
            if (iS == f68035y) {
                androidx.media3.extractor.metadata.id3.n nVarK15 = k(iS, "TSOC", o0Var);
                o0Var.a0(iF);
                return nVarK15;
            }
            if (iS == f68036z) {
                androidx.media3.extractor.metadata.id3.i iVarG3 = g(iS, "ITUNESADVISORY", o0Var, false, false);
                o0Var.a0(iF);
                return iVarG3;
            }
            if (iS == A) {
                androidx.media3.extractor.metadata.id3.i iVarG4 = g(iS, "ITUNESGAPLESS", o0Var, false, true);
                o0Var.a0(iF);
                return iVarG4;
            }
            if (iS == B) {
                androidx.media3.extractor.metadata.id3.n nVarK16 = k(iS, "TVSHOWSORT", o0Var);
                o0Var.a0(iF);
                return nVarK16;
            }
            if (iS == C) {
                androidx.media3.extractor.metadata.id3.n nVarK17 = k(iS, "TVSHOW", o0Var);
                o0Var.a0(iF);
                return nVarK17;
            }
            if (iS == D) {
                androidx.media3.extractor.metadata.id3.i iVarH = h(o0Var, iF);
                o0Var.a0(iF);
                return iVarH;
            }
            androidx.media3.common.util.z.b(f68011a, "Skipped unknown metadata entry: " + androidx.media3.container.b.a(iS));
            o0Var.a0(iF);
            return null;
        } catch (Throwable th2) {
            o0Var.a0(iF);
            throw th2;
        }
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.n e(int i10, String str, o0 o0Var) {
        int iS = o0Var.s();
        if (o0Var.s() == 1684108385 && iS >= 22) {
            o0Var.b0(10);
            int iT = o0Var.T();
            if (iT > 0) {
                String str2 = "" + iT;
                int iT2 = o0Var.T();
                if (iT2 > 0) {
                    str2 = str2 + "/" + iT2;
                }
                return new androidx.media3.extractor.metadata.id3.n(str, (String) null, l6.G(str2));
            }
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse index/count attribute: " + androidx.media3.container.b.a(i10));
        return null;
    }

    private static int f(o0 o0Var) {
        int iS = o0Var.s();
        if (o0Var.s() == 1684108385) {
            o0Var.b0(8);
            int i10 = iS - 16;
            if (i10 == 1) {
                return o0Var.L();
            }
            if (i10 == 2) {
                return o0Var.T();
            }
            if (i10 == 3) {
                return o0Var.O();
            }
            if (i10 == 4 && (o0Var.k() & 128) == 0) {
                return o0Var.P();
            }
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse data atom to int");
        return -1;
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.i g(int i10, String str, o0 o0Var, boolean z10, boolean z11) {
        int iF = f(o0Var);
        if (z11) {
            iF = Math.min(1, iF);
        }
        if (iF >= 0) {
            return z10 ? new androidx.media3.extractor.metadata.id3.n(str, (String) null, l6.G(Integer.toString(iF))) : new androidx.media3.extractor.metadata.id3.e("und", str, Integer.toString(iF));
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse uint8 attribute: " + androidx.media3.container.b.a(i10));
        return null;
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.i h(o0 o0Var, int i10) {
        String strG = null;
        String strG2 = null;
        int i11 = -1;
        int i12 = -1;
        while (o0Var.f() < i10) {
            int iF = o0Var.f();
            int iS = o0Var.s();
            int iS2 = o0Var.s();
            o0Var.b0(4);
            if (iS2 == 1835360622) {
                strG = o0Var.G(iS - 12);
            } else if (iS2 == 1851878757) {
                strG2 = o0Var.G(iS - 12);
            } else {
                if (iS2 == 1684108385) {
                    i11 = iF;
                    i12 = iS;
                }
                o0Var.b0(iS - 12);
            }
        }
        if (strG != null && strG2 != null && i11 != -1) {
            o0Var.a0(i11);
            o0Var.b0(16);
            return new androidx.media3.extractor.metadata.id3.k(strG, strG2, o0Var.G(i12 - 16));
        }
        return null;
    }

    @p0
    public static androidx.media3.container.a i(o0 o0Var, int i10, String str) {
        while (true) {
            int iF = o0Var.f();
            if (iF >= i10) {
                return null;
            }
            int iS = o0Var.s();
            if (o0Var.s() == 1684108385) {
                int iS2 = o0Var.s();
                int iS3 = o0Var.s();
                int i11 = iS - 16;
                byte[] bArr = new byte[i11];
                o0Var.n(bArr, 0, i11);
                return new androidx.media3.container.a(str, bArr, iS3, iS2);
            }
            o0Var.a0(iF + iS);
        }
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.n j(o0 o0Var) {
        String strA = androidx.media3.extractor.metadata.id3.j.a(f(o0Var) - 1);
        if (strA != null) {
            return new androidx.media3.extractor.metadata.id3.n("TCON", (String) null, l6.G(strA));
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse standard genre code");
        return null;
    }

    @p0
    private static androidx.media3.extractor.metadata.id3.n k(int i10, String str, o0 o0Var) {
        int iS = o0Var.s();
        if (o0Var.s() == 1684108385) {
            o0Var.b0(8);
            return new androidx.media3.extractor.metadata.id3.n(str, (String) null, l6.G(o0Var.G(iS - 16)));
        }
        androidx.media3.common.util.z.n(f68011a, "Failed to parse text attribute: " + androidx.media3.container.b.a(i10));
        return null;
    }

    public static void l(int i10, g0 g0Var, androidx.media3.common.w.b bVar) {
        if (i10 == 1 && g0Var.a()) {
            bVar.Z(g0Var.f67338a).a0(g0Var.f67339b);
        }
    }

    public static void m(int i10, @p0 r0 r0Var, androidx.media3.common.w.b bVar, r0... r0VarArr) {
        r0 r0Var2 = new r0(new r0.a[0]);
        if (r0Var != null) {
            for (int i11 = 0; i11 < r0Var.e(); i11++) {
                r0.a aVarD = r0Var.d(i11);
                if (aVarD instanceof androidx.media3.container.a) {
                    androidx.media3.container.a aVar = (androidx.media3.container.a) aVarD;
                    if (!aVar.f62018a.equals(androidx.media3.container.a.f62004e)) {
                        r0Var2 = r0Var2.a(aVar);
                    } else if (i10 == 2) {
                        r0Var2 = r0Var2.a(aVar);
                    }
                }
            }
        }
        for (r0 r0Var3 : r0VarArr) {
            r0Var2 = r0Var2.b(r0Var3);
        }
        if (r0Var2.e() > 0) {
            bVar.n0(r0Var2);
        }
    }
}
