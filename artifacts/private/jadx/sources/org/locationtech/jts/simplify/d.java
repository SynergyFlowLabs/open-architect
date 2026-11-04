package org.locationtech.jts.simplify;

import java.util.ArrayList;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.u;

/* JADX INFO: loaded from: classes14.dex */
class d implements qm.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private u f339011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f339012b = new ArrayList();

    public d(u uVar) {
        this.f339011a = uVar;
    }

    @Override // qm.b
    public void a(Object obj) {
        u uVar = (u) obj;
        org.locationtech.jts.geom.a aVar = uVar.f338211a;
        org.locationtech.jts.geom.a aVar2 = uVar.f338212b;
        u uVar2 = this.f339011a;
        if (m.a0(aVar, aVar2, uVar2.f338211a, uVar2.f338212b)) {
            this.f339012b.add(obj);
        }
    }

    public ArrayList b() {
        return this.f339012b;
    }
}
