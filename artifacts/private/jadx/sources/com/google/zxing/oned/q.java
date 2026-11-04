package com.google.zxing.oned;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class q extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y[] f130632a;

    public q(Map<com.google.zxing.e, ?> map) {
        Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.e.POSSIBLE_FORMATS);
        ArrayList arrayList = new ArrayList();
        if (collection != null) {
            if (collection.contains(com.google.zxing.a.EAN_13)) {
                arrayList.add(new i());
            } else if (collection.contains(com.google.zxing.a.UPC_A)) {
                arrayList.add(new t());
            }
            if (collection.contains(com.google.zxing.a.EAN_8)) {
                arrayList.add(new k());
            }
            if (collection.contains(com.google.zxing.a.UPC_E)) {
                arrayList.add(new a0());
            }
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new i());
            arrayList.add(new k());
            arrayList.add(new a0());
        }
        this.f130632a = (y[]) arrayList.toArray(new y[arrayList.size()]);
    }

    @Override // com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m {
        int[] iArrP = y.p(aVar);
        for (y yVar : this.f130632a) {
            try {
                com.google.zxing.r rVarM = yVar.m(i10, aVar, iArrP, map);
                boolean z10 = rVarM.b() == com.google.zxing.a.EAN_13 && rVarM.g().charAt(0) == '0';
                Collection collection = map == null ? null : (Collection) map.get(com.google.zxing.e.POSSIBLE_FORMATS);
                boolean z11 = collection == null || collection.contains(com.google.zxing.a.UPC_A);
                if (!z10 || !z11) {
                    return rVarM;
                }
                com.google.zxing.r rVar = new com.google.zxing.r(rVarM.g().substring(1), rVarM.d(), rVarM.f(), com.google.zxing.a.UPC_A);
                rVar.i(rVarM.e());
                return rVar;
            } catch (com.google.zxing.q unused) {
            }
        }
        throw com.google.zxing.m.a();
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.p
    public void reset() {
        for (y yVar : this.f130632a) {
            yVar.reset();
        }
    }
}
