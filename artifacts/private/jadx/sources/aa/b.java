package aa;

import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.pdf417.decoder.j;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import java.util.ArrayList;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class b implements p, z9.c {
    private static r[] e(com.google.zxing.c cVar, Map<e, ?> map, boolean z10) throws m, com.google.zxing.d, h {
        ArrayList arrayList = new ArrayList();
        ba.b bVarB = ba.a.b(cVar, map, z10);
        for (t[] tVarArr : bVarB.b()) {
            com.google.zxing.common.e eVarI = j.i(bVarB.a(), tVarArr[4], tVarArr[5], tVarArr[6], tVarArr[7], h(tVarArr), f(tVarArr));
            r rVar = new r(eVarI.j(), eVarI.g(), tVarArr, com.google.zxing.a.PDF_417);
            rVar.j(s.ERROR_CORRECTION_LEVEL, eVarI.b());
            c cVar2 = (c) eVarI.f();
            if (cVar2 != null) {
                rVar.j(s.PDF417_EXTRA_METADATA, cVar2);
            }
            arrayList.add(rVar);
        }
        return (r[]) arrayList.toArray(new r[arrayList.size()]);
    }

    private static int f(t[] tVarArr) {
        int i10 = (5 | 4) >> 2;
        return Math.max(Math.max(g(tVarArr[0], tVarArr[4]), (g(tVarArr[6], tVarArr[2]) * 17) / 18), Math.max(g(tVarArr[1], tVarArr[5]), (g(tVarArr[7], tVarArr[3]) * 17) / 18));
    }

    private static int g(t tVar, t tVar2) {
        if (tVar != null && tVar2 != null) {
            return (int) Math.abs(tVar.c() - tVar2.c());
        }
        return 0;
    }

    private static int h(t[] tVarArr) {
        return Math.min(Math.min(i(tVarArr[0], tVarArr[4]), (i(tVarArr[6], tVarArr[2]) * 17) / 18), Math.min(i(tVarArr[1], tVarArr[5]), (i(tVarArr[7], tVarArr[3]) * 17) / 18));
    }

    private static int i(t tVar, t tVar2) {
        if (tVar == null || tVar2 == null) {
            return Integer.MAX_VALUE;
        }
        return (int) Math.abs(tVar.c() - tVar2.c());
    }

    @Override // com.google.zxing.p
    public r a(com.google.zxing.c cVar, Map<e, ?> map) throws m, com.google.zxing.d, h {
        r rVar;
        r[] rVarArrE = e(cVar, map, false);
        if (rVarArrE == null || rVarArrE.length == 0 || (rVar = rVarArrE[0]) == null) {
            throw m.a();
        }
        return rVar;
    }

    @Override // z9.c
    public r[] b(com.google.zxing.c cVar) throws m {
        return d(cVar, null);
    }

    @Override // com.google.zxing.p
    public r c(com.google.zxing.c cVar) throws m, com.google.zxing.d, h {
        return a(cVar, null);
    }

    @Override // z9.c
    public r[] d(com.google.zxing.c cVar, Map<e, ?> map) throws m {
        try {
            return e(cVar, map, true);
        } catch (com.google.zxing.d | h unused) {
            throw m.a();
        }
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
