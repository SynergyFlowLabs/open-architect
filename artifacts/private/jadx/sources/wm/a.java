package wm;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.f0;
import org.locationtech.jts.geom.m;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.util.f;
import org.locationtech.jts.geom.util.o;
import org.locationtech.jts.index.strtree.k;

/* JADX INFO: loaded from: classes14.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f390589c = 4;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Collection f390590a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f390591b = null;

    public a(Collection collection) {
        this.f390590a = collection;
        if (collection == null) {
            this.f390590a = new ArrayList();
        }
    }

    private n a(List list) {
        return b(list, 0, list.size());
    }

    private n b(List list, int i10, int i11) {
        int i12 = i11 - i10;
        if (i12 <= 1) {
            return n(f(list, i10), null);
        }
        if (i12 == 2) {
            return n(f(list, i10), f(list, i10 + 1));
        }
        int i13 = (i11 + i10) / 2;
        return n(b(list, i10, i13), b(list, i13, i11));
    }

    private n c(List list) {
        return ((n) list.get(0)).g0().b(list).f(0.0d);
    }

    private n d(n nVar, n nVar2) {
        return nVar.g0().e(new n[]{nVar, nVar2}).f(0.0d);
    }

    private n e(m mVar, n nVar, List list) {
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < nVar.l0(); i10++) {
            n nVarH0 = nVar.h0(i10);
            if (nVarH0.f0().c0(mVar)) {
                arrayList.add(nVarH0);
            } else {
                list.add(nVarH0);
            }
        }
        return this.f390591b.b(arrayList);
    }

    private static n f(List list, int i10) {
        if (i10 >= list.size()) {
            return null;
        }
        return (n) list.get(i10);
    }

    private List g(List list) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            arrayList.add(obj instanceof List ? o((List) obj) : obj instanceof n ? (n) obj : null);
        }
        return arrayList;
    }

    private n h(List list) {
        Iterator it = list.iterator();
        n nVarW = null;
        while (it.hasNext()) {
            n nVar = (n) it.next();
            nVarW = nVarW == null ? nVar.w() : nVarW.O0(nVar);
        }
        return nVarW;
    }

    private static n i(n nVar) {
        if (nVar instanceof f0) {
            return nVar;
        }
        List listB = o.b(nVar);
        return listB.size() == 1 ? (e0) listB.get(0) : nVar.g0().t(r.P(listB));
    }

    public static n k(Collection collection) {
        return new a(collection).j();
    }

    private n l(n nVar, n nVar2) {
        return i(nVar.O0(nVar2));
    }

    private n m(n nVar, n nVar2) {
        m mVarF0 = nVar.f0();
        m mVarF1 = nVar2.f0();
        if (mVarF0.c0(mVarF1)) {
            return (nVar.l0() > 1 || nVar2.l0() > 1) ? p(nVar, nVar2, mVarF0.V(mVarF1)) : l(nVar, nVar2);
        }
        return f.c(nVar, nVar2);
    }

    private n n(n nVar, n nVar2) {
        if (nVar == null && nVar2 == null) {
            return null;
        }
        if (nVar == null) {
            return nVar2.w();
        }
        return nVar2 == null ? nVar.w() : m(nVar, nVar2);
    }

    private n o(List list) {
        return a(g(list));
    }

    private n p(n nVar, n nVar2, m mVar) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(l(e(mVar, nVar, arrayList), e(mVar, nVar2, arrayList)));
        return f.b(arrayList);
    }

    public n j() {
        Collection collection = this.f390590a;
        if (collection == null) {
            throw new IllegalStateException("union() method cannot be called twice");
        }
        if (collection.isEmpty()) {
            return null;
        }
        this.f390591b = ((n) this.f390590a.iterator().next()).g0();
        k kVar = new k(4);
        for (n nVar : this.f390590a) {
            kVar.a(nVar.f0(), nVar);
        }
        this.f390590a = null;
        return o(kVar.t());
    }
}
