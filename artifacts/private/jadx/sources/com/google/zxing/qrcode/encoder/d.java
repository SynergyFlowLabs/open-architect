package com.google.zxing.qrcode.encoder;

/* JADX INFO: loaded from: classes5.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130967a = 3;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f130968b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f130969c = 40;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130970d = 10;

    private d() {
    }

    static int a(b bVar) {
        return b(bVar, true) + b(bVar, false);
    }

    private static int b(b bVar, boolean z10) {
        int iD = z10 ? bVar.d() : bVar.e();
        int iE = z10 ? bVar.e() : bVar.d();
        byte[][] bArrC = bVar.c();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            byte b10 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < iE; i13++) {
                byte b11 = z10 ? bArrC[i11][i13] : bArrC[i13][i11];
                if (b11 == b10) {
                    i12++;
                } else {
                    if (i12 >= 5) {
                        i10 += i12 - 2;
                    }
                    i12 = 1;
                    b10 = b11;
                }
            }
            if (i12 >= 5) {
                i10 += i12 - 2;
            }
        }
        return i10;
    }

    static int c(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD - 1; i11++) {
            byte[] bArr = bArrC[i11];
            int i12 = 0;
            while (i12 < iE - 1) {
                byte b10 = bArr[i12];
                int i13 = i12 + 1;
                if (b10 == bArr[i13]) {
                    byte[] bArr2 = bArrC[i11 + 1];
                    if (b10 == bArr2[i12] && b10 == bArr2[i13]) {
                        i10++;
                    }
                }
                i12 = i13;
            }
        }
        return i10 * 3;
    }

    static int d(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            for (int i12 = 0; i12 < iE; i12++) {
                byte[] bArr = bArrC[i11];
                int i13 = i12 + 6;
                if (i13 < iE && bArr[i12] == 1 && bArr[i12 + 1] == 0 && bArr[i12 + 2] == 1 && bArr[i12 + 3] == 1 && bArr[i12 + 4] == 1 && bArr[i12 + 5] == 0 && bArr[i13] == 1 && (g(bArr, i12 - 4, i12) || g(bArr, i12 + 7, i12 + 11))) {
                    i10++;
                }
                int i14 = i11 + 6;
                if (i14 < iD && bArrC[i11][i12] == 1 && bArrC[i11 + 1][i12] == 0 && bArrC[i11 + 2][i12] == 1 && bArrC[i11 + 3][i12] == 1 && bArrC[i11 + 4][i12] == 1 && bArrC[i11 + 5][i12] == 0 && bArrC[i14][i12] == 1 && (h(bArrC, i12, i11 - 4, i11) || h(bArrC, i12, i11 + 7, i11 + 11))) {
                    i10++;
                }
            }
        }
        return i10 * 40;
    }

    static int e(b bVar) {
        byte[][] bArrC = bVar.c();
        int iE = bVar.e();
        int iD = bVar.d();
        int i10 = 0;
        for (int i11 = 0; i11 < iD; i11++) {
            byte[] bArr = bArrC[i11];
            for (int i12 = 0; i12 < iE; i12++) {
                if (bArr[i12] == 1) {
                    i10++;
                }
            }
        }
        int iD2 = bVar.d() * bVar.e();
        return ((Math.abs((i10 << 1) - iD2) * 10) / iD2) * 10;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    static boolean f(int i10, int i11, int i12) {
        int i13;
        int i14;
        switch (i10) {
            case 0:
                i12 += i11;
                i13 = i12 & 1;
                return i13 == 0;
            case 1:
                i13 = i12 & 1;
                if (i13 == 0) {
                }
            case 2:
                i13 = i11 % 3;
                if (i13 == 0) {
                }
            case 3:
                i13 = (i12 + i11) % 3;
                if (i13 == 0) {
                }
            case 4:
                i12 /= 2;
                i11 /= 3;
                i12 += i11;
                i13 = i12 & 1;
                if (i13 == 0) {
                }
            case 5:
                int i15 = i12 * i11;
                i13 = (i15 & 1) + (i15 % 3);
                if (i13 == 0) {
                }
            case 6:
                int i16 = i12 * i11;
                i14 = (i16 & 1) + (i16 % 3);
                i13 = i14 & 1;
                if (i13 == 0) {
                }
            case 7:
                i14 = ((i12 * i11) % 3) + ((i12 + i11) & 1);
                i13 = i14 & 1;
                if (i13 == 0) {
                }
            default:
                throw new IllegalArgumentException("Invalid mask pattern: ".concat(String.valueOf(i10)));
        }
    }

    private static boolean g(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, bArr.length);
        for (int iMax = Math.max(i10, 0); iMax < iMin; iMax++) {
            if (bArr[iMax] == 1) {
                return false;
            }
        }
        return true;
    }

    private static boolean h(byte[][] bArr, int i10, int i11, int i12) {
        int iMin = Math.min(i12, bArr.length);
        for (int iMax = Math.max(i11, 0); iMax < iMin; iMax++) {
            if (bArr[iMax][i10] == 1) {
                return false;
            }
        }
        return true;
    }
}
