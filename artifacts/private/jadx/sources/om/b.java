package om;

import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.o;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class b {
    public static void a(n nVar, org.locationtech.jts.geom.a aVar, c cVar) {
        if (nVar instanceof v) {
            c((v) nVar, aVar, cVar);
            return;
        }
        if (nVar instanceof e0) {
            d((e0) nVar, aVar, cVar);
            return;
        }
        if (!(nVar instanceof o)) {
            cVar.j(nVar.c0(), aVar);
            return;
        }
        o oVar = (o) nVar;
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            a(oVar.h0(i10), aVar, cVar);
        }
    }

    public static void b(u uVar, org.locationtech.jts.geom.a aVar, c cVar) {
        cVar.j(uVar.l(aVar), aVar);
    }

    public static void c(v vVar, org.locationtech.jts.geom.a aVar, c cVar) {
        u uVar = new u();
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        int i10 = 0;
        while (i10 < aVarArrD0.length - 1) {
            org.locationtech.jts.geom.a aVar2 = aVarArrD0[i10];
            i10++;
            uVar.Z(aVar2, aVarArrD0[i10]);
            cVar.j(uVar.l(aVar), aVar);
        }
    }

    public static void d(e0 e0Var, org.locationtech.jts.geom.a aVar, c cVar) {
        c(e0Var.R0(), aVar, cVar);
        for (int i10 = 0; i10 < e0Var.T0(); i10++) {
            c(e0Var.S0(i10), aVar, cVar);
        }
    }
}
