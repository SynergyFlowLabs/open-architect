package org.locationtech.jts.edgegraph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f338080a = new HashMap();

    private c b(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        c cVarC = c(aVar);
        c.j(cVarC, c(aVar2));
        return cVarC;
    }

    private c f(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, c cVar) {
        c cVarB = b(aVar, aVar2);
        if (cVar != null) {
            cVar.l(cVarB);
        } else {
            this.f338080a.put(aVar, cVarB);
        }
        c cVar2 = (c) this.f338080a.get(aVar2);
        if (cVar2 != null) {
            cVar2.l(cVarB.u());
            return cVarB;
        }
        this.f338080a.put(aVar2, cVarB.u());
        return cVarB;
    }

    public static boolean g(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        return aVar2.compareTo(aVar) != 0;
    }

    public c a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        if (!g(aVar, aVar2)) {
            return null;
        }
        c cVar = (c) this.f338080a.get(aVar);
        c cVarI = cVar != null ? cVar.i(aVar2) : null;
        return cVarI != null ? cVarI : f(aVar, aVar2, cVar);
    }

    protected c c(org.locationtech.jts.geom.a aVar) {
        return new c(aVar);
    }

    public c d(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        c cVar = (c) this.f338080a.get(aVar);
        if (cVar == null) {
            return null;
        }
        return cVar.i(aVar2);
    }

    public Collection e() {
        return this.f338080a.values();
    }
}
