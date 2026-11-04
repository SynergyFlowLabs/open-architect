package org.locationtech.jts.operation.polygonize;

/* JADX INFO: loaded from: classes14.dex */
class b extends org.locationtech.jts.planargraph.a {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private a f338872m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private b f338873n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private long f338874o;

    public b(org.locationtech.jts.planargraph.e eVar, org.locationtech.jts.planargraph.e eVar2, org.locationtech.jts.geom.a aVar, boolean z10) {
        super(eVar, eVar2, aVar, z10);
        this.f338872m = null;
        this.f338873n = null;
        this.f338874o = -1L;
    }

    public long W() {
        return this.f338874o;
    }

    public b X() {
        return this.f338873n;
    }

    public a Y() {
        return this.f338872m;
    }

    public boolean Z() {
        return this.f338872m != null;
    }

    public void a0(long j10) {
        this.f338874o = j10;
    }

    public void c0(b bVar) {
        this.f338873n = bVar;
    }

    public void d0(a aVar) {
        this.f338872m = aVar;
    }
}
