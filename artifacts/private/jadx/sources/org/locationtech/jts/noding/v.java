package org.locationtech.jts.noding;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes14.dex */
public class v {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map f338662a = new TreeMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f338663b;

    public v(m mVar) {
        this.f338663b = mVar;
    }

    private void b() {
        ArrayList arrayList = new ArrayList();
        j(arrayList);
        i(arrayList);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Integer) it.next()).intValue();
            a(this.f338663b.w4(iIntValue), iIntValue);
        }
    }

    private void c(u uVar, u uVar2, org.locationtech.jts.geom.d dVar) {
        int i10 = uVar2.f338659c;
        int i11 = uVar.f338659c;
        boolean z10 = uVar2.n() || !uVar2.f338658b.p(this.f338663b.w4(i10));
        dVar.i(new org.locationtech.jts.geom.a(uVar.f338658b), false);
        for (int i12 = uVar.f338659c + 1; i12 <= uVar2.f338659c; i12++) {
            dVar.d(this.f338663b.w4(i12));
        }
        if (z10) {
            dVar.d(new org.locationtech.jts.geom.a(uVar2.f338658b));
        }
    }

    private void d() {
        int size = this.f338663b.size() - 1;
        a(this.f338663b.w4(0), 0);
        a(this.f338663b.w4(size), size);
    }

    private void f(List list) {
        org.locationtech.jts.geom.a[] aVarArrN = this.f338663b.n();
        org.locationtech.jts.geom.a aVarW4 = ((y) list.get(0)).w4(0);
        if (!aVarW4.p(aVarArrN[0])) {
            throw new RuntimeException("bad split edge start point at " + aVarW4);
        }
        org.locationtech.jts.geom.a[] aVarArrN2 = ((y) list.get(list.size() - 1)).n();
        org.locationtech.jts.geom.a aVar = aVarArrN2[aVarArrN2.length - 1];
        if (aVar.p(aVarArrN[aVarArrN.length - 1])) {
            return;
        }
        throw new RuntimeException("bad split edge end point at " + aVar);
    }

    private boolean h(u uVar, u uVar2, int[] iArr) {
        if (!uVar.f338658b.p(uVar2.f338658b)) {
            return false;
        }
        int i10 = uVar2.f338659c - uVar.f338659c;
        if (!uVar2.n()) {
            i10--;
        }
        if (i10 != 1) {
            return false;
        }
        iArr[0] = uVar.f338659c + 1;
        return true;
    }

    private void i(List list) {
        int i10 = 0;
        while (i10 < this.f338663b.size() - 2) {
            org.locationtech.jts.geom.a aVarW4 = this.f338663b.w4(i10);
            int i11 = i10 + 1;
            this.f338663b.w4(i11);
            if (aVarW4.p(this.f338663b.w4(i10 + 2))) {
                list.add(new Integer(i11));
            }
            i10 = i11;
        }
    }

    private void j(List list) {
        int[] iArr = new int[1];
        Iterator itM = m();
        u uVar = (u) itM.next();
        while (itM.hasNext()) {
            u uVar2 = (u) itM.next();
            if (h(uVar, uVar2, iArr)) {
                boolean z10 = true & false;
                list.add(new Integer(iArr[0]));
            }
            uVar = uVar2;
        }
    }

    public u a(org.locationtech.jts.geom.a aVar, int i10) {
        m mVar = this.f338663b;
        u uVar = new u(mVar, aVar, i10, mVar.i(i10));
        u uVar2 = (u) this.f338662a.get(uVar);
        if (uVar2 != null) {
            org.locationtech.jts.util.a.d(uVar2.f338658b.p(aVar), "Found equal nodes with different coordinates");
            return uVar2;
        }
        this.f338662a.put(uVar, uVar);
        return uVar;
    }

    public void e(Collection collection) {
        d();
        b();
        Iterator itM = m();
        u uVar = (u) itM.next();
        while (itM.hasNext()) {
            u uVar2 = (u) itM.next();
            collection.add(g(uVar, uVar2));
            uVar = uVar2;
        }
    }

    y g(u uVar, u uVar2) {
        int i10 = uVar2.f338659c;
        int i11 = i10 - uVar.f338659c;
        int i12 = i11 + 2;
        int i13 = 1;
        boolean z10 = uVar2.n() || !uVar2.f338658b.p(this.f338663b.w4(i10));
        if (!z10) {
            i12 = i11 + 1;
        }
        org.locationtech.jts.geom.a[] aVarArr = new org.locationtech.jts.geom.a[i12];
        aVarArr[0] = new org.locationtech.jts.geom.a(uVar.f338658b);
        int i14 = uVar.f338659c + 1;
        while (i14 <= uVar2.f338659c) {
            aVarArr[i13] = this.f338663b.w4(i14);
            i14++;
            i13++;
        }
        if (z10) {
            aVarArr[i13] = new org.locationtech.jts.geom.a(uVar2.f338658b);
        }
        return new m(aVarArr, this.f338663b.getData());
    }

    public m k() {
        return this.f338663b;
    }

    public org.locationtech.jts.geom.a[] l() {
        org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
        d();
        Iterator itM = m();
        u uVar = (u) itM.next();
        while (itM.hasNext()) {
            u uVar2 = (u) itM.next();
            c(uVar, uVar2, dVar);
            uVar = uVar2;
        }
        return dVar.Uf();
    }

    public Iterator m() {
        return this.f338662a.values().iterator();
    }

    public void n(PrintStream printStream) {
        printStream.println("Intersections:");
        Iterator itM = m();
        while (itM.hasNext()) {
            ((u) itM.next()).o(printStream);
        }
    }
}
