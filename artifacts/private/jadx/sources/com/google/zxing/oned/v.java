package com.google.zxing.oned;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130726a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f130727b = new StringBuilder();

    v() {
        int i10 = 7 >> 4;
    }

    private int a(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr2 = this.f130726a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 2 && iK < iL; i11++) {
            int iJ = y.j(aVar, iArr2, iK, y.f130740j);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i12 : iArr2) {
                iK += i12;
            }
            if (iJ >= 10) {
                i10 |= 1 << (1 - i11);
            }
            if (i11 != 1) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 2) {
            throw com.google.zxing.m.a();
        }
        if (Integer.parseInt(sb2.toString()) % 4 == i10) {
            return iK;
        }
        throw com.google.zxing.m.a();
    }

    private static Map<com.google.zxing.s, Object> c(String str) {
        if (str.length() != 2) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.s.class);
        enumMap.put(com.google.zxing.s.ISSUE_NUMBER, Integer.valueOf(str));
        return enumMap;
    }

    com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, int[] iArr) throws com.google.zxing.m {
        StringBuilder sb2 = this.f130727b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<com.google.zxing.s, Object> mapC = c(string);
        float f10 = i10;
        com.google.zxing.r rVar = new com.google.zxing.r(string, null, new com.google.zxing.t[]{new com.google.zxing.t((iArr[0] + iArr[1]) / 2.0f, f10), new com.google.zxing.t(iA, f10)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (mapC != null) {
            rVar.i(mapC);
        }
        return rVar;
    }
}
