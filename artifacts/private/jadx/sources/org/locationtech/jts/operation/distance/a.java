package org.locationtech.jts.operation.distance;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.s;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class a implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338764a;

    a(List list) {
        this.f338764a = list;
    }

    public static List b(n nVar) {
        ArrayList arrayList = new ArrayList();
        nVar.e(new a(arrayList));
        return arrayList;
    }

    @Override // org.locationtech.jts.geom.s
    public void a(n nVar) {
        if ((nVar instanceof d0) || (nVar instanceof v) || (nVar instanceof e0)) {
            this.f338764a.add(new f(nVar, 0, nVar.c0()));
        }
    }
}
