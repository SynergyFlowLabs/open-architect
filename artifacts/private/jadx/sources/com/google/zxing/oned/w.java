package com.google.zxing.oned;

import java.util.EnumMap;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
final class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int[] f130728c = {24, 20, 18, 17, 12, 6, 3, 10, 9, 5};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int[] f130729a = new int[4];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final StringBuilder f130730b = new StringBuilder();

    w() {
    }

    private int a(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr2 = this.f130729a;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int iK = iArr[1];
        int i10 = 0;
        for (int i11 = 0; i11 < 5 && iK < iL; i11++) {
            int iJ = y.j(aVar, iArr2, iK, y.f130740j);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i12 : iArr2) {
                iK += i12;
            }
            if (iJ >= 10) {
                i10 |= 1 << (4 - i11);
            }
            if (i11 != 4) {
                iK = aVar.k(aVar.j(iK));
            }
        }
        if (sb2.length() != 5) {
            throw com.google.zxing.m.a();
        }
        if (d(sb2.toString()) == c(i10)) {
            return iK;
        }
        throw com.google.zxing.m.a();
    }

    private static int c(int i10) throws com.google.zxing.m {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f130728c[i11]) {
                return i11;
            }
        }
        throw com.google.zxing.m.a();
    }

    private static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int iCharAt = 0;
        for (int i10 = length - 2; i10 >= 0; i10 -= 2) {
            iCharAt += charSequence.charAt(i10) - '0';
        }
        int iCharAt2 = iCharAt * 3;
        for (int i11 = length - 1; i11 >= 0; i11 -= 2) {
            iCharAt2 += charSequence.charAt(i11) - '0';
        }
        return (iCharAt2 * 3) % 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    private static String e(String str) {
        String str2;
        byte b10 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt == '0') {
            str2 = "£";
        } else if (cCharAt != '5') {
            str2 = "";
            if (cCharAt == '9') {
                switch (str.hashCode()) {
                    case 54118329:
                        if (!str.equals("90000")) {
                            b10 = -1;
                        }
                        break;
                    case 54395376:
                        if (!str.equals("99990")) {
                            b10 = -1;
                        } else {
                            b10 = 1;
                        }
                        break;
                    case 54395377:
                        if (!str.equals("99991")) {
                            b10 = -1;
                        } else {
                            b10 = 2;
                        }
                        break;
                    default:
                        b10 = -1;
                        break;
                }
                switch (b10) {
                    case 0:
                        return null;
                    case 1:
                        return "Used";
                    case 2:
                        return "0.00";
                }
            }
        } else {
            str2 = "$";
        }
        int i10 = Integer.parseInt(str.substring(1));
        String strValueOf = String.valueOf(i10 / 100);
        int i11 = i10 % 100;
        return str2 + strValueOf + '.' + (i11 < 10 ? com.facebook.appevents.p.f99189d0.concat(String.valueOf(i11)) : String.valueOf(i11));
    }

    private static Map<com.google.zxing.s, Object> f(String str) {
        String strE;
        if (str.length() != 5 || (strE = e(str)) == null) {
            return null;
        }
        EnumMap enumMap = new EnumMap(com.google.zxing.s.class);
        enumMap.put(com.google.zxing.s.SUGGESTED_PRICE, strE);
        return enumMap;
    }

    com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, int[] iArr) throws com.google.zxing.m {
        StringBuilder sb2 = this.f130730b;
        sb2.setLength(0);
        int iA = a(aVar, iArr, sb2);
        String string = sb2.toString();
        Map<com.google.zxing.s, Object> mapF = f(string);
        float f10 = i10;
        com.google.zxing.r rVar = new com.google.zxing.r(string, null, new com.google.zxing.t[]{new com.google.zxing.t((iArr[0] + iArr[1]) / 2.0f, f10), new com.google.zxing.t(iA, f10)}, com.google.zxing.a.UPC_EAN_EXTENSION);
        if (mapF != null) {
            rVar.i(mapF);
        }
        return rVar;
    }
}
