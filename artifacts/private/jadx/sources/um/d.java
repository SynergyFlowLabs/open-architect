package um;

import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class d {
    public static void a(n nVar, org.locationtech.jts.geom.a aVar, e eVar) {
        if (nVar instanceof v) {
            c((v) nVar, aVar, eVar);
            return;
        }
        if (nVar instanceof e0) {
            d((e0) nVar, aVar, eVar);
            return;
        }
        if (!(nVar instanceof o)) {
            eVar.i(nVar.c0(), aVar);
            return;
        }
        o oVar = (o) nVar;
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            a(oVar.h0(i10), aVar, eVar);
        }
    }

    public static void b(u uVar, org.locationtech.jts.geom.a aVar, e eVar) {
        eVar.i(uVar.l(aVar), aVar);
    }

    public static void c(v vVar, org.locationtech.jts.geom.a aVar, e eVar) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        u uVar = new u();
        int i10 = 0;
        while (i10 < aVarArrD0.length - 1) {
            org.locationtech.jts.geom.a aVar2 = aVarArrD0[i10];
            i10++;
            uVar.Z(aVar2, aVarArrD0[i10]);
            eVar.i(uVar.l(aVar), aVar);
        }
    }

    public static void d(e0 e0Var, org.locationtech.jts.geom.a aVar, e eVar) {
        c(e0Var.R0(), aVar, eVar);
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            c(e0Var.S0(i10), aVar, eVar);
        }
    }
}
