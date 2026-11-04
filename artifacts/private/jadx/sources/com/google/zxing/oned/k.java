package com.google.zxing.oned;

/* JADX INFO: loaded from: classes5.dex */
public final class k extends y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f130612k = new int[4];

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr2 = this.f130612k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        for (int i11 = 0; i11 < 4 && i10 < iL; i11++) {
            sb2.append((char) (y.j(aVar, iArr2, i10, y.f130739i) + 48));
            for (int i12 : iArr2) {
                i10 += i12;
            }
        }
        int i13 = y.n(aVar, i10, true, y.f130737g)[1];
        for (int i14 = 0; i14 < 4 && i13 < iL; i14++) {
            sb2.append((char) (y.j(aVar, iArr2, i13, y.f130739i) + 48));
            for (int i15 : iArr2) {
                i13 += i15;
            }
        }
        return i13;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_8;
    }
}
