package com.google.zxing.oned;

import java.util.Arrays;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class y extends r {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f130734d = 0.48f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f130735e = 0.7f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final int[] f130736f = {1, 1, 1};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final int[] f130737g = {1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final int[] f130738h = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    static final int[][] f130739i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final int[][] f130740j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final StringBuilder f130741a = new StringBuilder(20);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final x f130742b = new x();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final m f130743c = new m();

    static {
        int[][] iArr = {new int[]{3, 2, 1, 1}, new int[]{2, 2, 2, 1}, new int[]{2, 1, 2, 2}, new int[]{1, 4, 1, 1}, new int[]{1, 1, 3, 2}, new int[]{1, 2, 3, 1}, new int[]{1, 1, 1, 4}, new int[]{1, 3, 1, 2}, new int[]{1, 2, 1, 3}, new int[]{3, 1, 1, 2}};
        f130739i = iArr;
        int[][] iArr2 = new int[20][];
        f130740j = iArr2;
        System.arraycopy(iArr, 0, iArr2, 0, 10);
        for (int i10 = 10; i10 < 20; i10++) {
            int[] iArr3 = f130739i[i10 - 10];
            int[] iArr4 = new int[iArr3.length];
            for (int i11 = 0; i11 < iArr3.length; i11++) {
                iArr4[i11] = iArr3[(iArr3.length - i11) - 1];
            }
            f130740j[i10] = iArr4;
        }
    }

    protected y() {
    }

    static boolean i(CharSequence charSequence) throws com.google.zxing.h {
        int length = charSequence.length();
        if (length == 0) {
            return false;
        }
        int i10 = length - 1;
        return r(charSequence.subSequence(0, i10)) == Character.digit(charSequence.charAt(i10), 10);
    }

    static int j(com.google.zxing.common.a aVar, int[] iArr, int i10, int[][] iArr2) throws com.google.zxing.m {
        r.f(aVar, i10, iArr);
        int length = iArr2.length;
        float f10 = f130734d;
        int i11 = -1;
        for (int i12 = 0; i12 < length; i12++) {
            float fE = r.e(iArr, iArr2[i12], 0.7f);
            if (fE < f10) {
                i11 = i12;
                f10 = fE;
            }
        }
        if (i11 >= 0) {
            return i11;
        }
        throw com.google.zxing.m.a();
    }

    static int[] n(com.google.zxing.common.a aVar, int i10, boolean z10, int[] iArr) throws com.google.zxing.m {
        return o(aVar, i10, z10, iArr, new int[iArr.length]);
    }

    private static int[] o(com.google.zxing.common.a aVar, int i10, boolean z10, int[] iArr, int[] iArr2) throws com.google.zxing.m {
        int iL = aVar.l();
        int iK = z10 ? aVar.k(i10) : aVar.j(i10);
        int length = iArr.length;
        boolean z11 = z10;
        int i11 = 0;
        int i12 = iK;
        while (iK < iL) {
            if (aVar.h(iK) != z11) {
                iArr2[i11] = iArr2[i11] + 1;
            } else {
                if (i11 != length - 1) {
                    i11++;
                } else {
                    if (r.e(iArr2, iArr, 0.7f) < f130734d) {
                        return new int[]{i12, iK};
                    }
                    i12 += iArr2[0] + iArr2[1];
                    int i13 = i11 - 1;
                    System.arraycopy(iArr2, 2, iArr2, 0, i13);
                    iArr2[i13] = 0;
                    iArr2[i11] = 0;
                    i11--;
                }
                iArr2[i11] = 1;
                z11 = !z11;
            }
            iK++;
        }
        throw com.google.zxing.m.a();
    }

    static int[] p(com.google.zxing.common.a aVar) throws com.google.zxing.m {
        int[] iArr = new int[f130736f.length];
        int[] iArrO = null;
        boolean zO = false;
        int i10 = 0;
        while (!zO) {
            int[] iArr2 = f130736f;
            Arrays.fill(iArr, 0, iArr2.length, 0);
            iArrO = o(aVar, i10, false, iArr2, iArr);
            int i11 = iArrO[0];
            int i12 = iArrO[1];
            int i13 = i11 - (i12 - i11);
            if (i13 >= 0) {
                zO = aVar.o(i13, i11, false);
            }
            i10 = i12;
        }
        return iArrO;
    }

    static int r(CharSequence charSequence) throws com.google.zxing.h {
        int length = charSequence.length();
        int i10 = 0;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            int iCharAt = charSequence.charAt(i11) - '0';
            if (iCharAt < 0 || iCharAt > 9) {
                throw com.google.zxing.h.a();
            }
            i10 += iCharAt;
        }
        int i12 = i10 * 3;
        for (int i13 = length - 2; i13 >= 0; i13 -= 2) {
            int iCharAt2 = charSequence.charAt(i13) - '0';
            if (iCharAt2 < 0 || iCharAt2 > 9) {
                throw com.google.zxing.h.a();
            }
            i12 += iCharAt2;
        }
        return (1000 - i12) % 10;
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        return m(i10, aVar, p(aVar), map);
    }

    boolean h(String str) throws com.google.zxing.h {
        return i(str);
    }

    int[] k(com.google.zxing.common.a aVar, int i10) throws com.google.zxing.m {
        return n(aVar, i10, false, f130736f);
    }

    protected abstract int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m;

    public com.google.zxing.r m(int i10, com.google.zxing.common.a aVar, int[] iArr, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        int length;
        String strC;
        int[] iArr2 = null;
        com.google.zxing.u uVar = map == null ? null : (com.google.zxing.u) map.get(com.google.zxing.e.NEED_RESULT_POINT_CALLBACK);
        int i11 = 0;
        if (uVar != null) {
            uVar.a(new com.google.zxing.t((iArr[0] + iArr[1]) / 2.0f, i10));
        }
        StringBuilder sb2 = this.f130741a;
        sb2.setLength(0);
        int iL = l(aVar, iArr, sb2);
        if (uVar != null) {
            uVar.a(new com.google.zxing.t(iL, i10));
        }
        int[] iArrK = k(aVar, iL);
        if (uVar != null) {
            uVar.a(new com.google.zxing.t((iArrK[0] + iArrK[1]) / 2.0f, i10));
        }
        int i12 = iArrK[1];
        int i13 = (i12 - iArrK[0]) + i12;
        if (i13 >= aVar.l() || !aVar.o(i12, i13, false)) {
            throw com.google.zxing.m.a();
        }
        String string = sb2.toString();
        if (string.length() < 8) {
            throw com.google.zxing.h.a();
        }
        if (!h(string)) {
            throw com.google.zxing.d.a();
        }
        float f10 = (iArr[1] + iArr[0]) / 2.0f;
        float f11 = (iArrK[1] + iArrK[0]) / 2.0f;
        com.google.zxing.a aVarQ = q();
        float f12 = i10;
        com.google.zxing.r rVar = new com.google.zxing.r(string, null, new com.google.zxing.t[]{new com.google.zxing.t(f10, f12), new com.google.zxing.t(f11, f12)}, aVarQ);
        try {
            com.google.zxing.r rVarA = this.f130742b.a(i10, aVar, iArrK[1]);
            rVar.j(com.google.zxing.s.UPC_EAN_EXTENSION, rVarA.g());
            rVar.i(rVarA.e());
            rVar.a(rVarA.f());
            length = rVarA.g().length();
        } catch (com.google.zxing.q unused) {
            length = 0;
        }
        if (map != null) {
            iArr2 = (int[]) map.get(com.google.zxing.e.ALLOWED_EAN_EXTENSIONS);
        }
        if (iArr2 != null) {
            int length2 = iArr2.length;
            while (true) {
                if (i11 >= length2) {
                    throw com.google.zxing.m.a();
                }
                if (length == iArr2[i11]) {
                    break;
                }
                i11++;
            }
        }
        if ((aVarQ == com.google.zxing.a.EAN_13 || aVarQ == com.google.zxing.a.UPC_A) && (strC = this.f130743c.c(string)) != null) {
            rVar.j(com.google.zxing.s.POSSIBLE_COUNTRY, strC);
        }
        return rVar;
    }

    abstract com.google.zxing.a q();
}
