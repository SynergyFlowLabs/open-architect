package org.locationtech.jts.operation.predicate;

import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;

/* JADX INFO: loaded from: classes14.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e0 f338895a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private m f338896b;

    public d(e0 e0Var) {
        this.f338895a = e0Var;
        this.f338896b = e0Var.f0();
    }

    public static boolean b(e0 e0Var, n nVar) {
        return new d(e0Var).a(nVar);
    }

    public boolean a(n nVar) {
        if (!this.f338896b.c0(nVar.f0())) {
            return false;
        }
        a aVar = new a(this.f338896b);
        aVar.a(nVar);
        if (aVar.d()) {
            return true;
        }
        b bVar = new b(this.f338895a);
        bVar.a(nVar);
        if (bVar.d()) {
            return true;
        }
        e eVar = new e(this.f338895a);
        eVar.a(nVar);
        return eVar.f();
    }
}
