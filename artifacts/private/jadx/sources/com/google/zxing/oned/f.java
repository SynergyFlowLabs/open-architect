package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class f extends s {
    private static void g(int i10, int[] iArr) {
        for (int i11 = 0; i11 < 9; i11++) {
            int i12 = 1;
            if (((1 << (8 - i11)) & i10) != 0) {
                i12 = 2;
            }
            iArr[i11] = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00f6  */
    private static String h(String str) {
        int length = str.length();
        StringBuilder sb2 = new StringBuilder();
        for (int i10 = 0; i10 < length; i10++) {
            char cCharAt = str.charAt(i10);
            if (cCharAt == 0) {
                sb2.append("%U");
            } else if (cCharAt == ' ') {
                sb2.append(cCharAt);
            } else if (cCharAt == '@') {
                sb2.append("%V");
            } else if (cCharAt == '`') {
                sb2.append("%W");
            } else if (cCharAt == '-' || cCharAt == '.') {
                sb2.append(cCharAt);
            } else if (cCharAt <= 26) {
                sb2.append('$');
                sb2.append((char) (cCharAt + '@'));
            } else if (cCharAt < ' ') {
                sb2.append('%');
                sb2.append((char) (cCharAt + kotlin.text.b0.f313279d));
            } else if (cCharAt <= ',' || cCharAt == '/' || cCharAt == ':') {
                sb2.append('/');
                sb2.append((char) (cCharAt + ' '));
            } else if (cCharAt <= '9') {
                sb2.append(cCharAt);
            } else if (cCharAt <= '?') {
                sb2.append('%');
                sb2.append((char) (cCharAt + 11));
            } else if (cCharAt <= 'Z') {
                sb2.append(cCharAt);
            } else if (cCharAt <= '_') {
                sb2.append('%');
                sb2.append((char) (cCharAt - 16));
            } else if (cCharAt <= 'z') {
                sb2.append('+');
                sb2.append((char) (cCharAt - ' '));
            } else {
                if (cCharAt > 127) {
                    throw new IllegalArgumentException("Requested content contains a non-encodable character: '" + str.charAt(i10) + "'");
                }
                sb2.append('%');
                sb2.append((char) (cCharAt - '+'));
            }
        }
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.CODE_39) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode CODE_39, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        for (int i10 = 0; i10 < length; i10++) {
            if ("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i10)) < 0) {
                str = h(str);
                length = str.length();
                if (length <= 80) {
                    break;
                }
                throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got " + length + " (extended full ASCII mode)");
            }
        }
        int[] iArr = new int[9];
        int i11 = length + 25;
        for (int i12 = 0; i12 < length; i12++) {
            g(e.f130597f["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i12))], iArr);
            for (int i13 = 0; i13 < 9; i13++) {
                i11 += iArr[i13];
            }
        }
        boolean[] zArr = new boolean[i11];
        g(com.planner5d.library.engine.input.f.b.G1, iArr);
        int iC = s.c(zArr, 0, iArr, true);
        int[] iArr2 = {1};
        int iC2 = iC + s.c(zArr, iC, iArr2, false);
        for (int i14 = 0; i14 < length; i14++) {
            g(e.f130597f["0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ-. $/+%".indexOf(str.charAt(i14))], iArr);
            int iC3 = iC2 + s.c(zArr, iC2, iArr, true);
            iC2 = iC3 + s.c(zArr, iC3, iArr2, false);
        }
        g(com.planner5d.library.engine.input.f.b.G1, iArr);
        s.c(zArr, iC2, iArr, true);
        return zArr;
    }
}
