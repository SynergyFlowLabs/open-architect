package org.locationtech.jts.noding;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class b0 extends d0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Collection f338555b;

    private void d(y yVar, y yVar2) {
        org.locationtech.jts.geom.a[] aVarArrN = yVar.n();
        org.locationtech.jts.geom.a[] aVarArrN2 = yVar2.n();
        for (int i10 = 0; i10 < aVarArrN.length - 1; i10++) {
            for (int i11 = 0; i11 < aVarArrN2.length - 1; i11++) {
                this.f338566a.a(yVar, i10, yVar2, i11);
            }
        }
    }

    @Override // org.locationtech.jts.noding.d0, org.locationtech.jts.noding.n
    public void a(Collection collection) {
        this.f338555b = collection;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            Iterator it2 = collection.iterator();
            while (it2.hasNext()) {
                d(yVar, (y) it2.next());
            }
        }
    }

    @Override // org.locationtech.jts.noding.d0, org.locationtech.jts.noding.n
    public Collection b() {
        return m.g(this.f338555b);
    }
}
