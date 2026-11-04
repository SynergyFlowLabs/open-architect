package org.locationtech.jts.dissolve;

import org.locationtech.jts.edgegraph.d;

/* JADX INFO: loaded from: classes14.dex */
class b extends d {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f338072e;

    public b(org.locationtech.jts.geom.a aVar) {
        super(aVar);
        this.f338072e = false;
    }

    public boolean D() {
        return this.f338072e;
    }

    public void E() {
        this.f338072e = true;
    }
}
