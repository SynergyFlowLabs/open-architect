package org.apache.commons.codec.net;

/* JADX INFO: loaded from: classes9.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f335488a = 16;

    f() {
    }

    static int a(byte b10) throws nk.f {
        int iDigit = Character.digit((char) b10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new nk.f("Invalid URL encoding: not a valid digit (radix 16): " + ((int) b10));
    }

    static char b(int i10) {
        return Character.toUpperCase(Character.forDigit(i10 & 15, 16));
    }
}
