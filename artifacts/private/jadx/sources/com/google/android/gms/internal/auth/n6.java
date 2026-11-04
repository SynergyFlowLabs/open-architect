package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class n6 extends m6 {
    n6() {
    }

    @Override // com.google.android.gms.internal.auth.m6
    final int a(int i10, byte[] bArr, int i11, int i12) {
        while (i11 < i12 && bArr[i11] >= 0) {
            i11++;
        }
        if (i11 >= i12) {
            return 0;
        }
        while (i11 < i12) {
            int i13 = i11 + 1;
            byte b10 = bArr[i11];
            if (b10 < 0) {
                if (b10 < -32) {
                    if (i13 >= i12) {
                        return b10;
                    }
                    if (b10 >= -62) {
                        i11 += 2;
                        if (bArr[i13] > -65) {
                        }
                    }
                    return -1;
                }
                if (b10 >= -16) {
                    if (i13 >= i12 - 2) {
                        return o6.a(bArr, i13, i12);
                    }
                    int i14 = i11 + 2;
                    byte b11 = bArr[i13];
                    if (b11 <= -65 && (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) == 0) {
                        int i15 = i11 + 3;
                        if (bArr[i14] <= -65) {
                            i11 += 4;
                            if (bArr[i15] > -65) {
                            }
                        }
                    }
                    return -1;
                }
                if (i13 >= i12 - 1) {
                    return o6.a(bArr, i13, i12);
                }
                int i16 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 <= -65) {
                    if (b10 == -32 && b12 < -96) {
                        return -1;
                    }
                    if (b10 == -19 && b12 >= -96) {
                        return -1;
                    }
                    i11 += 3;
                    if (bArr[i16] > -65) {
                    }
                }
                return -1;
            }
            i11 = i13;
        }
        return 0;
    }
}
