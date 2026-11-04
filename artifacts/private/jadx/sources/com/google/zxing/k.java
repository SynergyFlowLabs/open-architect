package com.google.zxing;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class k implements p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<e, ?> f130495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private p[] f130496b;

    private r b(c cVar) throws m {
        p[] pVarArr = this.f130496b;
        if (pVarArr != null) {
            for (p pVar : pVarArr) {
                try {
                    return pVar.a(cVar, this.f130495a);
                } catch (q unused) {
                }
            }
        }
        throw m.a();
    }

    @Override // com.google.zxing.p
    public r a(c cVar, Map<e, ?> map) throws m {
        e(map);
        return b(cVar);
    }

    @Override // com.google.zxing.p
    public r c(c cVar) throws m {
        e(null);
        return b(cVar);
    }

    public r d(c cVar) throws m {
        if (this.f130496b == null) {
            e(null);
        }
        return b(cVar);
    }

    public void e(Map<e, ?> map) {
        this.f130495a = map;
        boolean z10 = map != null && map.containsKey(e.TRY_HARDER);
        Collection collection = map == null ? null : (Collection) map.get(e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            boolean z11 = collection.contains(a.UPC_A) || collection.contains(a.UPC_E) || collection.contains(a.EAN_13) || collection.contains(a.EAN_8) || collection.contains(a.CODABAR) || collection.contains(a.CODE_39) || collection.contains(a.CODE_93) || collection.contains(a.CODE_128) || collection.contains(a.ITF) || collection.contains(a.RSS_14) || collection.contains(a.RSS_EXPANDED);
            if (z11 && !z10) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
            if (collection.contains(a.QR_CODE)) {
                arrayList.add(new com.google.zxing.qrcode.a());
            }
            if (collection.contains(a.DATA_MATRIX)) {
                arrayList.add(new x9.a());
            }
            if (collection.contains(a.AZTEC)) {
                arrayList.add(new v9.b());
            }
            if (collection.contains(a.PDF_417)) {
                arrayList.add(new aa.b());
            }
            if (collection.contains(a.MAXICODE)) {
                arrayList.add(new y9.a());
            }
            if (z11 && z10) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
        }
        if (arrayList.isEmpty()) {
            if (!z10) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
            arrayList.add(new com.google.zxing.qrcode.a());
            arrayList.add(new x9.a());
            arrayList.add(new v9.b());
            arrayList.add(new aa.b());
            arrayList.add(new y9.a());
            if (z10) {
                arrayList.add(new com.google.zxing.oned.p(map));
            }
        }
        this.f130496b = (p[]) arrayList.toArray(new p[arrayList.size()]);
    }

    @Override // com.google.zxing.p
    public void reset() {
        p[] pVarArr = this.f130496b;
        if (pVarArr != null) {
            int i10 = 7 << 0;
            for (p pVar : pVarArr) {
                pVar.reset();
            }
        }
    }
}
