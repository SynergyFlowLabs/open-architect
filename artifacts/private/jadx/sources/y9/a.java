package y9;

import com.google.zxing.common.b;
import com.google.zxing.d;
import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.maxicode.decoder.c;
import com.google.zxing.p;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class a implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final t[] f395336b = new t[0];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f395337c = 30;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f395338d = 33;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final c f395339a = new c();

    private static b b(b bVar) throws m {
        int[] iArrG = bVar.g();
        if (iArrG == null) {
            throw m.a();
        }
        int i10 = iArrG[0];
        int i11 = iArrG[1];
        int i12 = iArrG[2];
        int i13 = iArrG[3];
        b bVar2 = new b(30, 33);
        for (int i14 = 0; i14 < 33; i14++) {
            int i15 = (((i14 * i13) + (i13 / 2)) / 33) + i11;
            for (int i16 = 0; i16 < 30; i16++) {
                if (bVar.e(((((i16 * i12) + (i12 / 2)) + (((i14 & 1) * i12) / 2)) / 30) + i10, i15)) {
                    bVar2.q(i16, i14);
                }
            }
        }
        return bVar2;
    }

    @Override // com.google.zxing.p
    public r a(com.google.zxing.c cVar, Map<e, ?> map) throws m, d, h {
        if (map == null || !map.containsKey(e.PURE_BARCODE)) {
            throw m.a();
        }
        com.google.zxing.common.e eVarC = this.f395339a.c(b(cVar.b()), map);
        r rVar = new r(eVarC.j(), eVarC.g(), f395336b, com.google.zxing.a.MAXICODE);
        String strB = eVarC.b();
        if (strB != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, strB);
        }
        return rVar;
    }

    @Override // com.google.zxing.p
    public r c(com.google.zxing.c cVar) throws m, d, h {
        return a(cVar, null);
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
