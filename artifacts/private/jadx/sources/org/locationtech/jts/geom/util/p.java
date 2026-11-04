package org.locationtech.jts.geom.util;

/* JADX INFO: loaded from: classes14.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f338251a = false;

    public void a(org.locationtech.jts.geom.n nVar) {
        for (int i10 = 0; i10 < nVar.l0() && !this.f338251a; i10++) {
            org.locationtech.jts.geom.n nVarH0 = nVar.h0(i10);
            if (nVarH0 instanceof org.locationtech.jts.geom.o) {
                a(nVarH0);
            } else {
                c(nVarH0);
                if (b()) {
                    this.f338251a = true;
                    return;
                }
            }
        }
    }

    protected abstract boolean b();

    protected abstract void c(org.locationtech.jts.geom.n nVar);
}
