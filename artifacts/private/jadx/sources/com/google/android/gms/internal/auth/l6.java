package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class l6 {
    static /* bridge */ /* synthetic */ void a(byte b10, byte b11, byte b12, byte b13, char[] cArr, int i10) throws a4 {
        if (e(b11) || (((b10 << com.google.common.base.c.F) + (b11 + 112)) >> 30) != 0 || e(b12) || e(b13)) {
            throw a4.b();
        }
        int i11 = ((b10 & 7) << 18) | ((b11 & 63) << 12) | ((b12 & 63) << 6) | (b13 & 63);
        cArr[i10] = (char) ((i11 >>> 10) + 55232);
        cArr[i10 + 1] = (char) ((i11 & 1023) + 56320);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0016 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:12:0x0018  */
    /* JADX WARN: Code duplicated, block: B:13:0x0019 A[PHI: r3
      0x0019: PHI (r3v3 byte) = (r3v2 byte), (r3v9 byte) binds: [B:10:0x0014, B:12:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:15:0x001f  */
    static /* bridge */ /* synthetic */ void b(byte b10, byte b11, byte b12, char[] cArr, int i10) throws a4 {
        if (!e(b11)) {
            if (b10 != -32) {
                if (b10 != -19) {
                    if (!e(b12)) {
                        cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!e(b12)) {
                        cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            } else if (b11 >= -96) {
                b10 = -32;
                if (b10 != -19) {
                    if (!e(b12)) {
                        cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                } else if (b11 < -96) {
                    b10 = -19;
                    if (!e(b12)) {
                        cArr[i10] = (char) (((b10 & com.google.common.base.c.f116464q) << 12) | ((b11 & 63) << 6) | (b12 & 63));
                        return;
                    }
                }
            }
        }
        throw a4.b();
    }

    static /* bridge */ /* synthetic */ void c(byte b10, byte b11, char[] cArr, int i10) throws a4 {
        if (b10 < -62 || e(b11)) {
            throw a4.b();
        }
        cArr[i10] = (char) (((b10 & com.google.common.base.c.I) << 6) | (b11 & 63));
    }

    static /* bridge */ /* synthetic */ boolean d(byte b10) {
        return b10 >= 0;
    }

    private static boolean e(byte b10) {
        return b10 > -65;
    }
}
