package org.locationtech.jts.noding;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class j implements x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.index.strtree.k f338593a = new org.locationtech.jts.index.strtree.k();

    public static class a extends org.locationtech.jts.index.chain.c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private t f338594c;

        public a(t tVar) {
            this.f338594c = tVar;
        }

        @Override // org.locationtech.jts.index.chain.c
        public void b(org.locationtech.jts.index.chain.a aVar, int i10, org.locationtech.jts.index.chain.a aVar2, int i11) {
            this.f338594c.a((y) aVar.d(), i10, (y) aVar2.d(), i11);
        }
    }

    public j(Collection collection) {
        e(collection);
    }

    private void b(y yVar) {
        for (org.locationtech.jts.index.chain.a aVar : org.locationtech.jts.index.chain.b.d(yVar.n(), yVar)) {
            this.f338593a.a(aVar.g(), aVar);
        }
    }

    private void c(y yVar, List list) {
        Iterator it = org.locationtech.jts.index.chain.b.d(yVar.n(), yVar).iterator();
        while (it.hasNext()) {
            list.add((org.locationtech.jts.index.chain.a) it.next());
        }
    }

    private void e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            b((y) it.next());
        }
        this.f338593a.g();
    }

    private void f(List list, t tVar) {
        a aVar = new a(tVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.index.chain.a aVar2 = (org.locationtech.jts.index.chain.a) it.next();
            Iterator it2 = this.f338593a.b(aVar2.g()).iterator();
            while (it2.hasNext()) {
                aVar2.b((org.locationtech.jts.index.chain.a) it2.next(), aVar);
                if (tVar.isDone()) {
                    return;
                }
            }
        }
    }

    @Override // org.locationtech.jts.noding.x
    public void a(Collection collection, t tVar) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((y) it.next(), arrayList);
        }
        f(arrayList, tVar);
    }

    public qm.c d() {
        return this.f338593a;
    }
}
