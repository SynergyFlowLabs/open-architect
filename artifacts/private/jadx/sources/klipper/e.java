package klipper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes11.dex */
public final class e {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    public static final a f312290o = new a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final double f312291p = 6.283185307179586d;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final double f312292q = 0.25d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private double f312293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private double f312294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<List<k>> f312295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<k> f312296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<k> f312297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final ArrayList<g> f312298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private double f312299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f312300h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f312301i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private double f312302j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private double f312303k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private double f312304l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final k f312305m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final x f312306n;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f312307a;

        static {
            int[] iArr = new int[p.values().length];
            iArr[p.Miter.ordinal()] = 1;
            iArr[p.Square.ordinal()] = 2;
            iArr[p.Round.ordinal()] = 3;
            f312307a = iArr;
        }
    }

    public e() {
        this(0.0d, 0.0d, 3, null);
    }

    private final void e(double d10) {
        Iterator<x> it;
        int i10;
        double d11;
        String str;
        double d12;
        double d13;
        d10 = d10;
        this.f312299g = d10;
        String str2 = "destPolys";
        if (d10 > -1.0E-20d && d10 < 1.0E-20d) {
            this.f312295c = q.d(this.f312306n.b());
            Iterator<x> it2 = this.f312306n.c().iterator();
            Intrinsics.checkNotNullExpressionValue(it2, "polyNodes.children.iterator()");
            while (it2.hasNext()) {
                x next = it2.next();
                if (next.e() == i.ClosedPolygon) {
                    List<List<k>> list = this.f312295c;
                    if (list == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("destPolys");
                        list = null;
                    }
                    list.add(next.d());
                }
            }
            return;
        }
        double d14 = this.f312293a;
        this.f312303k = d14 > 2.0d ? ((double) 2) / (d14 * d14) : 0.5d;
        double d15 = this.f312294b;
        double d16 = 0.0d;
        int i11 = 1;
        double dAcos = 3.141592653589793d / Math.acos(((double) 1) - ((d15 > 0.0d ? d15 > Math.abs(d10) * 0.25d ? 0.25d * Math.abs(d10) : this.f312294b : 0.25d) / Math.abs(d10)));
        double d17 = 6.283185307179586d / dAcos;
        this.f312301i = Math.sin(d17);
        this.f312302j = Math.cos(d17);
        this.f312304l = dAcos / 6.283185307179586d;
        int i12 = (d10 > 0.0d ? 1 : (d10 == 0.0d ? 0 : -1));
        if (i12 < 0) {
            this.f312301i = -this.f312301i;
        }
        this.f312295c = q.d(this.f312306n.b() * 2);
        Iterator<x> it3 = this.f312306n.c().iterator();
        while (it3.hasNext()) {
            x next2 = it3.next();
            List<k> listD = next2.d();
            this.f312296d = listD;
            if (listD == null) {
                Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                listD = null;
            }
            int size = listD.size();
            if (size == 0 || (i12 <= 0 && (size < 3 || next2.e() != i.ClosedPolygon))) {
                str = str2;
                i10 = i12;
                it = it3;
                d12 = d16;
                d11 = dAcos;
                d16 = d12;
                str2 = str;
                dAcos = d11;
                i12 = i10;
                it3 = it;
            } else {
                int i13 = 0;
                this.f312297e = q.c(new k[0]);
                String str3 = "destPoly";
                if (size == i11) {
                    List<k> list2 = this.f312296d;
                    if (list2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                        list2 = null;
                    }
                    k kVar = list2.get(0);
                    double d18 = 1.0d;
                    if (next2.f() == p.Round) {
                        int i14 = i11;
                        double d19 = d16;
                        d13 = d19;
                        while (i14 <= dAcos) {
                            List<k> list3 = this.f312297e;
                            if (list3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list3 = null;
                            }
                            list3.add(new k(q.J(kVar.e() + (d18 * d10)), q.J(kVar.f() + (d19 * d10))));
                            double d20 = this.f312302j;
                            double d21 = this.f312301i;
                            double d22 = (d18 * d20) - (d21 * d19);
                            d19 = (d18 * d21) + (d19 * d20);
                            i14++;
                            d10 = d10;
                            d18 = d22;
                            str2 = str2;
                        }
                        str = str2;
                    } else {
                        str = str2;
                        d13 = d16;
                        IntIterator it4 = new IntRange(1, 4).iterator();
                        double d23 = -1.0d;
                        double d24 = -1.0d;
                        while (it4.hasNext()) {
                            it4.next().intValue();
                            List<k> list4 = this.f312297e;
                            if (list4 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list4 = null;
                            }
                            int i15 = i12;
                            Iterator<x> it5 = it3;
                            list4.add(new k(q.J(kVar.e() + (d23 * d10)), q.J(kVar.f() + (d24 * d10))));
                            if (d23 < d13) {
                                d23 = 1.0d;
                            } else if (d24 < d13) {
                                d24 = 1.0d;
                            } else {
                                d23 = -1.0d;
                            }
                            i12 = i15;
                            it3 = it5;
                        }
                    }
                    i10 = i12;
                    it = it3;
                    List<List<k>> list5 = this.f312295c;
                    if (list5 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(str);
                        list5 = null;
                    }
                    List<k> list6 = this.f312297e;
                    if (list6 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                        list6 = null;
                    }
                    list5.add(list6);
                } else {
                    str = str2;
                    i10 = i12;
                    it = it3;
                    d13 = d16;
                    this.f312298f.clear();
                    this.f312298f.ensureCapacity(size);
                    int i16 = size - 1;
                    IntRange intRangeW1 = kotlin.ranges.r.W1(0, i16);
                    ArrayList<g> arrayList = this.f312298f;
                    Iterator<Integer> it6 = intRangeW1.iterator();
                    while (it6.hasNext()) {
                        int iNextInt = ((IntIterator) it6).nextInt();
                        List<k> list7 = this.f312296d;
                        if (list7 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                            list7 = null;
                        }
                        k kVar2 = list7.get(iNextInt);
                        List<k> list8 = this.f312296d;
                        if (list8 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                            list8 = null;
                        }
                        arrayList.add(q.x(kVar2, list8.get(iNextInt + 1)));
                    }
                    i iVarE = next2.e();
                    i iVar = i.ClosedLine;
                    if (iVarE == iVar || next2.e() == i.ClosedPolygon) {
                        ArrayList<g> arrayList2 = this.f312298f;
                        List<k> list9 = this.f312296d;
                        if (list9 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                            list9 = null;
                        }
                        k kVar3 = list9.get(i16);
                        List<k> list10 = this.f312296d;
                        if (list10 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                            list10 = null;
                        }
                        arrayList2.add(q.x(kVar3, list10.get(0)));
                    } else {
                        ArrayList<g> arrayList3 = this.f312298f;
                        g gVar = arrayList3.get(size - 2);
                        Intrinsics.checkNotNullExpressionValue(gVar, "normals[len - 2]");
                        arrayList3.add(g.d(gVar, 0.0d, 0.0d, 3, null));
                    }
                    if (next2.e() == i.ClosedPolygon) {
                        while (i13 < size) {
                            p pVarF = next2.f();
                            Intrinsics.checkNotNull(pVarF);
                            m(i13, i16, pVarF);
                            int i17 = i13;
                            i13++;
                            i16 = i17;
                        }
                        List<List<k>> list11 = this.f312295c;
                        if (list11 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            list11 = null;
                        }
                        List<k> list12 = this.f312297e;
                        if (list12 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                            list12 = null;
                        }
                        list11.add(list12);
                    } else if (next2.e() == iVar) {
                        int i18 = i16;
                        for (int i19 = 0; i19 < size; i19++) {
                            p pVarF2 = next2.f();
                            Intrinsics.checkNotNull(pVarF2);
                            m(i19, i18, pVarF2);
                            i18 = i19;
                        }
                        List<List<k>> list13 = this.f312295c;
                        if (list13 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            list13 = null;
                        }
                        List<k> list14 = this.f312297e;
                        if (list14 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                            list14 = null;
                        }
                        list13.add(list14);
                        this.f312297e = q.c(new k[0]);
                        g gVar2 = this.f312298f.get(i16);
                        Intrinsics.checkNotNullExpressionValue(gVar2, "normals[len - 1]");
                        g gVar3 = gVar2;
                        int i20 = i16;
                        while (i20 > 0) {
                            ArrayList<g> arrayList4 = this.f312298f;
                            int i21 = i20 - 1;
                            arrayList4.set(i20, new g(-arrayList4.get(i21).e(), -this.f312298f.get(i21).f()));
                            i20--;
                            str3 = str3;
                        }
                        String str4 = str3;
                        this.f312298f.set(0, new g(-gVar3.e(), -gVar3.f()));
                        int i22 = 0;
                        while (true) {
                            int i23 = i16;
                            if (-1 >= i23) {
                                break;
                            }
                            p pVarF3 = next2.f();
                            Intrinsics.checkNotNull(pVarF3);
                            m(i23, i22, pVarF3);
                            i16 = i23 - 1;
                            i22 = i23;
                        }
                        List<List<k>> list15 = this.f312295c;
                        if (list15 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            list15 = null;
                        }
                        List<k> list16 = this.f312297e;
                        if (list16 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str4);
                            list16 = null;
                        }
                        list15.add(list16);
                    } else {
                        int i24 = 0;
                        int i25 = 1;
                        while (i25 < i16) {
                            p pVarF4 = next2.f();
                            Intrinsics.checkNotNull(pVarF4);
                            m(i25, i24, pVarF4);
                            int i26 = i25;
                            i25++;
                            i24 = i26;
                        }
                        if (next2.e() == i.OpenButt) {
                            List<k> list17 = this.f312296d;
                            if (list17 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                                list17 = null;
                            }
                            k kVar4 = list17.get(i16);
                            g gVar4 = this.f312298f.get(i16);
                            Intrinsics.checkNotNullExpressionValue(gVar4, "normals[j]");
                            g gVar5 = gVar4;
                            List<k> list18 = this.f312297e;
                            if (list18 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list18 = null;
                            }
                            d11 = dAcos;
                            list18.add(new k(q.J(kVar4.e() + (gVar5.e() * d10)), q.J(kVar4.f() + (gVar5.f() * d10))));
                            List<k> list19 = this.f312297e;
                            if (list19 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list19 = null;
                            }
                            list19.add(new k(q.J(kVar4.e() - (gVar5.e() * d10)), q.J(kVar4.f() - (gVar5.f() * d10))));
                        } else {
                            d11 = dAcos;
                            int i27 = size - 2;
                            this.f312300h = d13;
                            g gVar6 = this.f312298f.get(i16);
                            Intrinsics.checkNotNullExpressionValue(gVar6, "normals[j]");
                            g gVar7 = gVar6;
                            this.f312298f.set(i16, new g(-gVar7.e(), -gVar7.f()));
                            if (next2.e() == i.OpenSquare) {
                                g(i16, i27);
                            } else {
                                f(i16, i27);
                            }
                        }
                        for (int i28 = i16; i28 > 0; i28--) {
                            g gVar8 = this.f312298f.get(i28 - 1);
                            this.f312298f.set(i28, new g(-gVar8.e(), -gVar8.f()));
                            Unit unit = Unit.f312394a;
                        }
                        g gVar9 = this.f312298f.get(1);
                        this.f312298f.set(0, new g(-gVar9.e(), -gVar9.f()));
                        Unit unit2 = Unit.f312394a;
                        int i29 = i16;
                        for (int i30 = size - 2; i30 > 0; i30--) {
                            p pVarF5 = next2.f();
                            Intrinsics.checkNotNull(pVarF5);
                            m(i30, i29, pVarF5);
                            i29 = i30;
                        }
                        if (next2.e() == i.OpenButt) {
                            List<k> list20 = this.f312296d;
                            if (list20 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
                                list20 = null;
                            }
                            k kVar5 = list20.get(0);
                            g gVar10 = this.f312298f.get(0);
                            Intrinsics.checkNotNullExpressionValue(gVar10, "normals[0]");
                            g gVar11 = gVar10;
                            List<k> list21 = this.f312297e;
                            if (list21 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list21 = null;
                            }
                            list21.add(new k(q.J(kVar5.e() - (gVar11.e() * d10)), q.J(kVar5.f() - (gVar11.f() * d10))));
                            List<k> list22 = this.f312297e;
                            if (list22 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                                list22 = null;
                            }
                            list22.add(new k(q.J(kVar5.e() + (gVar11.e() * d10)), q.J(kVar5.f() + (gVar11.f() * d10))));
                            d12 = 0.0d;
                            i11 = 1;
                        } else {
                            d12 = 0.0d;
                            this.f312300h = 0.0d;
                            if (next2.e() == i.OpenSquare) {
                                i11 = 1;
                                g(0, 1);
                            } else {
                                i11 = 1;
                                f(0, 1);
                            }
                        }
                        List<List<k>> list23 = this.f312295c;
                        if (list23 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(str);
                            list23 = null;
                        }
                        List<k> list24 = this.f312297e;
                        if (list24 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
                            list24 = null;
                        }
                        list23.add(list24);
                        d16 = d12;
                        str2 = str;
                        dAcos = d11;
                        i12 = i10;
                        it3 = it;
                    }
                }
                d16 = d13;
                str2 = str;
                i12 = i10;
                it3 = it;
                i11 = 1;
            }
        }
    }

    private final void j() {
        if (this.f312305m.e() < 0 || q.w(this.f312306n.c().get((int) this.f312305m.e()).d())) {
            Iterator<x> it = this.f312306n.c().iterator();
            Intrinsics.checkNotNullExpressionValue(it, "polyNodes.children.iterator()");
            while (it.hasNext()) {
                x next = it.next();
                if (next.e() == i.ClosedLine && !q.w(next.d())) {
                    CollectionsKt.reverse(next.d());
                }
            }
            return;
        }
        Iterator<x> it2 = this.f312306n.c().iterator();
        Intrinsics.checkNotNullExpressionValue(it2, "polyNodes.children.iterator()");
        while (it2.hasNext()) {
            x next2 = it2.next();
            if (next2.e() == i.ClosedPolygon || (next2.e() == i.ClosedLine && q.w(next2.d()))) {
                CollectionsKt.reverse(next2.d());
            }
        }
    }

    public final void a(@NotNull List<k> path, @NotNull p joinType, @NotNull i endType) {
        int i10;
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(joinType, "joinType");
        Intrinsics.checkNotNullParameter(endType, "endType");
        int size = path.size() - 1;
        if (size < 0) {
            return;
        }
        x xVar = new x(joinType, endType);
        List<k> listD = xVar.d();
        int i11 = 0;
        if (endType == i.ClosedLine || endType == i.ClosedPolygon) {
            while (size > 0 && Intrinsics.areEqual(path.get(0), path.get(size))) {
                size--;
            }
        }
        ((ArrayList) listD).ensureCapacity(size + 1);
        listD.add(path.get(0));
        loop0: while (true) {
            i10 = i11;
            for (k kVar : path) {
                if (!Intrinsics.areEqual(listD.get(i11), kVar)) {
                    i11++;
                    listD.add(kVar);
                    if (kVar.f() > listD.get(i10).f() || (kVar.f() == listD.get(i10).f() && kVar.e() < listD.get(i10).e())) {
                    }
                }
            }
            break loop0;
        }
        i iVar = i.ClosedPolygon;
        if (endType != iVar || i11 >= 2) {
            this.f312306n.a(xVar);
            if (endType != iVar) {
                return;
            }
            if (this.f312305m.e() < 0) {
                this.f312305m.i(this.f312306n.b() - 1, i10);
                return;
            }
            k kVar2 = this.f312306n.c().get((int) this.f312305m.e()).d().get((int) this.f312305m.f());
            k kVar3 = listD.get(i10);
            if (kVar3.f() > kVar2.f() || (kVar3.f() == kVar2.f() && kVar3.e() < kVar2.e())) {
                this.f312305m.i(this.f312306n.b() - 1, i10);
            }
        }
    }

    public final void b(@NotNull List<List<k>> paths, @NotNull p joinType, @NotNull i endType) {
        Intrinsics.checkNotNullParameter(paths, "paths");
        Intrinsics.checkNotNullParameter(joinType, "joinType");
        Intrinsics.checkNotNullParameter(endType, "endType");
        Iterator<List<k>> it = paths.iterator();
        while (it.hasNext()) {
            a(it.next(), joinType, endType);
        }
    }

    public final void c() {
        this.f312306n.c().clear();
        this.f312305m.k(-1L);
    }

    public final void d(int i10, int i11, double d10) {
        g gVar = this.f312298f.get(i11);
        Intrinsics.checkNotNullExpressionValue(gVar, "normals[k]");
        g gVar2 = gVar;
        g gVar3 = this.f312298f.get(i10);
        Intrinsics.checkNotNullExpressionValue(gVar3, "normals[j]");
        g gVar4 = gVar3;
        List<k> list = this.f312296d;
        List<k> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
            list = null;
        }
        k kVar = list.get(i10);
        double d11 = this.f312299g / d10;
        List<k> list3 = this.f312297e;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
        } else {
            list2 = list3;
        }
        list2.add(new k(q.J(kVar.e() + ((gVar2.e() + gVar4.e()) * d11)), q.J(kVar.f() + ((gVar2.f() + gVar4.f()) * d11))));
    }

    public final void f(int i10, int i11) {
        g gVar;
        String str;
        List<k> list;
        g gVar2 = this.f312298f.get(i11);
        Intrinsics.checkNotNullExpressionValue(gVar2, "normals[k]");
        g gVar3 = gVar2;
        g gVar4 = this.f312298f.get(i10);
        Intrinsics.checkNotNullExpressionValue(gVar4, "normals[j]");
        g gVar5 = gVar4;
        List<k> list2 = this.f312296d;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
            list2 = null;
        }
        k kVar = list2.get(i10);
        long j10 = 1;
        long jMax = Math.max(q.J(this.f312304l * Math.abs(Math.atan2(this.f312300h, (gVar3.e() * gVar5.e()) + (gVar3.f() * gVar5.f())))), 1L);
        double dE = gVar3.e();
        double dF = gVar3.f();
        long j11 = jMax - 1;
        long j12 = 0;
        String str2 = "destPoly";
        if (0 <= j11) {
            while (true) {
                List<k> list3 = this.f312297e;
                if (list3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(str2);
                    list3 = null;
                }
                long j13 = j10;
                gVar = gVar5;
                str = str2;
                long j14 = j11;
                list3.add(new k(q.J(kVar.e() + (this.f312299g * dE)), q.J(kVar.f() + (this.f312299g * dF))));
                double d10 = this.f312302j;
                double d11 = this.f312301i;
                double d12 = (dE * d10) - (d11 * dF);
                dF = (dF * d10) + (dE * d11);
                if (j12 == j14) {
                    break;
                }
                j12 += j13;
                dE = d12;
                j10 = j13;
                gVar5 = gVar;
                j11 = j14;
                str2 = str;
            }
        } else {
            gVar = gVar5;
            str = "destPoly";
        }
        List<k> list4 = this.f312297e;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(str);
            list = null;
        } else {
            list = list4;
        }
        list.add(new k(q.J(kVar.e() + (gVar.e() * this.f312299g)), q.J(kVar.f() + (gVar.f() * this.f312299g))));
    }

    public final void g(int i10, int i11) {
        g gVar = this.f312298f.get(i11);
        Intrinsics.checkNotNullExpressionValue(gVar, "normals[k]");
        g gVar2 = gVar;
        g gVar3 = this.f312298f.get(i10);
        Intrinsics.checkNotNullExpressionValue(gVar3, "normals[j]");
        g gVar4 = gVar3;
        List<k> list = this.f312296d;
        List<k> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
            list = null;
        }
        k kVar = list.get(i10);
        double dTan = Math.tan(Math.atan2(this.f312300h, (gVar2.e() * gVar4.e()) + (gVar2.f() * gVar4.f())) / 4.0d);
        List<k> list3 = this.f312297e;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
            list3 = null;
        }
        list3.add(new k(q.J(kVar.e() + (this.f312299g * (gVar2.e() - (gVar2.f() * dTan)))), q.J(kVar.f() + (this.f312299g * (gVar2.f() + (gVar2.e() * dTan))))));
        List<k> list4 = this.f312297e;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
        } else {
            list2 = list4;
        }
        list2.add(new k(q.J(kVar.e() + (this.f312299g * (gVar4.e() + (gVar4.f() * dTan)))), q.J(kVar.f() + (this.f312299g * (gVar4.f() - (gVar4.e() * dTan))))));
    }

    public final void h(@NotNull List<List<k>> solution, double d10) {
        Intrinsics.checkNotNullParameter(solution, "solution");
        solution.clear();
        j();
        e(d10);
        List<List<k>> list = null;
        klipper.b bVar = new klipper.b(0, 1, null);
        List<List<k>> list2 = this.f312295c;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPolys");
            list2 = null;
        }
        z zVar = z.Subject;
        bVar.b(list2, zVar, true);
        if (d10 > 0.0d) {
            klipper.a aVar = klipper.a.Union;
            w wVar = w.Positive;
            bVar.c0(aVar, solution, wVar, wVar);
            return;
        }
        List<List<k>> list3 = this.f312295c;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPolys");
        } else {
            list = list3;
        }
        l lVarT = q.t(list);
        long j10 = 10;
        bVar.a(q.c(new k(lVarT.h() - j10, lVarT.g() + j10), new k(lVarT.i() + j10, lVarT.g() + j10), new k(lVarT.i() + j10, lVarT.j() - j10), new k(lVarT.h() - j10, lVarT.j() - j10)), zVar, true);
        bVar.a1(true);
        klipper.a aVar2 = klipper.a.Union;
        w wVar2 = w.Negative;
        bVar.c0(aVar2, solution, wVar2, wVar2);
        if (solution.isEmpty()) {
            return;
        }
        solution.remove(0);
    }

    public final void i(@NotNull y solution, double d10) {
        Intrinsics.checkNotNullParameter(solution, "solution");
        solution.n();
        j();
        e(d10);
        List<List<k>> list = null;
        klipper.b bVar = new klipper.b(0, 1, null);
        List<List<k>> list2 = this.f312295c;
        if (list2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPolys");
            list2 = null;
        }
        z zVar = z.Subject;
        bVar.b(list2, zVar, true);
        if (d10 > 0.0d) {
            klipper.a aVar = klipper.a.Union;
            w wVar = w.Positive;
            bVar.e0(aVar, solution, wVar, wVar);
            return;
        }
        List<List<k>> list3 = this.f312295c;
        if (list3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPolys");
        } else {
            list = list3;
        }
        l lVarT = q.t(list);
        long j10 = 10;
        bVar.a(q.c(new k(lVarT.h() - j10, lVarT.g() + j10), new k(lVarT.i() + j10, lVarT.g() + j10), new k(lVarT.i() + j10, lVarT.j() - j10), new k(lVarT.h() - j10, lVarT.j() - j10)), zVar, true);
        bVar.a1(true);
        klipper.a aVar2 = klipper.a.Union;
        w wVar2 = w.Negative;
        bVar.e0(aVar2, solution, wVar2, wVar2);
        if (solution.b() != 1) {
            solution.n();
            return;
        }
        x xVar = solution.c().get(0);
        if (xVar.b() <= 0) {
            solution.n();
            return;
        }
        solution.c().ensureCapacity(xVar.b());
        ArrayList<x> arrayListC = solution.c();
        x xVar2 = xVar.c().get(0);
        xVar2.m(solution);
        Unit unit = Unit.f312394a;
        arrayListC.set(0, xVar2);
        int iB = xVar.b();
        for (int i10 = 1; i10 < iB; i10++) {
            x xVar3 = xVar.c().get(i10);
            Intrinsics.checkNotNullExpressionValue(xVar3, "outerNode.children[i]");
            solution.a(xVar3);
        }
    }

    public final double k() {
        return this.f312294b;
    }

    public final double l() {
        return this.f312293a;
    }

    public final void m(int i10, int i11, @NotNull p jointype) {
        Intrinsics.checkNotNullParameter(jointype, "jointype");
        g gVar = this.f312298f.get(i11);
        Intrinsics.checkNotNullExpressionValue(gVar, "normals[k]");
        g gVar2 = gVar;
        g gVar3 = this.f312298f.get(i10);
        Intrinsics.checkNotNullExpressionValue(gVar3, "normals[j]");
        g gVar4 = gVar3;
        List<k> list = this.f312296d;
        List<k> list2 = null;
        if (list == null) {
            Intrinsics.throwUninitializedPropertyAccessException("srcPoly");
            list = null;
        }
        k kVar = list.get(i10);
        double dE = (gVar2.e() * gVar4.f()) - (gVar4.e() * gVar2.f());
        this.f312300h = dE;
        if (Math.abs(dE * this.f312299g) >= 1.0d) {
            double d10 = this.f312300h;
            if (d10 > 1.0d) {
                this.f312300h = 1.0d;
            } else if (d10 < -1.0d) {
                this.f312300h = -1.0d;
            }
        } else if ((gVar2.e() * gVar4.e()) + (gVar4.f() * gVar2.f()) > 0.0d) {
            List<k> list3 = this.f312297e;
            if (list3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("destPoly");
            } else {
                list2 = list3;
            }
            list2.add(new k(q.J(kVar.e() + (gVar2.e() * this.f312299g)), q.J(kVar.f() + (gVar2.f() * this.f312299g))));
            return;
        }
        if (this.f312300h * this.f312299g >= 0.0d) {
            int i12 = b.f312307a[jointype.ordinal()];
            if (i12 == 1) {
                double dE2 = ((double) 1) + (gVar4.e() * gVar2.e()) + (gVar4.f() * gVar2.f());
                if (dE2 >= this.f312303k) {
                    d(i10, i11, dE2);
                    return;
                } else {
                    g(i10, i11);
                    return;
                }
            }
            if (i12 == 2) {
                g(i10, i11);
                return;
            } else {
                if (i12 != 3) {
                    return;
                }
                f(i10, i11);
                return;
            }
        }
        List<k> list4 = this.f312297e;
        if (list4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
            list4 = null;
        }
        list4.add(new k(q.J(kVar.e() + (gVar2.e() * this.f312299g)), q.J(kVar.f() + (gVar2.f() * this.f312299g))));
        List<k> list5 = this.f312297e;
        if (list5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
            list5 = null;
        }
        list5.add(kVar);
        List<k> list6 = this.f312297e;
        if (list6 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("destPoly");
        } else {
            list2 = list6;
        }
        list2.add(new k(q.J(kVar.e() + (gVar4.e() * this.f312299g)), q.J(kVar.f() + (gVar4.f() * this.f312299g))));
    }

    public final void n(double d10) {
        this.f312294b = d10;
    }

    public final void o(double d10) {
        this.f312293a = d10;
    }

    public e(double d10, double d11) {
        this.f312293a = d10;
        this.f312294b = d11;
        this.f312298f = new ArrayList<>();
        this.f312305m = new k(-1L, 0L);
        this.f312306n = new x(null, null, 3, null);
    }

    public /* synthetic */ e(double d10, double d11, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? 2.0d : d10, (i10 & 2) != 0 ? 0.25d : d11);
    }
}
