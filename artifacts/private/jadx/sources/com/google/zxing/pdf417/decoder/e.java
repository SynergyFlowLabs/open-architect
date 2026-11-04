package com.google.zxing.pdf417.decoder;

import java.math.BigInteger;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
final class e {
    private static final char[] A = ";<>@[\\]_`~!\r\t,:\n-.$/\"|*()?{}'".toCharArray();
    private static final char[] B = "0123456789&\r\t,:#-.$/+%*=^".toCharArray();
    private static final BigInteger[] C;
    private static final int D = 2;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130765a = 900;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130766b = 901;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130767c = 902;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130768d = 924;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130769e = 925;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130770f = 926;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130771g = 927;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f130772h = 928;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f130773i = 923;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f130774j = 922;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f130775k = 913;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f130776l = 15;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f130777m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f130778n = 1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f130779o = 2;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int f130780p = 3;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f130781q = 4;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f130782r = 5;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f130783s = 6;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f130784t = 25;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final int f130785u = 27;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final int f130786v = 27;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f130787w = 28;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f130788x = 28;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final int f130789y = 29;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final int f130790z = 29;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f130791a;

        static {
            int[] iArr = new int[b.values().length];
            f130791a = iArr;
            try {
                iArr[b.ALPHA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f130791a[b.LOWER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f130791a[b.MIXED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f130791a[b.PUNCT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f130791a[b.ALPHA_SHIFT.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f130791a[b.PUNCT_SHIFT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    private enum b {
        ALPHA,
        LOWER,
        MIXED,
        PUNCT,
        ALPHA_SHIFT,
        PUNCT_SHIFT
    }

    static {
        BigInteger[] bigIntegerArr = new BigInteger[16];
        C = bigIntegerArr;
        bigIntegerArr[0] = BigInteger.ONE;
        BigInteger bigIntegerValueOf = BigInteger.valueOf(900L);
        bigIntegerArr[1] = bigIntegerValueOf;
        int i10 = 2;
        while (true) {
            BigInteger[] bigIntegerArr2 = C;
            if (i10 >= bigIntegerArr2.length) {
                return;
            }
            bigIntegerArr2[i10] = bigIntegerArr2[i10 - 1].multiply(bigIntegerValueOf);
            i10++;
        }
    }

    private e() {
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:27:0x0066  */
    /* JADX WARN: Failed to find 'out' block for switch in B:36:0x0095. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:37:0x0098. Please report as an issue. */
    /* JADX WARN: Switch 'out' block B:31:0x0081 for B:36:0x0095 already processed. Defaulting to fallback option. */
    /* JADX WARN: Switch 'out' block B:31:0x0081 for B:37:0x0098 already processed. Defaulting to fallback option. */
    /*  JADX ERROR: UnsupportedOperationException in pass: RegionMakerVisitor
        java.lang.UnsupportedOperationException
        	at java.base/java.util.Collections$UnmodifiableCollection.add(Collections.java:1095)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker$1.leaveRegion(SwitchRegionMaker.java:419)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:31)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaksForCase(SwitchRegionMaker.java:399)
        	at jadx.core.dex.visitors.regions.maker.SwitchRegionMaker.insertBreaks(SwitchRegionMaker.java:89)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.leaveRegion(PostProcessRegions.java:31)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:91)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.PostProcessRegions.process(PostProcessRegions.java:21)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:31)
        */
    private static int a(int r19, int[] r20, java.nio.charset.Charset r21, int r22, java.lang.StringBuilder r23) {
        /*
            Method dump skipped, instruction units count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.zxing.pdf417.decoder.e.a(int, int[], java.nio.charset.Charset, int, java.lang.StringBuilder):int");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x005e  */
    static com.google.zxing.common.e b(int[] iArr, String str) throws com.google.zxing.h {
        int iG;
        StringBuilder sb2 = new StringBuilder(iArr.length << 1);
        Charset charsetForName = StandardCharsets.ISO_8859_1;
        int i10 = iArr[1];
        aa.c cVar = new aa.c();
        int i11 = 2;
        while (i11 < iArr[0]) {
            if (i10 != f130775k) {
                switch (i10) {
                    case 900:
                        iG = g(iArr, i11, sb2);
                        break;
                    case 901:
                        iG = a(i10, iArr, charsetForName, i11, sb2);
                        break;
                    case 902:
                        iG = f(iArr, i11, sb2);
                        break;
                    default:
                        switch (i10) {
                            case f130774j /* 922 */:
                            case f130773i /* 923 */:
                                throw com.google.zxing.h.a();
                            case f130768d /* 924 */:
                                iG = a(i10, iArr, charsetForName, i11, sb2);
                                break;
                            case f130769e /* 925 */:
                                iG = i11 + 1;
                                break;
                            case f130770f /* 926 */:
                                iG = i11 + 2;
                                break;
                            case f130771g /* 927 */:
                                iG = i11 + 1;
                                charsetForName = Charset.forName(com.google.zxing.common.d.c(iArr[i11]).name());
                                break;
                            case 928:
                                iG = d(iArr, i11, cVar);
                                break;
                            default:
                                iG = g(iArr, i11 - 1, sb2);
                                break;
                        }
                        break;
                }
            } else {
                iG = i11 + 1;
                sb2.append((char) iArr[i11]);
            }
            if (iG >= iArr.length) {
                throw com.google.zxing.h.a();
            }
            i11 = iG + 1;
            i10 = iArr[iG];
        }
        if (sb2.length() == 0) {
            throw com.google.zxing.h.a();
        }
        com.google.zxing.common.e eVar = new com.google.zxing.common.e(null, sb2.toString(), null, str);
        eVar.o(cVar);
        return eVar;
    }

    private static String c(int[] iArr, int i10) throws com.google.zxing.h {
        BigInteger bigIntegerAdd = BigInteger.ZERO;
        for (int i11 = 0; i11 < i10; i11++) {
            bigIntegerAdd = bigIntegerAdd.add(C[(i10 - i11) - 1].multiply(BigInteger.valueOf(iArr[i11])));
        }
        String string = bigIntegerAdd.toString();
        if (string.charAt(0) == '1') {
            return string.substring(1);
        }
        throw com.google.zxing.h.a();
    }

    static int d(int[] iArr, int i10, aa.c cVar) throws com.google.zxing.h {
        if (i10 + 2 > iArr[0]) {
            throw com.google.zxing.h.a();
        }
        int[] iArr2 = new int[2];
        int i11 = 0;
        while (i11 < 2) {
            iArr2[i11] = iArr[i10];
            i11++;
            i10++;
        }
        cVar.t(Integer.parseInt(c(iArr2, 2)));
        StringBuilder sb2 = new StringBuilder();
        int iG = g(iArr, i10, sb2);
        cVar.n(sb2.toString());
        int i12 = iArr[iG] == f130773i ? iG + 1 : -1;
        while (iG < iArr[0]) {
            int i13 = iArr[iG];
            if (i13 == f130774j) {
                iG++;
                cVar.q(true);
            } else {
                if (i13 != f130773i) {
                    throw com.google.zxing.h.a();
                }
                switch (iArr[iG + 1]) {
                    case 0:
                        StringBuilder sb3 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb3);
                        cVar.o(sb3.toString());
                        break;
                    case 1:
                        StringBuilder sb4 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb4);
                        cVar.s(Integer.parseInt(sb4.toString()));
                        break;
                    case 2:
                        StringBuilder sb5 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb5);
                        cVar.v(Long.parseLong(sb5.toString()));
                        break;
                    case 3:
                        StringBuilder sb6 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb6);
                        cVar.u(sb6.toString());
                        break;
                    case 4:
                        StringBuilder sb7 = new StringBuilder();
                        iG = g(iArr, iG + 2, sb7);
                        cVar.l(sb7.toString());
                        break;
                    case 5:
                        StringBuilder sb8 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb8);
                        cVar.p(Long.parseLong(sb8.toString()));
                        break;
                    case 6:
                        StringBuilder sb9 = new StringBuilder();
                        iG = f(iArr, iG + 2, sb9);
                        cVar.m(Integer.parseInt(sb9.toString()));
                        break;
                    default:
                        throw com.google.zxing.h.a();
                }
            }
        }
        if (i12 != -1) {
            int i14 = iG - i12;
            if (cVar.k()) {
                i14--;
            }
            cVar.r(Arrays.copyOfRange(iArr, i12, i14 + i12));
        }
        return iG;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void e(int[] iArr, int[] iArr2, int i10, StringBuilder sb2) {
        b bVar;
        int i11;
        b bVar2 = b.ALPHA;
        b bVar3 = bVar2;
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = iArr[i12];
            char c10 = ' ';
            switch (a.f130791a[bVar2.ordinal()]) {
                case 1:
                    if (i13 < 26) {
                        i11 = i13 + 65;
                        c10 = (char) i11;
                    } else {
                        if (i13 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i13 != f130775k) {
                            switch (i13) {
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar4 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar4;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 2:
                    if (i13 < 26) {
                        i11 = i13 + 97;
                        c10 = (char) i11;
                    } else {
                        if (i13 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i13 != f130775k) {
                            switch (i13) {
                                case 27:
                                    bVar = b.ALPHA_SHIFT;
                                    b bVar5 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar5;
                                    break;
                                case 28:
                                    bVar2 = b.MIXED;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar6 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar6;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 3:
                    if (i13 < 25) {
                        c10 = B[i13];
                    } else {
                        if (i13 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i13 != f130775k) {
                            switch (i13) {
                                case 25:
                                    bVar2 = b.PUNCT;
                                    break;
                                case 27:
                                    bVar2 = b.LOWER;
                                    break;
                                case 28:
                                    bVar2 = b.ALPHA;
                                    break;
                                case 29:
                                    bVar = b.PUNCT_SHIFT;
                                    b bVar7 = bVar;
                                    bVar3 = bVar2;
                                    bVar2 = bVar7;
                                    break;
                            }
                        } else {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 4:
                    if (i13 < 29) {
                        c10 = A[i13];
                    } else {
                        if (i13 == 29 || i13 == 900) {
                            bVar2 = b.ALPHA;
                        } else if (i13 == f130775k) {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    break;
                case 5:
                    if (i13 < 26) {
                        c10 = (char) (i13 + 65);
                    } else if (i13 != 26) {
                        bVar2 = i13 != 900 ? bVar3 : b.ALPHA;
                        c10 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                case 6:
                    if (i13 < 29) {
                        c10 = A[i13];
                    } else if (i13 == 29 || i13 == 900) {
                        bVar2 = b.ALPHA;
                        c10 = 0;
                    } else {
                        if (i13 == f130775k) {
                            sb2.append((char) iArr2[i12]);
                        }
                        c10 = 0;
                    }
                    bVar2 = bVar3;
                    break;
                default:
                    c10 = 0;
                    break;
            }
            if (c10 != 0) {
                sb2.append(c10);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0044 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x0009 A[SYNTHETIC] */
    private static int f(int[] iArr, int i10, StringBuilder sb2) throws com.google.zxing.h {
        int[] iArr2 = new int[15];
        boolean z10 = false;
        int i11 = 0;
        while (true) {
            int i12 = iArr[0];
            if (i10 < i12 && !z10) {
                int i13 = i10 + 1;
                int i14 = iArr[i10];
                if (i13 == i12) {
                    z10 = true;
                }
                if (i14 < 900) {
                    iArr2[i11] = i14;
                    i11++;
                } else {
                    if (i14 != 900 && i14 != 901 && i14 != 928) {
                        switch (i14) {
                            case f130774j /* 922 */:
                            case f130773i /* 923 */:
                            case f130768d /* 924 */:
                                z10 = true;
                                break;
                        }
                    } else {
                        z10 = true;
                    }
                    if (i11 % 15 != 0 || i14 == 902 || z10) {
                        if (i11 > 0) {
                            sb2.append(c(iArr2, i11));
                            i11 = 0;
                        }
                    }
                }
                i10 = i13;
                if (i11 % 15 != 0) {
                }
                if (i11 > 0) {
                    sb2.append(c(iArr2, i11));
                    i11 = 0;
                }
            }
        }
        return i10;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x0042. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:17:0x0046. Please report as an issue. */
    private static int g(int[] iArr, int i10, StringBuilder sb2) {
        int i11 = iArr[0];
        int[] iArr2 = new int[(i11 - i10) << 1];
        int[] iArr3 = new int[(i11 - i10) << 1];
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iArr[0] && !z10) {
            int i13 = i10 + 1;
            int i14 = iArr[i10];
            if (i14 < 900) {
                iArr2[i12] = i14 / 30;
                iArr2[i12 + 1] = i14 % 30;
                i12 += 2;
            } else if (i14 != f130775k) {
                if (i14 != 928) {
                    switch (i14) {
                        case 900:
                            iArr2[i12] = 900;
                            i12++;
                            break;
                        case 901:
                        case 902:
                            break;
                        default:
                            switch (i14) {
                                case f130774j /* 922 */:
                                case f130773i /* 923 */:
                                case f130768d /* 924 */:
                                    break;
                                default:
                                    break;
                            }
                            break;
                    }
                }
                z10 = true;
            } else {
                iArr2[i12] = f130775k;
                i10 += 2;
                iArr3[i12] = iArr[i13];
                i12++;
            }
            i10 = i13;
        }
        e(iArr2, iArr3, i12, sb2);
        return i10;
    }
}
