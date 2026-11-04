package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.s;

/* JADX INFO: loaded from: classes14.dex */
public class o implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338250a;

    public o(List list) {
        this.f338250a = list;
    }

    public static List b(org.locationtech.jts.geom.n nVar) {
        return c(nVar, new ArrayList());
    }

    public static List c(org.locationtech.jts.geom.n nVar, List list) {
        if (nVar instanceof e0) {
            list.add(nVar);
            return list;
        }
        if (nVar instanceof org.locationtech.jts.geom.o) {
            nVar.e(new o(list));
        }
        return list;
    }

    @Override // org.locationtech.jts.geom.s
    public void a(org.locationtech.jts.geom.n nVar) {
        if (nVar instanceof e0) {
            this.f338250a.add(nVar);
        }
    }
}
