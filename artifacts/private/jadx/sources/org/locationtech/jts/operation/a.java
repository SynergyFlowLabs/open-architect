package org.locationtech.jts.operation;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;
import org.locationtech.jts.geom.a0;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.geom.z;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338666a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f338667b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.algorithm.c f338668c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map f338669d;

    public a(n nVar) {
        this(nVar, org.locationtech.jts.algorithm.c.f337983a);
    }

    private void a(org.locationtech.jts.geom.a aVar) {
        b bVar = (b) this.f338669d.get(aVar);
        if (bVar == null) {
            bVar = new b();
            this.f338669d.put(aVar, bVar);
        }
        bVar.f338670a++;
    }

    private n b(v vVar) {
        if (this.f338666a.v0()) {
            return h();
        }
        if (vVar.X0()) {
            return this.f338668c.a(2) ? vVar.V0() : this.f338667b.n();
        }
        return this.f338667b.q(new d0[]{vVar.V0(), vVar.T0()});
    }

    private n c(z zVar) {
        if (this.f338666a.v0()) {
            return h();
        }
        org.locationtech.jts.geom.a[] aVarArrD = d(zVar);
        return aVarArrD.length == 1 ? this.f338667b.v(aVarArrD[0]) : this.f338667b.r(aVarArrD);
    }

    private org.locationtech.jts.geom.a[] d(z zVar) {
        ArrayList arrayList = new ArrayList();
        this.f338669d = new TreeMap();
        for (int i10 = 0; i10 < zVar.l0(); i10++) {
            v vVar = (v) zVar.h0(i10);
            if (vVar.m0() != 0) {
                a(vVar.R0(0));
                a(vVar.R0(vVar.m0() - 1));
            }
        }
        for (Map.Entry entry : this.f338669d.entrySet()) {
            if (this.f338668c.a(((b) entry.getValue()).f338670a)) {
                arrayList.add(entry.getKey());
            }
        }
        return org.locationtech.jts.geom.b.v(arrayList);
    }

    public static n f(n nVar) {
        return new a(nVar).e();
    }

    public static n g(n nVar, org.locationtech.jts.algorithm.c cVar) {
        return new a(nVar, cVar).e();
    }

    private a0 h() {
        return this.f338667b.n();
    }

    public n e() {
        n nVar = this.f338666a;
        if (nVar instanceof v) {
            return b((v) nVar);
        }
        return nVar instanceof z ? c((z) nVar) : nVar.Y();
    }

    public a(n nVar, org.locationtech.jts.algorithm.c cVar) {
        this.f338666a = nVar;
        this.f338667b = nVar.g0();
        this.f338668c = cVar;
    }
}
