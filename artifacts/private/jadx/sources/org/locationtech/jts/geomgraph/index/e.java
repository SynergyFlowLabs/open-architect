package org.locationtech.jts.geomgraph.index;

import java.util.Collection;
import java.util.Iterator;
import org.locationtech.jts.algorithm.o;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private o f338313e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f338314f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f338315g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f338316h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Collection[] f338319k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338309a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338310b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f338311c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338312d = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f338317i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f338318j = 0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f338320l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f338321m = false;

    public e(o oVar, boolean z10, boolean z11) {
        this.f338313e = oVar;
        this.f338314f = z10;
        this.f338315g = z11;
    }

    public static boolean f(int i10, int i11) {
        return Math.abs(i10 - i11) == 1;
    }

    private boolean g(o oVar, Collection[] collectionArr) {
        if (collectionArr == null) {
            return false;
        }
        return h(oVar, collectionArr[0]) || h(oVar, collectionArr[1]);
    }

    private boolean h(o oVar, Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (oVar.s(((org.locationtech.jts.geomgraph.o) it.next()).b())) {
                return true;
            }
        }
        return false;
    }

    private boolean j(org.locationtech.jts.geomgraph.d dVar, int i10, org.locationtech.jts.geomgraph.d dVar2, int i11) {
        if (dVar == dVar2 && this.f338313e.l() == 1) {
            if (f(i10, i11)) {
                return true;
            }
            if (dVar.z()) {
                int iY = dVar.y() - 1;
                if ((i10 == 0 && i11 == iY) || (i11 == 0 && i10 == iY)) {
                    return true;
                }
            }
        }
        return false;
    }

    public void a(org.locationtech.jts.geomgraph.d dVar, int i10, org.locationtech.jts.geomgraph.d dVar2, int i11) {
        if (dVar == dVar2 && i10 == i11) {
            return;
        }
        this.f338318j++;
        this.f338313e.f(dVar.r()[i10], dVar.r()[i10 + 1], dVar2.r()[i11], dVar2.r()[i11 + 1]);
        if (this.f338313e.n()) {
            if (this.f338315g) {
                dVar.F(false);
                dVar2.F(false);
            }
            this.f338317i++;
            if (j(dVar, i10, dVar2, i11)) {
                return;
            }
            this.f338309a = true;
            if (this.f338314f || !this.f338313e.t()) {
                dVar.o(this.f338313e, i10, 0);
                dVar2.o(this.f338313e, i11, 1);
            }
            if (this.f338313e.t()) {
                this.f338312d = this.f338313e.j(0).k();
                this.f338310b = true;
                if (this.f338321m) {
                    this.f338320l = true;
                }
                if (g(this.f338313e, this.f338319k)) {
                    return;
                }
                this.f338311c = true;
            }
        }
    }

    public org.locationtech.jts.geom.a b() {
        return this.f338312d;
    }

    public boolean c() {
        return this.f338309a;
    }

    public boolean d() {
        return this.f338311c;
    }

    public boolean e() {
        return this.f338310b;
    }

    public boolean i() {
        return this.f338320l;
    }

    public void k(Collection collection, Collection collection2) {
        this.f338319k = new Collection[]{collection, collection2};
    }

    public void l(boolean z10) {
        this.f338321m = z10;
    }
}
