package klipper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final boolean f312342a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final long f312343b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final long f312344c = 1073741823;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final long f312345d = 4611686018427387903L;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final double f312346e = -3.4E38d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f312347f = -2;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f312348g = -1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final double f312349h = 1.0E-20d;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312350a;

        static {
            int[] iArr = new int[t.values().length];
            iArr[t.Open.ordinal()] = 1;
            iArr[t.Closed.ordinal()] = 2;
            f312350a = iArr;
        }
    }

    @NotNull
    public static final List<List<k>> A(@NotNull List<k> pattern, @NotNull List<k> path, boolean z10, boolean z11) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(path, "path");
        int size = pattern.size();
        int size2 = path.size();
        List<List<k>> listD = d(size2);
        if (z10) {
            for (k kVar : path) {
                List<k> listA = a(size);
                for (k kVar2 : pattern) {
                    listA.add(new k(kVar.e() + kVar2.e(), kVar.f() + kVar2.f()));
                }
                listD.add(listA);
            }
        } else {
            for (k kVar3 : path) {
                List<k> listA2 = a(size);
                for (k kVar4 : pattern) {
                    listA2.add(new k(kVar3.e() - kVar4.e(), kVar3.f() - kVar4.f()));
                }
                listD.add(listA2);
            }
        }
        List<List<k>> listD2 = d((size2 + (z11 ? 1 : 0)) * (size + 1));
        int i10 = (size2 - 1) + (z11 ? 1 : 0);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = 0;
            while (i12 < size) {
                int i13 = i11 % size2;
                int i14 = i12 % size;
                int i15 = (i11 + 1) % size2;
                i12++;
                int i16 = i12 % size;
                List<k> listC = c(listD.get(i13).get(i14), listD.get(i15).get(i14), listD.get(i15).get(i16), listD.get(i13).get(i16));
                if (!w(listC)) {
                    CollectionsKt.reverse(listC);
                }
                listD2.add(listC);
            }
        }
        return listD2;
    }

    @NotNull
    public static final List<List<k>> B(@NotNull List<k> poly1, @NotNull List<k> poly2) {
        Intrinsics.checkNotNullParameter(poly1, "poly1");
        Intrinsics.checkNotNullParameter(poly2, "poly2");
        List<List<k>> listA = A(poly1, poly2, false, true);
        b bVar = new b(0, 1, null);
        bVar.b(listA, z.Subject, true);
        klipper.a aVar = klipper.a.Union;
        w wVar = w.NonZero;
        bVar.c0(aVar, listA, wVar, wVar);
        return listA;
    }

    @NotNull
    public static final List<List<k>> C(@NotNull List<k> pattern, @NotNull List<k> path, boolean z10) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(path, "path");
        List<List<k>> listA = A(pattern, path, true, z10);
        b bVar = new b(0, 1, null);
        bVar.b(listA, z.Subject, true);
        klipper.a aVar = klipper.a.Union;
        w wVar = w.NonZero;
        bVar.c0(aVar, listA, wVar, wVar);
        return listA;
    }

    @oj.i(name = "minkowskiSumPaths")
    @NotNull
    public static final List<List<k>> D(@NotNull List<k> pattern, @NotNull List<List<k>> paths, boolean z10) {
        Intrinsics.checkNotNullParameter(pattern, "pattern");
        Intrinsics.checkNotNullParameter(paths, "paths");
        List<List<k>> listF = f(new List[0]);
        b bVar = new b(0, 1, null);
        for (List<k> list : paths) {
            bVar.b(A(pattern, list, true, z10), z.Subject, true);
            if (z10) {
                bVar.a(V(list, pattern.get(0)), z.Clip, true);
            }
        }
        klipper.a aVar = klipper.a.Union;
        w wVar = w.NonZero;
        bVar.c0(aVar, listF, wVar, wVar);
        return listF;
    }

    public static final void E(long j10, long j11) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v F(v vVar) {
        while (vVar != null && vVar.f() == null) {
            vVar = vVar.c();
        }
        return vVar;
    }

    private static final boolean G(k kVar, k kVar2, double d10) {
        double dE = kVar.e() - kVar2.e();
        double dF = kVar.f() - kVar2.f();
        return (dE * dE) + (dF * dF) <= d10;
    }

    public static final boolean H(@NotNull k pt1, @NotNull k pt2, @NotNull k pt3) {
        Intrinsics.checkNotNullParameter(pt1, "pt1");
        Intrinsics.checkNotNullParameter(pt2, "pt2");
        Intrinsics.checkNotNullParameter(pt3, "pt3");
        if (!Intrinsics.areEqual(pt1, pt3) && !Intrinsics.areEqual(pt1, pt2) && !Intrinsics.areEqual(pt3, pt2)) {
            if (pt1.e() != pt3.e()) {
                return ((pt2.e() > pt1.e() ? 1 : (pt2.e() == pt1.e() ? 0 : -1)) > 0) == ((pt2.e() > pt3.e() ? 1 : (pt2.e() == pt3.e() ? 0 : -1)) < 0);
            }
            if ((pt2.f() > pt1.f()) == (pt2.f() < pt3.f())) {
                return true;
            }
        }
        return false;
    }

    public static final void I(@NotNull List<List<k>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Iterator<List<k>> it = list.iterator();
        while (it.hasNext()) {
            CollectionsKt.reverse(it.next());
        }
    }

    public static final long J(double d10) {
        return (long) (d10 < 0.0d ? d10 - 0.5d : d10 + 0.5d);
    }

    @NotNull
    public static final List<List<k>> K(@NotNull List<k> list, @NotNull w fillType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        List<List<k>> listF = f(new List[0]);
        b bVar = new b(0, 1, null);
        bVar.b1(true);
        bVar.a(list, z.Subject, true);
        bVar.c0(klipper.a.Union, listF, fillType, fillType);
        return listF;
    }

    public static /* synthetic */ List L(List list, w wVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = w.EvenOdd;
        }
        return K(list, wVar);
    }

    @oj.i(name = "simplifyPolygon")
    @NotNull
    public static final List<List<k>> M(@NotNull List<List<k>> list, @NotNull w fillType) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(fillType, "fillType");
        List<List<k>> listF = f(new List[0]);
        b bVar = new b(0, 1, null);
        bVar.b1(true);
        bVar.b(list, z.Subject, true);
        bVar.c0(klipper.a.Union, listF, fillType, fillType);
        return listF;
    }

    public static /* synthetic */ List N(List list, w wVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            wVar = w.EvenOdd;
        }
        return M(list, wVar);
    }

    public static final boolean O(@NotNull k pt1, @NotNull k pt2, @NotNull k pt3, @NotNull k pt4, boolean z10) {
        Intrinsics.checkNotNullParameter(pt1, "pt1");
        Intrinsics.checkNotNullParameter(pt2, "pt2");
        Intrinsics.checkNotNullParameter(pt3, "pt3");
        Intrinsics.checkNotNullParameter(pt4, "pt4");
        if (!z10) {
            return (pt1.f() - pt2.f()) * (pt3.e() - pt4.e()) == (pt1.e() - pt2.e()) * (pt3.f() - pt4.f());
        }
        E(pt1.f() - pt2.f(), pt3.e() - pt4.e());
        Unit unit = Unit.f312394a;
        E(pt1.e() - pt2.e(), pt3.f() - pt4.f());
        return Intrinsics.areEqual(unit, unit);
    }

    public static final boolean P(@NotNull k pt1, @NotNull k pt2, @NotNull k pt3, boolean z10) {
        Intrinsics.checkNotNullParameter(pt1, "pt1");
        Intrinsics.checkNotNullParameter(pt2, "pt2");
        Intrinsics.checkNotNullParameter(pt3, "pt3");
        if (!z10) {
            return (pt1.f() - pt2.f()) * (pt2.e() - pt3.e()) == (pt1.e() - pt2.e()) * (pt2.f() - pt3.f());
        }
        E(pt1.f() - pt2.f(), pt2.e() - pt3.e());
        Unit unit = Unit.f312394a;
        E(pt1.e() - pt2.e(), pt2.f() - pt3.f());
        return Intrinsics.areEqual(unit, unit);
    }

    public static final boolean Q(@NotNull b0 e10, @NotNull b0 e11, boolean z10) {
        Intrinsics.checkNotNullParameter(e10, "e1");
        Intrinsics.checkNotNullParameter(e11, "e2");
        if (!z10) {
            return e10.c().f() * e11.c().e() == e10.c().e() * e11.c().f();
        }
        E(e10.c().f(), e11.c().e());
        Unit unit = Unit.f312394a;
        E(e10.c().e(), e11.c().f());
        return Intrinsics.areEqual(unit, unit);
    }

    private static final boolean R(k kVar, k kVar2, k kVar3, double d10) {
        double dR;
        if (Math.abs(kVar.e() - kVar2.e()) > Math.abs(kVar.f() - kVar2.f())) {
            if ((kVar.e() > kVar2.e()) == (kVar.e() < kVar3.e())) {
                dR = r(kVar, kVar2, kVar3);
            } else {
                dR = ((kVar2.e() > kVar.e() ? 1 : (kVar2.e() == kVar.e() ? 0 : -1)) > 0) == ((kVar2.e() > kVar3.e() ? 1 : (kVar2.e() == kVar3.e() ? 0 : -1)) < 0) ? r(kVar2, kVar, kVar3) : r(kVar3, kVar, kVar2);
            }
        } else {
            if ((kVar.f() > kVar2.f()) == (kVar.f() < kVar3.f())) {
                dR = r(kVar, kVar2, kVar3);
            } else {
                dR = ((kVar2.f() > kVar.f() ? 1 : (kVar2.f() == kVar.f() ? 0 : -1)) > 0) == ((kVar2.f() > kVar3.f() ? 1 : (kVar2.f() == kVar3.f() ? 0 : -1)) < 0) ? r(kVar2, kVar, kVar3) : r(kVar3, kVar, kVar2);
            }
        }
        return dR < d10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(b0 b0Var, b0 b0Var2) {
        int i10 = b0Var.i();
        b0Var.C(b0Var2.i());
        b0Var2.C(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T(b0 b0Var, b0 b0Var2) {
        h hVarN = b0Var.n();
        b0Var.H(b0Var2.n());
        b0Var2.H(hVarN);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long U(b0 b0Var, long j10) {
        return j10 == b0Var.o().f() ? b0Var.o().e() : b0Var.a().e() + J(b0Var.d() * (j10 - b0Var.a().f()));
    }

    private static final List<k> V(List<k> list, k kVar) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i10 = 0; i10 < size; i10++) {
            k kVar2 = list.get(i10);
            arrayList.add(new k(kVar2.e() + kVar.e(), kVar2.f() + kVar.f()));
        }
        return arrayList;
    }

    @NotNull
    public static final List<k> a(int i10) {
        return new ArrayList(i10);
    }

    @NotNull
    public static final List<k> b(int i10, @NotNull Function1<? super Integer, k> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<k> c(@NotNull k... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return CollectionsKt.mutableListOf(Arrays.copyOf(elements, elements.length));
    }

    @NotNull
    public static final List<List<k>> d(int i10) {
        return new ArrayList(i10);
    }

    @NotNull
    public static final List<List<k>> e(int i10, @NotNull Function1<? super Integer, ? extends List<k>> init) {
        Intrinsics.checkNotNullParameter(init, "init");
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(init.invoke(Integer.valueOf(i11)));
        }
        return arrayList;
    }

    @NotNull
    public static final List<List<k>> f(@NotNull List<k>... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return CollectionsKt.mutableListOf(Arrays.copyOf(elements, elements.length));
    }

    public static final void m(@NotNull List<List<k>> list, @NotNull x polyNode, @NotNull t nt) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(polyNode, "polyNode");
        Intrinsics.checkNotNullParameter(nt, "nt");
        int i10 = a.f312350a[nt.ordinal()];
        boolean z10 = true;
        if (i10 != 1) {
            if (i10 == 2 && polyNode.k()) {
                z10 = false;
            }
            if (!polyNode.d().isEmpty() && z10) {
                list.add(polyNode.d());
            }
            Iterator<x> it = polyNode.c().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "polyNode.children.iterator()");
            while (it.hasNext()) {
                x pn = it.next();
                Intrinsics.checkNotNullExpressionValue(pn, "pn");
                m(list, pn, nt);
            }
        }
    }

    public static final double n(@NotNull List<k> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size < 3) {
            return 0.0d;
        }
        int i10 = size - 1;
        double dE = 0.0d;
        for (int i11 = 0; i11 < size; i11++) {
            k kVar = list.get(i11);
            k kVar2 = list.get(i10);
            dE += (kVar2.e() + kVar.e()) * (kVar2.f() - kVar.f());
            i10 = i11;
        }
        return (-dE) * 0.5d;
    }

    @oj.i(name = "cleanPolygon")
    @NotNull
    public static final List<k> o(@NotNull List<k> list, double d10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        if (size == 0) {
            return c(new k[0]);
        }
        u[] uVarArr = new u[size];
        for (int i10 = 0; i10 < size; i10++) {
            uVarArr[i10] = new u(0, list.get(i10));
        }
        int i11 = 0;
        for (int i12 = 0; i12 < size; i12++) {
            u uVar = uVarArr[i12];
            i11++;
            u uVar2 = uVarArr[i11 % size];
            uVar2.m(uVar);
            uVar.l(uVar2);
        }
        double d11 = d10 * d10;
        u uVarF = uVarArr[0];
        while (uVarF.e() == 0 && !Intrinsics.areEqual(uVarF.f(), uVarF.g())) {
            if (G(uVarF.h(), uVarF.g().h(), d11)) {
                size--;
                uVarF = uVarF.d();
            } else if (G(uVarF.g().h(), uVarF.f().h(), d11)) {
                size -= 2;
                uVarF.f().d();
                uVarF = uVarF.d();
            } else if (R(uVarF.g().h(), uVarF.h(), uVarF.f().h(), d11)) {
                size--;
                uVarF = uVarF.d();
            } else {
                uVarF.k(1);
                uVarF = uVarF.f();
            }
        }
        if (size < 3) {
            size = 0;
        }
        ArrayList arrayList = new ArrayList(size);
        for (int i13 = 0; i13 < size; i13++) {
            k kVarH = uVarF.h();
            uVarF = uVarF.f();
            arrayList.add(kVarH);
        }
        return arrayList;
    }

    public static /* synthetic */ List p(List list, double d10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            d10 = 1.415d;
        }
        return o(list, d10);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x0111 A[PHI: r20
      0x0111: PHI (r20v5 int) = (r20v4 int), (r20v6 int) binds: [B:69:0x016c, B:54:0x010f] A[DONT_GENERATE, DONT_INLINE]] */
    public static final int q(@NotNull List<k> list, @NotNull k pt) {
        int i10;
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(pt, "pt");
        int size = list.size();
        int i11 = 0;
        if (size < 3) {
            return 0;
        }
        k kVar = list.get(0);
        int i12 = 1;
        if (1 > size) {
            return 0;
        }
        int i13 = 0;
        int i14 = 1;
        while (true) {
            k kVar2 = i14 == size ? list.get(i11) : list.get(i14);
            if (kVar2.f() == pt.f()) {
                if (kVar2.e() != pt.e()) {
                    if (kVar.f() == pt.f()) {
                        if ((kVar2.e() > pt.e() ? i12 : i11) == (kVar.e() < pt.e() ? i12 : i11)) {
                            break;
                        }
                    }
                } else {
                    break;
                }
            }
            if ((kVar.f() < pt.f() ? i12 : i11) == (kVar2.f() < pt.f() ? i12 : i11)) {
                i10 = i11;
            } else if (kVar.e() < pt.e()) {
                i10 = i11;
                if (kVar2.e() > pt.e()) {
                    double dE = ((kVar.e() - pt.e()) * (kVar2.f() - pt.f())) - ((kVar2.e() - pt.e()) * (kVar.f() - pt.f()));
                    if (dE == 0.0d) {
                        return -1;
                    }
                    if ((dE > 0.0d ? 1 : i10) == (kVar2.f() > kVar.f() ? 1 : i10)) {
                        i13 = 1 - i13;
                    }
                }
            } else if (kVar2.e() > pt.e()) {
                i13 = 1 - i13;
                i10 = i11;
            } else {
                i10 = i11;
                double dE2 = ((kVar.e() - pt.e()) * (kVar2.f() - pt.f())) - ((kVar2.e() - pt.e()) * (kVar.f() - pt.f()));
                if (dE2 == 0.0d) {
                    return -1;
                }
                if ((dE2 > 0.0d ? 1 : i10) == (kVar2.f() > kVar.f() ? 1 : i10)) {
                    i13 = 1 - i13;
                }
            }
            if (i14 == size) {
                return i13;
            }
            i14++;
            kVar = kVar2;
            i11 = i10;
            i12 = 1;
        }
        return -1;
    }

    private static final double r(k kVar, k kVar2, k kVar3) {
        double dF = kVar2.f() - kVar3.f();
        double dE = kVar3.e() - kVar2.e();
        double dE2 = ((kVar.e() * dF) + (kVar.f() * dE)) - ((kVar2.e() * dF) + (kVar2.f() * dE));
        return (dE2 * dE2) / ((dF * dF) + (dE * dE));
    }

    private static final double s(k kVar, k kVar2) {
        double dE = kVar.e() - kVar2.e();
        double dF = kVar.f() - kVar2.f();
        return (dE * dE) + (dF * dF);
    }

    @NotNull
    public static final l t(@NotNull List<List<k>> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int size = list.size();
        int i10 = 0;
        while (i10 < size && list.get(i10).size() == 0) {
            i10++;
        }
        if (i10 == size) {
            return new l(0L, 0L, 0L, 0L);
        }
        k kVar = list.get(i10).get(0);
        long jE = kVar.e();
        long jF = kVar.f();
        l lVar = new l(jE, jF, jE, jF);
        IntIterator it = kotlin.ranges.r.W1(i10, size).iterator();
        while (it.hasNext()) {
            for (k kVar2 : list.get(it.next().intValue())) {
                long jA = kVar2.a();
                long jB = kVar2.b();
                if (jA < lVar.h()) {
                    lVar.l(jA);
                } else if (jA > lVar.i()) {
                    lVar.m(jA);
                }
                if (jB < lVar.j()) {
                    lVar.n(jB);
                } else if (jB > lVar.g()) {
                    lVar.k(jB);
                }
            }
        }
        return lVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final double u(k kVar, k kVar2) {
        if (kVar.f() == kVar2.f()) {
            return -3.4E38d;
        }
        return (kVar2.e() - kVar.e()) / (kVar2.f() - kVar.f());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(m mVar) {
        return Intrinsics.areEqual(mVar.a().h(), mVar.b()) || Intrinsics.areEqual(mVar.a().m(), mVar.b());
    }

    public static final boolean w(@NotNull List<k> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        return n(list) >= 0.0d;
    }

    @NotNull
    public static final g x(@NotNull k pt1, @NotNull k pt2) {
        Intrinsics.checkNotNullParameter(pt1, "pt1");
        Intrinsics.checkNotNullParameter(pt2, "pt2");
        long jE = pt2.e() - pt1.e();
        long jF = pt2.f() - pt1.f();
        if (jE == 0 && jF == 0) {
            return new g(0.0d, 0.0d, 3, null);
        }
        double d10 = jE;
        double d11 = jF;
        double dSqrt = 1.0d / Math.sqrt((d10 * d10) + (d11 * d11));
        return new g(d11 * dSqrt, (-jE) * dSqrt);
    }

    private static final int y(m mVar, m mVar2) {
        return (int) (mVar2.c().f() - mVar.c().f());
    }

    public static final boolean z(double d10) {
        return d10 > -1.0E-20d && d10 < 1.0E-20d;
    }
}
