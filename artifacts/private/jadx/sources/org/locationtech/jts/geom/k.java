package org.locationtech.jts.geom;

import java.io.Serializable;

/* JADX INFO: loaded from: classes14.dex */
public class k implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f338149a = -4099577099607551657L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final k f338150b = new k();

    public static k d() {
        return f338150b;
    }

    private Object readResolve() {
        return d();
    }

    @Override // org.locationtech.jts.geom.g
    public e a(a[] aVarArr) {
        return new j(aVarArr);
    }

    @Override // org.locationtech.jts.geom.g
    public e b(e eVar) {
        return new j(eVar);
    }

    @Override // org.locationtech.jts.geom.g
    public e c(int i10, int i11) {
        return new j(i10);
    }
}
