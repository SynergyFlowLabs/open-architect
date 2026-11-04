package x9;

import com.google.zxing.c;
import com.google.zxing.common.g;
import com.google.zxing.datamatrix.decoder.d;
import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t[] f390618b = new t[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final d f390619a = new d();

    private static com.google.zxing.common.b b(com.google.zxing.common.b bVar) throws m {
        int[] iArrK = bVar.k();
        int[] iArrF = bVar.f();
        if (iArrK == null || iArrF == null) {
            throw m.a();
        }
        int iD = d(iArrK, bVar);
        int i10 = iArrK[1];
        int i11 = iArrF[1];
        int i12 = iArrK[0];
        int i13 = ((iArrF[0] - i12) + 1) / iD;
        int i14 = ((i11 - i10) + 1) / iD;
        if (i13 <= 0 || i14 <= 0) {
            throw m.a();
        }
        int i15 = iD / 2;
        int i16 = i10 + i15;
        int i17 = i12 + i15;
        com.google.zxing.common.b bVar2 = new com.google.zxing.common.b(i13, i14);
        for (int i18 = 0; i18 < i14; i18++) {
            int i19 = (i18 * iD) + i16;
            for (int i20 = 0; i20 < i13; i20++) {
                if (bVar.e((i20 * iD) + i17, i19)) {
                    bVar2.q(i20, i18);
                }
            }
        }
        return bVar2;
    }

    private static int d(int[] iArr, com.google.zxing.common.b bVar) throws m {
        int iL = bVar.l();
        int i10 = iArr[0];
        int i11 = iArr[1];
        while (i10 < iL && bVar.e(i10, i11)) {
            i10++;
        }
        if (i10 == iL) {
            throw m.a();
        }
        int i12 = i10 - iArr[0];
        if (i12 != 0) {
            return i12;
        }
        throw m.a();
    }

    @Override // com.google.zxing.p
    public r a(c cVar, Map<e, ?> map) throws m, com.google.zxing.d, h {
        com.google.zxing.common.e eVarB;
        t[] tVarArrB;
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            g gVarC = new com.google.zxing.datamatrix.detector.a(cVar.b()).c();
            eVarB = this.f390619a.b(gVarC.a());
            tVarArrB = gVarC.b();
        } else {
            eVarB = this.f390619a.b(b(cVar.b()));
            tVarArrB = f390618b;
        }
        r rVar = new r(eVarB.j(), eVarB.g(), tVarArrB, com.google.zxing.a.DATA_MATRIX);
        List<byte[]> listA = eVarB.a();
        if (listA != null) {
            rVar.j(s.BYTE_SEGMENTS, listA);
        }
        String strB = eVarB.b();
        if (strB != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, strB);
        }
        return rVar;
    }

    @Override // com.google.zxing.p
    public r c(c cVar) throws m, com.google.zxing.d, h {
        return a(cVar, null);
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
