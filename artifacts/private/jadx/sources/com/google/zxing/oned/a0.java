package com.google.zxing.oned;

/* JADX INFO: loaded from: classes5.dex */
public final class a0 extends y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int[] f130551l = {1, 1, 1, 1, 1, 1};

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int[][] f130552m = {new int[]{56, 52, 50, 49, 44, 38, 35, 42, 41, 37}, new int[]{7, 11, 13, 14, 19, 25, 28, 21, 22, 26}};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f130553k = new int[4];

    public static String s(String str) {
        char[] cArr = new char[6];
        str.getChars(1, 7, cArr, 0);
        StringBuilder sb2 = new StringBuilder(12);
        sb2.append(str.charAt(0));
        char c10 = cArr[5];
        switch (c10) {
            case '0':
            case '1':
            case '2':
                sb2.append(cArr, 0, 2);
                sb2.append(c10);
                sb2.append("0000");
                sb2.append(cArr, 2, 3);
                break;
            case '3':
                sb2.append(cArr, 0, 3);
                sb2.append("00000");
                sb2.append(cArr, 3, 2);
                break;
            case '4':
                sb2.append(cArr, 0, 4);
                sb2.append("00000");
                sb2.append(cArr[4]);
                break;
            default:
                sb2.append(cArr, 0, 5);
                sb2.append("0000");
                sb2.append(c10);
                break;
        }
        if (str.length() >= 8) {
            sb2.append(str.charAt(7));
        }
        return sb2.toString();
    }

    private static void t(StringBuilder sb2, int i10) throws com.google.zxing.m {
        for (int i11 = 0; i11 <= 1; i11++) {
            for (int i12 = 0; i12 < 10; i12++) {
                if (i10 == f130552m[i11][i12]) {
                    sb2.insert(0, (char) (i11 + 48));
                    sb2.append((char) (i12 + 48));
                    return;
                }
            }
        }
        throw com.google.zxing.m.a();
    }

    @Override // com.google.zxing.oned.y
    protected boolean h(String str) throws com.google.zxing.h {
        return super.h(s(str));
    }

    @Override // com.google.zxing.oned.y
    protected int[] k(com.google.zxing.common.a aVar, int i10) throws com.google.zxing.m {
        return y.n(aVar, i10, true, f130551l);
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr2 = this.f130553k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < iL; i12++) {
            int iJ = y.j(aVar, iArr2, i10, y.f130740j);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (iJ >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        t(sb2, i11);
        return i10;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_E;
    }
}
