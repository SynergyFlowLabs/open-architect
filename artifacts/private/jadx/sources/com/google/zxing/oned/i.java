package com.google.zxing.oned;

/* JADX INFO: loaded from: classes5.dex */
public final class i extends y {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final int[] f130609l = {0, 11, 13, 14, 19, 25, 28, 21, 22, 26};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f130610k = new int[4];

    private static void s(StringBuilder sb2, int i10) throws com.google.zxing.m {
        for (int i11 = 0; i11 < 10; i11++) {
            if (i10 == f130609l[i11]) {
                sb2.insert(0, (char) (i11 + 48));
                return;
            }
        }
        throw com.google.zxing.m.a();
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        int[] iArr2 = this.f130610k;
        iArr2[0] = 0;
        iArr2[1] = 0;
        iArr2[2] = 0;
        iArr2[3] = 0;
        int iL = aVar.l();
        int i10 = iArr[1];
        int i11 = 0;
        for (int i12 = 0; i12 < 6 && i10 < iL; i12++) {
            int iJ = y.j(aVar, iArr2, i10, y.f130740j);
            sb2.append((char) ((iJ % 10) + 48));
            for (int i13 : iArr2) {
                i10 += i13;
            }
            if (iJ >= 10) {
                i11 |= 1 << (5 - i12);
            }
        }
        s(sb2, i11);
        int i14 = y.n(aVar, i10, true, y.f130737g)[1];
        for (int i15 = 0; i15 < 6 && i14 < iL; i15++) {
            sb2.append((char) (y.j(aVar, iArr2, i14, y.f130739i) + 48));
            for (int i16 : iArr2) {
                i14 += i16;
            }
        }
        return i14;
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.EAN_13;
    }
}
