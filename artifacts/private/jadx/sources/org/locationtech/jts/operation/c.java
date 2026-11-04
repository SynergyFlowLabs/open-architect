package org.locationtech.jts.operation;

import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geom.g0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geomgraph.l;

/* JADX INFO: loaded from: classes14.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final o f338755a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected g0 f338756b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected l[] f338757c;

    public c(n nVar, n nVar2) {
        this(nVar, nVar2, org.locationtech.jts.algorithm.c.f337987e);
    }

    public n a(int i10) {
        return this.f338757c[i10].P();
    }

    protected void b(g0 g0Var) {
        this.f338756b = g0Var;
        this.f338755a.w(g0Var);
    }

    public c(n nVar, n nVar2, org.locationtech.jts.algorithm.c cVar) {
        this.f338755a = new y();
        if (nVar.n0().compareTo(nVar2.n0()) >= 0) {
            b(nVar.n0());
        } else {
            b(nVar2.n0());
        }
        l[] lVarArr = new l[2];
        this.f338757c = lVarArr;
        lVarArr[0] = new l(0, nVar, cVar);
        this.f338757c[1] = new l(1, nVar2, cVar);
    }

    public c(n nVar) {
        this.f338755a = new y();
        b(nVar.n0());
        this.f338757c = new l[]{new l(0, nVar)};
    }
}
