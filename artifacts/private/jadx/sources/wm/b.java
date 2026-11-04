package wm;

import java.util.TreeSet;
import org.locationtech.jts.algorithm.u;
import org.locationtech.jts.geom.d0;
import org.locationtech.jts.geom.h0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.util.f;

/* JADX INFO: loaded from: classes14.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n f390592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n f390593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private r f390594c;

    /* JADX WARN: Multi-variable type inference failed */
    public b(h0 h0Var, n nVar) {
        this.f390592a = (n) h0Var;
        this.f390593b = nVar;
        this.f390594c = nVar.g0();
    }

    public static n b(h0 h0Var, n nVar) {
        return new b(h0Var, nVar).a();
    }

    public n a() {
        u uVar = new u();
        TreeSet treeSet = new TreeSet();
        for (int i10 = 0; i10 < this.f390592a.l0(); i10++) {
            org.locationtech.jts.geom.a aVarC0 = ((d0) this.f390592a.h0(i10)).c0();
            if (uVar.c(aVarC0, this.f390593b) == 2) {
                treeSet.add(aVarC0);
            }
        }
        if (treeSet.size() == 0) {
            return this.f390593b;
        }
        org.locationtech.jts.geom.a[] aVarArrV = org.locationtech.jts.geom.b.v(treeSet);
        return f.c(aVarArrV.length == 1 ? this.f390594c.v(aVarArrV[0]) : this.f390594c.r(aVarArrV), this.f390593b);
    }
}
