package org.locationtech.jts.noding;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public class c0 implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Collection f338557a;

    public c0(Collection collection) {
        this.f338557a = collection;
    }

    private void b(y yVar, y yVar2, t tVar) {
        org.locationtech.jts.geom.a[] aVarArrN = yVar.n();
        org.locationtech.jts.geom.a[] aVarArrN2 = yVar2.n();
        for (int i10 = 0; i10 < aVarArrN.length - 1; i10++) {
            for (int i11 = 0; i11 < aVarArrN2.length - 1; i11++) {
                tVar.a(yVar, i10, yVar2, i11);
                if (tVar.isDone()) {
                    return;
                }
            }
        }
    }

    @Override // org.locationtech.jts.noding.x
    public void a(Collection collection, t tVar) {
        for (y yVar : this.f338557a) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b(yVar, (y) it.next(), tVar);
                if (tVar.isDone()) {
                    return;
                }
            }
        }
    }
}
