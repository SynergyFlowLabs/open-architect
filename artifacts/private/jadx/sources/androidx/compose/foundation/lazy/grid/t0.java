package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.z2;
import androidx.compose.runtime.n3;
import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 8 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,640:1\n472#1,3:660\n475#1,16:666\n492#1:683\n472#1,3:684\n475#1:690\n476#1,15:699\n492#1:715\n97#2,4:641\n97#2,4:645\n97#2,4:656\n51#2,4:739\n97#2,4:751\n109#2,5:755\n109#2,5:760\n54#3:649\n59#3:651\n54#3:716\n59#3:718\n85#4:650\n90#4:652\n85#4:717\n90#4:719\n26#5:653\n26#5:654\n26#5:655\n35#6,3:663\n39#6:682\n35#6,3:687\n103#6:691\n35#6,3:692\n39#6:697\n104#6:698\n39#6:714\n35#6,5:720\n35#6,5:725\n103#6:731\n35#6,3:732\n39#6:737\n104#6:738\n134#6,2:743\n35#6,5:745\n136#6:750\n53#6,5:765\n35#6,5:770\n35#6,5:775\n35#6,5:780\n35#6,5:785\n12574#7,2:695\n12574#7,2:735\n1#8:730\n*S KotlinDebug\n*F\n+ 1 LazyGridMeasure.kt\nandroidx/compose/foundation/lazy/grid/LazyGridMeasureKt\n*L\n292#1:660,3\n292#1:666,16\n292#1:683\n310#1:684,3\n310#1:690\n310#1:699,15\n310#1:715\n83#1:641,4\n84#1:645,4\n285#1:656,4\n567#1:739,4\n573#1:751,4\n580#1:755,5\n585#1:760,5\n108#1:649\n109#1:651\n395#1:716\n397#1:718\n108#1:650\n109#1:652\n395#1:717\n397#1:719\n139#1:653\n267#1:654\n268#1:655\n292#1:663,3\n292#1:682\n310#1:687,3\n317#1:691\n317#1:692,3\n317#1:697\n317#1:698\n310#1:714\n400#1:720,5\n474#1:725,5\n535#1:731\n535#1:732,3\n535#1:737\n535#1:738\n570#1:743,2\n570#1:745,5\n570#1:750\n613#1:765,5\n620#1:770,5\n625#1:775,5\n440#1:780,5\n441#1:785,5\n318#1:695,2\n535#1:735,2\n*E\n"})
public final class t0 {
    private static final <T> void e(List<T> list, T[] tArr) {
        for (T t10 : tArr) {
            list.add(t10);
        }
    }

    private static final List<v0> f(List<Integer> list, x0 x0Var, z0 z0Var, Function1<? super Integer, Boolean> function1) {
        x0 x0Var2;
        int size = list.size();
        ArrayList arrayList = null;
        int i10 = 0;
        while (i10 < size) {
            int iIntValue = list.get(i10).intValue();
            if (function1.invoke(Integer.valueOf(iIntValue)).booleanValue()) {
                int iF = z0Var.f(iIntValue);
                x0Var2 = x0Var;
                v0 v0VarA = x0Var2.a(iIntValue, 0, iF, z0Var.a(0, iF));
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(v0VarA);
            } else {
                x0Var2 = x0Var;
            }
            i10++;
            x0Var = x0Var2;
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<v0> g(List<y0> list, List<v0> list2, List<v0> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, androidx.compose.foundation.layout.q.m mVar, androidx.compose.foundation.layout.q.e eVar, boolean z11, androidx.compose.ui.unit.d dVar) {
        int i15 = z10 ? i11 : i10;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                androidx.compose.foundation.internal.e.i("non-zero firstLineScrollOffset");
            }
        }
        List<y0> list4 = list;
        int size = list4.size();
        int length = 0;
        for (int i16 = 0; i16 < size; i16++) {
            length += list.get(i16).b().length;
        }
        ArrayList arrayList = new ArrayList(length);
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                androidx.compose.foundation.internal.e.g("no items");
            }
            int size2 = list.size();
            int[] iArr = new int[size2];
            for (int i17 = 0; i17 < size2; i17++) {
                iArr[i17] = list.get(h(i17, z11, size2)).c();
            }
            int[] iArr2 = new int[size2];
            if (z10) {
                if (mVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalArrangement");
                    throw new kotlin.a0();
                }
                mVar.arrange(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalArrangement");
                    throw new kotlin.a0();
                }
                eVar.c(dVar, i15, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
            }
            kotlin.ranges.j indices = ArraysKt.getIndices(iArr2);
            if (z11) {
                indices = kotlin.ranges.r.q1(indices);
            }
            int iL = indices.l();
            int iM = indices.m();
            int iN = indices.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                while (true) {
                    int iC = iArr2[iL];
                    y0 y0Var = list.get(h(iL, z11, size2));
                    if (z11) {
                        iC = (i15 - iC) - y0Var.c();
                    }
                    e(arrayList, y0Var.f(iC, i10, i11));
                    if (iL == iM) {
                        break;
                    }
                    iL += iN;
                }
            }
        } else {
            int size3 = list2.size() - 1;
            if (size3 >= 0) {
                int iM2 = i14;
                while (true) {
                    int i18 = size3 - 1;
                    v0 v0Var = list2.get(size3);
                    iM2 -= v0Var.m();
                    v0Var.k(iM2, 0, i10, i11);
                    arrayList.add(v0Var);
                    if (i18 < 0) {
                        break;
                    }
                    size3 = i18;
                }
            }
            int size4 = list4.size();
            int iM3 = i14;
            for (int i19 = 0; i19 < size4; i19++) {
                y0 y0Var2 = list.get(i19);
                e(arrayList, y0Var2.f(iM3, i10, i11));
                iM3 += y0Var2.d();
            }
            int size5 = list3.size();
            for (int i20 = 0; i20 < size5; i20++) {
                v0 v0Var2 = list3.get(i20);
                v0Var2.k(iM3, 0, i10, i11);
                arrayList.add(v0Var2);
                iM3 += v0Var2.m();
            }
        }
        return arrayList;
    }

    private static final int h(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    private static final List<y0> i(int i10, int i11, z0 z0Var, boolean z10, List<y0> list, n0 n0Var) {
        x xVar;
        int index;
        int iMin;
        ArrayList arrayList = null;
        if (z10 && n0Var != null && !n0Var.h().isEmpty()) {
            List<x> listH = n0Var.h();
            int size = listH.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    xVar = null;
                    break;
                }
                if (listH.get(size).getIndex() > i10 && (size == 0 || listH.get(size - 1).getIndex() <= i10)) {
                    xVar = listH.get(size);
                    break;
                }
            }
            x xVar2 = (x) CollectionsKt.last((List) n0Var.h());
            y0 y0Var = (y0) CollectionsKt.lastOrNull((List) list);
            int i12 = 5 ^ 0;
            int iA = y0Var != null ? y0Var.a() + 1 : 0;
            if (xVar != null && (index = xVar.getIndex()) <= (iMin = Math.min(xVar2.getIndex(), i11 - 1))) {
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i13 = 0;
                        while (true) {
                            if (i13 < size2) {
                                v0[] v0VarArrB = arrayList.get(i13).b();
                                int length = v0VarArrB.length;
                                int i14 = 0;
                                while (true) {
                                    if (i14 >= length) {
                                        i13++;
                                    } else if (v0VarArrB[i14].getIndex() != index) {
                                        i14++;
                                    }
                                }
                            } else {
                                if (arrayList == null) {
                                    arrayList = new ArrayList();
                                }
                                y0 y0VarC = z0Var.c(iA);
                                iA++;
                                arrayList.add(y0VarC);
                            }
                        }
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        y0 y0VarC2 = z0Var.c(iA);
                        iA++;
                        arrayList.add(y0VarC2);
                    }
                    if (index == iMin) {
                        break;
                    }
                    index++;
                }
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:184:0x0473  */
    @NotNull
    public static final u0 j(int i10, @NotNull final z0 z0Var, @NotNull final x0 x0Var, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @Nullable androidx.compose.foundation.layout.q.m mVar, @Nullable androidx.compose.foundation.layout.q.e eVar, boolean z11, @NotNull androidx.compose.ui.unit.d dVar, @NotNull LazyLayoutItemAnimator<v0> lazyLayoutItemAnimator, int i17, @NotNull List<Integer> list, boolean z12, final boolean z13, @Nullable n0 n0Var, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull final n3<Unit> n3Var, @NotNull androidx.compose.ui.graphics.o1 o1Var, @NotNull Function1<? super Integer, ? extends List<Pair<Integer, androidx.compose.ui.unit.b>>> function1, @NotNull Function1<? super Integer, Integer> function2, @Nullable z2 z2Var, @NotNull pj.n<? super Integer, ? super Integer, ? super Function1<? super i2.a, Unit>, ? extends androidx.compose.ui.layout.b1> nVar) {
        int i18;
        ArrayDeque arrayDeque;
        int i19;
        v0[] v0VarArrB;
        v0 v0Var;
        int i20;
        int i21;
        int i22 = i10;
        boolean z14 = true;
        if (!(i12 >= 0)) {
            androidx.compose.foundation.internal.e.g("negative beforeContentPadding");
        }
        if (!(i13 >= 0)) {
            androidx.compose.foundation.internal.e.g("negative afterContentPadding");
        }
        if (i22 <= 0) {
            int iR = androidx.compose.ui.unit.b.r(j10);
            int iQ = androidx.compose.ui.unit.b.q(j10);
            lazyLayoutItemAnimator.m(0, iR, iQ, new ArrayList(), x0Var.g(), x0Var, z10, z13, i17, z12, 0, 0, s0Var, o1Var);
            if (!z13) {
                long jI = lazyLayoutItemAnimator.i();
                if (!androidx.compose.ui.unit.u.h(jI, androidx.compose.ui.unit.u.f42720b.a())) {
                    iR = androidx.compose.ui.unit.c.i(j10, (int) (jI >> 32));
                    iQ = androidx.compose.ui.unit.c.h(j10, (int) (jI & com.rabbitmq.client.k0.f265952a));
                }
            }
            return new u0(null, 0, false, 0.0f, nVar.invoke(Integer.valueOf(iR), Integer.valueOf(iQ), new Function1() { // from class: androidx.compose.foundation.lazy.grid.p0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t0.m((i2.a) obj);
                }
            }), 0.0f, false, s0Var, dVar, i17, function1, function2, CollectionsKt.emptyList(), -i12, i11 + i13, 0, z11, z10 ? q3.Vertical : q3.Horizontal, i13, i14);
        }
        int iRound = Math.round(f10);
        int i23 = i16 - iRound;
        if (i15 == 0 && i23 < 0) {
            iRound += i23;
            i23 = 0;
        }
        ArrayDeque arrayDeque2 = new ArrayDeque();
        int i24 = -i12;
        int i25 = (i14 < 0 ? i14 : 0) + i24;
        int iD = i23 + i25;
        int i26 = i15;
        while (iD < 0 && i26 > 0) {
            i26--;
            y0 y0VarC = z0Var.c(i26);
            arrayDeque2.add(0, y0VarC);
            iD += y0VarC.d();
        }
        if (iD < i25) {
            iRound -= i25 - iD;
            iD = i25;
        }
        int iD2 = iD - i25;
        int i27 = i11 + i13;
        int i28 = i26;
        int iU = kotlin.ranges.r.u(i27, 0);
        int iD3 = -iD2;
        int i29 = i28;
        int i30 = 0;
        boolean z15 = false;
        while (i30 < arrayDeque2.size()) {
            if (iD3 >= iU) {
                arrayDeque2.remove(i30);
                Unit unit = Unit.f312394a;
                z15 = true;
            } else {
                i29++;
                iD3 += ((y0) arrayDeque2.get(i30)).d();
                i30++;
            }
        }
        int i31 = i28;
        boolean z16 = z15;
        int i32 = i29;
        while (i32 < i22 && (iD3 < iU || iD3 <= 0 || arrayDeque2.isEmpty())) {
            y0 y0VarC2 = z0Var.c(i32);
            if (y0VarC2.e()) {
                break;
            }
            iD3 += y0VarC2.d();
            if (iD3 <= i25) {
                i20 = iU;
                i21 = i25;
                if (((v0) ArraysKt.last(y0VarC2.b())).getIndex() != i10 - 1) {
                    iD2 -= y0VarC2.d();
                    Unit unit2 = Unit.f312394a;
                    i31 = i32 + 1;
                    z16 = true;
                }
                i32++;
                i22 = i10;
                iU = i20;
                i25 = i21;
            } else {
                i20 = iU;
                i21 = i25;
            }
            arrayDeque2.add(y0VarC2);
            i32++;
            i22 = i10;
            iU = i20;
            i25 = i21;
        }
        if (iD3 < i11) {
            int i33 = i11 - iD3;
            iD2 -= i33;
            iD3 += i33;
            while (iD2 < i12 && i31 > 0) {
                i31--;
                y0 y0VarC3 = z0Var.c(i31);
                arrayDeque2.add(0, y0VarC3);
                iD2 += y0VarC3.d();
            }
            i18 = i33 + iRound;
            if (iD2 < 0) {
                i18 += iD2;
                iD3 += iD2;
                iD2 = 0;
            }
        } else {
            i18 = iRound;
        }
        float f11 = (kotlin.math.b.U(Math.round(f10)) != kotlin.math.b.U(i18) || Math.abs(Math.round(f10)) < Math.abs(i18)) ? f10 : i18;
        float f12 = f10 - f11;
        float f13 = 0.0f;
        if (z13 && i18 > iRound && f12 <= 0.0f) {
            f13 = (i18 - iRound) + f12;
        }
        float f14 = f13;
        if (!(iD2 >= 0)) {
            androidx.compose.foundation.internal.e.g("negative initial offset");
        }
        int i34 = -iD2;
        y0 y0Var = (y0) arrayDeque2.first();
        v0 v0Var2 = (v0) ArraysKt.firstOrNull(y0Var.b());
        int index = v0Var2 != null ? v0Var2.getIndex() : 0;
        y0 y0Var2 = (y0) arrayDeque2.lastOrNull();
        int index2 = (y0Var2 == null || (v0VarArrB = y0Var2.b()) == null || (v0Var = (v0) ArraysKt.lastOrNull(v0VarArrB)) == null) ? 0 : v0Var.getIndex();
        List<Integer> list2 = list;
        int size = list2.size();
        List listEmptyList = null;
        List listEmptyList2 = null;
        int i35 = 0;
        while (i35 < size) {
            int i36 = size;
            int iIntValue = list.get(i35).intValue();
            if (iIntValue >= 0 && iIntValue < index) {
                int iF = z0Var.f(iIntValue);
                v0 v0VarA = x0Var.a(iIntValue, 0, iF, z0Var.a(0, iF));
                if (listEmptyList2 == null) {
                    listEmptyList2 = new ArrayList();
                }
                List list3 = listEmptyList2;
                list3.add(v0VarA);
                listEmptyList2 = list3;
            }
            i35++;
            size = i36;
            index = index;
        }
        int i37 = index;
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        int i38 = index2;
        List<y0> listI = i(i38, i10, z0Var, z13, arrayDeque2, n0Var);
        int i39 = i10;
        z0 z0Var2 = z0Var;
        int size2 = list2.size();
        int i40 = 0;
        while (i40 < size2) {
            int i41 = size2;
            int iIntValue2 = list.get(i40).intValue();
            int i42 = i40;
            if (i38 + 1 <= iIntValue2 && iIntValue2 < i39) {
                if (z13) {
                    int size3 = listI.size();
                    int i43 = 0;
                    while (true) {
                        if (i43 < size3) {
                            int i44 = i43;
                            v0[] v0VarArrB2 = listI.get(i43).b();
                            int i45 = size3;
                            int length = v0VarArrB2.length;
                            int i46 = 0;
                            while (true) {
                                if (i46 < length) {
                                    int i47 = i46;
                                    if (v0VarArrB2[i46].getIndex() != iIntValue2) {
                                        i46 = i47 + 1;
                                    }
                                } else {
                                    i43 = i44 + 1;
                                    size3 = i45;
                                }
                            }
                        }
                    }
                }
                int iF2 = z0Var2.f(iIntValue2);
                v0 v0VarA2 = x0Var.a(iIntValue2, 0, iF2, z0Var2.a(0, iF2));
                if (listEmptyList == null) {
                    listEmptyList = new ArrayList();
                }
                List list4 = listEmptyList;
                list4.add(v0VarA2);
                listEmptyList = list4;
            }
            i40 = i42 + 1;
            i39 = i10;
            z0Var2 = z0Var;
            size2 = i41;
            arrayDeque2 = arrayDeque2;
            listI = listI;
        }
        ArrayDeque arrayDeque3 = arrayDeque2;
        List<y0> list5 = listI;
        if (listEmptyList == null) {
            listEmptyList = CollectionsKt.emptyList();
        }
        List list6 = listEmptyList;
        if (i12 > 0 || i14 < 0) {
            int size4 = arrayDeque3.size();
            int i48 = 0;
            ArrayDeque arrayDeque4 = arrayDeque3;
            while (true) {
                arrayDeque = arrayDeque4;
                if (i48 >= size4) {
                    break;
                }
                int iD4 = ((y0) arrayDeque.get(i48)).d();
                if (iD2 == 0 || iD4 > iD2 || i48 == CollectionsKt.getLastIndex(arrayDeque)) {
                    break;
                }
                iD2 -= iD4;
                i48++;
                y0Var = (y0) arrayDeque.get(i48);
                arrayDeque4 = arrayDeque;
            }
        } else {
            arrayDeque = arrayDeque3;
        }
        int i49 = iD2;
        y0 y0Var3 = y0Var;
        int iP = z10 ? androidx.compose.ui.unit.b.p(j10) : androidx.compose.ui.unit.c.i(j10, iD3);
        int iH = z10 ? androidx.compose.ui.unit.c.h(j10, iD3) : androidx.compose.ui.unit.b.o(j10);
        List listPlus = arrayDeque;
        if (!list5.isEmpty()) {
            listPlus = CollectionsKt.plus((Collection) arrayDeque, (Iterable) list5);
        }
        List list7 = listPlus;
        int i50 = iH;
        float f15 = f11;
        int i51 = iD3;
        final List<v0> listG = g(list7, listEmptyList2, list6, iP, i50, i51, i11, i34, z10, mVar, eVar, z11, dVar);
        lazyLayoutItemAnimator.m((int) f15, iP, i50, listG, x0Var.g(), x0Var, z10, z13, i17, z12, i49, i51, s0Var, o1Var);
        if (z13) {
            i19 = i50;
        } else {
            long jI2 = lazyLayoutItemAnimator.i();
            if (androidx.compose.ui.unit.u.h(jI2, androidx.compose.ui.unit.u.f42720b.a())) {
                i19 = i50;
            } else {
                int i52 = z10 ? i50 : iP;
                iP = androidx.compose.ui.unit.c.i(j10, Math.max(iP, (int) (jI2 >> 32)));
                int iH2 = androidx.compose.ui.unit.c.h(j10, Math.max(i50, (int) (jI2 & com.rabbitmq.client.k0.f265952a)));
                int i53 = z10 ? iH2 : iP;
                if (i53 != i52) {
                    int size5 = listG.size();
                    for (int i54 = 0; i54 < size5; i54++) {
                        listG.get(i54).x(i53);
                    }
                }
                i19 = iH2;
            }
        }
        int i55 = iP;
        final List listB = androidx.compose.foundation.lazy.layout.y1.b(z2Var, i37, i38, listG, x0Var.f(), i12, i13, i55, i19, new Function1() { // from class: androidx.compose.foundation.lazy.grid.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.n(z0Var, x0Var, ((Integer) obj).intValue());
            }
        });
        if (i38 == i10 - 1 && i51 <= i11) {
            z14 = false;
        }
        return new u0(y0Var3, i49, z14, f15, nVar.invoke(Integer.valueOf(i55), Integer.valueOf(i19), new Function1() { // from class: androidx.compose.foundation.lazy.grid.r0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.k(n3Var, listG, listB, z13, (i2.a) obj);
            }
        }), f14, z16, s0Var, dVar, i17, function1, function2, androidx.compose.foundation.lazy.layout.a1.d(i37, i38, listG, listB), i24, i27, i10, z11, z10 ? q3.Vertical : q3.Horizontal, i13, i14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(n3 n3Var, final List list, final List list2, final boolean z10, i2.a aVar) {
        aVar.K0(new Function1() { // from class: androidx.compose.foundation.lazy.grid.s0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t0.l(list, list2, z10, (i2.a) obj);
            }
        });
        n2.a(n3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(List list, List list2, boolean z10, i2.a aVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((v0) list.get(i10)).v(aVar, z10);
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((v0) list2.get(i11)).v(aVar, z10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final v0 n(z0 z0Var, x0 x0Var, int i10) {
        int iF = z0Var.f(i10);
        return x0Var.a(i10, 0, iF, z0Var.a(0, iF));
    }
}
