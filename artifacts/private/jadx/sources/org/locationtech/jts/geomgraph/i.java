package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338302a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map f338303b = new TreeMap();

    public void a(d dVar) {
        this.f338302a.add(dVar);
        this.f338303b.put(new org.locationtech.jts.noding.q(dVar.r()), dVar);
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            a((d) it.next());
        }
    }

    public int c(d dVar) {
        for (int i10 = 0; i10 < this.f338302a.size(); i10++) {
            if (((d) this.f338302a.get(i10)).equals(dVar)) {
                return i10;
            }
        }
        return -1;
    }

    public d d(d dVar) {
        return (d) this.f338303b.get(new org.locationtech.jts.noding.q(dVar.r()));
    }

    public d e(int i10) {
        return (d) this.f338302a.get(i10);
    }

    public List f() {
        return this.f338302a;
    }

    public Iterator g() {
        return this.f338302a.iterator();
    }

    public void h(PrintStream printStream) {
        printStream.print("MULTILINESTRING ( ");
        for (int i10 = 0; i10 < this.f338302a.size(); i10++) {
            d dVar = (d) this.f338302a.get(i10);
            if (i10 > 0) {
                printStream.print(",");
            }
            printStream.print("(");
            org.locationtech.jts.geom.a[] aVarArrR = dVar.r();
            for (int i11 = 0; i11 < aVarArrR.length; i11++) {
                if (i11 > 0) {
                    printStream.print(",");
                }
                printStream.print(aVarArrR[i11].f338092a + " " + aVarArrR[i11].f338093b);
            }
            printStream.println(")");
        }
        printStream.print(")  ");
    }
}
