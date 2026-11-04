package org.locationtech.jts.index.strtree;

import java.util.Iterator;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
class d implements Comparable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f338451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f338452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f338453c = k();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i f338454d;

    public d(c cVar, c cVar2, i iVar) {
        this.f338451a = cVar;
        this.f338452b = cVar2;
        this.f338454d = iVar;
    }

    private static double b(c cVar) {
        return ((m) cVar.getBounds()).D();
    }

    private double k() {
        return r() ? this.f338454d.a((h) this.f338451a, (h) this.f338452b) : ((m) this.f338451a.getBounds()).s((m) this.f338452b.getBounds());
    }

    private void l(c cVar, c cVar2, org.locationtech.jts.util.k kVar, double d10) {
        Iterator it = ((a) cVar).c().iterator();
        while (it.hasNext()) {
            d dVar = new d((c) it.next(), cVar2, this.f338454d);
            if (dVar.p() < d10) {
                kVar.a(dVar);
            }
        }
    }

    public static boolean q(Object obj) {
        return obj instanceof a;
    }

    @Override // java.lang.Comparable
    public int compareTo(Object obj) {
        double d10 = this.f338453c;
        double d11 = ((d) obj).f338453c;
        if (d10 < d11) {
            return -1;
        }
        return d10 > d11 ? 1 : 0;
    }

    public void n(org.locationtech.jts.util.k kVar, double d10) {
        boolean zQ = q(this.f338451a);
        boolean zQ2 = q(this.f338452b);
        if (zQ && zQ2) {
            if (b(this.f338451a) > b(this.f338452b)) {
                l(this.f338451a, this.f338452b, kVar, d10);
                return;
            } else {
                l(this.f338452b, this.f338451a, kVar, d10);
                return;
            }
        }
        if (zQ) {
            l(this.f338451a, this.f338452b, kVar, d10);
        } else {
            if (!zQ2) {
                throw new IllegalArgumentException("neither boundable is composite");
            }
            l(this.f338452b, this.f338451a, kVar, d10);
        }
    }

    public c o(int i10) {
        return i10 == 0 ? this.f338451a : this.f338452b;
    }

    public double p() {
        return this.f338453c;
    }

    public boolean r() {
        return (q(this.f338451a) || q(this.f338452b)) ? false : true;
    }
}
