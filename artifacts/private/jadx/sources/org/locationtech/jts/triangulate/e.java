package org.locationtech.jts.triangulate;

/* JADX INFO: loaded from: classes14.dex */
public class e extends org.locationtech.jts.triangulate.quadedge.m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f339066i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Object f339067j;

    public e(org.locationtech.jts.geom.a aVar) {
        super(aVar);
        this.f339067j = null;
    }

    public Object B() {
        return this.f339067j;
    }

    public boolean C() {
        return this.f339066i;
    }

    protected void D(e eVar) {
        if (eVar.f339066i) {
            this.f339066i = true;
            this.f339067j = eVar.f339067j;
        }
    }

    public void E(Object obj) {
        this.f339066i = true;
        this.f339067j = obj;
    }

    public void F(boolean z10) {
        this.f339066i = z10;
    }
}
