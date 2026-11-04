package org.locationtech.jts.geom.prep;

import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
abstract class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected h f338202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private org.locationtech.jts.algorithm.locate.b f338203b;

    public m(h hVar) {
        this.f338202a = hVar;
        this.f338203b = hVar.q();
    }

    protected boolean a(n nVar) {
        Iterator it = org.locationtech.jts.geom.util.d.b(nVar).iterator();
        while (it.hasNext()) {
            if (this.f338203b.a((org.locationtech.jts.geom.a) it.next()) == 2) {
                return false;
            }
        }
        return true;
    }

    protected boolean b(n nVar) {
        Iterator it = org.locationtech.jts.geom.util.d.b(nVar).iterator();
        while (it.hasNext()) {
            if (this.f338203b.a((org.locationtech.jts.geom.a) it.next()) != 0) {
                return false;
            }
        }
        return true;
    }

    protected boolean c(n nVar, List list) {
        org.locationtech.jts.algorithm.locate.c cVar = new org.locationtech.jts.algorithm.locate.c(nVar);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (cVar.a((org.locationtech.jts.geom.a) it.next()) != 2) {
                return true;
            }
        }
        return false;
    }

    protected boolean d(n nVar) {
        Iterator it = org.locationtech.jts.geom.util.d.b(nVar).iterator();
        while (it.hasNext()) {
            if (this.f338203b.a((org.locationtech.jts.geom.a) it.next()) != 2) {
                return true;
            }
        }
        return false;
    }

    protected boolean e(n nVar) {
        Iterator it = org.locationtech.jts.geom.util.d.b(nVar).iterator();
        while (it.hasNext()) {
            if (this.f338203b.a((org.locationtech.jts.geom.a) it.next()) == 0) {
                return true;
            }
        }
        return false;
    }
}
