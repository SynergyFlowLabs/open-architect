package com.google.zxing.qrcode.decoder;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f130882a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final byte[] f130883b;

    private b(int i10, byte[] bArr) {
        this.f130882a = i10;
        this.f130883b = bArr;
    }

    static b[] b(byte[] bArr, j jVar, f fVar) {
        if (bArr.length != jVar.h()) {
            throw new IllegalArgumentException();
        }
        j.b bVarF = jVar.f(fVar);
        j.a[] aVarArrA = bVarF.a();
        int iA = 0;
        for (j.a aVar : aVarArrA) {
            iA += aVar.a();
        }
        b[] bVarArr = new b[iA];
        int i10 = 0;
        for (j.a aVar2 : aVarArrA) {
            int i11 = 0;
            while (i11 < aVar2.a()) {
                int iB = aVar2.b();
                bVarArr[i10] = new b(iB, new byte[bVarF.b() + iB]);
                i11++;
                i10++;
            }
        }
        int length = bVarArr[0].f130883b.length;
        int i12 = iA - 1;
        while (i12 >= 0 && bVarArr[i12].f130883b.length != length) {
            i12--;
        }
        int i13 = i12 + 1;
        int iB2 = length - bVarF.b();
        int i14 = 0;
        for (int i15 = 0; i15 < iB2; i15++) {
            int i16 = 0;
            while (i16 < i10) {
                bVarArr[i16].f130883b[i15] = bArr[i14];
                i16++;
                i14++;
            }
        }
        int i17 = i13;
        while (i17 < i10) {
            bVarArr[i17].f130883b[iB2] = bArr[i14];
            i17++;
            i14++;
        }
        int length2 = bVarArr[0].f130883b.length;
        while (iB2 < length2) {
            int i18 = 0;
            while (i18 < i10) {
                bVarArr[i18].f130883b[i18 < i13 ? iB2 : iB2 + 1] = bArr[i14];
                i18++;
                i14++;
            }
            iB2++;
        }
        return bVarArr;
    }

    byte[] a() {
        return this.f130883b;
    }

    int c() {
        return this.f130882a;
    }
}
