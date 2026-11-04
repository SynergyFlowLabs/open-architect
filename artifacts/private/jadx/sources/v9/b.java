package v9;

import com.google.zxing.e;
import com.google.zxing.h;
import com.google.zxing.m;
import com.google.zxing.p;
import com.google.zxing.r;
import com.google.zxing.s;
import com.google.zxing.t;
import com.google.zxing.u;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class b implements p {
    @Override // com.google.zxing.p
    public r a(com.google.zxing.c cVar, Map<e, ?> map) throws m, h {
        t[] tVarArrB;
        m mVar;
        t[] tVarArrB2;
        h hVar;
        u uVar;
        com.google.zxing.aztec.detector.a aVar = new com.google.zxing.aztec.detector.a(cVar.b());
        com.google.zxing.common.e eVarC = null;
        int i10 = 3 ^ 0;
        try {
            a aVarB = aVar.b(false);
            tVarArrB = aVarB.b();
            try {
                hVar = null;
                eVarC = new com.google.zxing.aztec.decoder.a().c(aVarB);
                tVarArrB2 = tVarArrB;
                mVar = null;
            } catch (h e10) {
                e = e10;
                hVar = e;
                tVarArrB2 = tVarArrB;
                mVar = null;
            } catch (m e11) {
                e = e11;
                t[] tVarArr = tVarArrB;
                mVar = e;
                tVarArrB2 = tVarArr;
                hVar = null;
            }
        } catch (h e12) {
            e = e12;
            tVarArrB = null;
        } catch (m e13) {
            e = e13;
            tVarArrB = null;
        }
        if (eVarC == null) {
            try {
                a aVarB2 = aVar.b(true);
                tVarArrB2 = aVarB2.b();
                eVarC = new com.google.zxing.aztec.decoder.a().c(aVarB2);
            } catch (h | m e14) {
                if (mVar != null) {
                    throw mVar;
                }
                if (hVar != null) {
                    throw hVar;
                }
                throw e14;
            }
        }
        t[] tVarArr2 = tVarArrB2;
        if (map != null && (uVar = (u) map.get(e.NEED_RESULT_POINT_CALLBACK)) != null) {
            for (t tVar : tVarArr2) {
                uVar.a(tVar);
            }
        }
        r rVar = new r(eVarC.j(), eVarC.g(), eVarC.e(), tVarArr2, com.google.zxing.a.AZTEC, System.currentTimeMillis());
        List<byte[]> listA = eVarC.a();
        if (listA != null) {
            rVar.j(s.BYTE_SEGMENTS, listA);
        }
        String strB = eVarC.b();
        if (strB != null) {
            rVar.j(s.ERROR_CORRECTION_LEVEL, strB);
        }
        return rVar;
    }

    @Override // com.google.zxing.p
    public r c(com.google.zxing.c cVar) throws m, h {
        return a(cVar, null);
    }

    @Override // com.google.zxing.p
    public void reset() {
    }
}
