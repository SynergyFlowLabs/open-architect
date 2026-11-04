package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class n extends r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f130616b = 0.38f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f130617c = 0.5f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130618d = 3;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130619e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130620f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int[] f130621g = {6, 8, 10, 12, 14};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int[] f130622h = {1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int[][] f130623i = {new int[]{1, 1, 2}, new int[]{1, 1, 3}};

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int[][] f130624j = {new int[]{1, 1, 2, 2, 1}, new int[]{2, 1, 1, 1, 2}, new int[]{1, 2, 1, 1, 2}, new int[]{2, 2, 1, 1, 1}, new int[]{1, 1, 2, 1, 2}, new int[]{2, 1, 2, 1, 1}, new int[]{1, 2, 2, 1, 1}, new int[]{1, 1, 1, 2, 2}, new int[]{2, 1, 1, 2, 1}, new int[]{1, 2, 1, 2, 1}, new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f130625a = -1;

    private static int h(int[] iArr) throws com.google.zxing.m {
        int length = f130624j.length;
        float f10 = 0.38f;
        int i10 = -1;
        for (int i11 = 0; i11 < length; i11++) {
            float fE = r.e(iArr, f130624j[i11], 0.5f);
            if (fE < f10) {
                i10 = i11;
                f10 = fE;
            } else if (fE == f10) {
                i10 = -1;
            }
        }
        if (i10 >= 0) {
            return i10 % 10;
        }
        throw com.google.zxing.m.a();
    }

    private int[] i(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int[] iArrL;
        aVar.q();
        try {
            int iM = m(aVar);
            try {
                iArrL = l(aVar, iM, f130623i[0]);
            } catch (com.google.zxing.m unused) {
                iArrL = l(aVar, iM, f130623i[1]);
            }
            n(aVar, iArrL[0]);
            int i10 = iArrL[0];
            iArrL[0] = aVar.l() - iArrL[1];
            iArrL[1] = aVar.l() - i10;
            aVar.q();
            return iArrL;
        } catch (Throwable th2) {
            aVar.q();
            throw th2;
        }
    }

    private static void j(com.google.zxing.common.a aVar, int i10, int i11, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr = new int[10];
        int[] iArr2 = new int[5];
        int[] iArr3 = new int[5];
        while (i10 < i11) {
            r.f(aVar, i10, iArr);
            for (int i12 = 0; i12 < 5; i12++) {
                int i13 = i12 * 2;
                iArr2[i12] = iArr[i13];
                iArr3[i12] = iArr[i13 + 1];
            }
            sb2.append((char) (h(iArr2) + 48));
            sb2.append((char) (h(iArr3) + 48));
            for (int i14 = 0; i14 < 10; i14++) {
                i10 += iArr[i14];
            }
        }
    }

    private int[] k(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int[] iArrL = l(aVar, m(aVar), f130622h);
        int i10 = iArrL[1];
        int i11 = iArrL[0];
        this.f130625a = (i10 - i11) / 4;
        n(aVar, i11);
        return iArrL;
    }

    private static int[] l(com.google.zxing.common.a aVar, int i10, int[] iArr) throws com.google.zxing.m {
        int length = iArr.length;
        int[] iArr2 = new int[length];
        int iL = aVar.l();
        int i11 = i10;
        boolean z10 = false;
        int i12 = 0;
        while (i10 < iL) {
            if (aVar.h(i10) != z10) {
                iArr2[i12] = iArr2[i12] + 1;
            } else {
                if (i12 != length - 1) {
                    i12++;
                } else {
                    if (r.e(iArr2, iArr, 0.5f) < 0.38f) {
                        return new int[]{i11, i10};
                    }
                    i11 += iArr2[0] + iArr2[1];
                    int i13 = i12 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i12] = 0;
                    i12--;
                }
                iArr2[i12] = 1;
                z10 = !z10;
            }
            i10++;
        }
        throw com.google.zxing.m.a();
    }

    private static int m(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int iL = aVar.l();
        int iJ = aVar.j(0);
        if (iJ != iL) {
            return iJ;
        }
        throw com.google.zxing.m.a();
    }

    private void n(com.google.zxing.common.a aVar, int i10) throws com.google.zxing.m {
        int i11 = this.f130625a * 10;
        if (i11 >= i10) {
            i11 = i10;
        }
        for (int i12 = i10 - 1; i11 > 0 && i12 >= 0 && !aVar.h(i12); i12--) {
            i11--;
        }
        if (i11 != 0) {
            throw com.google.zxing.m.a();
        }
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.h {
        boolean z10;
        int[] iArrK = k(aVar);
        int[] iArrI = i(aVar);
        StringBuilder sb2 = new StringBuilder(20);
        j(aVar, iArrK[1], iArrI[0], sb2);
        String string = sb2.toString();
        int[] iArr = map != null ? (int[]) map.get(com.google.zxing.e.ALLOWED_LENGTHS) : null;
        if (iArr == null) {
            iArr = f130621g;
        }
        int length = string.length();
        int length2 = iArr.length;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (i11 >= length2) {
                z10 = false;
                break;
            }
            int i13 = iArr[i11];
            if (length == i13) {
                z10 = true;
                break;
            }
            if (i13 > i12) {
                i12 = i13;
            }
            i11++;
        }
        if (!z10 && length > i12) {
            z10 = true;
        }
        if (!z10) {
            throw com.google.zxing.h.a();
        }
        float f10 = i10;
        return new com.google.zxing.r(string, null, new com.google.zxing.t[]{new com.google.zxing.t(iArrK[1], f10), new com.google.zxing.t(iArrI[0], f10)}, com.google.zxing.a.ITF);
    }
}
