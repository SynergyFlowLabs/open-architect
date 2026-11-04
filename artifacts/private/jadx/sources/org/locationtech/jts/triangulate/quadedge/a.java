package org.locationtech.jts.triangulate.quadedge;

import java.util.Collection;
import java.util.LinkedList;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private LinkedList f339085a = new LinkedList();

    private void c(h hVar, j jVar) {
        hVar.p();
        for (int i10 = 0; i10 < 3; i10++) {
            h hVar2 = (h) hVar.j(i10).B().h();
            if (hVar2 != null && jVar.a(hVar, i10, hVar2)) {
                this.f339085a.addLast(hVar2);
            }
        }
    }

    public void a(Collection collection) {
        this.f339085a.addAll(collection);
    }

    public void b(h hVar) {
        this.f339085a.addLast(hVar);
    }

    public void d(j jVar) {
        while (!this.f339085a.isEmpty()) {
            c((h) this.f339085a.removeFirst(), jVar);
        }
    }
}
