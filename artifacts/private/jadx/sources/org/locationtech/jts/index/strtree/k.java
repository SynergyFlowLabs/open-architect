package org.locationtech.jts.index.strtree;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import org.locationtech.jts.geom.m;

/* JADX INFO: loaded from: classes14.dex */
public class k extends org.locationtech.jts.index.strtree.b implements qm.c, Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f338465g = 259274702368956900L;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Comparator f338466h = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static Comparator f338467i = new b();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static org.locationtech.jts.index.strtree.b.a f338468j = new c();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f338469k = 10;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return org.locationtech.jts.index.strtree.b.h(k.I((m) ((org.locationtech.jts.index.strtree.c) obj).getBounds()), k.I((m) ((org.locationtech.jts.index.strtree.c) obj2).getBounds()));
        }
    }

    class b implements Comparator {
        b() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return org.locationtech.jts.index.strtree.b.h(k.J((m) ((org.locationtech.jts.index.strtree.c) obj).getBounds()), k.J((m) ((org.locationtech.jts.index.strtree.c) obj2).getBounds()));
        }
    }

    class c implements org.locationtech.jts.index.strtree.b.a {
        c() {
        }

        @Override // org.locationtech.jts.index.strtree.b.a
        public boolean a(Object obj, Object obj2) {
            return ((m) obj).c0((m) obj2);
        }
    }

    private static final class d extends org.locationtech.jts.index.strtree.a {
        @Override // org.locationtech.jts.index.strtree.a
        protected Object b() {
            m mVar = null;
            for (org.locationtech.jts.index.strtree.c cVar : c()) {
                if (mVar == null) {
                    mVar = new m((m) cVar.getBounds());
                } else {
                    mVar.z((m) cVar.getBounds());
                }
            }
            return mVar;
        }

        private d(int i10) {
            super(i10);
        }
    }

    public k() {
        this(10);
    }

    private static double H(double d10, double d11) {
        return (d10 + d11) / 2.0d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double I(m mVar) {
        return H(mVar.L(), mVar.H());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static double J(m mVar) {
        return H(mVar.M(), mVar.I());
    }

    private List L(List[] listArr, int i10) {
        org.locationtech.jts.util.a.c(listArr.length > 0);
        ArrayList arrayList = new ArrayList();
        for (List list : listArr) {
            arrayList.addAll(K(list, i10));
        }
        return arrayList;
    }

    private static Object[] M(PriorityQueue<org.locationtech.jts.index.strtree.d> priorityQueue) {
        Object[] objArr = new Object[priorityQueue.size()];
        Iterator<org.locationtech.jts.index.strtree.d> it = priorityQueue.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            objArr[i10] = ((h) it.next().o(0)).a();
            i10++;
        }
        return objArr;
    }

    private Object[] P(org.locationtech.jts.index.strtree.d dVar) {
        return Q(dVar, Double.POSITIVE_INFINITY);
    }

    private Object[] Q(org.locationtech.jts.index.strtree.d dVar, double d10) {
        org.locationtech.jts.util.k kVar = new org.locationtech.jts.util.k();
        kVar.a(dVar);
        org.locationtech.jts.index.strtree.d dVar2 = null;
        while (!kVar.c() && d10 > 0.0d) {
            org.locationtech.jts.index.strtree.d dVar3 = (org.locationtech.jts.index.strtree.d) kVar.d();
            double dP = dVar3.p();
            if (dP >= d10) {
                break;
            }
            if (dVar3.r()) {
                dVar2 = dVar3;
                d10 = dP;
            } else {
                dVar3.n(kVar, d10);
            }
        }
        return new Object[]{((h) dVar2.o(0)).a(), ((h) dVar2.o(1)).a()};
    }

    private Object[] R(org.locationtech.jts.index.strtree.d dVar, double d10, int i10) {
        org.locationtech.jts.util.k kVar = new org.locationtech.jts.util.k();
        kVar.a(dVar);
        PriorityQueue priorityQueue = new PriorityQueue(i10, new e(false));
        while (!kVar.c() && d10 >= 0.0d) {
            org.locationtech.jts.index.strtree.d dVar2 = (org.locationtech.jts.index.strtree.d) kVar.d();
            double dP = dVar2.p();
            if (dP >= d10) {
                break;
            }
            if (!dVar2.r()) {
                dVar2.n(kVar, d10);
            } else if (priorityQueue.size() < i10) {
                priorityQueue.add(dVar2);
            } else {
                if (((org.locationtech.jts.index.strtree.d) priorityQueue.peek()).p() > dP) {
                    priorityQueue.poll();
                    priorityQueue.add(dVar2);
                }
                d10 = ((org.locationtech.jts.index.strtree.d) priorityQueue.peek()).p();
            }
        }
        return M(priorityQueue);
    }

    private Object[] S(org.locationtech.jts.index.strtree.d dVar, int i10) {
        return R(dVar, Double.POSITIVE_INFINITY, i10);
    }

    @Override // org.locationtech.jts.index.strtree.b
    public int D() {
        return super.D();
    }

    protected List K(List list, int i10) {
        return super.k(list, i10);
    }

    public Object N(m mVar, Object obj, i iVar) {
        return P(new org.locationtech.jts.index.strtree.d(q(), new h(mVar, obj), iVar))[0];
    }

    public Object[] O(m mVar, Object obj, i iVar, int i10) {
        return S(new org.locationtech.jts.index.strtree.d(q(), new h(mVar, obj), iVar), i10);
    }

    public Object[] T(i iVar) {
        return P(new org.locationtech.jts.index.strtree.d(q(), q(), iVar));
    }

    public Object[] U(k kVar, i iVar) {
        return P(new org.locationtech.jts.index.strtree.d(q(), kVar.q(), iVar));
    }

    protected List[] V(List list, int i10) {
        int iCeil = (int) Math.ceil(((double) list.size()) / ((double) i10));
        List[] listArr = new List[i10];
        Iterator it = list.iterator();
        int i11 = 6 << 0;
        for (int i12 = 0; i12 < i10; i12++) {
            listArr[i12] = new ArrayList();
            for (int i13 = 0; it.hasNext() && i13 < iCeil; i13++) {
                listArr[i12].add((org.locationtech.jts.index.strtree.c) it.next());
            }
        }
        return listArr;
    }

    @Override // qm.c
    public void a(m mVar, Object obj) {
        if (mVar.d0()) {
            return;
        }
        super.r(mVar, obj);
    }

    @Override // qm.c
    public List b(m mVar) {
        return super.w(mVar);
    }

    @Override // qm.c
    public void c(m mVar, qm.b bVar) {
        super.x(mVar, bVar);
    }

    @Override // qm.c
    public boolean d(m mVar, Object obj) {
        return super.A(mVar, obj);
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected org.locationtech.jts.index.strtree.a j(int i10) {
        return new d(i10);
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected List k(List list, int i10) {
        org.locationtech.jts.util.a.c(!list.isEmpty());
        int iCeil = (int) Math.ceil(((double) list.size()) / ((double) p()));
        ArrayList arrayList = new ArrayList(list);
        Collections.sort(arrayList, f338466h);
        return L(V(arrayList, (int) Math.ceil(Math.sqrt(iCeil))), i10);
    }

    @Override // org.locationtech.jts.index.strtree.b
    public int l() {
        return super.l();
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected Comparator n() {
        return f338467i;
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected org.locationtech.jts.index.strtree.b.a o() {
        return f338468j;
    }

    public k(int i10) {
        super(i10);
    }
}
