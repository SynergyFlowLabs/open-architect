package org.locationtech.jts.simplify;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class e extends u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private n f339013d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f339014e;

    public e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2, n nVar, int i10) {
        super(aVar, aVar2);
        this.f339013d = nVar;
        this.f339014e = i10;
    }

    public int d0() {
        return this.f339014e;
    }

    public n e0() {
        return this.f339013d;
    }

    public e(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        this(aVar, aVar2, null, -1);
    }
}
