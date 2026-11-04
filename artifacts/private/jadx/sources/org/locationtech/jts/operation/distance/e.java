package org.locationtech.jts.operation.distance;

import java.util.ArrayList;
import java.util.List;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.q;
import org.locationtech.jts.geom.v;
import org.locationtech.jts.index.strtree.k;

/* JADX INFO: loaded from: classes14.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f338780a = 6;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f338781b = 4;

    class a implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f338782a;

        a(List list) {
            this.f338782a = list;
        }

        @Override // org.locationtech.jts.geom.q
        public void a(n nVar) {
            if (nVar instanceof v) {
                e.b(((v) nVar).S0(), this.f338782a);
            } else if (nVar instanceof d0) {
                e.b(((d0) nVar).R0(), this.f338782a);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(org.locationtech.jts.geom.e eVar, List list) {
        int size = eVar.size();
        int i10 = 0;
        while (true) {
            int i11 = size - 1;
            if (i10 > i11) {
                return;
            }
            int i12 = i10 + 6;
            int i13 = i10 + 7;
            if (i13 >= i11) {
                i13 = size;
            }
            list.add(new d(eVar, i10, i13));
            i10 = i12;
        }
    }

    public static k c(n nVar) {
        k kVar = new k(4);
        for (d dVar : d(nVar)) {
            kVar.a(dVar.e(), dVar);
        }
        kVar.g();
        return kVar;
    }

    private static List d(n nVar) {
        ArrayList arrayList = new ArrayList();
        nVar.d(new a(arrayList));
        return arrayList;
    }
}
