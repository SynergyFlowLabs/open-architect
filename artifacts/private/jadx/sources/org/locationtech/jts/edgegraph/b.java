package org.locationtech.jts.edgegraph;

import java.util.Collection;
import java.util.Iterator;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.edgegraph.a f338081a = new org.locationtech.jts.edgegraph.a();

    class a implements q {
        a() {
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                b.this.d((v) nVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(v vVar) {
        e eVarS0 = vVar.S0();
        for (int i10 = 1; i10 < eVarS0.size(); i10++) {
            this.f338081a.a(eVarS0.w4(i10 - 1), eVarS0.w4(i10));
        }
    }

    public static org.locationtech.jts.edgegraph.a e(Collection collection) {
        b bVar = new b();
        bVar.b(collection);
        return bVar.f();
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((n) it.next());
        }
    }

    public void c(n nVar) {
        nVar.d(new a());
    }

    public org.locationtech.jts.edgegraph.a f() {
        return this.f338081a;
    }
}
