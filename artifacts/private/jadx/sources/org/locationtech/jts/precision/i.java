package org.locationtech.jts.precision;

import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public class i extends org.locationtech.jts.geom.util.g.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338989a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338990b;

    public i(g0 g0Var, boolean z10) {
        this.f338989a = g0Var;
        this.f338990b = z10;
    }

    @Override // org.locationtech.jts.geom.util.g.a
    public org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr, n nVar) {
        if (aVarArr.length == 0) {
            return null;
        }
        org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[aVarArr.length];
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(aVarArr[i10]);
            this.f338989a.s(aVar);
            aVarArr2[i10] = aVar;
        }
        org.locationtech.jts.geom.a[] aVarArrUf = new org.locationtech.jts.geom.d(aVarArr2, false).Uf();
        int i11 = nVar instanceof v ? 2 : 0;
        if (nVar instanceof x) {
            i11 = 4;
        }
        return aVarArrUf.length < i11 ? this.f338990b ? null : aVarArr2 : aVarArrUf;
    }
}
