package org.locationtech.jts.noding;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private a f338664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f338665b;

    public interface a {
        void a(y yVar, y yVar2, boolean z10);
    }

    public z(a aVar) {
        this.f338665b = new TreeMap();
        this.f338664a = aVar;
    }

    private void a(q qVar, y yVar) {
        this.f338665b.put(qVar, yVar);
    }

    private y d(q qVar, y yVar) {
        return (y) this.f338665b.get(qVar);
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((y) it.next());
        }
    }

    public void c(y yVar) {
        q qVar = new q(yVar.n());
        y yVarD = d(qVar, yVar);
        if (yVarD == null) {
            a(qVar, yVar);
        } else if (this.f338664a != null) {
            this.f338664a.a(yVarD, yVar, org.locationtech.jts.geom.b.g(yVarD.n(), yVar.n()));
        }
    }

    public Collection e() {
        return this.f338665b.values();
    }

    public z() {
        this(null);
    }
}
