package org.locationtech.jts.operation.distance;

import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f338783d = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f338784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f338785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a f338786c;

    public f(n nVar, int i10, org.locationtech.jts.geom.a aVar) {
        this.f338784a = nVar;
        this.f338785b = i10;
        this.f338786c = aVar;
    }

    public org.locationtech.jts.geom.a a() {
        return this.f338786c;
    }

    public n b() {
        return this.f338784a;
    }

    public int c() {
        return this.f338785b;
    }

    public boolean d() {
        return this.f338785b == -1;
    }

    public f(n nVar, org.locationtech.jts.geom.a aVar) {
        this(nVar, -1, aVar);
    }
}
