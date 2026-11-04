package com.google.vr.sdk.deps;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class m6 extends j6 {
    m6() {
    }

    private static int g(byte[] bArr, int i10, long j10, int i11) {
        if (i11 == 0) {
            return i6.i(i10);
        }
        if (i11 == 1) {
            return i6.j(i10, f6.a(bArr, j10));
        }
        if (i11 == 2) {
            return i6.k(i10, f6.a(bArr, j10), f6.a(bArr, j10 + 1));
        }
        throw new AssertionError();
    }

    @Override // com.google.vr.sdk.deps.j6
    final int a(int i10, byte[] bArr, int i11, int i12) {
        int i13;
        long j10;
        if ((i11 | i12 | (bArr.length - i12)) < 0) {
            throw new ArrayIndexOutOfBoundsException(String.format("Array length=%d, index=%d, limit=%d", Integer.valueOf(bArr.length), Integer.valueOf(i11), Integer.valueOf(i12)));
        }
        long j11 = i11;
        int i14 = (int) (((long) i12) - j11);
        byte b10 = 0;
        long j12 = 1;
        if (i14 >= 16) {
            long j13 = j11;
            i13 = 0;
            while (true) {
                if (i13 >= i14) {
                    i13 = i14;
                    break;
                }
                long j14 = j13 + 1;
                if (f6.a(bArr, j13) < 0) {
                    break;
                }
                i13++;
                j13 = j14;
            }
        } else {
            i13 = 0;
        }
        int i15 = i14 - i13;
        long j15 = j11 + ((long) i13);
        while (true) {
            byte bA = b10;
            while (i15 > 0) {
                long j16 = j15 + j12;
                bA = f6.a(bArr, j15);
                if (bA < 0) {
                    j15 = j16;
                    break;
                }
                i15--;
                j15 = j16;
            }
            if (i15 == 0) {
                return b10;
            }
            int i16 = i15 - 1;
            if (bA >= -32) {
                if (bA >= -16) {
                    j10 = j12;
                    if (i16 >= 3) {
                        i15 -= 4;
                        long j17 = j15 + j10;
                        byte bA2 = f6.a(bArr, j15);
                        if (bA2 <= -65 && (((bA << com.google.common.base.c.F) + (bA2 + 112)) >> 30) == 0) {
                            long j18 = 2 + j15;
                            if (f6.a(bArr, j17) > -65) {
                                break;
                            }
                            j15 += 3;
                            if (f6.a(bArr, j18) > -65) {
                                break;
                            }
                        } else {
                            break;
                        }
                    } else {
                        return g(bArr, bA, j15, i16);
                    }
                } else {
                    if (i16 < 2) {
                        return g(bArr, bA, j15, i16);
                    }
                    i15 -= 3;
                    j10 = j12;
                    long j19 = j15 + j10;
                    byte bA3 = f6.a(bArr, j15);
                    if (bA3 <= -65 && ((bA != -32 || bA3 >= -96) && (bA != -19 || bA3 < -96))) {
                        j15 += 2;
                        if (f6.a(bArr, j19) > -65) {
                        }
                    }
                    return -1;
                }
            } else {
                if (i16 == 0) {
                    return bA;
                }
                i15 -= 2;
                if (bA >= -62) {
                    long j20 = j15 + j12;
                    if (f6.a(bArr, j15) <= -65) {
                        j10 = j12;
                        j15 = j20;
                    }
                }
                return -1;
            }
            j12 = j10;
            b10 = 0;
        }
        return -1;
    }

    @Override // com.google.vr.sdk.deps.j6
    final int b(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        long j10;
        long j11;
        long j12;
        int i12;
        char cCharAt;
        long j13 = i10;
        long j14 = ((long) i11) + j13;
        int length = charSequence.length();
        if (length > i11 || bArr.length - i11 < i10) {
            char cCharAt2 = charSequence.charAt(length - 1);
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(i10 + i11);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i13 = 0;
        while (true) {
            j10 = 1;
            if (i13 >= length || (cCharAt = charSequence.charAt(i13)) >= 128) {
                break;
            }
            f6.n(bArr, j13, (byte) cCharAt);
            i13++;
            j13 = 1 + j13;
        }
        if (i13 == length) {
            return (int) j13;
        }
        while (i13 < length) {
            char cCharAt3 = charSequence.charAt(i13);
            if (cCharAt3 < 128 && j13 < j14) {
                f6.n(bArr, j13, (byte) cCharAt3);
                j12 = j14;
                j11 = j10;
                j13 += j10;
            } else if (cCharAt3 >= 2048 || j13 > j14 - 2) {
                j11 = j10;
                if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || j13 > j14 - 3) {
                    j12 = j14;
                    if (j13 > j12 - 4) {
                        if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i12 = i13 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i12)))) {
                            throw new l6(i13, length);
                        }
                        StringBuilder sb3 = new StringBuilder(46);
                        sb3.append("Failed writing ");
                        sb3.append(cCharAt3);
                        sb3.append(" at index ");
                        sb3.append(j13);
                        throw new ArrayIndexOutOfBoundsException(sb3.toString());
                    }
                    int i14 = i13 + 1;
                    if (i14 != length) {
                        char cCharAt4 = charSequence.charAt(i14);
                        if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                            int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                            f6.n(bArr, j13, (byte) ((codePoint >>> 18) | 240));
                            f6.n(bArr, j13 + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                            long j15 = j13 + 3;
                            f6.n(bArr, j13 + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                            j13 += 4;
                            f6.n(bArr, j15, (byte) ((codePoint & 63) | 128));
                            i13 = i14;
                        } else {
                            i13 = i14;
                        }
                    }
                    throw new l6(i13 - 1, length);
                }
                f6.n(bArr, j13, (byte) ((cCharAt3 >>> '\f') | 480));
                long j16 = j13 + 2;
                j12 = j14;
                f6.n(bArr, j13 + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                j13 += 3;
                f6.n(bArr, j16, (byte) ((cCharAt3 & '?') | 128));
            } else {
                j11 = j10;
                long j17 = j13 + j11;
                f6.n(bArr, j13, (byte) ((cCharAt3 >>> 6) | 960));
                j13 += 2;
                f6.n(bArr, j17, (byte) ((cCharAt3 & '?') | 128));
                j12 = j14;
            }
            i13++;
            j10 = j11;
            j14 = j12;
        }
        return (int) j13;
    }

    @Override // com.google.vr.sdk.deps.j6
    final void c(CharSequence charSequence, ByteBuffer byteBuffer) {
        long j10;
        char c10;
        long j11;
        int i10;
        char c11;
        char cCharAt;
        long jC = f6.c(byteBuffer);
        long jPosition = ((long) byteBuffer.position()) + jC;
        long jLimit = ((long) byteBuffer.limit()) + jC;
        int length = charSequence.length();
        if (length > jLimit - jPosition) {
            char cCharAt2 = charSequence.charAt(length - 1);
            int iLimit = byteBuffer.limit();
            StringBuilder sb2 = new StringBuilder(37);
            sb2.append("Failed writing ");
            sb2.append(cCharAt2);
            sb2.append(" at index ");
            sb2.append(iLimit);
            throw new ArrayIndexOutOfBoundsException(sb2.toString());
        }
        int i11 = 0;
        while (true) {
            j10 = 1;
            c10 = 128;
            if (i11 >= length || (cCharAt = charSequence.charAt(i11)) >= 128) {
                break;
            }
            f6.f(jPosition, (byte) cCharAt);
            i11++;
            jPosition = 1 + jPosition;
        }
        if (i11 == length) {
            byteBuffer.position((int) (jPosition - jC));
            return;
        }
        while (i11 < length) {
            char cCharAt3 = charSequence.charAt(i11);
            if (cCharAt3 >= c10 || jPosition >= jLimit) {
                j11 = j10;
                if (cCharAt3 < 2048 && jPosition <= jLimit - 2) {
                    long j12 = jPosition + j11;
                    f6.f(jPosition, (byte) ((cCharAt3 >>> 6) | 960));
                    jPosition += 2;
                    f6.f(j12, (byte) ((cCharAt3 & '?') | 128));
                } else {
                    if ((cCharAt3 >= 55296 && 57343 >= cCharAt3) || jPosition > jLimit - 3) {
                        jC = jC;
                        jLimit = jLimit;
                        if (jPosition > jLimit - 4) {
                            if (55296 <= cCharAt3 && cCharAt3 <= 57343 && ((i10 = i11 + 1) == length || !Character.isSurrogatePair(cCharAt3, charSequence.charAt(i10)))) {
                                throw new l6(i11, length);
                            }
                            StringBuilder sb3 = new StringBuilder(46);
                            sb3.append("Failed writing ");
                            sb3.append(cCharAt3);
                            sb3.append(" at index ");
                            sb3.append(jPosition);
                            throw new ArrayIndexOutOfBoundsException(sb3.toString());
                        }
                        int i12 = i11 + 1;
                        if (i12 != length) {
                            char cCharAt4 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt3, cCharAt4)) {
                                int codePoint = Character.toCodePoint(cCharAt3, cCharAt4);
                                f6.f(jPosition, (byte) ((codePoint >>> 18) | 240));
                                c11 = 128;
                                f6.f(jPosition + j11, (byte) (((codePoint >>> 12) & 63) | 128));
                                long j13 = jPosition + 3;
                                f6.f(jPosition + 2, (byte) (((codePoint >>> 6) & 63) | 128));
                                jPosition += 4;
                                f6.f(j13, (byte) ((codePoint & 63) | 128));
                                i11 = i12;
                            } else {
                                i11 = i12;
                            }
                        }
                        throw new l6(i11 - 1, length);
                    }
                    f6.f(jPosition, (byte) ((cCharAt3 >>> '\f') | 480));
                    long j14 = jPosition + 2;
                    f6.f(jPosition + j11, (byte) (((cCharAt3 >>> 6) & 63) | 128));
                    jPosition += 3;
                    f6.f(j14, (byte) ((cCharAt3 & '?') | 128));
                }
                c11 = 128;
            } else {
                f6.f(jPosition, (byte) cCharAt3);
                jC = jC;
                jLimit = jLimit;
                c11 = c10;
                jPosition += j10;
                j11 = j10;
            }
            i11++;
            c10 = c11;
            j10 = j11;
            jC = jC;
            jLimit = jLimit;
        }
        byteBuffer.position((int) (jPosition - jC));
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
            byte bA = f6.a(bArr, i10);
            if (!m4.y(bA)) {
                break;
            }
            i10++;
            m4.v(bA, cArr, i13);
            i13++;
        }
        int i14 = i13;
        while (i10 < i12) {
            int i15 = i10 + 1;
            byte bA2 = f6.a(bArr, i10);
            if (m4.y(bA2)) {
                int i16 = i14 + 1;
                m4.v(bA2, cArr, i14);
                while (i15 < i12) {
                    byte bA3 = f6.a(bArr, i15);
                    if (!m4.y(bA3)) {
                        break;
                    }
                    i15++;
                    m4.v(bA3, cArr, i16);
                    i16++;
                }
                i14 = i16;
                i10 = i15;
            } else if (m4.z(bA2)) {
                if (i15 >= i12) {
                    throw v3.h();
                }
                i10 += 2;
                m4.u(bA2, f6.a(bArr, i15), cArr, i14);
                i14++;
            } else if (m4.A(bA2)) {
                if (i15 >= i12 - 1) {
                    throw v3.h();
                }
                int i17 = i10 + 2;
                i10 += 3;
                m4.t(bA2, f6.a(bArr, i15), f6.a(bArr, i17), cArr, i14);
                i14++;
            } else {
                if (i15 >= i12 - 2) {
                    throw v3.h();
                }
                byte bA4 = f6.a(bArr, i15);
                int i18 = i10 + 3;
                byte bA5 = f6.a(bArr, i10 + 2);
                i10 += 4;
                m4.s(bA2, bA4, bA5, f6.a(bArr, i18), cArr, i14);
                i14 += 2;
            }
        }
        return new String(cArr, 0, i14);
    }
}
