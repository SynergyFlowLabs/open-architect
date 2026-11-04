package org.locationtech.jts.index.intervalrtree;

/* JADX INFO: loaded from: classes14.dex */
public class a extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private c f338402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f338403d;

    public a(c cVar, c cVar2) {
        this.f338402c = cVar;
        this.f338403d = cVar2;
        e(cVar, cVar2);
    }

    private void e(c cVar, c cVar2) {
        this.f338405a = Math.min(cVar.f338405a, cVar2.f338405a);
        this.f338406b = Math.max(cVar.f338406b, cVar2.f338406b);
    }

    @Override // org.locationtech.jts.index.intervalrtree.c
    public void d(double d10, double d11, qm.b bVar) {
        if (c(d10, d11)) {
            c cVar = this.f338402c;
            if (cVar != null) {
                cVar.d(d10, d11, bVar);
            }
            c cVar2 = this.f338403d;
            if (cVar2 != null) {
                cVar2.d(d10, d11, bVar);
            }
        }
    }
}
