package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.s;

/* JADX INFO: loaded from: classes14.dex */
public class n implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338249a;

    public n(List list) {
        this.f338249a = list;
    }

    public static List b(org.locationtech.jts.geom.n nVar) {
        return nVar instanceof d0 ? Collections.singletonList(nVar) : c(nVar, new ArrayList());
    }

    public static List c(org.locationtech.jts.geom.n nVar, List list) {
        if (nVar instanceof d0) {
            list.add(nVar);
            return list;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            nVar.e(new n(list));
        }
        return list;
    }

    @Override // org.locationtech.jts.geom.s
    public void a(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof d0) {
            this.f338249a.add(nVar);
        }
    }
}
