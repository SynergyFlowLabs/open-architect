package org.locationtech.jts.operation.buffer;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.algorithm.s;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f338751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f338752b = new u();

    static class a implements Comparable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private u f338753a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f338754b;

        public a(u uVar, int i10) {
            this.f338753a = new u(uVar);
            this.f338754b = i10;
        }

        private int c(u uVar, u uVar2) {
            int iCompareTo = uVar.f338211a.compareTo(uVar2.f338211a);
            return iCompareTo != 0 ? iCompareTo : uVar.f338212b.compareTo(uVar2.f338212b);
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            a aVar = (a) obj;
            if (this.f338753a.L() >= aVar.f338753a.D()) {
                return 1;
            }
            if (this.f338753a.D() <= aVar.f338753a.L()) {
                return -1;
            }
            int iR = this.f338753a.R(aVar.f338753a);
            if (iR != 0) {
                return iR;
            }
            int iR2 = aVar.f338753a.R(this.f338753a) * (-1);
            return iR2 != 0 ? iR2 : this.f338753a.compareTo(aVar.f338753a);
        }

        public String toString() {
            return this.f338753a.toString();
        }
    }

    public k(List list) {
        this.f338751a = list;
    }

    private List a(org.locationtech.jts.geom.a aVar) {
        ArrayList arrayList = new ArrayList();
        for (e eVar : this.f338751a) {
            m mVarT = eVar.t();
            if (aVar.f338093b >= mVarT.M() && aVar.f338093b <= mVarT.I()) {
                b(aVar, eVar.s(), arrayList);
            }
        }
        return arrayList;
    }

    private void b(org.locationtech.jts.geom.a aVar, List list, List list2) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            org.locationtech.jts.geomgraph.b bVar = (org.locationtech.jts.geomgraph.b) it.next();
            if (bVar.O()) {
                c(aVar, bVar, list2);
            }
        }
    }

    private void c(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geomgraph.b bVar, List list) {
        org.locationtech.jts.geom.a[] aVarArrR = bVar.p().r();
        int i10 = 0;
        int i11 = 5 | 0;
        while (i10 < aVarArrR.length - 1) {
            u uVar = this.f338752b;
            org.locationtech.jts.geom.a aVar2 = aVarArrR[i10];
            uVar.f338211a = aVar2;
            int i12 = i10 + 1;
            org.locationtech.jts.geom.a aVar3 = aVarArrR[i12];
            uVar.f338212b = aVar3;
            if (aVar2.f338093b > aVar3.f338093b) {
                uVar.X();
            }
            u uVar2 = this.f338752b;
            if (Math.max(uVar2.f338211a.f338092a, uVar2.f338212b.f338092a) >= aVar.f338092a && !this.f338752b.w()) {
                double d10 = aVar.f338093b;
                u uVar3 = this.f338752b;
                org.locationtech.jts.geom.a aVar4 = uVar3.f338211a;
                if (d10 >= aVar4.f338093b) {
                    org.locationtech.jts.geom.a aVar5 = uVar3.f338212b;
                    if (d10 <= aVar5.f338093b && s.a(aVar4, aVar5, aVar) != -1) {
                        int iD = bVar.D(1);
                        if (!this.f338752b.f338211a.equals(aVarArrR[i10])) {
                            iD = bVar.D(2);
                        }
                        list.add(new a(this.f338752b, iD));
                    }
                }
            }
            i10 = i12;
        }
    }

    public int d(org.locationtech.jts.geom.a aVar) {
        List listA = a(aVar);
        if (listA.size() == 0) {
            return 0;
        }
        return ((a) Collections.min(listA)).f338754b;
    }
}
