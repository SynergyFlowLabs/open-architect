package com.davidehrmann.vcdiff.mina_buffer;

/* JADX INFO: loaded from: classes3.dex */
class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final byte[] f97995a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f97996b;

    static {
        byte[] bArr = {48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 65, 66, 67, 68, 69, 70};
        byte[] bArr2 = new byte[256];
        byte[] bArr3 = new byte[256];
        int i10 = 2 & 0;
        for (int i11 = 0; i11 < 256; i11++) {
            bArr2[i11] = bArr[i11 >>> 4];
            bArr3[i11] = bArr[i11 & 15];
        }
        f97995a = bArr2;
        f97996b = bArr3;
    }

    f() {
    }

    public static String a(d dVar, int i10) {
        if (i10 == 0) {
            throw new IllegalArgumentException("lengthLimit: " + i10 + " (expected: 1+)");
        }
        boolean z10 = dVar.F2() > i10;
        if (!z10) {
            i10 = dVar.F2();
        }
        if (i10 == 0) {
            return "empty";
        }
        StringBuilder sb2 = new StringBuilder((i10 * 3) + 3);
        int iN1 = dVar.n1();
        int iV = dVar.V() & 255;
        sb2.append((char) f97995a[iV]);
        sb2.append((char) f97996b[iV]);
        while (true) {
            i10--;
            if (i10 <= 0) {
                break;
            }
            sb2.append(' ');
            int iV2 = dVar.V() & 255;
            sb2.append((char) f97995a[iV2]);
            sb2.append((char) f97996b[iV2]);
        }
        dVar.o1(iN1);
        if (z10) {
            sb2.append("...");
        }
        return sb2.toString();
    }
}
