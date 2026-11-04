package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class o extends s {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130628c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130629d = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f130626a = {1, 1, 1, 1};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int[] f130627b = {3, 1, 1};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int[][] f130630e = {new int[]{1, 1, 3, 3, 1}, new int[]{3, 1, 1, 1, 3}, new int[]{1, 3, 1, 1, 3}, new int[]{3, 3, 1, 1, 1}, new int[]{1, 1, 3, 1, 3}, new int[]{3, 1, 3, 1, 1}, new int[]{1, 3, 3, 1, 1}, new int[]{1, 1, 1, 3, 3}, new int[]{3, 1, 1, 3, 1}, new int[]{1, 3, 1, 3, 1}};

    @Override // com.google.zxing.oned.s, com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<com.google.zxing.g, ?> map) throws com.google.zxing.w {
        if (aVar == com.google.zxing.a.ITF) {
            return super.a(str, aVar, i10, i11, map);
        }
        throw new IllegalArgumentException("Can only encode ITF, but got ".concat(String.valueOf(aVar)));
    }

    @Override // com.google.zxing.oned.s
    public boolean[] d(String str) {
        int length = str.length();
        if (length % 2 != 0) {
            throw new IllegalArgumentException("The length of the input should be even");
        }
        if (length > 80) {
            throw new IllegalArgumentException("Requested contents should be less than 80 digits long, but got ".concat(String.valueOf(length)));
        }
        boolean[] zArr = new boolean[(length * 9) + 9];
        int iC = s.c(zArr, 0, f130626a, true);
        for (int i10 = 0; i10 < length; i10 += 2) {
            int iDigit = Character.digit(str.charAt(i10), 10);
            int iDigit2 = Character.digit(str.charAt(i10 + 1), 10);
            int[] iArr = new int[10];
            for (int i11 = 0; i11 < 5; i11++) {
                int i12 = i11 * 2;
                int[][] iArr2 = f130630e;
                iArr[i12] = iArr2[iDigit][i11];
                iArr[i12 + 1] = iArr2[iDigit2][i11];
            }
            iC += s.c(zArr, iC, iArr, true);
        }
        s.c(zArr, iC, f130627b, true);
        return zArr;
    }
}
