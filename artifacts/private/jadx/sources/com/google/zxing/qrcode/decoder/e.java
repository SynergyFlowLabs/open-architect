package com.google.zxing.qrcode.decoder;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.zxing.common.reedsolomon.c f130896a = new com.google.zxing.common.reedsolomon.c(com.google.zxing.common.reedsolomon.a.f130357l);

    private void a(byte[] bArr, int i10) throws com.google.zxing.d {
        int length = bArr.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = bArr[i11] & 255;
        }
        try {
            this.f130896a.a(iArr, bArr.length - i10);
            for (int i12 = 0; i12 < i10; i12++) {
                bArr[i12] = (byte) iArr[i12];
            }
        } catch (com.google.zxing.common.reedsolomon.e unused) {
            throw com.google.zxing.d.a();
        }
    }

    private com.google.zxing.common.e d(a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.d, com.google.zxing.h {
        j jVarE = aVar.e();
        f fVarD = aVar.d().d();
        b[] bVarArrB = b.b(aVar.c(), jVarE, fVarD);
        int iC = 0;
        for (b bVar : bVarArrB) {
            iC += bVar.c();
        }
        byte[] bArr = new byte[iC];
        int i10 = 0;
        for (b bVar2 : bVarArrB) {
            byte[] bArrA = bVar2.a();
            int iC2 = bVar2.c();
            a(bArrA, iC2);
            int i11 = 0;
            while (i11 < iC2) {
                bArr[i10] = bArrA[i11];
                i11++;
                i10++;
            }
        }
        return d.a(bArr, jVarE, fVarD, map);
    }

    public com.google.zxing.common.e b(com.google.zxing.common.b bVar) throws com.google.zxing.d, com.google.zxing.h {
        return c(bVar, null);
    }

    public com.google.zxing.common.e c(com.google.zxing.common.b bVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.d, com.google.zxing.h {
        com.google.zxing.d e10;
        a aVar = new a(bVar);
        com.google.zxing.h hVar = null;
        try {
            return d(aVar, map);
        } catch (com.google.zxing.d e11) {
            e10 = e11;
            try {
                aVar.f();
                aVar.g(true);
                aVar.e();
                aVar.d();
                aVar.b();
                com.google.zxing.common.e eVarD = d(aVar, map);
                eVarD.o(new i(true));
                return eVarD;
            } catch (com.google.zxing.d | com.google.zxing.h unused) {
                if (hVar != null) {
                    throw hVar;
                }
                throw e10;
            }
        } catch (com.google.zxing.h e12) {
            e10 = null;
            hVar = e12;
            aVar.f();
            aVar.g(true);
            aVar.e();
            aVar.d();
            aVar.b();
            com.google.zxing.common.e eVarD2 = d(aVar, map);
            eVarD2.o(new i(true));
            return eVarD2;
        }
    }

    public com.google.zxing.common.e e(boolean[][] zArr) throws com.google.zxing.d, com.google.zxing.h {
        return f(zArr, null);
    }

    public com.google.zxing.common.e f(boolean[][] zArr, Map<com.google.zxing.e, ?> map) throws com.google.zxing.d, com.google.zxing.h {
        return c(com.google.zxing.common.b.o(zArr), map);
    }
}
