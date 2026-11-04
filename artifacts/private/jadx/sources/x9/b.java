package x9;

import com.google.zxing.datamatrix.encoder.e;
import com.google.zxing.datamatrix.encoder.i;
import com.google.zxing.datamatrix.encoder.j;
import com.google.zxing.datamatrix.encoder.k;
import com.google.zxing.datamatrix.encoder.l;
import com.google.zxing.f;
import com.google.zxing.g;
import com.google.zxing.v;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements v {
    private static com.google.zxing.common.b c(com.google.zxing.qrcode.encoder.b bVar, int i10, int i11) {
        com.google.zxing.common.b bVar2;
        int iE = bVar.e();
        int iD = bVar.d();
        int iMax = Math.max(i10, iE);
        int iMax2 = Math.max(i11, iD);
        int iMin = Math.min(iMax / iE, iMax2 / iD);
        int i12 = (iMax - (iE * iMin)) / 2;
        int i13 = (iMax2 - (iD * iMin)) / 2;
        if (i11 < iD || i10 < iE) {
            bVar2 = new com.google.zxing.common.b(iE, iD);
            i12 = 0;
            i13 = 0;
        } else {
            bVar2 = new com.google.zxing.common.b(i10, i11);
        }
        bVar2.b();
        int i14 = 0;
        while (i14 < iD) {
            int i15 = i12;
            int i16 = 0;
            while (i16 < iE) {
                if (bVar.b(i16, i14) == 1) {
                    bVar2.r(i15, i13, iMin, iMin);
                }
                i16++;
                i15 += iMin;
            }
            i14++;
            i13 += iMin;
        }
        return bVar2;
    }

    private static com.google.zxing.common.b d(e eVar, k kVar, int i10, int i11) {
        int i12 = kVar.i();
        int iH = kVar.h();
        com.google.zxing.qrcode.encoder.b bVar = new com.google.zxing.qrcode.encoder.b(kVar.k(), kVar.j());
        int i13 = 0;
        for (int i14 = 0; i14 < iH; i14++) {
            if (i14 % kVar.f130455e == 0) {
                int i15 = 0;
                for (int i16 = 0; i16 < kVar.k(); i16++) {
                    bVar.h(i15, i13, i16 % 2 == 0);
                    i15++;
                }
                i13++;
            }
            int i17 = 0;
            for (int i18 = 0; i18 < i12; i18++) {
                if (i18 % kVar.f130454d == 0) {
                    bVar.h(i17, i13, true);
                    i17++;
                }
                bVar.h(i17, i13, eVar.e(i18, i14));
                int i19 = i17 + 1;
                int i20 = kVar.f130454d;
                if (i18 % i20 == i20 - 1) {
                    bVar.h(i19, i13, i14 % 2 == 0);
                    i17 += 2;
                } else {
                    i17 = i19;
                }
            }
            int i21 = i13 + 1;
            int i22 = kVar.f130455e;
            if (i14 % i22 == i22 - 1) {
                int i23 = 0;
                for (int i24 = 0; i24 < kVar.k(); i24++) {
                    bVar.h(i23, i21, true);
                    i23++;
                }
                i13 += 2;
            } else {
                i13 = i21;
            }
        }
        return c(bVar, i10, i11);
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b a(String str, com.google.zxing.a aVar, int i10, int i11, Map<g, ?> map) {
        f fVar;
        if (str.isEmpty()) {
            throw new IllegalArgumentException("Found empty contents");
        }
        if (aVar != com.google.zxing.a.DATA_MATRIX) {
            throw new IllegalArgumentException("Can only encode DATA_MATRIX, but got ".concat(String.valueOf(aVar)));
        }
        if (i10 < 0 || i11 < 0) {
            throw new IllegalArgumentException("Requested dimensions can't be negative: " + i10 + 'x' + i11);
        }
        l lVar = l.FORCE_NONE;
        f fVar2 = null;
        if (map != null) {
            l lVar2 = (l) map.get(g.DATA_MATRIX_SHAPE);
            if (lVar2 != null) {
                lVar = lVar2;
            }
            f fVar3 = (f) map.get(g.MIN_SIZE);
            if (fVar3 == null) {
                fVar3 = null;
            }
            fVar = (f) map.get(g.MAX_SIZE);
            if (fVar == null) {
                fVar = null;
            }
            fVar2 = fVar3;
        } else {
            fVar = null;
        }
        String strC = j.c(str, lVar, fVar2, fVar);
        k kVarO = k.o(strC.length(), lVar, fVar2, fVar, true);
        e eVar = new e(i.c(strC, kVarO), kVarO.i(), kVarO.h());
        eVar.k();
        return d(eVar, kVarO, i10, i11);
    }

    @Override // com.google.zxing.v
    public com.google.zxing.common.b b(String str, com.google.zxing.a aVar, int i10, int i11) {
        return a(str, aVar, i10, i11, null);
    }
}
