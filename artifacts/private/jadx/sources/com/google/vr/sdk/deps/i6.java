package com.google.vr.sdk.deps;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
final class i6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final j6 f129451a;

    static {
        f129451a = (f6.p() && f6.u() && !g2.b()) ? new m6() : new k6();
    }

    static int d(CharSequence charSequence) {
        int length = charSequence.length();
        int i10 = 0;
        int i11 = 0;
        while (i11 < length && charSequence.charAt(i11) < 128) {
            i11++;
        }
        int i12 = length;
        while (i11 < length) {
            char cCharAt = charSequence.charAt(i11);
            if (cCharAt >= 2048) {
                int length2 = charSequence.length();
                while (i11 < length2) {
                    char cCharAt2 = charSequence.charAt(i11);
                    if (cCharAt2 < 2048) {
                        i10 += (127 - cCharAt2) >>> 31;
                    } else {
                        i10 += 2;
                        if (55296 <= cCharAt2 && cCharAt2 <= 57343) {
                            if (Character.codePointAt(charSequence, i11) < 65536) {
                                throw new l6(i11, length2);
                            }
                            i11++;
                        }
                    }
                    i11++;
                }
                i12 += i10;
                break;
            }
            i12 += (127 - cCharAt) >>> 31;
            i11++;
        }
        if (i12 >= length) {
            return i12;
        }
        StringBuilder sb2 = new StringBuilder(54);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(((long) i12) + 4294967296L);
        throw new IllegalArgumentException(sb2.toString());
    }

    static int e(CharSequence charSequence, byte[] bArr, int i10, int i11) {
        return f129451a.b(charSequence, bArr, i10, i11);
    }

    static void f(CharSequence charSequence, ByteBuffer byteBuffer) {
        j6 j6Var = f129451a;
        if (byteBuffer.hasArray()) {
            int iArrayOffset = byteBuffer.arrayOffset();
            byteBuffer.position(e(charSequence, byteBuffer.array(), byteBuffer.position() + iArrayOffset, byteBuffer.remaining()) - iArrayOffset);
        } else if (byteBuffer.isDirect()) {
            j6Var.c(charSequence, byteBuffer);
        } else {
            j6.f(charSequence, byteBuffer);
        }
    }

    public static boolean g(byte[] bArr) {
        return f129451a.d(bArr, 0, bArr.length);
    }

    public static boolean h(byte[] bArr, int i10, int i11) {
        return f129451a.d(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10) {
        if (i10 > -12) {
            return -1;
        }
        return i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(int i10, int i11) {
        if (i10 <= -12 && i11 <= -65) {
            return i10 ^ (i11 << 8);
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, int i11, int i12) {
        if (i10 <= -12 && i11 <= -65 && i12 <= -65) {
            return (i10 ^ (i11 << 8)) ^ (i12 << 16);
        }
        return -1;
    }

    static String l(byte[] bArr, int i10, int i11) throws v3 {
        return f129451a.e(bArr, i10, i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int n(byte[] bArr, int i10, int i11) {
        byte b10 = bArr[i10 - 1];
        int i12 = i11 - i10;
        if (i12 == 0) {
            return i(b10);
        }
        if (i12 == 1) {
            return j(b10, bArr[i10]);
        }
        if (i12 == 2) {
            return k(b10, bArr[i10], bArr[i10 + 1]);
        }
        throw new AssertionError();
    }
}
