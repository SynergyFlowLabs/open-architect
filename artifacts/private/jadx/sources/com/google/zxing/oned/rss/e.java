package com.google.zxing.oned.rss;

import com.google.zxing.m;
import com.google.zxing.r;
import com.google.zxing.t;
import com.google.zxing.u;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import okhttp3.internal.ws.g;
import org.locationtech.jts.geom.l;

/* JADX INFO: loaded from: classes5.dex */
public final class e extends a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f130650m = {1, 10, 34, 70, g.f334652s};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int[] f130651n = {4, 20, 48, 81};

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f130652o = {0, 161, 961, 2015, 2715};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f130653p = {0, 336, 1036, 1516};

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int[] f130654q = {8, 6, 4, 3, 1};

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f130655r = {2, 4, 6, 8};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int[][] f130656s = {new int[]{3, 8, 2, 1}, new int[]{3, 5, 5, 1}, new int[]{3, 3, 7, 1}, new int[]{3, 1, 9, 1}, new int[]{2, 7, 4, 1}, new int[]{2, 5, 6, 1}, new int[]{2, 3, 8, 1}, new int[]{1, 5, 7, 1}, new int[]{1, 3, 9, 1}};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final List<d> f130657k = new ArrayList();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<d> f130658l = new ArrayList();

    private static void s(Collection<d> collection, d dVar) {
        if (dVar == null) {
            return;
        }
        for (d dVar2 : collection) {
            if (dVar2.b() == dVar.b()) {
                dVar2.e();
                return;
            }
        }
        collection.add(dVar);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003a A[PHI: r6 r7
      0x003a: PHI (r6v4 boolean) = (r6v2 boolean), (r6v10 boolean) binds: [B:26:0x0058, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]
      0x003a: PHI (r7v5 boolean) = (r7v3 boolean), (r7v15 boolean) binds: [B:26:0x0058, B:13:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fe  */
    private void t(boolean z10, int i10) throws m {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        int iD = w9.a.d(n());
        int iD2 = w9.a.d(l());
        boolean z15 = true;
        if (z10) {
            if (iD > 12) {
                z12 = true;
                z11 = false;
            } else if (iD < 4) {
                z11 = true;
                z12 = false;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iD2 > 12) {
                z14 = true;
                z13 = false;
            } else if (iD2 < 4) {
                z13 = true;
                z14 = false;
            } else {
                z13 = false;
                z14 = false;
            }
        } else {
            if (iD > 11) {
                z12 = true;
                z11 = false;
            } else if (iD < 5) {
                z11 = true;
                z12 = false;
            } else {
                z11 = false;
                z12 = false;
            }
            if (iD2 > 10) {
                z14 = true;
                z13 = false;
            } else if (iD2 < 4) {
                z13 = true;
                z14 = false;
            } else {
                z13 = false;
                z14 = false;
            }
        }
        int i11 = (iD + iD2) - i10;
        boolean z16 = (iD & 1) == z10;
        boolean z17 = (iD2 & 1) == 1;
        if (i11 != 1) {
            if (i11 == -1) {
                if (z16) {
                    if (z17) {
                        throw m.a();
                    }
                } else {
                    if (!z17) {
                        throw m.a();
                    }
                    z13 = true;
                }
            } else {
                if (i11 != 0) {
                    throw m.a();
                }
                if (z16) {
                    if (!z17) {
                        throw m.a();
                    }
                    if (iD < iD2) {
                        z14 = true;
                    } else {
                        z13 = true;
                        z12 = true;
                    }
                } else if (z17) {
                    throw m.a();
                }
            }
            if (z15) {
                if (!z12) {
                    throw m.a();
                }
                a.p(n(), o());
            }
            if (z12) {
                a.i(n(), o());
            }
            if (z13) {
                if (!z14) {
                    throw m.a();
                }
                a.p(l(), o());
            }
            if (z14) {
                a.i(l(), m());
            }
        }
        if (z16) {
            if (z17) {
                throw m.a();
            }
            z12 = true;
        } else {
            if (!z17) {
                throw m.a();
            }
            z14 = true;
        }
        z15 = z11;
        if (z15) {
            if (!z12) {
                throw m.a();
            }
            a.p(n(), o());
        }
        if (z12) {
            a.i(n(), o());
        }
        if (z13) {
            if (!z14) {
                throw m.a();
            }
            a.p(l(), o());
        }
        if (z14) {
            a.i(l(), m());
        }
    }

    private static boolean u(d dVar, d dVar2) {
        int iA = (dVar.a() + (dVar2.a() * 16)) % 79;
        int iC = (dVar.d().c() * 9) + dVar2.d().c();
        if (iC > 72) {
            iC--;
        }
        if (iC > 8) {
            iC--;
        }
        return iA == iC;
    }

    private static r v(d dVar, d dVar2) {
        String strValueOf = String.valueOf((((long) dVar.b()) * 4537077) + ((long) dVar2.b()));
        StringBuilder sb2 = new StringBuilder(14);
        for (int length = 13 - strValueOf.length(); length > 0; length--) {
            sb2.append(l.f338160j);
        }
        sb2.append(strValueOf);
        int i10 = 0;
        for (int i11 = 0; i11 < 13; i11++) {
            int iCharAt = sb2.charAt(i11) - l.f338160j;
            if ((i11 & 1) == 0) {
                iCharAt *= 3;
            }
            i10 += iCharAt;
        }
        int i12 = 10 - (i10 % 10);
        if (i12 == 10) {
            i12 = 0;
        }
        sb2.append(i12);
        t[] tVarArrA = dVar.d().a();
        t[] tVarArrA2 = dVar2.d().a();
        return new r(sb2.toString(), null, new t[]{tVarArrA[0], tVarArrA[1], tVarArrA2[0], tVarArrA2[1]}, com.google.zxing.a.RSS_14);
    }

    private b w(com.google.zxing.common.a aVar, c cVar, boolean z10) throws m {
        int[] iArrJ = j();
        for (int i10 = 0; i10 < iArrJ.length; i10++) {
            iArrJ[i10] = 0;
        }
        if (z10) {
            com.google.zxing.oned.r.g(aVar, cVar.b()[0], iArrJ);
        } else {
            com.google.zxing.oned.r.f(aVar, cVar.b()[1] + 1, iArrJ);
            int i11 = 0;
            for (int length = iArrJ.length - 1; i11 < length; length--) {
                int i12 = iArrJ[i11];
                iArrJ[i11] = iArrJ[length];
                iArrJ[length] = i12;
                i11++;
            }
        }
        int i13 = z10 ? 16 : 15;
        float fD = w9.a.d(iArrJ) / i13;
        int[] iArrN = n();
        int[] iArrL = l();
        float[] fArrO = o();
        float[] fArrM = m();
        for (int i14 = 0; i14 < iArrJ.length; i14++) {
            float f10 = iArrJ[i14] / fD;
            int i15 = (int) (0.5f + f10);
            if (i15 <= 0) {
                i15 = 1;
            } else if (i15 > 8) {
                i15 = 8;
            }
            int i16 = i14 / 2;
            if ((i14 & 1) == 0) {
                iArrN[i16] = i15;
                fArrO[i16] = f10 - i15;
            } else {
                iArrL[i16] = i15;
                fArrM[i16] = f10 - i15;
            }
        }
        t(z10, i13);
        int i17 = 0;
        int i18 = 0;
        for (int length2 = iArrN.length - 1; length2 >= 0; length2--) {
            int i19 = iArrN[length2];
            i17 = (i17 * 9) + i19;
            i18 += i19;
        }
        int i20 = 0;
        int i21 = 0;
        for (int length3 = iArrL.length - 1; length3 >= 0; length3--) {
            int i22 = iArrL[length3];
            i20 = (i20 * 9) + i22;
            i21 += i22;
        }
        int i23 = i17 + (i20 * 3);
        if (!z10) {
            if ((i21 & 1) != 0 || i21 > 10 || i21 < 4) {
                throw m.a();
            }
            int i24 = (10 - i21) / 2;
            int i25 = f130655r[i24];
            return new b((f.b(iArrL, 9 - i25, false) * f130651n[i24]) + f.b(iArrN, i25, true) + f130653p[i24], i23);
        }
        if ((i18 & 1) != 0 || i18 > 12 || i18 < 4) {
            throw m.a();
        }
        int i26 = (12 - i18) / 2;
        int i27 = f130654q[i26];
        return new b((f.b(iArrN, i27, false) * f130650m[i26]) + f.b(iArrL, 9 - i27, true) + f130652o[i26], i23);
    }

    private d x(com.google.zxing.common.a aVar, boolean z10, int i10, Map<com.google.zxing.e, ?> map) {
        try {
            int[] iArrY = y(aVar, z10);
            c cVarZ = z(aVar, i10, z10, iArrY);
            u uVar = map == null ? null : (u) map.get(com.google.zxing.e.NEED_RESULT_POINT_CALLBACK);
            if (uVar != null) {
                float fL = (iArrY[0] + iArrY[1]) / 2.0f;
                if (z10) {
                    fL = (aVar.l() - 1) - fL;
                }
                uVar.a(new t(fL, i10));
            }
            b bVarW = w(aVar, cVarZ, true);
            b bVarW2 = w(aVar, cVarZ, false);
            return new d((bVarW.b() * 1597) + bVarW2.b(), bVarW.a() + (bVarW2.a() * 4), cVarZ);
        } catch (m unused) {
            return null;
        }
    }

    private int[] y(com.google.zxing.common.a aVar, boolean z10) throws m {
        int[] iArrK = k();
        iArrK[0] = 0;
        iArrK[1] = 0;
        iArrK[2] = 0;
        iArrK[3] = 0;
        int iL = aVar.l();
        int i10 = 0;
        boolean z11 = false;
        while (i10 < iL) {
            z11 = !aVar.h(i10);
            if (z10 == z11) {
                break;
            }
            i10++;
        }
        int i11 = 0;
        int i12 = i10;
        while (i10 < iL) {
            if (aVar.h(i10) != z11) {
                iArrK[i11] = iArrK[i11] + 1;
            } else {
                if (i11 != 3) {
                    i11++;
                } else {
                    if (a.q(iArrK)) {
                        return new int[]{i12, i10};
                    }
                    i12 += iArrK[0] + iArrK[1];
                    iArrK[0] = iArrK[2];
                    iArrK[1] = iArrK[3];
                    iArrK[2] = 0;
                    iArrK[3] = 0;
                    i11--;
                }
                iArrK[i11] = 1;
                z11 = !z11;
            }
            i10++;
        }
        throw m.a();
    }

    private c z(com.google.zxing.common.a aVar, int i10, boolean z10, int[] iArr) throws m {
        int i11;
        boolean zH = aVar.h(iArr[0]);
        int i12 = iArr[0] - 1;
        while (i12 >= 0 && zH != aVar.h(i12)) {
            i12--;
        }
        int i13 = i12 + 1;
        int i14 = iArr[0] - i13;
        int[] iArrK = k();
        System.arraycopy(iArrK, 0, iArrK, 1, iArrK.length - 1);
        iArrK[0] = i14;
        int iR = a.r(iArrK, f130656s);
        int iL = iArr[1];
        if (z10) {
            int iL2 = (aVar.l() - 1) - i13;
            iL = (aVar.l() - 1) - iL;
            i11 = iL2;
        } else {
            i11 = i13;
        }
        return new c(iR, new int[]{i13, iArr[1]}, i11, iL, i10);
    }

    @Override // com.google.zxing.oned.r
    public r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws m {
        s(this.f130657k, x(aVar, false, i10, map));
        aVar.q();
        s(this.f130658l, x(aVar, true, i10, map));
        aVar.q();
        for (d dVar : this.f130657k) {
            if (dVar.c() > 1) {
                for (d dVar2 : this.f130658l) {
                    if (dVar2.c() > 1 && u(dVar, dVar2)) {
                        return v(dVar, dVar2);
                    }
                }
            }
        }
        throw m.a();
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.p
    public void reset() {
        this.f130657k.clear();
        this.f130658l.clear();
    }
}
