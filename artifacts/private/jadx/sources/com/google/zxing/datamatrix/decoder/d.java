package com.google.zxing.datamatrix.decoder;

import com.google.zxing.h;

/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.reedsolomon.c f130393a = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f130358m);

    private void a(byte[] bArr, int i10) throws com.google.zxing.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f130393a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (com.google.zxing.common.reedsolomon.e unused) {
            throw com.google.zxing.d.a();
        }
    }

    public com.google.zxing.common.e b(com.google.zxing.common.b bVar) throws com.google.zxing.d, h {
        a aVar = new a(bVar);
        b[] bVarArrB = b.b(aVar.c(), aVar.b());
        int iC = 0;
        for (b bVar2 : bVarArrB) {
            iC += bVar2.c();
        }
        byte[] bArr = new byte[iC];
        int length = bVarArrB.length;
        for (int i10 = 0; i10 < length; i10++) {
            b bVar3 = bVarArrB[i10];
            byte[] bArrA = bVar3.a();
            int iC2 = bVar3.c();
            a(bArrA, iC2);
            for (int i11 = 0; i11 < iC2; i11++) {
                bArr[(i11 * length) + i10] = bArrA[i11];
            }
        }
        return c.a(bArr);
    }

    public com.google.zxing.common.e c(boolean[][] zArr) throws com.google.zxing.d, h {
        return b(com.google.zxing.common.b.o(zArr));
    }
}
