package org.locationtech.jts.index.intervalrtree;

/* JADX INFO: loaded from: classes14.dex */
public class b extends c {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Object f338404c;

    public b(double d10, double d11, Object obj) {
        this.f338405a = d10;
        this.f338406b = d11;
        this.f338404c = obj;
    }

    @Override // org.locationtech.jts.index.intervalrtree.c
    public void d(double d10, double d11, qm.b bVar) {
        if (c(d10, d11)) {
            bVar.a(this.f338404c);
        }
    }
}
