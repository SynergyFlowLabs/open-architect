package org.locationtech.jts.noding;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
class l implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private v f338595a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f338596b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Iterator f338597c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private u f338598d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u f338599e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f338600f = 0;

    l(v vVar) {
        this.f338595a = vVar;
        this.f338596b = vVar.k();
        this.f338597c = vVar.m();
        b();
    }

    private void b() {
        if (this.f338597c.hasNext()) {
            this.f338599e = (u) this.f338597c.next();
        } else {
            this.f338599e = null;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.f338599e != null;
    }

    @Override // java.util.Iterator
    public Object next() {
        int i10;
        u uVar = this.f338598d;
        if (uVar == null) {
            u uVar2 = this.f338599e;
            this.f338598d = uVar2;
            this.f338600f = uVar2.f338659c;
            b();
            return this.f338598d;
        }
        u uVar3 = this.f338599e;
        if (uVar3 != null && (i10 = uVar3.f338659c) == uVar.f338659c) {
            this.f338598d = uVar3;
            this.f338600f = i10;
            b();
            return this.f338598d;
        }
        return null;
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(getClass().getName());
    }
}
