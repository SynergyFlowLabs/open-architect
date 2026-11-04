package org.locationtech.jts.operation.overlay.validate;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.util.l;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338851b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338852c = true;

    public b(n nVar) {
        this.f338850a = nVar;
    }

    private void a(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, double d10, List list) {
        double d11 = aVar2.f338092a - aVar.f338092a;
        double d12 = aVar2.f338093b - aVar.f338093b;
        double dSqrt = Math.sqrt((d11 * d11) + (d12 * d12));
        double d13 = (d11 * d10) / dSqrt;
        double d14 = (d10 * d12) / dSqrt;
        double d15 = (aVar2.f338092a + aVar.f338092a) / 2.0d;
        double d16 = (aVar2.f338093b + aVar.f338093b) / 2.0d;
        if (this.f338851b) {
            list.add(new org.locationtech.jts.geom.a(d15 - d14, d16 + d13));
        }
        if (this.f338852c) {
            list.add(new org.locationtech.jts.geom.a(d15 + d14, d16 - d13));
        }
    }

    private void b(v vVar, double d10, List list) {
        org.locationtech.jts.geom.a[] aVarArrD0 = vVar.d0();
        int i10 = 0;
        while (i10 < aVarArrD0.length - 1) {
            org.locationtech.jts.geom.a aVar = aVarArrD0[i10];
            i10++;
            a(aVar, aVarArrD0[i10], d10, list);
        }
    }

    public List c(double d10) {
        ArrayList arrayList = new ArrayList();
        Iterator it = l.h(this.f338850a).iterator();
        while (it.hasNext()) {
            b((v) it.next(), d10, arrayList);
        }
        return arrayList;
    }

    public void d(boolean z10, boolean z11) {
        this.f338851b = z10;
        this.f338852c = z11;
    }
}
