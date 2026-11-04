package com.google.vr.sdk.deps;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class k6 extends j6 {
    k6() {
    }

    @Override // com.google.vr.sdk.deps.j6
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
                        return i6.n(bArr, i13, i12);
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
                    return i6.n(bArr, i13, i12);
                }
                int i16 = i11 + 2;
                byte b12 = bArr[i13];
                if (b12 <= -65 && ((b10 != -32 || b12 >= -96) && (b10 != -19 || b12 < -96))) {
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

    @Override // com.google.vr.sdk.deps.j6
    final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        int i12;
        int i13;
        char cCharAt;
        int length = charSequence.length();
        int i14 = i11 + i10;
        int i15 = 0;
        while (i15 < length && (i13 = i15 + i10) < i14 && (cCharAt = charSequence.charAt(i15)) < 128) {
            bArr[i13] = (byte) cCharAt;
            i15++;
        }
        if (i15 == length) {
            return i10 + length;
        }
        int i16 = i10 + i15;
        while (i15 < length) {
            char cCharAt2 = charSequence.charAt(i15);
            if (cCharAt2 < 128 && i16 < i14) {
                bArr[i16] = (byte) cCharAt2;
                i16++;
            } else if (cCharAt2 < 2048 && i16 <= i14 - 2) {
                int i17 = i16 + 1;
                bArr[i16] = (byte) ((cCharAt2 >>> 6) | 960);
                i16 += 2;
                bArr[i17] = (byte) ((cCharAt2 & '?') | 128);
            } else {
                if ((cCharAt2 >= 55296 && 57343 >= cCharAt2) || i16 > i14 - 3) {
                    if (i16 > i14 - 4) {
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343 && ((i12 = i15 + 1) == charSequence.length() || !Character.isSurrogatePair(cCharAt2, charSequence.charAt(i12)))) {
                            throw new l6(i15, length);
                        }
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt2);
                        sb2.append(" at index ");
                        sb2.append(i16);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    int i18 = i15 + 1;
                    if (i18 != charSequence.length()) {
                        char cCharAt3 = charSequence.charAt(i18);
                        if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                            int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                            bArr[i16] = (byte) ((codePoint >>> 18) | 240);
                            bArr[i16 + 1] = (byte) (((codePoint >>> 12) & 63) | 128);
                            int i19 = i16 + 3;
                            bArr[i16 + 2] = (byte) (((codePoint >>> 6) & 63) | 128);
                            i16 += 4;
                            bArr[i19] = (byte) ((codePoint & 63) | 128);
                            i15 = i18;
                        } else {
                            i15 = i18;
                        }
                    }
                    throw new l6(i15 - 1, length);
                }
                bArr[i16] = (byte) ((cCharAt2 >>> '\f') | 480);
                int i20 = i16 + 2;
                bArr[i16 + 1] = (byte) (((cCharAt2 >>> 6) & 63) | 128);
                i16 += 3;
                bArr[i20] = (byte) ((cCharAt2 & '?') | 128);
            }
            i15++;
        }
        return i16;
    }

    @Override // com.google.vr.sdk.deps.j6
    final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        j6.f(charSequence, byteBuffer);
    }

    @Override // com.google.vr.sdk.deps.j6
    final String e(byte[] bArr, int i10, int i11) throws v3 {
        if ((i10 | i11 | ((bArr.length - i10) - i11)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("buffer length=%d, index=%d, size=%d", Integer.valueOf(bArr.length), Integer.valueOf(i10), Integer.valueOf(i11)));
        }
        int i12 = i10 + i11;
        char[] cArr = new char[i11];
        int i13 = 0;
        while (i10 < i12) {
            byte b10 = bArr[i10];
            if (!m4.y(b10)) {
                break;
            }
            i10++;
            m4.v(b10, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte b11 = bArr[i10];
            if (m4.y(b11)) {
                int i16 = i14 + 1;
                m4.v(b11, cArr, i14);
                int i17 = i15;
                while (i17 < i12) {
                    byte b12 = bArr[i17];
                    if (!m4.y(b12)) {
                        break;
                    }
                    i17++;
                    m4.v(b12, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i17;
            } else if (m4.z(b11)) {
                if (i15 >= i12) {
                    throw v3.h();
                }
                i10 += 2;
                m4.u(b11, bArr[i15], cArr, i14);
                i14++;
            } else if (m4.A(b11)) {
                if (i15 >= i12 - 1) {
                    throw v3.h();
                }
                int i18 = i10 + 2;
                i10 += 3;
                m4.t(b11, bArr[i15], bArr[i18], cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw v3.h();
                }
                byte b13 = bArr[i15];
                int i19 = i10 + 3;
                byte b14 = bArr[i10 + 2];
                i10 += 4;
                m4.s(b11, b13, b14, bArr[i19], cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }
}
