package io.sentry.util;

import java.util.UUID;

/* JADX INFO: loaded from: classes11.dex */
public final class p0 {
    public static long a() {
        byte[] bArr = new byte[8];
        f0.a().e(bArr);
        byte b10 = (byte) (bArr[6] & com.google.common.base.c.f116464q);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | com.google.common.primitives.t.f119782a);
        long j10 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j10 = (j10 << 8) | ((long) (bArr[i10] & 255));
        }
        return j10;
    }

    public static UUID b() {
        byte[] bArr = new byte[16];
        f0.a().e(bArr);
        byte b10 = (byte) (bArr[6] & com.google.common.base.c.f116464q);
        bArr[6] = b10;
        bArr[6] = (byte) (b10 | com.google.common.primitives.t.f119782a);
        byte b11 = (byte) (bArr[8] & 63);
        bArr[8] = b11;
        bArr[8] = (byte) (b11 | 128);
        long j10 = 0;
        long j11 = 0;
        for (int i10 = 0; i10 < 8; i10++) {
            j11 = (j11 << 8) | ((long) (bArr[i10] & 255));
        }
        for (int i11 = 8; i11 < 16; i11++) {
            j10 = (j10 << 8) | ((long) (bArr[i11] & 255));
        }
        return new UUID(j11, j10);
    }
}
