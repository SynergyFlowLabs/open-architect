package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class l extends z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130613a = 67;

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.EAN_8) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode EAN_8, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length == 7) {
            try {
                str = str + y.r(str);
            } catch (com.google.zxing.h e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            if (length != 8) {
                throw new IllegalArgumentException("Requested contents should be 8 digits long, but got ".concat(String.valueOf(length)));
            }
            try {
                if (!y.i(str)) {
                    throw new IllegalArgumentException("Contents do not pass checksum");
                }
            } catch (com.google.zxing.h unused) {
                throw new IllegalArgumentException("Illegal contents");
            }
        }
        boolean[] zArr = new boolean[67];
        int iC = s.c(zArr, 0, y.f130736f, true);
        for (int i10 = 0; i10 <= 3; i10++) {
            iC += s.c(zArr, iC, y.f130739i[Character.digit(str.charAt(i10), 10)], false);
        }
        int iC2 = iC + s.c(zArr, iC, y.f130737g, false);
        for (int i11 = 4; i11 <= 7; i11++) {
            iC2 += s.c(zArr, iC2, y.f130739i[Character.digit(str.charAt(i11), 10)], true);
        }
        s.c(zArr, iC2, y.f130736f, true);
        return zArr;
    }
}
