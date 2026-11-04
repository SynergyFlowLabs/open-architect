package org.locationtech.jts.index.quadtree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List f338435a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d[] f338436b = new d[4];

    public static int g(m mVar, double d10, double d11) {
        int i10 = -1;
        if (mVar.L() >= d10) {
            i10 = mVar.M() >= d11 ? 3 : -1;
            if (mVar.I() <= d11) {
                i10 = 1;
            }
        }
        if (mVar.H() <= d10) {
            if (mVar.M() >= d11) {
                i10 = 2;
            }
            if (mVar.I() <= d11) {
                return 0;
            }
        }
        return i10;
    }

    private void o(m mVar, qm.b bVar) {
        Iterator it = this.f338435a.iterator();
        while (it.hasNext()) {
            bVar.a(it.next());
        }
    }

    public void a(Object obj) {
        this.f338435a.add(obj);
    }

    public List b(List list) {
        list.addAll(this.f338435a);
        for (int i10 = 0; i10 < 4; i10++) {
            d dVar = this.f338436b[i10];
            if (dVar != null) {
                dVar.b(list);
            }
        }
        return list;
    }

    public void c(m mVar, List list) {
        if (k(mVar)) {
            list.addAll(this.f338435a);
            for (int i10 = 0; i10 < 4; i10++) {
                d dVar = this.f338436b[i10];
                if (dVar != null) {
                    dVar.c(mVar, list);
                }
            }
        }
    }

    int d() {
        int iD;
        int i10 = 0;
        for (int i11 = 0; i11 < 4; i11++) {
            d dVar = this.f338436b[i11];
            if (dVar != null && (iD = dVar.d()) > i10) {
                i10 = iD;
            }
        }
        return i10 + 1;
    }

    public List e() {
        return this.f338435a;
    }

    int f() {
        int iM = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            d dVar = this.f338436b[i10];
            if (dVar != null) {
                iM += dVar.m();
            }
        }
        return iM + 1;
    }

    public boolean h() {
        return !this.f338435a.isEmpty();
    }

    public boolean hasChildren() {
        for (int i10 = 0; i10 < 4; i10++) {
            if (this.f338436b[i10] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean i() {
        if (!this.f338435a.isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < 4; i10++) {
            d dVar = this.f338436b[i10];
            if (dVar != null && !dVar.i()) {
                return false;
            }
        }
        return true;
    }

    public boolean j() {
        return (hasChildren() || h()) ? false : true;
    }

    protected abstract boolean k(m mVar);

    public boolean l(m mVar, Object obj) {
        if (!k(mVar)) {
            return false;
        }
        boolean zL = false;
        for (int i10 = 0; i10 < 4; i10++) {
            d dVar = this.f338436b[i10];
            if (dVar != null && (zL = dVar.l(mVar, obj))) {
                if (!this.f338436b[i10].j()) {
                    break;
                }
                this.f338436b[i10] = null;
                break;
            }
        }
        return zL ? zL : this.f338435a.remove(obj);
    }

    int m() {
        int iM = 0;
        for (int i10 = 0; i10 < 4; i10++) {
            d dVar = this.f338436b[i10];
            if (dVar != null) {
                iM += dVar.m();
            }
        }
        return iM + this.f338435a.size();
    }

    public void n(m mVar, qm.b bVar) {
        if (k(mVar)) {
            o(mVar, bVar);
            for (int i10 = 0; i10 < 4; i10++) {
                d dVar = this.f338436b[i10];
                if (dVar != null) {
                    dVar.n(mVar, bVar);
                }
            }
        }
    }
}
