package androidx.compose.foundation.lazy;

import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.foundation.lazy.layout.y1;
import androidx.compose.foundation.lazy.layout.z2;
import androidx.compose.runtime.n3;
import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyListMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,682:1\n97#2,4:683\n97#2,4:687\n97#2,4:698\n51#2,4:752\n97#2,4:756\n109#2,5:760\n109#2,5:765\n54#3:691\n59#3:693\n54#3:712\n59#3:714\n85#4:692\n90#4:694\n85#4:713\n90#4:715\n26#5:695\n26#5:696\n26#5:697\n35#6,5:702\n35#6,5:707\n35#6,5:716\n118#6:721\n35#6,5:722\n119#6:727\n118#6:728\n35#6,5:729\n119#6:734\n118#6:735\n35#6,5:736\n119#6:741\n35#6,5:742\n53#6,5:747\n35#6,5:770\n35#6,5:775\n35#6,5:780\n35#6,5:785\n35#6,5:790\n*S KotlinDebug\n*F\n+ 1 LazyListMeasure.kt\nandroidx/compose/foundation/lazy/LazyListMeasureKt\n*L\n81#1:683,4\n82#1:687,4\n289#1:698,4\n608#1:752,4\n615#1:756,4\n626#1:760,5\n634#1:765,5\n107#1:691\n108#1:693\n390#1:712\n392#1:714\n107#1:692\n108#1:694\n390#1:713\n392#1:715\n142#1:695\n271#1:696\n272#1:697\n323#1:702,5\n339#1:707,5\n395#1:716,5\n510#1:721\n510#1:722,5\n510#1:727\n530#1:728\n530#1:729,5\n530#1:734\n531#1:735\n531#1:736,5\n531#1:741\n552#1:742,5\n579#1:747,5\n661#1:770,5\n668#1:775,5\n674#1:780,5\n436#1:785,5\n438#1:790,5\n*E\n"})
public final class l0 {
    private static final List<n0> e(List<n0> list, List<n0> list2, List<n0> list3, int i10, int i11, int i12, int i13, int i14, boolean z10, androidx.compose.foundation.layout.q.m mVar, androidx.compose.foundation.layout.q.e eVar, boolean z11, androidx.compose.ui.unit.d dVar) {
        int i15 = z10 ? i11 : i10;
        int i16 = 0;
        boolean z12 = i12 < Math.min(i15, i13);
        if (z12) {
            if (!(i14 == 0)) {
                androidx.compose.foundation.internal.e.i("non-zero itemsScrollOffset");
            }
        }
        ArrayList arrayList = new ArrayList(list.size() + list2.size() + list3.size());
        if (z12) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                androidx.compose.foundation.internal.e.g("no extra items");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i16 < size) {
                iArr[i16] = list.get(f(i16, z11, size)).getSize();
                i16++;
            }
            int[] iArr2 = new int[size];
            if (z10) {
                if (mVar == null) {
                    androidx.compose.foundation.internal.e.h("null verticalArrangement when isVertical == true");
                    throw new kotlin.a0();
                }
                mVar.arrange(dVar, i15, iArr, iArr2);
            } else {
                if (eVar == null) {
                    androidx.compose.foundation.internal.e.h("null horizontalArrangement when isVertical == false");
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
                    int size2 = iArr2[iL];
                    n0 n0Var = list.get(f(iL, z11, size));
                    if (z11) {
                        size2 = (i15 - size2) - n0Var.getSize();
                    }
                    n0Var.r(size2, i10, i11);
                    arrayList.add(n0Var);
                    if (iL == iM) {
                        break;
                    }
                    iL += iN;
                }
            }
        } else {
            int size3 = list2.size();
            int iM2 = i14;
            for (int i17 = 0; i17 < size3; i17++) {
                n0 n0Var2 = list2.get(i17);
                iM2 -= n0Var2.m();
                n0Var2.r(iM2, i10, i11);
                arrayList.add(n0Var2);
            }
            int size4 = list.size();
            int iM3 = i14;
            for (int i18 = 0; i18 < size4; i18++) {
                n0 n0Var3 = list.get(i18);
                n0Var3.r(iM3, i10, i11);
                arrayList.add(n0Var3);
                iM3 += n0Var3.m();
            }
            int size5 = list3.size();
            while (i16 < size5) {
                n0 n0Var4 = list3.get(i16);
                n0Var4.r(iM3, i10, i11);
                arrayList.add(n0Var4);
                iM3 += n0Var4.m();
                i16++;
            }
        }
        return arrayList;
    }

    private static final int f(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<n0> g(List<n0> list, p0 p0Var, int i10, int i11, List<Integer> list2, float f10, boolean z10, f0 f0Var) {
        ArrayList arrayList;
        v vVar;
        n0 n0Var;
        n0 n0Var2;
        int iM;
        n0 n0Var3;
        int index;
        int iMin;
        n0 n0Var4;
        n0 n0Var5;
        int i12 = i10 - 1;
        int iMin2 = Math.min(((n0) CollectionsKt.last((List) list)).getIndex() + i11, i12);
        int index2 = ((n0) CollectionsKt.last((List) list)).getIndex() + 1;
        if (index2 <= iMin2) {
            int i13 = index2;
            arrayList = null;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p0.f(p0Var, i13, 0L, 2, null));
                if (i13 == iMin2) {
                    break;
                }
                i13++;
            }
        } else {
            arrayList = null;
        }
        if (z10 && f0Var != null && !f0Var.h().isEmpty()) {
            List<v> listH = f0Var.h();
            int size = listH.size();
            while (true) {
                size--;
                if (-1 >= size) {
                    vVar = null;
                    break;
                }
                if (listH.get(size).getIndex() > iMin2 && (size == 0 || listH.get(size - 1).getIndex() <= iMin2)) {
                    vVar = listH.get(size);
                    break;
                }
            }
            v vVar2 = (v) CollectionsKt.last((List) f0Var.h());
            if (vVar != null && (index = vVar.getIndex()) <= (iMin = Math.min(vVar2.getIndex(), i12))) {
                int i14 = index;
                while (true) {
                    if (arrayList != null) {
                        int size2 = arrayList.size();
                        int i15 = 0;
                        while (true) {
                            if (i15 >= size2) {
                                n0Var5 = null;
                                break;
                            }
                            n0Var5 = arrayList.get(i15);
                            if (n0Var5.getIndex() == i14) {
                                break;
                            }
                            i15++;
                        }
                        n0Var4 = n0Var5;
                    } else {
                        n0Var4 = null;
                    }
                    if (n0Var4 == null) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p0.f(p0Var, i14, 0L, 2, null));
                    }
                    if (i14 == iMin) {
                        break;
                    }
                    i14++;
                }
            }
            float fE = ((f0Var.e() - vVar2.getOffset()) - vVar2.getSize()) - f10;
            if (fE > 0.0f) {
                int index3 = vVar2.getIndex() + 1;
                int i16 = 0;
                while (index3 < i10 && i16 < fE) {
                    if (index3 <= iMin2) {
                        int size3 = list.size();
                        int i17 = 0;
                        while (true) {
                            if (i17 >= size3) {
                                n0Var3 = null;
                                break;
                            }
                            n0Var3 = list.get(i17);
                            if (n0Var3.getIndex() == index3) {
                                break;
                            }
                            i17++;
                        }
                        n0Var = n0Var3;
                    } else if (arrayList != null) {
                        int size4 = arrayList.size();
                        int i18 = 0;
                        while (true) {
                            if (i18 >= size4) {
                                n0Var2 = null;
                                break;
                            }
                            n0Var2 = arrayList.get(i18);
                            if (n0Var2.getIndex() == index3) {
                                break;
                            }
                            i18++;
                        }
                        n0Var = n0Var2;
                    } else {
                        n0Var = null;
                    }
                    if (n0Var != null) {
                        index3++;
                        iM = n0Var.m();
                    } else {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.add(p0.f(p0Var, index3, 0L, 2, null));
                        index3++;
                        iM = ((n0) CollectionsKt.last((List) arrayList)).m();
                    }
                    i16 += iM;
                }
            }
        }
        if (arrayList != null && ((n0) CollectionsKt.last((List) arrayList)).getIndex() > iMin2) {
            iMin2 = ((n0) CollectionsKt.last((List) arrayList)).getIndex();
        }
        int size5 = list2.size();
        for (int i19 = 0; i19 < size5; i19++) {
            int iIntValue = list2.get(i19).intValue();
            if (iIntValue > iMin2) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(p0.f(p0Var, iIntValue, 0L, 2, null));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<n0> h(int i10, p0 p0Var, int i11, List<Integer> list) {
        p0 p0Var2;
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            int i13 = i12;
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                p0Var2 = p0Var;
                arrayList.add(p0.f(p0Var2, i13, 0L, 2, null));
                if (i13 == iMax) {
                    break;
                }
                i13--;
                p0Var = p0Var2;
            }
        } else {
            p0Var2 = p0Var;
        }
        int size = list.size() - 1;
        if (size >= 0) {
            while (true) {
                int i14 = size - 1;
                int iIntValue = list.get(size).intValue();
                if (iIntValue < iMax) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(p0.f(p0Var2, iIntValue, 0L, 2, null));
                }
                if (i14 < 0) {
                    break;
                }
                size = i14;
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:146:0x03e9  */
    /* JADX WARN: Code duplicated, block: B:161:0x043b  */
    @NotNull
    public static final m0 i(int i10, @NotNull final p0 p0Var, int i11, int i12, int i13, int i14, int i15, int i16, float f10, long j10, boolean z10, @Nullable androidx.compose.foundation.layout.q.m mVar, @Nullable androidx.compose.foundation.layout.q.e eVar, boolean z11, @NotNull androidx.compose.ui.unit.d dVar, @NotNull LazyLayoutItemAnimator<n0> lazyLayoutItemAnimator, int i17, @NotNull List<Integer> list, boolean z12, final boolean z13, @Nullable f0 f0Var, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull final n3<Unit> n3Var, @NotNull androidx.compose.ui.graphics.o1 o1Var, @Nullable z2 z2Var, @NotNull pj.n<? super Integer, ? super Integer, ? super Function1<? super i2.a, Unit>, ? extends androidx.compose.ui.layout.b1> nVar) {
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        p0 p0Var2;
        int i23;
        int i24;
        int i25;
        int i26;
        Integer numValueOf;
        if (!(i12 >= 0)) {
            androidx.compose.foundation.internal.e.g("invalid beforeContentPadding");
        }
        if (!(i13 >= 0)) {
            androidx.compose.foundation.internal.e.g("invalid afterContentPadding");
        }
        if (i10 <= 0) {
            int iR = androidx.compose.ui.unit.b.r(j10);
            int iQ = androidx.compose.ui.unit.b.q(j10);
            lazyLayoutItemAnimator.m(0, iR, iQ, new ArrayList(), p0Var.i(), p0Var, z10, z13, 1, z12, 0, 0, s0Var, o1Var);
            if (!z13) {
                long jI = lazyLayoutItemAnimator.i();
                if (!androidx.compose.ui.unit.u.h(jI, androidx.compose.ui.unit.u.f42720b.a())) {
                    iR = androidx.compose.ui.unit.c.i(j10, (int) (jI >> 32));
                    iQ = androidx.compose.ui.unit.c.h(j10, (int) (jI & com.rabbitmq.client.k0.f265952a));
                }
            }
            return new m0(null, 0, false, 0.0f, nVar.invoke(Integer.valueOf(iR), Integer.valueOf(iQ), new Function1() { // from class: androidx.compose.foundation.lazy.h0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return l0.l((i2.a) obj);
                }
            }), 0.0f, false, s0Var, dVar, p0Var.g(), CollectionsKt.emptyList(), -i12, i11 + i13, 0, z11, z10 ? q3.Vertical : q3.Horizontal, i13, i14, null);
        }
        int i27 = i10;
        int i28 = i15;
        if (i28 >= i27) {
            i28 = i27 - 1;
            i18 = 0;
        } else {
            i18 = i16;
        }
        int iRound = Math.round(f10);
        int i29 = i18 - iRound;
        if (i28 == 0 && i29 < 0) {
            iRound += i29;
            i29 = 0;
        }
        int i30 = iRound;
        ArrayDeque arrayDeque = new ArrayDeque();
        int i31 = -i12;
        int i32 = (i14 < 0 ? i14 : 0) + i31;
        int iM = i29 + i32;
        int iMax = 0;
        while (iM < 0 && i28 > 0) {
            int i33 = i28 - 1;
            int i34 = i32;
            n0 n0VarF = p0.f(p0Var, i33, 0L, 2, null);
            arrayDeque.add(0, n0VarF);
            iMax = Math.max(iMax, n0VarF.g());
            iM = n0VarF.m() + iM;
            i28 = i33;
            i32 = i34;
            i31 = i31;
            i30 = i30;
        }
        int i35 = iM;
        int i36 = i30;
        int i37 = i31;
        int i38 = i32;
        int i39 = iMax;
        if (i35 < i38) {
            i20 = i36 - (i38 - i35);
            i19 = i38;
        } else {
            i19 = i35;
            i20 = i36;
        }
        int i40 = i19 - i38;
        int i41 = i11 + i13;
        int iU = kotlin.ranges.r.u(i41, 0);
        int iM2 = -i40;
        int i42 = i28;
        int i43 = 0;
        boolean z14 = false;
        while (i43 < arrayDeque.size()) {
            if (iM2 >= iU) {
                arrayDeque.remove(i43);
                Unit unit = Unit.f312394a;
                z14 = true;
            } else {
                i42++;
                iM2 += ((n0) arrayDeque.get(i43)).m();
                i43++;
            }
        }
        int i44 = i28;
        int i45 = i39;
        int iM3 = i40;
        int i46 = iM2;
        int i47 = i41;
        int i48 = i42;
        while (i48 < i27 && (i46 < iU || i46 <= 0 || arrayDeque.isEmpty())) {
            int i49 = i47;
            int i50 = i46;
            int i51 = iU;
            int i52 = i45;
            int i53 = i44;
            n0 n0VarF2 = p0.f(p0Var, i48, 0L, 2, null);
            int i54 = i48;
            int iM4 = n0VarF2.m() + i50;
            if (iM4 > i38 || i54 == i10 - 1) {
                int iMax2 = Math.max(i52, n0VarF2.g());
                arrayDeque.add(n0VarF2);
                i44 = i53;
                i52 = iMax2;
            } else {
                iM3 -= n0VarF2.m();
                Unit unit2 = Unit.f312394a;
                i44 = i54 + 1;
                z14 = true;
            }
            i46 = iM4;
            i47 = i49;
            iU = i51;
            i48 = i54 + 1;
            i45 = i52;
            i27 = i10;
        }
        int iMax3 = i45;
        int i55 = i48;
        int i56 = i47;
        int i57 = i44;
        int i58 = i46;
        if (i58 < i11) {
            int i59 = i11 - i58;
            iM3 -= i59;
            i58 += i59;
            i23 = i57;
            while (iM3 < i12 && i23 > 0) {
                i23--;
                n0 n0VarF3 = p0.f(p0Var, i23, 0L, 2, null);
                arrayDeque.add(0, n0VarF3);
                iMax3 = Math.max(iMax3, n0VarF3.g());
                iM3 += n0VarF3.m();
                i55 = i55;
            }
            i21 = i55;
            i22 = 0;
            p0Var2 = p0Var;
            i24 = i59 + i20;
            if (iM3 < 0) {
                i24 += iM3;
                i58 += iM3;
                iM3 = 0;
            }
        } else {
            i21 = i55;
            i22 = 0;
            p0Var2 = p0Var;
            i23 = i57;
            i24 = i20;
        }
        float f11 = (kotlin.math.b.U(Math.round(f10)) != kotlin.math.b.U(i24) || Math.abs(Math.round(f10)) < Math.abs(i24)) ? f10 : i24;
        float f12 = f10 - f11;
        float f13 = 0.0f;
        if (z13 && i24 > i20 && f12 <= 0.0f) {
            f13 = (i24 - i20) + f12;
        }
        float f14 = f13;
        if ((iM3 >= 0 ? 1 : i22) == 0) {
            androidx.compose.foundation.internal.e.g("negative currentFirstItemScrollOffset");
        }
        int i60 = -iM3;
        n0 n0Var = (n0) arrayDeque.first();
        if (i12 <= 0 && i14 >= 0) {
            i25 = i60;
            break;
        }
        int size = arrayDeque.size();
        while (true) {
            if (i22 >= size) {
                i25 = i60;
                break;
            }
            i25 = i60;
            int iM5 = ((n0) arrayDeque.get(i22)).m();
            if (iM3 == 0 || iM5 > iM3 || i22 == CollectionsKt.getLastIndex(arrayDeque)) {
                break;
            }
            iM3 -= iM5;
            i22++;
            n0Var = (n0) arrayDeque.get(i22);
            i60 = i25;
        }
        int i61 = iM3;
        n0 n0Var2 = n0Var;
        List<n0> listH = h(i23, p0Var2, i17, list);
        int size2 = listH.size();
        int i62 = 0;
        while (i62 < size2) {
            iMax3 = Math.max(iMax3, listH.get(i62).g());
            i62++;
            p0Var2 = p0Var;
        }
        List<n0> listG = g(arrayDeque, p0Var2, i10, i17, list, f11, z13, f0Var);
        int size3 = listG.size();
        int iMax4 = iMax3;
        for (int i63 = 0; i63 < size3; i63++) {
            iMax4 = Math.max(iMax4, listG.get(i63).g());
        }
        boolean z15 = Intrinsics.areEqual(n0Var2, arrayDeque.first()) && listH.isEmpty() && listG.isEmpty();
        int i64 = androidx.compose.ui.unit.c.i(j10, z10 ? iMax4 : i58);
        if (z10) {
            iMax4 = i58;
        }
        int iH = androidx.compose.ui.unit.c.h(j10, iMax4);
        float f15 = f11;
        int i65 = i58;
        final List<n0> listE = e(arrayDeque, listH, listG, i64, iH, i65, i11, i25, z10, mVar, eVar, z11, dVar);
        int i66 = i64;
        lazyLayoutItemAnimator.m((int) f15, i66, iH, listE, p0Var.i(), p0Var, z10, z13, 1, z12, i61, i65, s0Var, o1Var);
        if (z13) {
            i26 = iH;
        } else {
            long jI2 = lazyLayoutItemAnimator.i();
            if (androidx.compose.ui.unit.u.h(jI2, androidx.compose.ui.unit.u.f42720b.a())) {
                i26 = iH;
            } else {
                int i67 = z10 ? iH : i66;
                i66 = androidx.compose.ui.unit.c.i(j10, Math.max(i66, (int) (jI2 >> 32)));
                int iH2 = androidx.compose.ui.unit.c.h(j10, Math.max(iH, (int) (jI2 & com.rabbitmq.client.k0.f265952a)));
                int i68 = z10 ? iH2 : i66;
                if (i68 != i67) {
                    int size4 = listE.size();
                    for (int i69 = 0; i69 < size4; i69++) {
                        listE.get(i69).s(i68);
                    }
                }
                i26 = iH2;
            }
        }
        int i70 = i66;
        n0 n0Var3 = (n0) arrayDeque.firstOrNull();
        int index = n0Var3 != null ? n0Var3.getIndex() : 0;
        n0 n0Var4 = (n0) arrayDeque.lastOrNull();
        final List listB = y1.b(z2Var, index, n0Var4 != null ? n0Var4.getIndex() : 0, listE, p0Var.h(), i12, i13, i70, i26, new Function1() { // from class: androidx.compose.foundation.lazy.i0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.m(p0Var, ((Integer) obj).intValue());
            }
        });
        Integer numValueOf2 = null;
        if (z15) {
            n0 n0Var5 = (n0) CollectionsKt.firstOrNull((List) listE);
            if (n0Var5 != null) {
                numValueOf = Integer.valueOf(n0Var5.getIndex());
            } else {
                numValueOf = null;
            }
        } else {
            n0 n0Var6 = (n0) arrayDeque.firstOrNull();
            if (n0Var6 != null) {
                numValueOf = Integer.valueOf(n0Var6.getIndex());
            } else {
                numValueOf = null;
            }
        }
        if (z15) {
            n0 n0Var7 = (n0) CollectionsKt.lastOrNull((List) listE);
            if (n0Var7 != null) {
                numValueOf2 = Integer.valueOf(n0Var7.getIndex());
            }
        } else {
            n0 n0Var8 = (n0) arrayDeque.lastOrNull();
            if (n0Var8 != null) {
                numValueOf2 = Integer.valueOf(n0Var8.getIndex());
            }
        }
        return new m0(n0Var2, i61, i21 < i10 || i65 > i11, f15, nVar.invoke(Integer.valueOf(i70), Integer.valueOf(i26), new Function1() { // from class: androidx.compose.foundation.lazy.j0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.j(n3Var, listE, listB, z13, (i2.a) obj);
            }
        }), f14, z14, s0Var, dVar, p0Var.g(), androidx.compose.foundation.lazy.layout.a1.d(numValueOf != null ? numValueOf.intValue() : 0, numValueOf2 != null ? numValueOf2.intValue() : 0, listE, listB), i37, i56, i10, z11, z10 ? q3.Vertical : q3.Horizontal, i13, i14, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(n3 n3Var, final List list, final List list2, final boolean z10, i2.a aVar) {
        aVar.K0(new Function1() { // from class: androidx.compose.foundation.lazy.k0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l0.k(list, list2, z10, (i2.a) obj);
            }
        });
        n2.a(n3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(List list, List list2, boolean z10, i2.a aVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((n0) list.get(i10)).q(aVar, z10);
        }
        int size2 = list2.size();
        for (int i11 = 0; i11 < size2; i11++) {
            ((n0) list2.get(i11)).q(aVar, z10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0 m(p0 p0Var, int i10) {
        return p0.f(p0Var, i10, 0L, 2, null);
    }
}
