package com.google.zxing.qrcode;

import com.google.zxing.c;
import com.google.zxing.common.g;
import com.google.zxing.d;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.qrcode.decoder.e;
import com.google.zxing.qrcode.decoder.i;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public class a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t[] f130875b = new t[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f130876a = new e();

    private static com.google.zxing.common.b e(com.google.zxing.common.b bVar) throws m {
        int[] iArrK = bVar.k();
        int[] iArrF = bVar.f();
        if (iArrK == null || iArrF == null) {
            throw m.a();
        }
        float fG = g(iArrK, bVar);
        int i10 = iArrK[1];
        int i11 = iArrF[1];
        int i12 = iArrK[0];
        int i13 = iArrF[0];
        if (i12 >= i13 || i10 >= i11) {
            throw m.a();
        }
        int i14 = i11 - i10;
        if (i14 != i13 - i12 && (i13 = i12 + i14) >= bVar.l()) {
            throw m.a();
        }
        int iRound = Math.round(((i13 - i12) + 1) / fG);
        int iRound2 = Math.round((i14 + 1) / fG);
        if (iRound <= 0 || iRound2 <= 0) {
            throw m.a();
        }
        if (iRound2 != iRound) {
            throw m.a();
        }
        int i15 = (int) (fG / 2.0f);
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        int i18 = (((int) ((iRound - 1) * fG)) + i17) - i13;
        if (i18 > 0) {
            if (i18 > i15) {
                throw m.a();
            }
            i17 -= i18;
        }
        int i19 = (((int) ((iRound2 - 1) * fG)) + i16) - i11;
        if (i19 > 0) {
            if (i19 > i15) {
                throw m.a();
            }
            i16 -= i19;
        }
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(iRound, iRound2);
        for (int i20 = 0; i20 < iRound2; i20++) {
            int i21 = ((int) (i20 * fG)) + i16;
            for (int i22 = 0; i22 < iRound; i22++) {
                if (bVar.e(((int) (i22 * fG)) + i17, i21)) {
                    bVar2.q(i22, i20);
                }
            }
        }
        return bVar2;
    }

    private static float g(int[] iArr, com.google.zxing.common.b bVar) throws m {
        int iH = bVar.h();
        int iL = bVar.l();
        int i10 = iArr[0];
        boolean z10 = true;
        int i11 = iArr[1];
        int i12 = 0;
        while (i10 < iL && i11 < iH) {
            if (z10 != bVar.e(i10, i11)) {
                i12++;
                if (i12 == 5) {
                    break;
                }
                z10 = !z10;
            }
            i10++;
            i11++;
        }
        if (i10 == iL || i11 == iH) {
            throw m.a();
        }
        return (i10 - iArr[0]) / 7.0f;
    }

    @Override // com.google.zxing.p
    public final r a(c cVar, Map<com.google.zxing.e, ?> map) throws m, d, h {
        com.google.zxing.common.e eVarC;
        t[] tVarArrB;
        if (map == null || !map.containsKey(com.google.zxing.e.PURE_BARCODE)) {
            g gVarF = new com.google.zxing.qrcode.detector.c(cVar.b()).f(map);
            eVarC = this.f130876a.c(gVarF.a(), map);
            tVarArrB = gVarF.b();
        } else {
            eVarC = this.f130876a.c(e(cVar.b()), map);
            tVarArrB = f130875b;
        }
        if (eVarC.f() instanceof i) {
            ((i) eVarC.f()).a(tVarArrB);
        }
        r rVar = new r(eVarC.j(), eVarC.g(), tVarArrB, com.google.zxing.a.QR_CODE);
        List<byte[]> listA = eVarC.a();
        if (listA != null) {
            rVar.j(s.BYTE_SEGMENTS, listA);
        }
        String strB = eVarC.b();
        if (strB != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, strB);
        }
        if (eVarC.k()) {
            rVar.j(s.STRUCTURED_APPEND_SEQUENCE, Integer.valueOf(eVarC.i()));
            rVar.j(s.STRUCTURED_APPEND_PARITY, Integer.valueOf(eVarC.h()));
        }
        return rVar;
    }

    @Override // com.google.zxing.p
    public r c(c cVar) throws m, d, h {
        return a(cVar, null);
    }

    protected final e f() {
        return this.f130876a;
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
