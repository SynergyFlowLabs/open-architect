package com.google.android.gms.internal.auth;

/* JADX INFO: loaded from: classes4.dex */
final class o6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final m6 f107730a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f107731b = 0;

    static {
        if (k6.u() && k6.v()) {
            int i10 = p2.f107733a;
        }
        f107730a = new n6();
    }

    static /* bridge */ /* synthetic */ int a(byte[] bArr, int i10, int i11) {
        int i12 = i11 - i10;
        byte b10 = bArr[i10 - 1];
        if (i12 == 0) {
            if (b10 > -12) {
                return -1;
            }
            return b10;
        }
        if (i12 == 1) {
            byte b11 = bArr[i10];
            if (b10 > -12 || b11 > -65) {
                return -1;
            }
            return (b11 << 8) ^ b10;
        }
        int i13 = 2 | 2;
        if (i12 != 2) {
            throw new AssertionError();
        }
        byte b12 = bArr[i10];
        byte b13 = bArr[i10 + 1];
        if (b10 > -12 || b12 > -65) {
            return -1;
        }
        if (b13 > -65) {
            return -1;
        }
        return (b13 << com.google.common.base.c.f116465r) ^ ((b12 << 8) ^ b10);
    }

    static boolean b(byte[] bArr) {
        return f107730a.b(bArr, 0, bArr.length);
    }

    static boolean c(byte[] bArr, int i10, int i11) {
        return f107730a.b(bArr, i10, i11);
    }
}
