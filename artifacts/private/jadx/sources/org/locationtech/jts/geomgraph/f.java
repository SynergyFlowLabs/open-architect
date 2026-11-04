package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.locationtech.jts.geom.i0;

/* JADX INFO: loaded from: classes14.dex */
public abstract class f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected List f338295b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Map f338294a = new TreeMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f338296c = {-1, -1};

    private boolean a(int i10) {
        List listG = g();
        if (listG.size() <= 0) {
            return true;
        }
        int iE = ((e) listG.get(listG.size() - 1)).q().e(i10, 1);
        org.locationtech.jts.util.a.d(iE != -1, "Found unlabelled area edge");
        Iterator itM = m();
        while (itM.hasNext()) {
            n nVarQ = ((e) itM.next()).q();
            org.locationtech.jts.util.a.d(nVarQ.h(i10), "Found non-area edge");
            int iE2 = nVarQ.e(i10, 1);
            int iE3 = nVarQ.e(i10, 2);
            if (iE2 != iE3 && iE3 == iE) {
                iE = iE2;
            }
            return false;
        }
        return true;
    }

    private void b(org.locationtech.jts.algorithm.c cVar) {
        Iterator itM = m();
        while (itM.hasNext()) {
            ((e) itM.next()).c(cVar);
        }
    }

    private int h(int i10, org.locationtech.jts.geom.a aVar, l[] lVarArr) {
        int[] iArr = this.f338296c;
        if (iArr[i10] == -1) {
            iArr[i10] = org.locationtech.jts.algorithm.locate.c.c(aVar, lVarArr[i10].P());
        }
        return this.f338296c[i10];
    }

    public void c(l[] lVarArr) {
        b(lVarArr[0].M());
        o(0);
        o(1);
        int i10 = 7 & 2;
        boolean[] zArr = new boolean[2];
        zArr[0] = false;
        zArr[1] = false;
        Iterator itM = m();
        while (itM.hasNext()) {
            n nVarQ = ((e) itM.next()).q();
            for (int i11 = 0; i11 < 2; i11++) {
                if (nVarQ.j(i11) && nVarQ.d(i11) == 1) {
                    zArr[i11] = true;
                }
            }
        }
        Iterator itM2 = m();
        while (itM2.hasNext()) {
            e eVar = (e) itM2.next();
            n nVarQ2 = eVar.q();
            for (int i12 = 0; i12 < 2; i12++) {
                if (nVarQ2.f(i12)) {
                    nVarQ2.o(i12, zArr[i12] ? 2 : h(i12, eVar.k(), lVarArr));
                }
            }
        }
    }

    public int d(e eVar) {
        m();
        for (int i10 = 0; i10 < this.f338295b.size(); i10++) {
            if (((e) this.f338295b.get(i10)) == eVar) {
                return i10;
            }
        }
        return -1;
    }

    public org.locationtech.jts.geom.a e() {
        Iterator itM = m();
        if (itM.hasNext()) {
            return ((e) itM.next()).k();
        }
        boolean z10 = true & false;
        return null;
    }

    public int f() {
        return this.f338294a.size();
    }

    public List g() {
        if (this.f338295b == null) {
            this.f338295b = new ArrayList(this.f338294a.values());
        }
        return this.f338295b;
    }

    public e i(e eVar) {
        g();
        int iIndexOf = this.f338295b.indexOf(eVar);
        int size = iIndexOf - 1;
        if (iIndexOf == 0) {
            size = this.f338295b.size() - 1;
        }
        return (e) this.f338295b.get(size);
    }

    public abstract void j(e eVar);

    protected void k(e eVar, Object obj) {
        this.f338294a.put(eVar, obj);
        this.f338295b = null;
    }

    public boolean l(l lVar) {
        b(lVar.M());
        return a(0);
    }

    public Iterator m() {
        return g().iterator();
    }

    public void n(PrintStream printStream) {
        System.out.println("EdgeEndStar:   " + e());
        Iterator itM = m();
        while (itM.hasNext()) {
            ((e) itM.next()).v(printStream);
        }
    }

    void o(int i10) {
        Iterator itM = m();
        int iE = -1;
        while (itM.hasNext()) {
            n nVarQ = ((e) itM.next()).q();
            if (nVarQ.h(i10) && nVarQ.e(i10, 1) != -1) {
                iE = nVarQ.e(i10, 1);
            }
        }
        if (iE != -1) {
            Iterator itM2 = m();
            while (itM2.hasNext()) {
                e eVar = (e) itM2.next();
                n nVarQ2 = eVar.q();
                if (nVarQ2.e(i10, 0) == -1) {
                    nVarQ2.q(i10, 0, iE);
                }
                if (nVarQ2.h(i10)) {
                    int iE2 = nVarQ2.e(i10, 1);
                    int iE3 = nVarQ2.e(i10, 2);
                    if (iE3 == -1) {
                        org.locationtech.jts.util.a.d(nVarQ2.e(i10, 1) == -1, "found single null side");
                        nVarQ2.q(i10, 2, iE);
                        nVarQ2.q(i10, 1, iE);
                    } else {
                        if (iE3 != iE) {
                            throw new i0("side location conflict", eVar.k());
                        }
                        if (iE2 == -1) {
                            org.locationtech.jts.util.a.f("found single null side (at " + eVar.k() + ")");
                        }
                        iE = iE2;
                    }
                }
            }
        }
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append("EdgeEndStar:   " + e());
        stringBuffer.append("\n");
        Iterator itM = m();
        while (itM.hasNext()) {
            stringBuffer.append((e) itM.next());
            stringBuffer.append("\n");
        }
        return stringBuffer.toString();
    }
}
