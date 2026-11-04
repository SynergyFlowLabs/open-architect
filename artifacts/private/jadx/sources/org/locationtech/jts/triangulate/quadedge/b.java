package org.locationtech.jts.triangulate.quadedge;

/* JADX INFO: loaded from: classes14.dex */
public class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f339086a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private d f339087b = null;

    public b(f fVar) {
        this.f339086a = fVar;
        c();
    }

    private d b() {
        return (d) this.f339086a.e().iterator().next();
    }

    private void c() {
        this.f339087b = b();
    }

    @Override // org.locationtech.jts.triangulate.quadedge.e
    public d a(m mVar) {
        if (!this.f339087b.l()) {
            c();
        }
        d dVarD = this.f339086a.D(mVar, this.f339087b);
        this.f339087b = dVarD;
        return dVarD;
    }
}
