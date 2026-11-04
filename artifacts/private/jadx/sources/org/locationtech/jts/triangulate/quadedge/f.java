package org.locationtech.jts.triangulate.quadedge;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import org.locationtech.jts.geom.e0;
import org.locationtech.jts.geom.j0;
import org.locationtech.jts.geom.n;
import org.locationtech.jts.geom.r;
import org.locationtech.jts.geom.u;
import org.locationtech.jts.geom.v;
import rm.o;

/* JADX INFO: loaded from: classes14.dex */
public class f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final double f339093k = 1000.0d;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.d f339096c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private double f339097d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private double f339098e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private org.locationtech.jts.geom.m f339100g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private e f339101h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f339094a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f339095b = new ArrayList();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m[] f339099f = new m[3];

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private u f339102i = new u();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private org.locationtech.jts.triangulate.quadedge.d[] f339103j = new org.locationtech.jts.triangulate.quadedge.d[3];

    private static class a implements l {
        @Override // org.locationtech.jts.triangulate.quadedge.l
        public void a(org.locationtech.jts.triangulate.quadedge.d[] dVarArr) {
            m mVar = new m(j0.i(dVarArr[0].r().k(), dVarArr[1].r().k(), dVarArr[2].r().k()));
            for (int i10 = 0; i10 < 3; i10++) {
                dVarArr[i10].u().y(mVar);
            }
        }
    }

    private static class b implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private org.locationtech.jts.geom.d f339104a = new org.locationtech.jts.geom.d();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private List f339105b = new ArrayList();

        private void b(org.locationtech.jts.geom.a[] aVarArr) {
            if (aVarArr.length >= 2) {
                o.A(aVarArr[0], aVarArr[1]);
            } else if (aVarArr.length >= 1) {
                o.D(aVarArr[0]);
            }
        }

        @Override // org.locationtech.jts.triangulate.quadedge.l
        public void a(org.locationtech.jts.triangulate.quadedge.d[] dVarArr) {
            this.f339104a.clear();
            for (int i10 = 0; i10 < 3; i10++) {
                this.f339104a.d(dVarArr[i10].r().k());
            }
            if (this.f339104a.size() > 0) {
                this.f339104a.s();
                org.locationtech.jts.geom.a[] aVarArrUf = this.f339104a.Uf();
                if (aVarArrUf.length != 4) {
                    return;
                }
                this.f339105b.add(aVarArrUf);
            }
        }

        public List c() {
            return this.f339105b;
        }
    }

    private static class c implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f339106a;

        @Override // org.locationtech.jts.triangulate.quadedge.l
        public void a(org.locationtech.jts.triangulate.quadedge.d[] dVarArr) {
            this.f339106a.add(dVarArr);
        }

        public List b() {
            return this.f339106a;
        }

        private c() {
            this.f339106a = new ArrayList();
        }
    }

    private static class d implements l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f339107a;

        @Override // org.locationtech.jts.triangulate.quadedge.l
        public void a(org.locationtech.jts.triangulate.quadedge.d[] dVarArr) {
            this.f339107a.add(new m[]{dVarArr[0].r(), dVarArr[1].r(), dVarArr[2].r()});
        }

        public List b() {
            return this.f339107a;
        }

        private d() {
            this.f339107a = new ArrayList();
        }
    }

    public f(org.locationtech.jts.geom.m mVar, double d10) {
        int i10 = 6 & 0;
        this.f339101h = null;
        this.f339097d = d10;
        this.f339098e = d10 / 1000.0d;
        b(mVar);
        this.f339096c = t();
        this.f339101h = new org.locationtech.jts.triangulate.quadedge.b(this);
    }

    private void b(org.locationtech.jts.geom.m mVar) {
        double dN = mVar.N();
        double dE = mVar.E();
        double d10 = dN > dE ? dN * 10.0d : dE * 10.0d;
        this.f339099f[0] = new m((mVar.H() + mVar.L()) / 2.0d, mVar.I() + d10);
        this.f339099f[1] = new m(mVar.L() - d10, mVar.M() - d10);
        this.f339099f[2] = new m(mVar.H() + d10, mVar.M() - d10);
        org.locationtech.jts.geom.m mVar2 = new org.locationtech.jts.geom.m(this.f339099f[0].k(), this.f339099f[1].k());
        this.f339100g = mVar2;
        mVar2.x(this.f339099f[2].k());
    }

    private org.locationtech.jts.triangulate.quadedge.d[] d(org.locationtech.jts.triangulate.quadedge.d dVar, Stack stack, boolean z10, Set set) {
        int i10 = 0;
        org.locationtech.jts.triangulate.quadedge.d dVarM = dVar;
        boolean z11 = false;
        do {
            this.f339103j[i10] = dVarM;
            if (w(dVarM)) {
                z11 = true;
            }
            org.locationtech.jts.triangulate.quadedge.d dVarB = dVarM.B();
            if (!set.contains(dVarB)) {
                stack.push(dVarB);
            }
            set.add(dVarM);
            i10++;
            dVarM = dVarM.m();
        } while (dVarM != dVar);
        if (!z11 || z10) {
            return this.f339103j;
        }
        return null;
    }

    public static void l(org.locationtech.jts.triangulate.quadedge.d dVar, org.locationtech.jts.triangulate.quadedge.d[] dVarArr) {
        dVarArr[0] = dVar;
        org.locationtech.jts.triangulate.quadedge.d dVarM = dVar.m();
        int i10 = 4 << 1;
        dVarArr[1] = dVarM;
        org.locationtech.jts.triangulate.quadedge.d dVarM2 = dVarM.m();
        dVarArr[2] = dVarM2;
        if (dVarM2.m() != dVarArr[0]) {
            throw new IllegalArgumentException("Edges do not form a triangle");
        }
    }

    private org.locationtech.jts.triangulate.quadedge.d t() {
        m[] mVarArr = this.f339099f;
        org.locationtech.jts.triangulate.quadedge.d dVarE = E(mVarArr[0], mVarArr[1]);
        m[] mVarArr2 = this.f339099f;
        org.locationtech.jts.triangulate.quadedge.d dVarE2 = E(mVarArr2[1], mVarArr2[2]);
        org.locationtech.jts.triangulate.quadedge.d.z(dVarE.B(), dVarE2);
        m[] mVarArr3 = this.f339099f;
        org.locationtech.jts.triangulate.quadedge.d dVarE3 = E(mVarArr3[2], mVarArr3[0]);
        org.locationtech.jts.triangulate.quadedge.d.z(dVarE2.B(), dVarE3);
        org.locationtech.jts.triangulate.quadedge.d.z(dVarE3.B(), dVarE);
        return dVarE;
    }

    public org.locationtech.jts.triangulate.quadedge.d A(org.locationtech.jts.geom.a aVar) {
        return this.f339101h.a(new m(aVar));
    }

    public org.locationtech.jts.triangulate.quadedge.d B(org.locationtech.jts.geom.a aVar, org.locationtech.jts.geom.a aVar2) {
        org.locationtech.jts.triangulate.quadedge.d dVarA = this.f339101h.a(new m(aVar));
        if (dVarA == null) {
            return null;
        }
        if (dVarA.e().k().p(aVar)) {
            dVarA = dVarA.B();
        }
        org.locationtech.jts.triangulate.quadedge.d dVarP = dVarA;
        while (!dVarP.e().k().p(aVar2)) {
            dVarP = dVarP.p();
            if (dVarP == dVarA) {
                return null;
            }
        }
        return dVarP;
    }

    public org.locationtech.jts.triangulate.quadedge.d C(m mVar) {
        return this.f339101h.a(mVar);
    }

    public org.locationtech.jts.triangulate.quadedge.d D(m mVar, org.locationtech.jts.triangulate.quadedge.d dVar) {
        int size = this.f339095b.size();
        int i10 = 0;
        while (true) {
            i10++;
            if (i10 > size) {
                throw new org.locationtech.jts.triangulate.quadedge.c(dVar.C());
            }
            if (!mVar.i(dVar.r()) && !mVar.i(dVar.e())) {
                if (mVar.w(dVar)) {
                    dVar = dVar.B();
                } else if (!mVar.w(dVar.p())) {
                    dVar = dVar.p();
                } else if (!mVar.w(dVar.c())) {
                    dVar = dVar.c();
                }
            }
            return dVar;
        }
    }

    public org.locationtech.jts.triangulate.quadedge.d E(m mVar, m mVar2) {
        org.locationtech.jts.triangulate.quadedge.d dVarO = org.locationtech.jts.triangulate.quadedge.d.o(mVar, mVar2);
        this.f339095b.add(dVarO);
        return dVarO;
    }

    public void F(e eVar) {
        this.f339101h = eVar;
    }

    public void G(l lVar, boolean z10) {
        org.locationtech.jts.triangulate.quadedge.d[] dVarArrD;
        this.f339094a++;
        Stack stack = new Stack();
        stack.push(this.f339096c);
        HashSet hashSet = new HashSet();
        while (!stack.empty()) {
            org.locationtech.jts.triangulate.quadedge.d dVar = (org.locationtech.jts.triangulate.quadedge.d) stack.pop();
            if (!hashSet.contains(dVar) && (dVarArrD = d(dVar, stack, z10, hashSet)) != null) {
                lVar.a(dVarArrD);
            }
        }
    }

    public org.locationtech.jts.triangulate.quadedge.d a(org.locationtech.jts.triangulate.quadedge.d dVar, org.locationtech.jts.triangulate.quadedge.d dVar2) {
        org.locationtech.jts.triangulate.quadedge.d dVarA = org.locationtech.jts.triangulate.quadedge.d.a(dVar, dVar2);
        this.f339095b.add(dVarA);
        return dVarA;
    }

    public void c(org.locationtech.jts.triangulate.quadedge.d dVar) {
        org.locationtech.jts.triangulate.quadedge.d.z(dVar, dVar.q());
        org.locationtech.jts.triangulate.quadedge.d.z(dVar.B(), dVar.B().q());
        org.locationtech.jts.triangulate.quadedge.d dVarB = dVar.B();
        org.locationtech.jts.triangulate.quadedge.d dVarU = dVar.u();
        org.locationtech.jts.triangulate.quadedge.d dVarB2 = dVar.u().B();
        this.f339095b.remove(dVar);
        this.f339095b.remove(dVarB);
        this.f339095b.remove(dVarU);
        this.f339095b.remove(dVarB2);
        dVar.d();
        dVarB.d();
        dVarU.d();
        dVarB2.d();
    }

    public Collection e() {
        return this.f339095b;
    }

    public n f(r rVar) {
        int i10 = 0;
        List<org.locationtech.jts.triangulate.quadedge.d> listH = h(false);
        v[] vVarArr = new v[listH.size()];
        for (org.locationtech.jts.triangulate.quadedge.d dVar : listH) {
            vVarArr[i10] = rVar.h(new org.locationtech.jts.geom.a[]{dVar.r().k(), dVar.e().k()});
            i10++;
        }
        return rVar.m(vVarArr);
    }

    public org.locationtech.jts.geom.m g() {
        return new org.locationtech.jts.geom.m(this.f339100g);
    }

    public List h(boolean z10) {
        this.f339094a++;
        ArrayList arrayList = new ArrayList();
        Stack stack = new Stack();
        stack.push(this.f339096c);
        HashSet hashSet = new HashSet();
        while (!stack.empty()) {
            org.locationtech.jts.triangulate.quadedge.d dVar = (org.locationtech.jts.triangulate.quadedge.d) stack.pop();
            if (!hashSet.contains(dVar)) {
                org.locationtech.jts.triangulate.quadedge.d dVarJ = dVar.j();
                if (z10 || !w(dVarJ)) {
                    arrayList.add(dVarJ);
                }
                stack.push(dVar.p());
                stack.push(dVar.B().p());
                hashSet.add(dVar);
                hashSet.add(dVar.B());
            }
        }
        return arrayList;
    }

    public double i() {
        return this.f339097d;
    }

    public List j(boolean z10) {
        b bVar = new b();
        G(bVar, z10);
        return bVar.c();
    }

    public List k(boolean z10) {
        c cVar = new c();
        G(cVar, z10);
        return cVar.b();
    }

    public List m(boolean z10) {
        d dVar = new d();
        G(dVar, z10);
        return dVar.b();
    }

    public n n(r rVar) {
        int i10 = 0;
        List listJ = j(false);
        e0[] e0VarArr = new e0[listJ.size()];
        Iterator it = listJ.iterator();
        while (it.hasNext()) {
            e0VarArr[i10] = rVar.A(rVar.k((org.locationtech.jts.geom.a[]) it.next()));
            i10++;
        }
        return rVar.e(e0VarArr);
    }

    public List o(boolean z10) {
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        for (org.locationtech.jts.triangulate.quadedge.d dVar : this.f339095b) {
            m mVarR = dVar.r();
            if (!hashSet.contains(mVarR)) {
                hashSet.add(mVarR);
                if (z10 || !x(mVarR)) {
                    arrayList.add(dVar);
                }
            }
            org.locationtech.jts.triangulate.quadedge.d dVarB = dVar.B();
            m mVarR2 = dVarB.r();
            if (!hashSet.contains(mVarR2)) {
                hashSet.add(mVarR2);
                if (z10 || !x(mVarR2)) {
                    arrayList.add(dVarB);
                }
            }
        }
        return arrayList;
    }

    public Collection p(boolean z10) {
        HashSet hashSet = new HashSet();
        for (org.locationtech.jts.triangulate.quadedge.d dVar : this.f339095b) {
            m mVarR = dVar.r();
            if (z10 || !x(mVarR)) {
                hashSet.add(mVarR);
            }
            m mVarE = dVar.e();
            if (z10 || !x(mVarE)) {
                hashSet.add(mVarE);
            }
        }
        return hashSet;
    }

    public e0 q(org.locationtech.jts.triangulate.quadedge.d dVar, r rVar) {
        ArrayList arrayList = new ArrayList();
        org.locationtech.jts.triangulate.quadedge.d dVarQ = dVar;
        do {
            arrayList.add(dVarQ.u().r().k());
            dVarQ = dVarQ.q();
        } while (dVarQ != dVar);
        org.locationtech.jts.geom.d dVar2 = new org.locationtech.jts.geom.d();
        int i10 = 7 << 0;
        dVar2.r(arrayList, false);
        dVar2.s();
        if (dVar2.size() < 4) {
            System.out.println(dVar2);
            dVar2.k(dVar2.get(dVar2.size() - 1), true);
        }
        e0 e0VarA = rVar.A(rVar.k(dVar2.Uf()));
        e0VarA.J0(dVar.r().k());
        return e0VarA;
    }

    public List r(r rVar) {
        G(new a(), true);
        ArrayList arrayList = new ArrayList();
        Iterator it = o(false).iterator();
        while (it.hasNext()) {
            arrayList.add(q((org.locationtech.jts.triangulate.quadedge.d) it.next(), rVar));
        }
        return arrayList;
    }

    public n s(r rVar) {
        return rVar.e(r.I(r(rVar)));
    }

    public org.locationtech.jts.triangulate.quadedge.d u(m mVar) {
        org.locationtech.jts.triangulate.quadedge.d dVarC = C(mVar);
        if (!mVar.j(dVarC.r(), this.f339097d) && !mVar.j(dVarC.e(), this.f339097d)) {
            org.locationtech.jts.triangulate.quadedge.d dVarE = E(dVarC.r(), mVar);
            org.locationtech.jts.triangulate.quadedge.d.z(dVarE, dVarC);
            org.locationtech.jts.triangulate.quadedge.d dVarA = dVarE;
            do {
                dVarA = a(dVarC, dVarA.B());
                dVarC = dVarA.q();
            } while (dVarC.m() != dVarE);
            return dVarE;
        }
        return dVarC;
    }

    public boolean v(org.locationtech.jts.triangulate.quadedge.d dVar) {
        l(dVar, new org.locationtech.jts.triangulate.quadedge.d[3]);
        l(dVar.B(), new org.locationtech.jts.triangulate.quadedge.d[3]);
        return x(dVar.m().e()) || x(dVar.B().m().e());
    }

    public boolean w(org.locationtech.jts.triangulate.quadedge.d dVar) {
        return x(dVar.r()) || x(dVar.e());
    }

    public boolean x(m mVar) {
        return mVar.i(this.f339099f[0]) || mVar.i(this.f339099f[1]) || mVar.i(this.f339099f[2]);
    }

    public boolean y(org.locationtech.jts.triangulate.quadedge.d dVar, org.locationtech.jts.geom.a aVar) {
        this.f339102i.Z(dVar.r().k(), dVar.e().k());
        if (this.f339102i.o(aVar) >= this.f339098e) {
            return false;
        }
        int i10 = 6 & 1;
        return true;
    }

    public boolean z(org.locationtech.jts.triangulate.quadedge.d dVar, m mVar) {
        return mVar.j(dVar.r(), this.f339097d) || mVar.j(dVar.e(), this.f339097d);
    }
}
