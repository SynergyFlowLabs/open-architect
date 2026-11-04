package org.locationtech.jts.operation.linemerge;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.v;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private r f338788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f338789b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.geom.a[] f338790c = null;

    public a(r rVar) {
        this.f338788a = rVar;
    }

    private org.locationtech.jts.geom.a[] b() {
        if (this.f338790c == null) {
            org.locationtech.jts.geom.d dVar = new org.locationtech.jts.geom.d();
            int i10 = 0;
            int i11 = 0;
            for (b bVar : this.f338789b) {
                if (bVar.I()) {
                    i11++;
                } else {
                    i10++;
                }
                dVar.p(((c) bVar.H()).I().d0(), false, bVar.I());
            }
            org.locationtech.jts.geom.a[] aVarArrUf = dVar.Uf();
            this.f338790c = aVarArrUf;
            if (i10 > i11) {
                org.locationtech.jts.geom.b.t(aVarArrUf);
            }
        }
        return this.f338790c;
    }

    public void a(b bVar) {
        this.f338789b.add(bVar);
    }

    public v c() {
        return this.f338788a.h(b());
    }
}
