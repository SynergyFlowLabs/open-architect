package org.locationtech.jts.operation.relate;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.t;
import org.locationtech.jts.geomgraph.l;
import org.locationtech.jts.geomgraph.n;

/* JADX INFO: loaded from: classes14.dex */
public class b extends org.locationtech.jts.geomgraph.e {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List f338902i;

    public b(org.locationtech.jts.algorithm.c cVar, org.locationtech.jts.geomgraph.e eVar) {
        super(eVar.p(), eVar.k(), eVar.l(), new n(eVar.q()));
        this.f338902i = new ArrayList();
        H(eVar);
    }

    private void D(int i10) {
        z(i10, 1);
        z(i10, 2);
    }

    private void x(int i10, org.locationtech.jts.algorithm.c cVar) {
        Iterator it = iterator();
        boolean z10 = false;
        int i11 = 0;
        while (it.hasNext()) {
            int iD = ((org.locationtech.jts.geomgraph.e) it.next()).q().d(i10);
            if (iD == 1) {
                i11++;
            }
            if (iD == 0) {
                z10 = true;
            }
        }
        int iK = z10 ? 0 : -1;
        if (i11 > 0) {
            iK = l.K(cVar, i11);
        }
        this.f338287b.p(i10, iK);
    }

    private void z(int i10, int i11) {
        Iterator it = iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.e eVar = (org.locationtech.jts.geomgraph.e) it.next();
            if (eVar.q().g()) {
                int iE = eVar.q().e(i10, i11);
                if (iE == 0) {
                    this.f338287b.q(i10, i11, 0);
                    return;
                } else if (iE == 2) {
                    this.f338287b.q(i10, i11, 2);
                }
            }
        }
    }

    public List E() {
        return this.f338902i;
    }

    public void H(org.locationtech.jts.geomgraph.e eVar) {
        this.f338902i.add(eVar);
    }

    void I(t tVar) {
        org.locationtech.jts.geomgraph.d.H(this.f338287b, tVar);
    }

    @Override // org.locationtech.jts.geomgraph.e
    public void c(org.locationtech.jts.algorithm.c cVar) {
        Iterator it = iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            if (((org.locationtech.jts.geomgraph.e) it.next()).q().g()) {
                z10 = true;
                int i10 = 7 | 1;
            }
        }
        if (z10) {
            this.f338287b = new n(-1, -1, -1);
        } else {
            this.f338287b = new n(-1);
        }
        for (int i11 = 0; i11 < 2; i11++) {
            x(i11, cVar);
            if (z10) {
                D(i11);
            }
        }
    }

    public Iterator iterator() {
        return this.f338902i.iterator();
    }

    @Override // org.locationtech.jts.geomgraph.e
    public n q() {
        return this.f338287b;
    }

    @Override // org.locationtech.jts.geomgraph.e
    public void v(PrintStream printStream) {
        printStream.println("EdgeEndBundle--> Label: " + this.f338287b);
        Iterator it = iterator();
        while (it.hasNext()) {
            ((org.locationtech.jts.geomgraph.e) it.next()).v(printStream);
            printStream.println();
        }
    }

    public b(org.locationtech.jts.geomgraph.e eVar) {
        this(null, eVar);
    }
}
