package org.locationtech.jts.triangulate;

import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class c extends RuntimeException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f339064b = 386496846550080140L;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private org.locationtech.jts.geom.a f339065a;

    public c(String str) {
        super(str);
        this.f339065a = null;
    }

    private static String b(String str, org.locationtech.jts.geom.a aVar) {
        if (aVar == null) {
            return str;
        }
        return str + " [ " + o.D(aVar) + " ]";
    }

    public org.locationtech.jts.geom.a a() {
        return this.f339065a;
    }

    public c(String str, org.locationtech.jts.geom.a aVar) {
        super(b(str, aVar));
        this.f339065a = null;
        this.f339065a = new org.locationtech.jts.geom.a(aVar);
    }
}
