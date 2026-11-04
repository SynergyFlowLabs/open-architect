package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class h extends s {
    @Deprecated
    protected static int c(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        return g(zArr, i10, iArr);
    }

    private static int g(boolean[] zArr, int i10, int[] iArr) {
        int length = iArr.length;
        int i11 = 0;
        while (i11 < length) {
            int i12 = i10 + 1;
            zArr[i10] = iArr[i11] != 0;
            i11++;
            i10 = i12;
        }
        return 9;
    }

    private static int h(String str, int i10) {
        int iIndexOf = 0;
        int i11 = 1;
        for (int length = str.length() - 1; length >= 0; length--) {
            iIndexOf += "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(length)) * i11;
            i11++;
            if (i11 > i10) {
                i11 = 1;
            }
        }
        return iIndexOf % 47;
    }

    private static void i(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) == 0) {
                i12 = 0;
            }
            iArr[i11] = i12;
        }
    }

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.CODE_93) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_93, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        int[] iArr = new int[9];
        int length2 = ((str.length() + 4) * 9) + 1;
        i(g.f130605e[47], iArr);
        boolean[] zArr = new boolean[length2];
        int iG = g(zArr, 0, iArr);
        for (int i10 = 0; i10 < length; i10++) {
            i(g.f130605e["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".indexOf(str.charAt(i10))], iArr);
            iG += g(zArr, iG, iArr);
        }
        int iH = h(str, 20);
        int[] iArr2 = g.f130605e;
        i(iArr2[iH], iArr);
        int iG2 = iG + g(zArr, iG, iArr);
        i(iArr2[h(str + "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%abcd*".charAt(iH), 15)], iArr);
        int iG3 = iG2 + g(zArr, iG2, iArr);
        i(iArr2[47], iArr);
        zArr[iG3 + g(zArr, iG3, iArr)] = true;
        return zArr;
    }
}
