package androidx.compose.foundation.pager;

import androidx.collection.t1;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.runtime.n3;
import androidx.compose.ui.layout.i2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerMeasure.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n+ 2 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,720:1\n716#1,4:729\n716#1,4:733\n716#1,4:737\n716#1,4:741\n716#1,4:745\n716#1,4:749\n716#1,4:791\n97#2,4:721\n97#2,4:725\n97#2,4:753\n51#2,4:818\n97#2,4:822\n35#3,5:757\n35#3,5:762\n231#3,2:767\n35#3,5:769\n233#3:774\n231#3,2:775\n35#3,5:777\n233#3:782\n231#3,2:783\n35#3,5:785\n233#3:790\n35#3,5:795\n35#3,5:800\n169#3,12:805\n35#3,5:826\n35#3,5:831\n35#3,5:836\n35#3,5:841\n1#4:817\n*S KotlinDebug\n*F\n+ 1 PagerMeasure.kt\nandroidx/compose/foundation/pager/PagerMeasureKt\n*L\n75#1:729,4\n143#1:733,4\n164#1:737,4\n186#1:741,4\n225#1:745,4\n250#1:749,4\n465#1:791,4\n69#1:721,4\n70#1:725,4\n308#1:753,4\n644#1:818,4\n652#1:822,4\n356#1:757,5\n382#1:762,5\n419#1:767,2\n419#1:769,5\n419#1:774\n426#1:775,2\n426#1:777,5\n426#1:782\n430#1:783,2\n430#1:785,5\n430#1:790\n525#1:795,5\n550#1:800,5\n569#1:805,12\n690#1:826,5\n697#1:831,5\n703#1:836,5\n483#1:841,5\n*E\n"})
public final class r0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f18425a = -0.5f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f18426b = 0.5f;

    private static final m f(int i10, List<m> list, int i11, int i12, int i13, androidx.compose.foundation.gestures.snapping.o oVar, int i14) {
        m mVar;
        if (list.isEmpty()) {
            mVar = null;
        } else {
            m mVar2 = list.get(0);
            m mVar3 = mVar2;
            float f10 = -Math.abs(androidx.compose.foundation.gestures.snapping.p.a(i10, i11, i12, i13, mVar3.getOffset(), mVar3.getIndex(), oVar, i14));
            int lastIndex = CollectionsKt.getLastIndex(list);
            if (1 <= lastIndex) {
                int i15 = 1;
                while (true) {
                    m mVar4 = list.get(i15);
                    m mVar5 = mVar4;
                    float f11 = -Math.abs(androidx.compose.foundation.gestures.snapping.p.a(i10, i11, i12, i13, mVar5.getOffset(), mVar5.getIndex(), oVar, i14));
                    if (Float.compare(f10, f11) < 0) {
                        f10 = f11;
                        mVar2 = mVar4;
                    }
                    if (i15 == lastIndex) {
                        break;
                    }
                    i15++;
                }
            }
            mVar = mVar2;
        }
        return mVar;
    }

    private static final List<m> g(androidx.compose.foundation.lazy.layout.w0 w0Var, List<m> list, List<m> list2, List<m> list3, int i10, int i11, int i12, int i13, int i14, q3 q3Var, boolean z10, androidx.compose.ui.unit.d dVar, int i15, int i16) {
        ArrayList arrayList;
        int i17 = i14;
        int i18 = i16 + i15;
        int i19 = q3Var == q3.Vertical ? i11 : i10;
        int i20 = 0;
        boolean z11 = i12 < Math.min(i19, i13);
        if (z11) {
            if (!(i17 == 0)) {
                androidx.compose.foundation.internal.e.i("non-zero pagesScrollOffset=" + i17);
            }
        }
        ArrayList arrayList2 = new ArrayList(list.size() + list2.size() + list3.size());
        if (z11) {
            if (!(list2.isEmpty() && list3.isEmpty())) {
                androidx.compose.foundation.internal.e.g("No extra pages");
            }
            int size = list.size();
            int[] iArr = new int[size];
            while (i20 < size) {
                iArr[i20] = i16;
                i20++;
            }
            int[] iArr2 = new int[size];
            androidx.compose.foundation.layout.q.f fVarR = androidx.compose.foundation.layout.q.a.f16340a.r(w0Var.D3(i15));
            if (q3Var == q3.Vertical) {
                fVarR.arrange(dVar, i19, iArr, iArr2);
                arrayList = arrayList2;
            } else {
                arrayList = arrayList2;
                fVarR.c(dVar, i19, iArr, androidx.compose.ui.unit.w.Ltr, iArr2);
            }
            kotlin.ranges.j indices = ArraysKt.getIndices(iArr2);
            if (z10) {
                indices = kotlin.ranges.r.q1(indices);
            }
            int iL = indices.l();
            int iM = indices.m();
            int iN = indices.n();
            if ((iN > 0 && iL <= iM) || (iN < 0 && iM <= iL)) {
                while (true) {
                    int iF = iArr2[iL];
                    m mVar = list.get(h(iL, z10, size));
                    if (z10) {
                        iF = (i19 - iF) - mVar.f();
                    }
                    mVar.h(iF, i10, i11);
                    arrayList.add(mVar);
                    if (iL == iM) {
                        break;
                    }
                    iL += iN;
                }
            }
        } else {
            arrayList = arrayList2;
            int size2 = list2.size();
            int i21 = i17;
            for (int i22 = 0; i22 < size2; i22++) {
                m mVar2 = list2.get(i22);
                i21 -= i18;
                mVar2.h(i21, i10, i11);
                arrayList.add(mVar2);
            }
            int size3 = list.size();
            for (int i23 = 0; i23 < size3; i23++) {
                m mVar3 = list.get(i23);
                mVar3.h(i17, i10, i11);
                arrayList.add(mVar3);
                i17 += i18;
            }
            int size4 = list3.size();
            while (i20 < size4) {
                m mVar4 = list3.get(i20);
                mVar4.h(i17, i10, i11);
                arrayList.add(mVar4);
                i17 += i18;
                i20++;
            }
        }
        return arrayList;
    }

    private static final int h(int i10, boolean z10, int i11) {
        return !z10 ? i10 : (i11 - i10) - 1;
    }

    private static final List<m> i(int i10, int i11, int i12, List<Integer> list, Function1<? super Integer, m> function1) {
        int iMin = Math.min(i12, (i11 - i10) - 1) + i10;
        int i13 = i10 + 1;
        ArrayList arrayList = null;
        if (i13 <= iMin) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i13)));
                if (i13 == iMin) {
                    break;
                }
                i13++;
            }
        }
        int size = list.size();
        for (int i14 = 0; i14 < size; i14++) {
            int iIntValue = list.get(i14).intValue();
            if (iMin + 1 <= iIntValue && iIntValue < i11) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final List<m> j(int i10, int i11, List<Integer> list, Function1<? super Integer, m> function1) {
        int iMax = Math.max(0, i10 - i11);
        int i12 = i10 - 1;
        ArrayList arrayList = null;
        if (iMax <= i12) {
            while (true) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(i12)));
                if (i12 == iMax) {
                    break;
                }
                i12--;
            }
        }
        int size = list.size();
        for (int i13 = 0; i13 < size; i13++) {
            int iIntValue = list.get(i13).intValue();
            if (iIntValue < iMax) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(function1.invoke(Integer.valueOf(iIntValue)));
            }
        }
        return arrayList == null ? CollectionsKt.emptyList() : arrayList;
    }

    private static final void k(Function0<String> function0) {
    }

    private static final m l(androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, long j10, l0 l0Var, long j11, q3 q3Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, androidx.compose.ui.unit.w wVar, boolean z10, int i11, t1<List<i2>> t1Var) {
        List<i2> list;
        Object objD = l0Var.d(i10);
        List<i2> listN = t1Var.n(i10);
        if (listN != null) {
            list = listN;
        } else {
            List<androidx.compose.ui.layout.z0> listG8 = w0Var.g8(i10);
            int size = listG8.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i12 = 0; i12 < size; i12++) {
                arrayList.add(listG8.get(i12).P0(j10));
            }
            t1Var.j0(i10, arrayList);
            list = arrayList;
        }
        return new m(i10, i11, list, j11, objD, q3Var, bVar, cVar, wVar, z10, null);
    }

    @NotNull
    public static final u0 m(@NotNull final androidx.compose.foundation.lazy.layout.w0 w0Var, int i10, @NotNull final l0 l0Var, int i11, int i12, int i13, int i14, int i15, int i16, long j10, @NotNull final q3 q3Var, @Nullable final androidx.compose.ui.e.c cVar, @Nullable final androidx.compose.ui.e.b bVar, final boolean z10, final long j11, final int i17, int i18, @NotNull List<Integer> list, @NotNull androidx.compose.foundation.gestures.snapping.o oVar, @NotNull final n3<Unit> n3Var, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull pj.n<? super Integer, ? super Integer, ? super Function1<? super i2.a, Unit>, ? extends androidx.compose.ui.layout.b1> nVar, @NotNull final t1<List<i2>> t1Var) {
        int i19;
        boolean z11;
        int iMax;
        int i20;
        int i21;
        int i22;
        List<m> arrayList;
        List arrayList2;
        List arrayList3;
        int i23;
        if (!(i12 >= 0)) {
            androidx.compose.foundation.internal.e.g("negative beforeContentPadding");
        }
        if (!(i13 >= 0)) {
            androidx.compose.foundation.internal.e.g("negative afterContentPadding");
        }
        int iU = kotlin.ranges.r.u(i17 + i14, 0);
        int iB = kotlin.ranges.r.B(i18, i10);
        if (i10 <= 0) {
            return new u0(CollectionsKt.emptyList(), i17, i14, i13, q3Var, -i12, i11 + i13, false, iB, null, null, 0.0f, 0, false, oVar, nVar.invoke(Integer.valueOf(androidx.compose.ui.unit.b.r(j10)), Integer.valueOf(androidx.compose.ui.unit.b.q(j10)), new Function1() { // from class: androidx.compose.foundation.pager.m0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return r0.r((i2.a) obj);
                }
            }), false, null, null, s0Var, 393216, null);
        }
        q3 q3Var2 = q3Var;
        q3 q3Var3 = q3.Vertical;
        final long jB = androidx.compose.ui.unit.c.b(0, q3Var2 == q3Var3 ? androidx.compose.ui.unit.b.p(j10) : i17, 0, q3Var2 != q3Var3 ? androidx.compose.ui.unit.b.o(j10) : i17, 5, null);
        int i24 = i15;
        int i25 = i16;
        while (i24 > 0 && i25 > 0) {
            i24--;
            i25 -= iU;
        }
        int i26 = i25 * (-1);
        if (i24 >= i10) {
            i24 = i10 - 1;
            i26 = 0;
        }
        ArrayDeque arrayDeque = new ArrayDeque();
        int i27 = -i12;
        int i28 = (i14 < 0 ? i14 : 0) + i27;
        int i29 = i26 + i28;
        int iMax2 = 0;
        while (i29 < 0 && i24 > 0) {
            int i30 = i24 - 1;
            m mVarL = l(w0Var, i30, jB, l0Var, j11, q3Var2, bVar, cVar, w0Var.getLayoutDirection(), z10, i17, t1Var);
            arrayDeque.add(0, mVarL);
            iMax2 = Math.max(iMax2, mVarL.c());
            i29 += iU;
            i28 = i28;
            i24 = i30;
            q3Var2 = q3Var;
        }
        int i31 = i28;
        int i32 = iMax2;
        if (i29 < i31) {
            i29 = i31;
        }
        int i33 = i29 - i31;
        int i34 = i11 + i13;
        int i35 = i24;
        int iU2 = kotlin.ranges.r.u(i34, 0);
        int i36 = -i33;
        int i37 = i35;
        int i38 = 0;
        boolean z12 = false;
        while (i38 < arrayDeque.size()) {
            if (i36 >= iU2) {
                arrayDeque.remove(i38);
                Unit unit = Unit.f312394a;
                z12 = true;
            } else {
                i37++;
                i36 += iU;
                i38++;
            }
        }
        int i39 = i33;
        int iMax3 = i32;
        int i40 = i37;
        boolean z13 = z12;
        while (i40 < i10 && (i36 < iU2 || i36 <= 0 || arrayDeque.isEmpty())) {
            int i41 = iU2;
            int i42 = i40;
            m mVarL2 = l(w0Var, i42, jB, l0Var, j11, q3Var, bVar, cVar, w0Var.getLayoutDirection(), z10, i17, t1Var);
            int i43 = i39;
            int i44 = i10 - 1;
            i36 += i42 == i44 ? i17 : iU;
            if (i36 > i31 || i42 == i44) {
                iMax3 = Math.max(iMax3, mVarL2.c());
                arrayDeque.add(mVarL2);
                i23 = i35;
                i39 = i43;
            } else {
                i23 = i42 + 1;
                i39 = i43 - iU;
                Unit unit2 = Unit.f312394a;
                z13 = true;
            }
            i40 = i42 + 1;
            i35 = i23;
            iU2 = i41;
        }
        int i45 = i39;
        if (i36 < i11) {
            int i46 = i11 - i36;
            i20 = i45 - i46;
            i36 += i46;
            iMax = iMax3;
            i21 = i35;
            while (i20 < i12 && i21 > 0) {
                int i47 = i21 - 1;
                m mVarL3 = l(w0Var, i47, jB, l0Var, j11, q3Var, bVar, cVar, w0Var.getLayoutDirection(), z10, i17, t1Var);
                arrayDeque.add(0, mVarL3);
                iMax = Math.max(iMax, mVarL3.c());
                i20 += iU;
                i40 = i40;
                i21 = i47;
            }
            i19 = i40;
            z11 = false;
            if (i20 < 0) {
                i36 += i20;
                i20 = 0;
            }
        } else {
            i19 = i40;
            z11 = false;
            iMax = iMax3;
            i20 = i45;
            i21 = i35;
        }
        if (!(i20 >= 0 ? true : z11)) {
            androidx.compose.foundation.internal.e.g("invalid currentFirstPageScrollOffset");
        }
        int i48 = iMax;
        int i49 = -i20;
        m mVar = (m) arrayDeque.first();
        if (i12 > 0 || i14 < 0) {
            int size = arrayDeque.size();
            i22 = i49;
            int i50 = 0;
            while (i50 < size && i20 != 0 && iU <= i20 && i50 != CollectionsKt.getLastIndex(arrayDeque)) {
                i20 -= iU;
                i50++;
                mVar = (m) arrayDeque.get(i50);
            }
        } else {
            i22 = i49;
        }
        int i51 = i20;
        m mVar2 = mVar;
        List<m> listJ = j(i21, iB, list, new Function1() { // from class: androidx.compose.foundation.pager.n0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r0.n(w0Var, jB, l0Var, j11, q3Var, bVar, cVar, z10, i17, t1Var, ((Integer) obj).intValue());
            }
        });
        int iMax4 = i48;
        int i52 = 0;
        for (int size2 = listJ.size(); i52 < size2; size2 = size2) {
            iMax4 = Math.max(iMax4, listJ.get(i52).c());
            i52++;
        }
        List<m> listI = i(((m) arrayDeque.last()).getIndex(), i10, iB, list, new Function1() { // from class: androidx.compose.foundation.pager.o0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r0.o(w0Var, jB, l0Var, j11, q3Var, bVar, cVar, z10, i17, t1Var, ((Integer) obj).intValue());
            }
        });
        int size3 = listI.size();
        int iMax5 = iMax4;
        for (int i53 = 0; i53 < size3; i53++) {
            iMax5 = Math.max(iMax5, listI.get(i53).c());
        }
        boolean z14 = Intrinsics.areEqual(mVar2, arrayDeque.first()) && listJ.isEmpty() && listI.isEmpty();
        q3 q3Var4 = q3.Vertical;
        int i54 = androidx.compose.ui.unit.c.i(j10, q3Var == q3Var4 ? iMax5 : i36);
        if (q3Var == q3Var4) {
            iMax5 = i36;
        }
        int iH = androidx.compose.ui.unit.c.h(j10, iMax5);
        int i55 = iU;
        int i56 = i19;
        int i57 = i36;
        final List<m> listG = g(w0Var, arrayDeque, listJ, listI, i54, iH, i57, i11, i22, q3Var, z10, w0Var, i14, i17);
        if (z14) {
            arrayList = listG;
        } else {
            arrayList = new ArrayList<>(listG.size());
            int size4 = listG.size();
            int i58 = 0;
            while (i58 < size4) {
                m mVar3 = listG.get(i58);
                m mVar4 = mVar3;
                int i59 = i55;
                int i60 = i56;
                if (mVar4.getIndex() >= ((m) arrayDeque.first()).getIndex() && mVar4.getIndex() <= ((m) arrayDeque.last()).getIndex()) {
                    arrayList.add(mVar3);
                }
                i58++;
                i55 = i59;
                i56 = i60;
            }
        }
        int i61 = i55;
        int i62 = i56;
        if (listJ.isEmpty()) {
            arrayList2 = CollectionsKt.emptyList();
        } else {
            arrayList2 = new ArrayList(listG.size());
            int size5 = listG.size();
            for (int i63 = 0; i63 < size5; i63++) {
                m mVar5 = listG.get(i63);
                if (mVar5.getIndex() < ((m) arrayDeque.first()).getIndex()) {
                    arrayList2.add(mVar5);
                }
            }
        }
        List list2 = arrayList2;
        if (listI.isEmpty()) {
            arrayList3 = CollectionsKt.emptyList();
        } else {
            arrayList3 = new ArrayList(listG.size());
            int size6 = listG.size();
            for (int i64 = 0; i64 < size6; i64++) {
                m mVar6 = listG.get(i64);
                if (mVar6.getIndex() > ((m) arrayDeque.last()).getIndex()) {
                    arrayList3.add(mVar6);
                }
            }
        }
        List list3 = arrayList3;
        int i65 = i11 + i12 + i13;
        m mVarF = f(i65, arrayList, i12, i13, i17, oVar, i10);
        return new u0(arrayList, i17, i14, i13, q3Var, i27, i34, z10, iB, mVar2, mVarF, i61 == 0 ? 0.0f : kotlin.ranges.r.H((oVar.a(i65, i17, i12, i13, mVarF != null ? mVarF.getIndex() : 0, i10) - (mVarF != null ? mVarF.getOffset() : 0)) / i61, -0.5f, 0.5f), i51, i62 < i10 || i57 > i11, oVar, nVar.invoke(Integer.valueOf(i54), Integer.valueOf(iH), new Function1() { // from class: androidx.compose.foundation.pager.p0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r0.p(n3Var, listG, (i2.a) obj);
            }
        }), z13, list2, list3, s0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m n(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10, l0 l0Var, long j11, q3 q3Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, boolean z10, int i10, t1 t1Var, int i11) {
        return l(w0Var, i11, j10, l0Var, j11, q3Var, bVar, cVar, w0Var.getLayoutDirection(), z10, i10, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m o(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10, l0 l0Var, long j11, q3 q3Var, androidx.compose.ui.e.b bVar, androidx.compose.ui.e.c cVar, boolean z10, int i10, t1 t1Var, int i11) {
        return l(w0Var, i11, j10, l0Var, j11, q3Var, bVar, cVar, w0Var.getLayoutDirection(), z10, i10, t1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(n3 n3Var, final List list, i2.a aVar) {
        aVar.K0(new Function1() { // from class: androidx.compose.foundation.pager.q0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return r0.q(list, (i2.a) obj);
            }
        });
        n2.a(n3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(List list, i2.a aVar) {
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((m) list.get(i10)).g(aVar);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(i2.a aVar) {
        return Unit.f312394a;
    }
}
