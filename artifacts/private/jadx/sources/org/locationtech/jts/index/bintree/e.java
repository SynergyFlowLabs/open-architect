package org.locationtech.jts.index.bintree;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected List f338390a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected d[] f338391b = new d[2];

    public static int f(b bVar, double d10) {
        int i10 = bVar.f338382a >= d10 ? 1 : -1;
        if (bVar.f338383b <= d10) {
            return 0;
        }
        return i10;
    }

    public void a(Object obj) {
        this.f338390a.add(obj);
    }

    public List b(List list) {
        list.addAll(this.f338390a);
        for (int i10 = 0; i10 < 2; i10++) {
            d dVar = this.f338391b[i10];
            if (dVar != null) {
                dVar.b(list);
            }
        }
        return list;
    }

    public void c(b bVar, Collection collection) {
        if (bVar == null || j(bVar)) {
            collection.addAll(this.f338390a);
            d dVar = this.f338391b[0];
            if (dVar != null) {
                dVar.c(bVar, collection);
            }
            d dVar2 = this.f338391b[1];
            if (dVar2 != null) {
                dVar2.c(bVar, collection);
            }
        }
    }

    int d() {
        int iD;
        int i10 = 0;
        for (int i11 = 0; i11 < 2; i11++) {
            d dVar = this.f338391b[i11];
            if (dVar != null && (iD = dVar.d()) > i10) {
                i10 = iD;
            }
        }
        return i10 + 1;
    }

    public List e() {
        return this.f338390a;
    }

    public boolean g() {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.f338391b[i10] != null) {
                return true;
            }
        }
        return false;
    }

    public boolean h() {
        return !this.f338390a.isEmpty();
    }

    public boolean i() {
        return (g() || h()) ? false : true;
    }

    protected abstract boolean j(b bVar);

    int k() {
        int iK = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            d dVar = this.f338391b[i10];
            if (dVar != null) {
                iK += dVar.k();
            }
        }
        return iK + 1;
    }

    public boolean l(b bVar, Object obj) {
        if (!j(bVar)) {
            return false;
        }
        boolean zL = false;
        for (int i10 = 0; i10 < 2; i10++) {
            d dVar = this.f338391b[i10];
            if (dVar != null && (zL = dVar.l(bVar, obj))) {
                if (!this.f338391b[i10].i()) {
                    break;
                }
                this.f338391b[i10] = null;
                break;
            }
        }
        return zL ? zL : this.f338390a.remove(obj);
    }

    int m() {
        int iM = 0;
        for (int i10 = 0; i10 < 2; i10++) {
            d dVar = this.f338391b[i10];
            if (dVar != null) {
                iM += dVar.m();
            }
        }
        return iM + this.f338390a.size();
    }
}
