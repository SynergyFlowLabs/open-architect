package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.s;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class k implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338246a;

    public k(List list) {
        this.f338246a = list;
    }

    public static org.locationtech.jts.geom.n b(org.locationtech.jts.geom.n nVar) {
        return nVar.g0().b(c(nVar));
    }

    public static List c(org.locationtech.jts.geom.n nVar) {
        return d(nVar, new ArrayList());
    }

    public static List d(org.locationtech.jts.geom.n nVar, List list) {
        if (nVar instanceof v) {
            list.add(nVar);
            return list;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            nVar.e(new k(list));
        }
        return list;
    }

    @Override // org.locationtech.jts.geom.s
    public void a(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof v) {
            this.f338246a.add(nVar);
        }
    }
}
