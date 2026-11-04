package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class j extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130611a = 95;

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.EAN_13) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_13, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 12) {
            try {
                str = str + y.r(str);
            } catch (com.google.zxing.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 13) {
                throw new IllegalArgumentException("Requested contents should be 12 or 13 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        int i10 = i.f130609l[Character.digit(str.charAt(0), 10)];
        boolean[] zArr = new boolean[95];
        int iC = s.c(zArr, 0, y.f130736f, true);
        for (int i11 = 1; i11 <= 6; i11++) {
            int iDigit = Character.digit(str.charAt(i11), 10);
            if (((i10 >> (6 - i11)) & 1) == 1) {
                iDigit += 10;
            }
            iC += s.c(zArr, iC, y.f130740j[iDigit], false);
        }
        int iC2 = iC + s.c(zArr, iC, y.f130737g, false);
        for (int i12 = 7; i12 <= 12; i12++) {
            iC2 += s.c(zArr, iC2, y.f130739i[Character.digit(str.charAt(i12), 10)], true);
        }
        s.c(zArr, iC2, y.f130736f, true);
        return zArr;
    }
}
