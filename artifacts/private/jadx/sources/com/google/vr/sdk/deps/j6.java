package com.google.vr.sdk.deps;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
abstract class j6 {
    j6() {
    }

    static void f(CharSequence charSequence, ByteBuffer byteBuffer) {
        int length = charSequence.length();
        int iPosition = byteBuffer.position();
        int i10 = 0;
        while (i10 < length) {
            try {
                char cCharAt = charSequence.charAt(i10);
                if (cCharAt >= 128) {
                    break;
                }
                byteBuffer.put(iPosition + i10, (byte) cCharAt);
                i10++;
            } catch (IndexOutOfBoundsException unused) {
            }
        }
        if (i10 == length) {
            byteBuffer.position(iPosition + i10);
            return;
        }
        iPosition += i10;
        while (i10 < length) {
            char cCharAt2 = charSequence.charAt(i10);
            if (cCharAt2 < 128) {
                byteBuffer.put(iPosition, (byte) cCharAt2);
            } else if (cCharAt2 < 2048) {
                int i11 = iPosition + 1;
                try {
                    byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> 6) | 192));
                    byteBuffer.put(i11, (byte) ((cCharAt2 & '?') | 128));
                    iPosition = i11;
                } catch (IndexOutOfBoundsException unused2) {
                    iPosition = i11;
                }
            } else {
                if (cCharAt2 >= 55296 && 57343 >= cCharAt2) {
                    int i12 = i10 + 1;
                    if (i12 != length) {
                        try {
                            char cCharAt3 = charSequence.charAt(i12);
                            if (Character.isSurrogatePair(cCharAt2, cCharAt3)) {
                                int codePoint = Character.toCodePoint(cCharAt2, cCharAt3);
                                int i13 = iPosition + 1;
                                try {
                                    byteBuffer.put(iPosition, (byte) ((codePoint >>> 18) | 240));
                                    int i14 = iPosition + 2;
                                    try {
                                        byteBuffer.put(i13, (byte) (((codePoint >>> 12) & 63) | 128));
                                        iPosition += 3;
                                        byteBuffer.put(i14, (byte) (((codePoint >>> 6) & 63) | 128));
                                        byteBuffer.put(iPosition, (byte) ((codePoint & 63) | 128));
                                        i10 = i12;
                                    } catch (IndexOutOfBoundsException unused3) {
                                        i10 = i12;
                                        iPosition = i14;
                                    }
                                } catch (IndexOutOfBoundsException unused4) {
                                    iPosition = i13;
                                    i10 = i12;
                                }
                            } else {
                                i10 = i12;
                            }
                        } catch (IndexOutOfBoundsException unused5) {
                        }
                        i10 = i12;
                        int iPosition2 = byteBuffer.position() + Math.max(i10, (iPosition - byteBuffer.position()) + 1);
                        char cCharAt4 = charSequence.charAt(i10);
                        StringBuilder sb2 = new StringBuilder(37);
                        sb2.append("Failed writing ");
                        sb2.append(cCharAt4);
                        sb2.append(" at index ");
                        sb2.append(iPosition2);
                        throw new ArrayIndexOutOfBoundsException(sb2.toString());
                    }
                    throw new l6(i10, length);
                }
                int i15 = iPosition + 1;
                byteBuffer.put(iPosition, (byte) ((cCharAt2 >>> '\f') | 224));
                iPosition += 2;
                byteBuffer.put(i15, (byte) (((cCharAt2 >>> 6) & 63) | 128));
                byteBuffer.put(iPosition, (byte) ((cCharAt2 & '?') | 128));
            }
            i10++;
            iPosition++;
        }
        byteBuffer.position(iPosition);
    }

    abstract int a(int i10, byte[] bArr, int i11, int i12);

    abstract int b(CharSequence charSequence, byte[] bArr, int i10, int i11);

    abstract void c(CharSequence charSequence, ByteBuffer byteBuffer);

    final boolean d(byte[] bArr, int i10, int i11) {
        if (a(0, bArr, i10, i11) != 0) {
            return false;
        }
        int i12 = 2 ^ 1;
        return true;
    }

    abstract String e(byte[] bArr, int i10, int i11) throws v3;
}
