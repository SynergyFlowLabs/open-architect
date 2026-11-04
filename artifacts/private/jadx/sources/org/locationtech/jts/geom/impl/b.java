package org.locationtech.jts.geom.impl;

import java.io.Serializable;
import org.locationtech.jts.geom.e;
import org.locationtech.jts.geom.g;

/* JADX INFO: loaded from: classes14.dex */
public final class b implements g, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f338130a = -4099577099607551657L;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b f338131b = new b();

    private b() {
    }

    public static b d() {
        return f338131b;
    }

    private Object readResolve() {
        return d();
    }

    @Override // org.locationtech.jts.geom.g
    public e a(org.locationtech.jts.geom.a[] aVarArr) {
        return new a(aVarArr);
    }

    @Override // org.locationtech.jts.geom.g
    public e b(e eVar) {
        return new a(eVar);
    }

    @Override // org.locationtech.jts.geom.g
    public e c(int i10, int i11) {
        if (i11 > 3) {
            i11 = 3;
        }
        return i11 < 2 ? new a(i10) : new a(i10, i11);
    }
}
