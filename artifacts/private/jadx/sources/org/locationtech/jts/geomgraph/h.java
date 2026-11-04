package org.locationtech.jts.geomgraph;

import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f338300a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    d f338301b;

    public h(d dVar) {
        this.f338301b = dVar;
    }

    public g a(org.locationtech.jts.geom.a aVar, int i10, double d10) {
        g gVar = new g(aVar, i10, d10);
        g gVar2 = (g) this.f338300a.get(gVar);
        if (gVar2 != null) {
            return gVar2;
        }
        this.f338300a.put(gVar, gVar);
        return gVar;
    }

    public void b() {
        org.locationtech.jts.geom.a[] aVarArr = this.f338301b.f338278f;
        int length = aVarArr.length - 1;
        a(aVarArr[0], 0, 0.0d);
        a(this.f338301b.f338278f[length], length, 0.0d);
    }

    public void c(List list) {
        b();
        Iterator itF = f();
        g gVar = (g) itF.next();
        while (itF.hasNext()) {
            g gVar2 = (g) itF.next();
            list.add(d(gVar, gVar2));
            gVar = gVar2;
        }
    }

    d d(g gVar, g gVar2) {
        int i10 = gVar2.f338298b;
        int i11 = i10 - gVar.f338298b;
        int i12 = i11 + 2;
        int i13 = 1;
        boolean z10 = gVar2.f338299c > 0.0d || !gVar2.f338297a.p(this.f338301b.f338278f[i10]);
        if (!z10) {
            i12 = i11 + 1;
        }
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[i12];
        aVarArr[0] = new org.locationtech.jts.geom.a(gVar.f338297a);
        int i14 = gVar.f338298b + 1;
        while (i14 <= gVar2.f338298b) {
            aVarArr[i13] = this.f338301b.f338278f[i14];
            i14++;
            i13++;
        }
        if (z10) {
            aVarArr[i13] = gVar2.f338297a;
        }
        return new d(aVarArr, new n(this.f338301b.f338359a));
    }

    public boolean e(org.locationtech.jts.geom.a aVar) {
        Iterator itF = f();
        while (itF.hasNext()) {
            if (((g) itF.next()).f338297a.equals(aVar)) {
                return true;
            }
        }
        return false;
    }

    public Iterator f() {
        return this.f338300a.values().iterator();
    }

    public void g(PrintStream printStream) {
        printStream.println("Intersections:");
        Iterator itF = f();
        while (itF.hasNext()) {
            ((g) itF.next()).p(printStream);
        }
    }
}
