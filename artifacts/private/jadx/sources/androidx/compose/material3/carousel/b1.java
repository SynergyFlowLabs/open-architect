package androidx.compose.material3.carousel;

import androidx.collection.l1;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.IntIterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStrategy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,653:1\n230#2,3:654\n34#2,6:657\n233#2:663\n286#2,3:664\n70#2,6:667\n289#2:673\n34#2,6:680\n34#2,6:686\n1557#3:674\n1628#3,3:675\n1863#3,2:678\n*S KotlinDebug\n*F\n+ 1 Strategy.kt\nandroidx/compose/material3/carousel/StrategyKt\n*L\n510#1:654,3\n510#1:657,6\n510#1:663\n528#1:664,3\n528#1:667,6\n528#1:673\n521#1:680,6\n549#1:686,6\n589#1:674\n589#1:675,3\n617#1:678,2\n*E\n"})
public final class b1 {
    private static final p0 j(final p0 p0Var, float f10, float f11, float f12, o0 o0Var, int i10) {
        ArrayList arrayList = new ArrayList(p0Var.size());
        int size = p0Var.size();
        for (int i11 = 0; i11 < size; i11++) {
            o0 o0Var2 = p0Var.get(i11);
            if (!o0Var2.n()) {
                arrayList.add(o0Var2);
            }
        }
        final float size2 = f12 / arrayList.size();
        p0 p0VarB = q0.b(f10, f11, i10, (o0Var.k() - (size2 / 2.0f)) + f12, new Function1() { // from class: androidx.compose.material3.carousel.a1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.k(p0Var, size2, (r0) obj);
            }
        });
        ArrayList arrayList2 = new ArrayList(p0VarB.size());
        int size3 = p0VarB.size();
        for (int i12 = 0; i12 < size3; i12++) {
            arrayList2.add(o0.i(p0VarB.get(i12), 0.0f, 0.0f, p0Var.get(i12).m(), false, false, false, 0.0f, 123, null));
        }
        return new p0(arrayList2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(p0 p0Var, float f10, r0 r0Var) {
        int size = p0Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            o0 o0Var = p0Var.get(i10);
            r0Var.a(o0Var.l() - Math.abs(f10), o0Var.n());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<p0> l(p0 p0Var, float f10, float f11, float f12) {
        if (p0Var.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(p0Var);
        if (p0Var.O(f10)) {
            if (f12 == 0.0f) {
                return arrayList;
            }
            arrayList.add(j(p0Var, f10, f11, -f12, p0Var.C(), p0Var.D()));
            return arrayList;
        }
        int iD = p0Var.D();
        int iG = p0Var.G();
        int i10 = iG - iD;
        if (i10 <= 0 && p0Var.C().j() > 0.0f) {
            arrayList.add(t(p0Var, 0, 0, f10, f11));
            return arrayList;
        }
        for (int i11 = 0; i11 < i10; i11++) {
            p0 p0Var2 = (p0) CollectionsKt.last((List) arrayList);
            int i12 = iG - i11;
            arrayList.add(t(p0Var2, p0Var.G(), i12 < CollectionsKt.getLastIndex(p0Var) ? p0Var2.P(p0Var.get(i12 + 1).l()) + 1 : 0, f10, f11));
        }
        if (f12 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), j((p0) CollectionsKt.last((List) arrayList), f10, f11, -f12, ((p0) CollectionsKt.last((List) arrayList)).C(), ((p0) CollectionsKt.last((List) arrayList)).D()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(List<p0> list, float f10) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((o0) CollectionsKt.last((List) CollectionsKt.first((List) list))).m() - ((o0) CollectionsKt.last((List) CollectionsKt.last((List) list))).m(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final x0 n(int i10, androidx.collection.r rVar, float f10) {
        float fW = rVar.w(0);
        Iterator<Integer> it = kotlin.ranges.r.W1(1, i10).iterator();
        while (it.hasNext()) {
            int iNextInt = ((IntIterator) it).nextInt();
            float fW2 = rVar.w(iNextInt);
            if (f10 <= fW2) {
                return new x0(iNextInt - 1, iNextInt, r(0.0f, 1.0f, fW, fW2, f10));
            }
            fW = fW2;
        }
        return new x0(0, 0, 0.0f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List<p0> o(p0 p0Var, float f10, float f11, float f12) {
        if (p0Var.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(p0Var);
        int i10 = 2 >> 0;
        if (p0Var.N()) {
            if (f12 == 0.0f) {
                return arrayList;
            }
            arrayList.add(j(p0Var, f10, f11, f12, p0Var.s(), p0Var.t()));
            return arrayList;
        }
        int iV = p0Var.v();
        int iT = p0Var.t() - iV;
        if (iT <= 0 && p0Var.s().j() > 0.0f) {
            arrayList.add(t(p0Var, 0, 0, f10, f11));
            return arrayList;
        }
        for (int i11 = 0; i11 < iT; i11++) {
            p0 p0Var2 = (p0) CollectionsKt.last((List) arrayList);
            int i12 = iV + i11;
            int lastIndex = CollectionsKt.getLastIndex(p0Var);
            if (i12 > 0) {
                lastIndex = p0Var2.n(p0Var.get(i12 - 1).l()) - 1;
            }
            arrayList.add(t(p0Var2, p0Var.v(), lastIndex, f10, f11));
        }
        if (f12 == 0.0f) {
            return arrayList;
        }
        arrayList.set(CollectionsKt.getLastIndex(arrayList), j((p0) CollectionsKt.last((List) arrayList), f10, f11, f12, ((p0) CollectionsKt.last((List) arrayList)).s(), ((p0) CollectionsKt.last((List) arrayList)).t()));
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float p(List<p0> list, float f10) {
        if (list.isEmpty()) {
            return 0.0f;
        }
        return Math.max(((o0) CollectionsKt.first((List) CollectionsKt.last((List) list))).m() - ((o0) CollectionsKt.first((List) CollectionsKt.first((List) list))).m(), f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.collection.r q(float f10, List<p0> list, boolean z10) {
        l1 l1VarJ = androidx.collection.s.j(0.0f);
        if (f10 != 0.0f && !list.isEmpty()) {
            IntRange intRangeW1 = kotlin.ranges.r.W1(1, list.size());
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(intRangeW1, 10));
            Iterator<Integer> it = intRangeW1.iterator();
            while (it.hasNext()) {
                int iNextInt = ((IntIterator) it).nextInt();
                int i10 = iNextInt - 1;
                p0 p0Var = list.get(i10);
                p0 p0Var2 = list.get(iNextInt);
                arrayList.add(Boolean.valueOf(l1VarJ.b0(iNextInt == CollectionsKt.getLastIndex(list) ? 1.0f : l1VarJ.w(i10) + ((z10 ? ((o0) CollectionsKt.first((List) p0Var2)).m() - ((o0) CollectionsKt.first((List) p0Var)).m() : ((o0) CollectionsKt.last((List) p0Var)).m() - ((o0) CollectionsKt.last((List) p0Var2)).m()) / f10))));
            }
        }
        return l1VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float r(float f10, float f11, float f12, float f13, float f14) {
        if (f14 <= f12) {
            return f10;
        }
        return f14 >= f13 ? f11 : androidx.compose.ui.util.e.r(f10, f11, (f14 - f12) / (f13 - f12));
    }

    private static final List<o0> s(List<o0> list, int i10, int i11) {
        o0 o0Var = list.get(i10);
        list.remove(i10);
        list.add(i11, o0Var);
        return list;
    }

    private static final p0 t(final p0 p0Var, final int i10, final int i11, float f10, float f11) {
        int i12;
        if (i10 > i11) {
            i12 = 1;
            int i13 = 0 >> 1;
        } else {
            i12 = -1;
        }
        return q0.b(f10, f11, p0Var.K() + i12, p0Var.J().k() + (((p0Var.get(i10).l() - p0Var.get(i10).j()) + f11) * i12), new Function1() { // from class: androidx.compose.material3.carousel.z0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b1.u(p0Var, i10, i11, (r0) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(p0 p0Var, int i10, int i11, r0 r0Var) {
        List<o0> listS = s(CollectionsKt.toMutableList((Collection) p0Var), i10, i11);
        int size = listS.size();
        for (int i12 = 0; i12 < size; i12++) {
            o0 o0Var = listS.get(i12);
            r0Var.a(o0Var.l(), o0Var.n());
        }
        return Unit.f312394a;
    }
}
