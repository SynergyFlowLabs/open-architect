package org.locationtech.jts.operation.overlay.validate;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.s;

/* JADX INFO: loaded from: classes14.dex */
class d implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f338860a = new ArrayList();

    @Override // org.locationtech.jts.geom.s
    public void a(n nVar) {
        if (nVar instanceof e0) {
            e0 e0Var = (e0) nVar;
            this.f338860a.add(e0Var.R0());
            for (int i10 = 0; i10 < e0Var.T0(); i10++) {
                this.f338860a.add(e0Var.S0(i10));
            }
        }
    }

    public List b() {
        return this.f338860a;
    }
}
