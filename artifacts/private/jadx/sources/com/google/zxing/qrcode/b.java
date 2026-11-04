package com.google.zxing.qrcode;

import com.google.zxing.g;
import com.google.zxing.qrcode.encoder.c;
import com.google.zxing.qrcode.encoder.f;
import com.google.zxing.v;
import com.google.zxing.w;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f130877a = 4;

    private static com.google.zxing.common.b c(f fVar, int i10, int i11, int i12) {
        com.google.zxing.qrcode.encoder.b bVarC = fVar.c();
        if (bVarC == null) {
            throw new IllegalStateException();
        }
        int iE = bVarC.e();
        int iD = bVarC.d();
        int i13 = i12 << 1;
        int i14 = iE + i13;
        int i15 = i13 + iD;
        int iMax = Math.max(i10, i14);
        int iMax2 = Math.max(i11, i15);
        int iMin = Math.min(iMax / i14, iMax2 / i15);
        int i16 = (iMax - (iE * iMin)) / 2;
        int i17 = (iMax2 - (iD * iMin)) / 2;
        com.google.zxing.common.b bVar = new com.google.zxing.common.b(iMax, iMax2);
        int i18 = 0;
        while (i18 < iD) {
            int i19 = 0;
            int i20 = i16;
            while (i19 < iE) {
                if (bVarC.b(i19, i18) == 1) {
                    bVar.r(i20, i17, iMin, iMin);
                }
                i19++;
                i20 += iMin;
            }
            i18++;
            i17 += iMin;
        }
        return bVar;
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<g, ?> map) throws w {
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.QR_CODE) {
            throw new IllegalArgumentException("Can only encode QR_CODE, but got ".concat(String.valueOf(aVar)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions are too small: " + i10 + 'x' + i11);
        }
        com.google.zxing.qrcode.decoder.f fVarValueOf = com.google.zxing.qrcode.decoder.f.L;
        int i12 = 4;
        if (map != null) {
            g gVar = g.ERROR_CORRECTION;
            if (map.containsKey(gVar)) {
                fVarValueOf = com.google.zxing.qrcode.decoder.f.valueOf(map.get(gVar).toString());
            }
            g gVar2 = g.MARGIN;
            if (map.containsKey(gVar2)) {
                i12 = Integer.parseInt(map.get(gVar2).toString());
            }
        }
        return c(c.p(str, fVarValueOf, map), i10, i11, i12);
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) throws w {
        return a(str, aVar, i10, i11, null);
    }
}
