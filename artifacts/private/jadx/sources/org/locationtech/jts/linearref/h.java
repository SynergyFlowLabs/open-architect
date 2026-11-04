package org.locationtech.jts.linearref;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338545a;

    public h(n nVar) {
        this.f338545a = nVar;
    }

    public static g[] b(n nVar, n nVar2) {
        return new h(nVar).a(nVar2);
    }

    public g[] a(n nVar) {
        org.locationtech.jts.geom.a aVarR0 = ((v) nVar.h0(0)).R0(0);
        v vVar = (v) nVar.h0(nVar.l0() - 1);
        org.locationtech.jts.geom.a aVarR1 = vVar.R0(vVar.m0() - 1);
        i iVar = new i(this.f338545a);
        g[] gVarArr = new g[2];
        gVarArr[0] = iVar.a(aVarR0);
        if (nVar.k0() == 0.0d) {
            gVarArr[1] = gVarArr[0].k();
            return gVarArr;
        }
        gVarArr[1] = iVar.c(aVarR1, gVarArr[0]);
        return gVarArr;
    }
}
