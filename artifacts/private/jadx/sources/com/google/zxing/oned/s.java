package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public abstract class s implements com.google.zxing.v {
    protected static int c(boolean[] zArr, int i10, int[] iArr, boolean z10) {
        int i11 = 0;
        for (int i12 : iArr) {
            int i13 = 0;
            while (i13 < i12) {
                zArr[i10] = z10;
                i13++;
                i10++;
            }
            i11 += i12;
            z10 = !z10;
        }
        return i11;
    }

    private static com.google.zxing.common.b f(boolean[] zArr, int i10, int i11, int i12) {
        int length = zArr.length;
        int i13 = i12 + length;
        int iMax = Math.max(i10, i13);
        int iMax2 = Math.max(1, i11);
        int i14 = iMax / i13;
        int i15 = (iMax - (length * i14)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(iMax, iMax2);
        int i16 = 0;
        while (i16 < length) {
            if (zArr[i16]) {
                bVar.r(i15, 0, i14, iMax2);
            }
            i16++;
            i15 += i14;
        }
        return bVar;
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Negative size is not allowed. Input: " + i10 + 'x' + i11);
        }
        int iE = e();
        if (map != null) {
            com.google.zxing.g gVar = com.google.zxing.g.MARGIN;
            if (map.containsKey(gVar)) {
                iE = Integer.parseInt(map.get(gVar).toString());
            }
        }
        return f(d(str), i10, i11, iE);
    }

    @Override // com.google.zxing.v
    public final com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) throws com.google.zxing.w {
        return a(str, aVar, i10, i11, null);
    }

    public abstract boolean[] d(String str);

    public int e() {
        return 10;
    }
}
