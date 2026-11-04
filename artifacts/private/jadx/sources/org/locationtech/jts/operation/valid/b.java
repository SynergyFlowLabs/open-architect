package org.locationtech.jts.operation.valid;

import java.util.Iterator;
import org.locationtech.jts.algorithm.o;
import org.locationtech.jts.algorithm.y;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.operation.relate.g;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f338916b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338918d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final o f338915a = new y();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private g f338917c = new g();

    public b(l lVar) {
        this.f338916b = lVar;
    }

    private boolean d() {
        Iterator itD = this.f338917c.d();
        while (itD.hasNext()) {
            org.locationtech.jts.operation.relate.e eVar = (org.locationtech.jts.operation.relate.e) itD.next();
            if (!eVar.p().l(this.f338916b)) {
                this.f338918d = eVar.b().k();
                return false;
            }
        }
        return true;
    }

    public org.locationtech.jts.geom.a a() {
        return this.f338918d;
    }

    public boolean b() {
        Iterator itD = this.f338917c.d();
        while (itD.hasNext()) {
            Iterator itM = ((org.locationtech.jts.operation.relate.e) itD.next()).p().m();
            while (itM.hasNext()) {
                org.locationtech.jts.operation.relate.b bVar = (org.locationtech.jts.operation.relate.b) itM.next();
                if (bVar.E().size() > 1) {
                    this.f338918d = bVar.p().q(0);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean c() {
        org.locationtech.jts.geomgraph.index.e eVarH = this.f338916b.H(this.f338915a, true, true);
        if (eVarH.e()) {
            this.f338918d = eVarH.b();
            return false;
        }
        this.f338917c.a(this.f338916b);
        return d();
    }
}
