package org.locationtech.jts.precision;

import org.locationtech.jts.geom.g0;

/* JADX INFO: loaded from: classes14.dex */
public class d implements org.locationtech.jts.geom.h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g0 f338979a;

    public d(g0 g0Var) {
        this.f338979a = g0Var;
    }

    @Override // org.locationtech.jts.geom.h
    public void a(org.locationtech.jts.geom.e eVar, int i10) {
        eVar.Ld(i10, 0, this.f338979a.r(eVar.ij(i10, 0)));
        eVar.Ld(i10, 1, this.f338979a.r(eVar.ij(i10, 1)));
    }

    @Override // org.locationtech.jts.geom.h
    public boolean b() {
        return true;
    }

    @Override // org.locationtech.jts.geom.h
    public boolean isDone() {
        return false;
    }
}
