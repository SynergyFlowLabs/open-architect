package org.locationtech.jts.operation.relate;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.t;

/* JADX INFO: loaded from: classes14.dex */
public class h extends org.locationtech.jts.operation.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private d f338911d;

    public h(n nVar, n nVar2) {
        super(nVar, nVar2);
        this.f338911d = new d(this.f338757c);
    }

    public static t d(n nVar, n nVar2) {
        return new h(nVar, nVar2).c();
    }

    public static t e(n nVar, n nVar2, org.locationtech.jts.algorithm.c cVar) {
        return new h(nVar, nVar2, cVar).c();
    }

    public t c() {
        return this.f338911d.b();
    }

    public h(n nVar, n nVar2, org.locationtech.jts.algorithm.c cVar) {
        super(nVar, nVar2, cVar);
        this.f338911d = new d(this.f338757c);
    }
}
