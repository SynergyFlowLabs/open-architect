package com.google.zxing.pdf417.decoder;

import com.google.zxing.m;
import com.google.zxing.t;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Formatter;

/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130818a = 2;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130819b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130820c = 512;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final com.google.zxing.pdf417.decoder.ec.a f130821d = new com.google.zxing.pdf417.decoder.ec.a();

    private j() {
    }

    private static c a(h hVar) throws m {
        int[] iArrJ;
        int i10;
        if (hVar == null || (iArrJ = hVar.j()) == null) {
            return null;
        }
        int iP = p(iArrJ);
        int i11 = 0;
        int i12 = 0;
        for (int i13 : iArrJ) {
            i12 += iP - i13;
            if (i13 > 0) {
                break;
            }
        }
        d[] dVarArrD = hVar.d();
        for (int i14 = 0; i12 > 0 && dVarArrD[i14] == null; i14++) {
            i12--;
        }
        int length = iArrJ.length;
        do {
            length--;
            if (length < 0) {
                break;
            }
            i10 = iArrJ[length];
            i11 += iP - i10;
        } while (i10 <= 0);
        for (int length2 = dVarArrD.length - 1; i11 > 0 && dVarArrD[length2] == null; length2--) {
            i11--;
        }
        return hVar.a().a(i12, i11, hVar.k());
    }

    private static void b(f fVar, b[][] bVarArr) throws m {
        b bVar = bVarArr[0][1];
        int[] iArrB = bVar.b();
        int iJ = (fVar.j() * fVar.l()) - r(fVar.k());
        if (iArrB.length != 0) {
            if (iArrB[0] != iJ) {
                bVar.c(iJ);
            }
        } else {
            if (iJ <= 0 || iJ > 928) {
                throw m.a();
            }
            bVar.c(iJ);
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001a  */
    /* JADX WARN: Code duplicated, block: B:18:0x0025 A[LOOP:1: B:8:0x000c->B:18:0x0025, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:23:0x0023 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0027 A[EDGE_INSN: B:26:0x0027->B:19:0x0027 BREAK  A[LOOP:1: B:8:0x000c->B:18:0x0025], SYNTHETIC] */
    private static int c(com.google.zxing.common.b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int i14 = z10 ? -1 : 1;
        int i15 = i12;
        for (int i16 = 0; i16 < 2; i16++) {
            while (true) {
                if (!z10) {
                    if (i15 >= i11) {
                        break;
                    }
                    if (z10 == bVar.e(i15, i13)) {
                        break;
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                } else {
                    if (i15 < i10) {
                        break;
                    }
                    if (z10 == bVar.e(i15, i13)) {
                        break;
                    }
                    if (Math.abs(i12 - i15) > 2) {
                        return i12;
                    }
                    i15 += i14;
                }
            }
            i14 = -i14;
            z10 = !z10;
        }
        return i15;
    }

    private static boolean d(int i10, int i11, int i12) {
        return i11 + (-2) <= i10 && i10 <= i12 + 2;
    }

    private static int e(int[] iArr, int[] iArr2, int i10) throws com.google.zxing.d {
        if ((iArr2 == null || iArr2.length <= (i10 / 2) + 3) && i10 >= 0 && i10 <= 512) {
            return f130821d.a(iArr, i10, iArr2);
        }
        throw com.google.zxing.d.a();
    }

    private static b[][] f(f fVar) {
        int iC;
        b[][] bVarArr = (b[][]) Array.newInstance((Class<?>) b.class, fVar.l(), fVar.j() + 2);
        for (b[] bVarArr2 : bVarArr) {
            int i10 = 0;
            while (true) {
                if (i10 < bVarArr2.length) {
                    bVarArr2[i10] = new b();
                    i10++;
                }
            }
        }
        int i11 = 0;
        for (g gVar : fVar.o()) {
            if (gVar != null) {
                for (d dVar : gVar.d()) {
                    if (dVar != null && (iC = dVar.c()) >= 0 && iC < bVarArr.length) {
                        bVarArr[iC][i11].c(dVar.e());
                    }
                }
            }
            i11++;
        }
        return bVarArr;
    }

    private static com.google.zxing.common.e g(f fVar) throws m, com.google.zxing.d, com.google.zxing.h {
        b[][] bVarArrF = f(fVar);
        b(fVar, bVarArrF);
        ArrayList arrayList = new ArrayList();
        int[] iArr = new int[fVar.l() * fVar.j()];
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (int i10 = 0; i10 < fVar.l(); i10++) {
            int i11 = 0;
            while (i11 < fVar.j()) {
                int i12 = i11 + 1;
                int[] iArrB = bVarArrF[i10][i12].b();
                int iJ = (fVar.j() * i10) + i11;
                if (iArrB.length == 0) {
                    arrayList.add(Integer.valueOf(iJ));
                } else if (iArrB.length == 1) {
                    iArr[iJ] = iArrB[0];
                } else {
                    arrayList3.add(Integer.valueOf(iJ));
                    arrayList2.add(iArrB);
                }
                i11 = i12;
            }
        }
        int size = arrayList2.size();
        int[][] iArr2 = new int[size][];
        for (int i13 = 0; i13 < size; i13++) {
            iArr2[i13] = (int[]) arrayList2.get(i13);
        }
        return h(fVar.k(), iArr, aa.a.c(arrayList), aa.a.c(arrayList3), iArr2);
    }

    private static com.google.zxing.common.e h(int i10, int[] iArr, int[] iArr2, int[] iArr3, int[][] iArr4) throws com.google.zxing.d, com.google.zxing.h {
        int length = iArr3.length;
        int[] iArr5 = new int[length];
        int i11 = 100;
        while (true) {
            int i12 = i11 - 1;
            if (i11 <= 0) {
                throw com.google.zxing.d.a();
            }
            for (int i13 = 0; i13 < length; i13++) {
                iArr[iArr3[i13]] = iArr4[i13][iArr5[i13]];
            }
            try {
                return j(iArr, i10, iArr2);
            } catch (com.google.zxing.d unused) {
                if (length == 0) {
                    throw com.google.zxing.d.a();
                }
                for (int i14 = 0; i14 < length; i14++) {
                    int i15 = iArr5[i14];
                    if (i15 < iArr4[i14].length - 1) {
                        iArr5[i14] = i15 + 1;
                        break;
                    }
                    iArr5[i14] = 0;
                    if (i14 == length - 1) {
                        throw com.google.zxing.d.a();
                    }
                }
                i11 = i12;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:58:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:77:0x0115 A[SYNTHETIC] */
    public static com.google.zxing.common.e i(com.google.zxing.common.b bVar, t tVar, t tVar2, t tVar3, t tVar4, int i10, int i11) throws m, com.google.zxing.d, com.google.zxing.h {
        c cVar;
        g hVar;
        g gVar;
        int i12;
        int i13;
        d dVarK;
        h hVar2 = null;
        boolean z10 = false;
        c cVar2 = new c(bVar, tVar, tVar2, tVar3, tVar4);
        h hVarS = null;
        f fVarV = null;
        int i14 = 0;
        while (true) {
            if (i14 >= 2) {
                cVar = cVar2;
                break;
            }
            h hVarS2 = tVar != null ? s(bVar, cVar2, tVar, true, i10, i11) : hVar2;
            if (tVar3 != null) {
                hVarS = s(bVar, cVar2, tVar3, false, i10, i11);
            }
            cVar = cVar2;
            fVarV = v(hVarS2, hVarS);
            if (fVarV == null) {
                throw m.a();
            }
            if (i14 != 0 || fVarV.m() == null || (fVarV.m().g() >= cVar.g() && fVarV.m().e() <= cVar.e())) {
                fVarV.p(cVar);
                hVar2 = hVarS2;
                break;
            }
            cVar2 = fVarV.m();
            i14++;
            hVar2 = hVarS2;
        }
        f fVar = fVarV;
        int iJ = fVar.j() + 1;
        fVar.q(0, hVar2);
        fVar.q(iJ, hVarS);
        boolean z11 = hVar2 != null;
        int i15 = i10;
        int i16 = i11;
        int i17 = 1;
        while (i17 <= iJ) {
            int i18 = z11 ? i17 : iJ - i17;
            if (fVar.n(i18) == null) {
                if (i18 == 0 || i18 == iJ) {
                    hVar = new h(cVar, i18 == 0 ? true : z10);
                } else {
                    hVar = new g(cVar);
                }
                fVar.q(i18, hVar);
                int i19 = -1;
                int iMin = i15;
                int iMax = i16;
                int iG = cVar.g();
                int i20 = -1;
                while (iG <= cVar.e()) {
                    int iT = t(fVar, i18, iG, z11);
                    if (iT >= 0 && iT <= cVar.d()) {
                        gVar = hVar;
                        i12 = i19;
                        i13 = iT;
                        dVarK = k(bVar, cVar.f(), cVar.d(), z11, i13, iG, iMin, iMax);
                        if (dVarK != null) {
                            gVar.f(iG, dVarK);
                            iMin = Math.min(iMin, dVarK.f());
                            iMax = Math.max(iMax, dVarK.f());
                            i20 = i13;
                        }
                    } else if (i20 != i19) {
                        iT = i20;
                        gVar = hVar;
                        i12 = i19;
                        i13 = iT;
                        dVarK = k(bVar, cVar.f(), cVar.d(), z11, i13, iG, iMin, iMax);
                        if (dVarK != null) {
                            gVar.f(iG, dVarK);
                            iMin = Math.min(iMin, dVarK.f());
                            iMax = Math.max(iMax, dVarK.f());
                            i20 = i13;
                        }
                    } else {
                        gVar = hVar;
                        i12 = i19;
                    }
                    iG++;
                    hVar = gVar;
                    i19 = i12;
                }
                i15 = iMin;
                i16 = iMax;
            }
            i17++;
            z10 = false;
        }
        return g(fVar);
    }

    private static com.google.zxing.common.e j(int[] iArr, int i10, int[] iArr2) throws com.google.zxing.d, com.google.zxing.h {
        if (iArr.length == 0) {
            throw com.google.zxing.h.a();
        }
        int i11 = 1 << (i10 + 1);
        int iE = e(iArr, iArr2, i11);
        x(iArr, i11);
        com.google.zxing.common.e eVarB = e.b(iArr, String.valueOf(i10));
        eVarB.m(Integer.valueOf(iE));
        eVarB.l(Integer.valueOf(iArr2.length));
        return eVarB;
    }

    private static d k(com.google.zxing.common.b bVar, int i10, int i11, boolean z10, int i12, int i13, int i14, int i15) {
        int i16;
        int iD;
        int iB;
        int iC = c(bVar, i10, i11, z10, i12, i13);
        int[] iArrQ = q(bVar, i10, i11, z10, iC, i13);
        if (iArrQ == null) {
            return null;
        }
        int iD2 = w9.a.d(iArrQ);
        if (z10) {
            i16 = iC + iD2;
        } else {
            for (int i17 = 0; i17 < iArrQ.length / 2; i17++) {
                int i18 = iArrQ[i17];
                iArrQ[i17] = iArrQ[(iArrQ.length - 1) - i17];
                iArrQ[(iArrQ.length - 1) - i17] = i18;
            }
            iC -= iD2;
            i16 = iC;
        }
        if (d(iD2, i14, i15) && (iB = aa.a.b((iD = i.d(iArrQ)))) != -1) {
            return new d(iC, i16, n(iD), iB);
        }
        return null;
    }

    private static a l(h hVar, h hVar2) {
        a aVarI;
        a aVarI2;
        if (hVar == null || (aVarI = hVar.i()) == null) {
            if (hVar2 == null) {
                return null;
            }
            return hVar2.i();
        }
        if (hVar2 == null || (aVarI2 = hVar2.i()) == null || aVarI.a() == aVarI2.a() || aVarI.b() == aVarI2.b() || aVarI.c() == aVarI2.c()) {
            return aVarI;
        }
        return null;
    }

    private static int[] m(int i10) {
        int[] iArr = new int[8];
        int i11 = 0;
        int i12 = 7;
        while (true) {
            int i13 = i10 & 1;
            if (i13 != i11) {
                i12--;
                if (i12 < 0) {
                    return iArr;
                }
                i11 = i13;
            }
            iArr[i12] = iArr[i12] + 1;
            i10 >>= 1;
        }
    }

    private static int n(int i10) {
        return o(m(i10));
    }

    private static int o(int[] iArr) {
        return ((((iArr[0] - iArr[2]) + iArr[4]) - iArr[6]) + 9) % 9;
    }

    private static int p(int[] iArr) {
        int iMax = -1;
        for (int i10 : iArr) {
            iMax = Math.max(iMax, i10);
        }
        return iMax;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0019  */
    /* JADX WARN: Code duplicated, block: B:28:0x002e A[EDGE_INSN: B:28:0x002e->B:16:0x002e BREAK  A[LOOP:0: B:7:0x0010->B:31:0x0010], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x0027 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x001f A[SYNTHETIC] */
    private static int[] q(com.google.zxing.common.b bVar, int i10, int i11, boolean z10, int i12, int i13) {
        int[] iArr = new int[8];
        int i14 = z10 ? 1 : -1;
        int i15 = 0;
        boolean z11 = z10;
        while (true) {
            if (!z10) {
                if (i12 < i10) {
                    break;
                }
                if (i15 < 8) {
                    break;
                    break;
                }
                if (bVar.e(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            } else {
                if (i12 >= i11) {
                    break;
                }
                if (i15 < 8) {
                    break;
                }
                if (bVar.e(i12, i13) == z11) {
                    iArr[i15] = iArr[i15] + 1;
                    i12 += i14;
                } else {
                    i15++;
                    z11 = !z11;
                }
            }
        }
        if (i15 != 8) {
            if (z10) {
                i10 = i11;
            }
            if (i12 != i10 || i15 != 7) {
                return null;
            }
        }
        return iArr;
    }

    private static int r(int i10) {
        return 2 << i10;
    }

    private static h s(com.google.zxing.common.b bVar, c cVar, t tVar, boolean z10, int i10, int i11) {
        h hVar = new h(cVar, z10);
        int i12 = 0;
        while (i12 < 2) {
            int i13 = i12 == 0 ? 1 : -1;
            int iC = (int) tVar.c();
            for (int iD = (int) tVar.d(); iD <= cVar.e() && iD >= cVar.g(); iD += i13) {
                d dVarK = k(bVar, 0, bVar.l(), z10, iC, iD, i10, i11);
                if (dVarK != null) {
                    hVar.f(iD, dVarK);
                    iC = z10 ? dVarK.d() : dVarK.b();
                }
            }
            i12++;
        }
        return hVar;
    }

    private static int t(f fVar, int i10, int i11, boolean z10) {
        int i12 = z10 ? 1 : -1;
        int i13 = i10 - i12;
        d dVarB = u(fVar, i13) ? fVar.n(i13).b(i11) : null;
        if (dVarB != null) {
            return z10 ? dVarB.b() : dVarB.d();
        }
        d dVarC = fVar.n(i10).c(i11);
        if (dVarC != null) {
            return z10 ? dVarC.d() : dVarC.b();
        }
        if (u(fVar, i13)) {
            dVarC = fVar.n(i13).c(i11);
        }
        if (dVarC != null) {
            return z10 ? dVarC.b() : dVarC.d();
        }
        int i14 = 0;
        while (true) {
            i10 -= i12;
            if (!u(fVar, i10)) {
                c cVarM = fVar.m();
                return z10 ? cVarM.f() : cVarM.d();
            }
            for (d dVar : fVar.n(i10).d()) {
                if (dVar != null) {
                    return (z10 ? dVar.b() : dVar.d()) + (i12 * i14 * (dVar.b() - dVar.d()));
                }
            }
            i14++;
        }
    }

    private static boolean u(f fVar, int i10) {
        return i10 >= 0 && i10 <= fVar.j() + 1;
    }

    private static f v(h hVar, h hVar2) throws m {
        a aVarL;
        if ((hVar != null || hVar2 != null) && (aVarL = l(hVar, hVar2)) != null) {
            return new f(aVarL, c.j(a(hVar), a(hVar2)));
        }
        return null;
    }

    public static String w(b[][] bVarArr) {
        Formatter formatter = new Formatter();
        for (int i10 = 0; i10 < bVarArr.length; i10++) {
            try {
                formatter.format("Row %2d: ", Integer.valueOf(i10));
                int i11 = 0;
                while (true) {
                    b[] bVarArr2 = bVarArr[i10];
                    if (i11 < bVarArr2.length) {
                        b bVar = bVarArr2[i11];
                        if (bVar.b().length == 0) {
                            formatter.format("        ", null);
                        } else {
                            formatter.format("%4d(%2d)", Integer.valueOf(bVar.b()[0]), bVar.a(bVar.b()[0]));
                        }
                        i11++;
                    }
                }
                formatter.format("%n", new Object[0]);
            } catch (Throwable th2) {
                try {
                    throw th2;
                } catch (Throwable th3) {
                    try {
                        formatter.close();
                    } catch (Throwable th4) {
                        th2.addSuppressed(th4);
                    }
                    throw th3;
                }
            }
        }
        String string = formatter.toString();
        formatter.close();
        return string;
    }

    private static void x(int[] iArr, int i10) throws com.google.zxing.h {
        if (iArr.length < 4) {
            throw com.google.zxing.h.a();
        }
        int i11 = iArr[0];
        if (i11 > iArr.length) {
            throw com.google.zxing.h.a();
        }
        if (i11 == 0) {
            if (i10 >= iArr.length) {
                throw com.google.zxing.h.a();
            }
            iArr[0] = iArr.length - i10;
        }
    }
}
