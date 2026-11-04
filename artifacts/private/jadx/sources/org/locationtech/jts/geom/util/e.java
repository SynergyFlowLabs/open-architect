package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import org.locationtech.jts.geom.r;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private i.a f338232a;

    public e(i.a aVar) {
        this.f338232a = aVar;
    }

    public static org.locationtech.jts.geom.o b(org.locationtech.jts.geom.o oVar, i.a aVar) {
        return new e(aVar).a(oVar);
    }

    public org.locationtech.jts.geom.o a(org.locationtech.jts.geom.o oVar) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < oVar.l0(); i10++) {
            org.locationtech.jts.geom.n nVarA = this.f338232a.a(oVar.h0(i10));
            if (!nVarA.v0()) {
                arrayList.add(nVarA);
            }
        }
        return oVar.g0().e(r.I(arrayList));
    }
}
