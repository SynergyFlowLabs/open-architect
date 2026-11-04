package org.locationtech.jts.simplify;

import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private c f339025a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f339026b = new c();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double f339027c = 0.0d;

    public void a(double d10) {
        this.f339027c = d10;
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            this.f339025a.b((f) it.next());
        }
        Iterator it2 = collection.iterator();
        while (it2.hasNext()) {
            g gVar = new g(this.f339025a, this.f339026b);
            gVar.i(this.f339027c);
            gVar.j((f) it2.next());
        }
    }
}
