package org.locationtech.jts.geom;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class p implements Iterator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338186a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f338188c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f338190e;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f338187b = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f338189d = 0;

    public p(n nVar) {
        this.f338186a = nVar;
        this.f338188c = nVar.l0();
    }

    private static boolean b(n nVar) {
        return !(nVar instanceof o);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f338187b) {
            return true;
        }
        p pVar = this.f338190e;
        if (pVar != null) {
            if (pVar.hasNext()) {
                return true;
            }
            this.f338190e = null;
        }
        return this.f338189d < this.f338188c;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (this.f338187b) {
            this.f338187b = false;
            if (b(this.f338186a)) {
                this.f338189d++;
            }
            return this.f338186a;
        }
        p pVar = this.f338190e;
        if (pVar != null) {
            if (pVar.hasNext()) {
                return this.f338190e.next();
            }
            this.f338190e = null;
        }
        int i10 = this.f338189d;
        if (i10 >= this.f338188c) {
            throw new NoSuchElementException();
        }
        n nVar = this.f338186a;
        this.f338189d = i10 + 1;
        n nVarH0 = nVar.h0(i10);
        if (!(nVarH0 instanceof o)) {
            return nVarH0;
        }
        p pVar2 = new p((o) nVarH0);
        this.f338190e = pVar2;
        return pVar2.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException(getClass().getName());
    }
}
