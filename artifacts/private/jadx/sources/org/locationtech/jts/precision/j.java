package org.locationtech.jts.precision;

import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.x;

/* JADX INFO: loaded from: classes14.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338991a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338992b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338993c = false;

    private class a extends org.locationtech.jts.geom.util.g.a {
        @Override // org.locationtech.jts.geom.util.g.a
        public org.locationtech.jts.geom.a[] b(org.locationtech.jts.geom.a[] aVarArr, n nVar) {
            if (aVarArr.length == 0) {
                return null;
            }
            org.locationtech.jts.geom.a[] aVarArr2 = new org.locationtech.jts.geom.a[aVarArr.length];
            for (int i10 = 0; i10 < aVarArr.length; i10++) {
                org.locationtech.jts.geom.a aVar = new org.locationtech.jts.geom.a(aVarArr[i10]);
                j.this.f338991a.s(aVar);
                aVarArr2[i10] = aVar;
            }
            org.locationtech.jts.geom.a[] aVarArrUf = new org.locationtech.jts.geom.d(aVarArr2, false).Uf();
            int i11 = nVar instanceof v ? 2 : 0;
            if (nVar instanceof x) {
                i11 = 4;
            }
            return aVarArrUf.length < i11 ? j.this.f338992b ? null : aVarArr2 : aVarArrUf;
        }

        private a() {
        }
    }

    public j(g0 g0Var) {
        this.f338991a = g0Var;
    }

    public static n d(n nVar, g0 g0Var) {
        return new j(g0Var).c(nVar);
    }

    public n c(n nVar) {
        return (this.f338993c ? new org.locationtech.jts.geom.util.g(new r(this.f338991a, nVar.g0().G())) : new org.locationtech.jts.geom.util.g()).a(nVar, new a());
    }

    public void e(boolean z10) {
        this.f338993c = z10;
    }

    public void f(boolean z10) {
        this.f338992b = z10;
    }
}
