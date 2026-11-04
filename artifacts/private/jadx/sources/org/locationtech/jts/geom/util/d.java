package org.locationtech.jts.geom.util;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class d implements org.locationtech.jts.geom.q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338231a;

    public d(List list) {
        this.f338231a = list;
    }

    public static List b(org.locationtech.jts.geom.n nVar) {
        ArrayList arrayList = new ArrayList();
        nVar.d(new d(arrayList));
        return arrayList;
    }

    @Override // org.locationtech.jts.geom.q
    public void a(org.locationtech.jts.geom.n nVar) {
        if ((nVar instanceof v) || (nVar instanceof d0)) {
            this.f338231a.add(nVar.c0());
        }
    }
}
