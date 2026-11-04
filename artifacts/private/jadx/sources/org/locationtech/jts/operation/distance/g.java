package org.locationtech.jts.operation.distance;

import org.locationtech.jts.geom.n;
import org.locationtech.jts.index.strtree.i;
import org.locationtech.jts.index.strtree.k;

/* JADX INFO: loaded from: classes14.dex */
public class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private k f338787a;

    private static class a implements i {
        @Override // org.locationtech.jts.index.strtree.i
        public double a(org.locationtech.jts.index.strtree.h hVar, org.locationtech.jts.index.strtree.h hVar2) {
            return ((d) hVar.a()).c((d) hVar2.a());
        }

        private a() {
        }
    }

    public g(n nVar) {
        this.f338787a = e.c(nVar);
    }

    public static double a(n nVar, n nVar2) {
        return new g(nVar).c(nVar2);
    }

    private static double b(Object[] objArr) {
        return ((d) objArr[0]).c((d) objArr[1]);
    }

    public double c(n nVar) {
        return b(this.f338787a.U(e.c(nVar), new a()));
    }
}
