package androidx.compose.foundation.layout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVectorKt\n+ 9 RowColumnImpl.kt\nandroidx/compose/foundation/layout/OrientationIndependentConstraints\n+ 10 IntList.kt\nandroidx/collection/IntListKt\n+ 11 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 12 IntList.kt\nandroidx/collection/IntList\n+ 13 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1585:1\n1085#1,111:1724\n1282#2,6:1586\n1282#2,6:1592\n1282#2,6:1603\n1282#2,6:1640\n1282#2,6:1646\n1282#2,6:1657\n1282#2,6:1694\n1282#2,6:1700\n1282#2,6:1706\n1282#2,6:1712\n166#3,5:1598\n80#3,6:1609\n87#3,3:1624\n90#3,2:1633\n94#3:1638\n172#3:1639\n166#3,5:1652\n80#3,6:1663\n87#3,3:1678\n90#3,2:1687\n94#3:1692\n172#3:1693\n391#4,9:1615\n400#4,3:1635\n391#4,9:1669\n400#4,3:1689\n4360#5,6:1627\n4360#5,6:1681\n71#6,5:1718\n1#7:1723\n1107#8:1835\n1085#8,2:1836\n213#9:1838\n210#9:1839\n219#9:1840\n219#9:1853\n219#9:1854\n216#9:1855\n213#9:1856\n216#9,4:1859\n216#9,4:1873\n210#9,4:1887\n905#10:1841\n905#10:1842\n105#11:1843\n105#11:1844\n101#11,10:1863\n101#11,10:1877\n101#11,10:1891\n70#12:1845\n65#12:1846\n65#12:1847\n65#12:1848\n251#12,4:1849\n256#12:1857\n516#13:1858\n424#13,8:1901\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n*L\n1057#1:1724,111\n101#1:1586,6\n112#1:1592,6\n119#1:1603,6\n215#1:1640,6\n226#1:1646,6\n232#1:1657,6\n441#1:1694,6\n472#1:1700,6\n502#1:1706,6\n530#1:1712,6\n119#1:1598,5\n119#1:1609,6\n119#1:1624,3\n119#1:1633,2\n119#1:1638\n119#1:1639\n232#1:1652,5\n232#1:1663,6\n232#1:1678,3\n232#1:1687,2\n232#1:1692\n232#1:1693\n119#1:1615,9\n119#1:1635,3\n232#1:1669,9\n232#1:1689,3\n119#1:1627,6\n232#1:1681,6\n935#1:1718,5\n1213#1:1835\n1213#1:1836,2\n1214#1:1838\n1215#1:1839\n1216#1:1840\n1429#1:1853\n1430#1:1854\n1435#1:1855\n1436#1:1856\n1555#1:1859,4\n1563#1:1873,4\n1569#1:1887,4\n1261#1:1841\n1262#1:1842\n1333#1:1843\n1343#1:1844\n1555#1:1863,10\n1563#1:1877,10\n1569#1:1891,10\n1406#1:1845\n1408#1:1846\n1419#1:1847\n1420#1:1848\n1424#1:1849,4\n1424#1:1857\n1462#1:1858\n1582#1:1901,8\n*E\n"})
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final k1 f16427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final k1 f16428b;

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<i2, androidx.compose.runtime.c0, Integer, Unit> f16429a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super i2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f16429a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1720407857, i10, -1, "androidx.compose.foundation.layout.FlowColumn.<anonymous>.<anonymous> (FlowLayout.kt:227)");
            }
            this.f16429a.invoke(j2.f16141b, c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<s3, androidx.compose.runtime.c0, Integer, Unit> f16430a;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super s3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f16430a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1192950673, i10, -1, "androidx.compose.foundation.layout.FlowRow.<anonymous>.<anonymous> (FlowLayout.kt:113)");
            }
            this.f16430a.invoke(t3.f16433b, c0Var, 6);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$columnMeasurementHelper$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1585:1\n1#2:1586\n*E\n"})
    static final class c implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ j3 f16431a;

        c(j3 j3Var) {
            this.f16431a = j3Var;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            return this.f16431a.a(c1Var, CollectionsKt.listOf(list), j10);
        }
    }

    @SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt$rowMeasurementHelper$1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1585:1\n1#2:1586\n*E\n"})
    static final class d implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.layout.h1 f16432a;

        d(androidx.compose.ui.layout.h1 h1Var) {
            this.f16432a = h1Var;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            return this.f16432a.a(c1Var, CollectionsKt.listOf(list), j10);
        }
    }

    static {
        k1.c cVar = k1.f16162a;
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        f16427a = cVar.j(aVar.w());
        f16428b = cVar.i(aVar.u());
    }

    public static final int A(@NotNull androidx.compose.ui.layout.y yVar, boolean z10, int i10) {
        return z10 ? yVar.L0(i10) : yVar.D0(i10);
    }

    private static final int B(List<? extends androidx.compose.ui.layout.y> list, pj.n<? super androidx.compose.ui.layout.y, ? super Integer, ? super Integer, Integer> nVar, int i10, int i11, int i12) {
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iIntValue = nVar.invoke(list.get(i13), Integer.valueOf(i13), Integer.valueOf(i10)).intValue() + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iIntValue) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iIntValue;
            }
            i13 = i16;
        }
        return iMax;
    }

    public static final long C(@NotNull androidx.compose.ui.layout.z0 z0Var, @NotNull b3 b3Var, long j10, @NotNull Function1<? super androidx.compose.ui.layout.i2, Unit> function1) {
        l2 l2VarI;
        if (q5.e(q5.c(z0Var)) == 0.0f) {
            t5 t5VarC = q5.c(z0Var);
            if (((t5VarC == null || (l2VarI = t5VarC.i()) == null) ? null : Float.valueOf(l2VarI.d())) == null) {
                androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(j10);
                function1.invoke(i2VarP0);
                return androidx.collection.e0.d(b3Var.k(i2VarP0), b3Var.h(i2VarP0));
            }
        }
        int iA = A(z0Var, b3Var.i(), Integer.MAX_VALUE);
        return androidx.collection.e0.d(iA, v(z0Var, b3Var.i(), iA));
    }

    private static final int D(List<? extends androidx.compose.ui.layout.y> list, pj.n<? super androidx.compose.ui.layout.y, ? super Integer, ? super Integer, Integer> nVar, pj.n<? super androidx.compose.ui.layout.y, ? super Integer, ? super Integer, Integer> nVar2, int i10, int i11, int i12, int i13, int i14, y2 y2Var) {
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int i15 = i13;
        int i16 = i14;
        if (list2.isEmpty()) {
            return 0;
        }
        int size = list2.size();
        int[] iArr = new int[size];
        int size2 = list2.size();
        int[] iArr2 = new int[size2];
        int size3 = list2.size();
        for (int i17 = 0; i17 < size3; i17++) {
            androidx.compose.ui.layout.y yVar = list2.get(i17);
            int iIntValue = nVar.invoke(yVar, Integer.valueOf(i17), Integer.valueOf(i10)).intValue();
            iArr[i17] = iIntValue;
            iArr2[i17] = nVar2.invoke(yVar, Integer.valueOf(i17), Integer.valueOf(iIntValue)).intValue();
        }
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int i19 = 1;
        int iMin = Math.min(i18 - (((i18 >= list2.size() || !(y2Var.p() == u2.a.ExpandIndicator || y2Var.p() == u2.a.ExpandOrCollapseIndicator)) && (i18 < list2.size() || i16 < y2Var.m() || y2Var.p() != u2.a.ExpandOrCollapseIndicator)) ? 0 : 1), list2.size());
        int iSum = ArraysKt.sum(iArr) + ((list2.size() - 1) * i11);
        if (size2 == 0) {
            throw new NoSuchElementException();
        }
        int iH = iArr2[0];
        int lastIndex = ArraysKt.getLastIndex(iArr2);
        if (1 <= lastIndex) {
            int i20 = 1;
            while (true) {
                int i21 = iArr2[i20];
                if (iH < i21) {
                    iH = i21;
                }
                if (i20 == lastIndex) {
                    break;
                }
                i20++;
            }
        }
        if (size == 0) {
            throw new NoSuchElementException();
        }
        int i22 = iArr[0];
        int lastIndex2 = ArraysKt.getLastIndex(iArr);
        if (1 <= lastIndex2) {
            while (true) {
                int i23 = iArr[i19];
                if (i22 < i23) {
                    i22 = i23;
                }
                if (i19 == lastIndex2) {
                    break;
                }
                i19++;
            }
        }
        int i24 = i22;
        int i25 = iSum;
        while (i24 <= i25 && iH != i10) {
            int i26 = (i24 + i25) / 2;
            long jZ = z(list2, iArr, iArr2, i26, i11, i12, i15, i16, y2Var);
            iH = androidx.collection.e0.h(jZ);
            int i27 = androidx.collection.e0.i(jZ);
            if (iH > i10 || i27 < iMin) {
                i24 = i26 + 1;
                if (i24 > i25) {
                    return i24;
                }
            } else {
                if (iH >= i10) {
                    return i26;
                }
                i25 = i26 - 1;
            }
            list2 = list;
            i15 = i13;
            i16 = i14;
            iSum = i26;
        }
        return iSum;
    }

    @NotNull
    public static final androidx.compose.ui.layout.b1 E(@NotNull androidx.compose.ui.layout.c1 c1Var, long j10, int i10, int i11, @NotNull int[] iArr, @NotNull final androidx.compose.runtime.collection.d<androidx.compose.ui.layout.b1> dVar, @NotNull b3 b3Var, @NotNull int[] iArr2) {
        int iO;
        int i12;
        int i13;
        boolean zI = b3Var.i();
        q.m mVarQ = b3Var.q();
        q.e eVarU = b3Var.u();
        if (zI) {
            int iG6 = i11 + (c1Var.g6(mVarQ.a()) * (dVar.R() - 1));
            int iQ = androidx.compose.ui.unit.b.q(j10);
            iO = androidx.compose.ui.unit.b.o(j10);
            if (iG6 < iQ) {
                iG6 = iQ;
            }
            if (iG6 <= iO) {
                iO = iG6;
            }
            mVarQ.arrange(c1Var, iO, iArr, iArr2);
        } else {
            int iG7 = i11 + (c1Var.g6(eVarU.a()) * (dVar.R() - 1));
            int iQ2 = androidx.compose.ui.unit.b.q(j10);
            int iO2 = androidx.compose.ui.unit.b.o(j10);
            if (iG7 < iQ2) {
                iG7 = iQ2;
            }
            int i14 = iG7 > iO2 ? iO2 : iG7;
            eVarU.c(c1Var, i14, iArr, c1Var.getLayoutDirection(), iArr2);
            iO = i14;
        }
        int iR = androidx.compose.ui.unit.b.r(j10);
        int iP = androidx.compose.ui.unit.b.p(j10);
        if (i10 < iR) {
            i10 = iR;
        }
        if (i10 <= iP) {
            iP = i10;
        }
        if (zI) {
            i13 = iP;
            i12 = iO;
        } else {
            i12 = iP;
            i13 = iO;
        }
        return androidx.compose.ui.layout.c1.h6(c1Var, i13, i12, null, new Function1() { // from class: androidx.compose.foundation.layout.o2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.F(dVar, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(androidx.compose.runtime.collection.d dVar, androidx.compose.ui.layout.i2.a aVar) {
        Object[] objArr = dVar.f35552a;
        int iR = dVar.R();
        for (int i10 = 0; i10 < iR; i10++) {
            ((androidx.compose.ui.layout.b1) objArr[i10]).y();
        }
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 G(@NotNull q.e eVar, @NotNull q.m mVar, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1479255111, i11, -1, "androidx.compose.foundation.layout.rowMeasurementHelper (FlowLayout.kt:439)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && c0Var.D(eVar)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(mVar)) || (i11 & 48) == 32) | ((((i11 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.K(i10)) || (i11 & androidx.media3.exoplayer.a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new d(new j3(true, eVar, mVar, eVar.a(), f16427a, mVar.a(), i10, Integer.MAX_VALUE, n3.f16241g.k().b(), null));
            c0Var.Y(objI0);
        }
        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.layout.h1 H(@NotNull q.e eVar, @NotNull q.m mVar, @NotNull androidx.compose.ui.e.c cVar, int i10, int i11, @NotNull y2 y2Var, @Nullable androidx.compose.runtime.c0 c0Var, int i12) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2010142641, i12, -1, "androidx.compose.foundation.layout.rowMeasurementMultiContentHelper (FlowLayout.kt:470)");
        }
        boolean zD = ((((i12 & 14) ^ 6) > 4 && c0Var.D(eVar)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(mVar)) || (i12 & 48) == 32) | ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(cVar)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && c0Var.K(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && c0Var.K(i11)) || (i12 & 24576) == 16384) | c0Var.D(y2Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            j3 j3Var = new j3(true, eVar, mVar, eVar.a(), k1.f16162a.j(cVar), mVar.a(), i10, i11, y2Var, null);
            c0Var.Y(j3Var);
            objI0 = j3Var;
        }
        j3 j3Var2 = (j3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j3Var2;
    }

    private static final androidx.compose.ui.layout.z0 I(Iterator<? extends androidx.compose.ui.layout.z0> it, z2 z2Var) {
        try {
            if (!(it instanceof y0)) {
                return it.next();
            }
            Intrinsics.checkNotNull(z2Var);
            return ((y0) it).c(z2Var);
        } catch (IndexOutOfBoundsException unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0140  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:110:0x0154  */
    /* JADX WARN: Code duplicated, block: B:112:0x0158  */
    /* JADX WARN: Code duplicated, block: B:113:0x015f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0167  */
    /* JADX WARN: Code duplicated, block: B:119:0x0177  */
    /* JADX WARN: Code duplicated, block: B:120:0x0179  */
    /* JADX WARN: Code duplicated, block: B:123:0x0180  */
    /* JADX WARN: Code duplicated, block: B:125:0x0188  */
    /* JADX WARN: Code duplicated, block: B:128:0x01aa  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:145:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:147:0x0207  */
    /* JADX WARN: Code duplicated, block: B:150:0x022f  */
    /* JADX WARN: Code duplicated, block: B:153:0x023b  */
    /* JADX WARN: Code duplicated, block: B:154:0x023f  */
    /* JADX WARN: Code duplicated, block: B:157:0x0260  */
    /* JADX WARN: Code duplicated, block: B:159:0x026e  */
    /* JADX WARN: Code duplicated, block: B:162:0x0295  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0053  */
    /* JADX WARN: Code duplicated, block: B:28:0x0058  */
    /* JADX WARN: Code duplicated, block: B:30:0x005c  */
    /* JADX WARN: Code duplicated, block: B:32:0x0064  */
    /* JADX WARN: Code duplicated, block: B:33:0x0067  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x0077  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0089  */
    /* JADX WARN: Code duplicated, block: B:50:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:65:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00de  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:85:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:89:0x010d  */
    /* JADX WARN: Code duplicated, block: B:90:0x010f  */
    /* JADX WARN: Code duplicated, block: B:93:0x0118 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x011a  */
    /* JADX WARN: Code duplicated, block: B:95:0x011d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0123  */
    /* JADX WARN: Code duplicated, block: B:98:0x012b  */
    @kotlin.l(message = "The overflow parameter has been deprecated")
    @androidx.compose.runtime.o
    @u1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.m mVar, @Nullable q.e eVar, @Nullable androidx.compose.ui.e.b bVar, int i10, int i11, @Nullable d2 d2Var, @NotNull final pj.n<? super i2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        int i14;
        q.m mVar2;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.e.b bVarU;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z10;
        final androidx.compose.ui.a0 a0Var2;
        final q.e eVar2;
        final q.m mVar3;
        androidx.compose.runtime.c0 c0Var2;
        final int i27;
        final int i28;
        final d2 d2Var2;
        final androidx.compose.ui.e.b bVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        q.m mVarY;
        int i29;
        q.e eVarW;
        int i30;
        int i31;
        d2 d2VarI;
        int i32;
        boolean z11;
        Object objI0;
        y2 y2Var;
        androidx.compose.ui.layout.h1 h1VarU;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objI1;
        Object obj;
        boolean zD;
        Object objI2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1944405121);
        int i33 = i13 & 1;
        if (i33 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (c0VarR.D(a0Var) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i34 = i13 & 2;
        if (i34 == 0) {
            if ((i12 & 48) == 0) {
                mVar2 = mVar;
                i14 |= c0VarR.D(mVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(eVar)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        bVarU = bVar;
                        if (c0VarR.D(bVarU)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            i20 = i10;
                            if (c0VarR.K(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            i14 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.D(d2Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i13 & 128) != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i14 |= i26;
                        }
                        if ((i14 & 4793491) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i33 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i34 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                                i29 = i17;
                            } else {
                                i29 = i17;
                                eVarW = eVar;
                            }
                            if (i29 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                            }
                            if (i19 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i20;
                            }
                            if (i22 != 0) {
                                i31 = Integer.MAX_VALUE;
                            } else {
                                i31 = i11;
                            }
                            if (i24 != 0) {
                                d2VarI = d2.f15960g.i();
                            } else {
                                d2VarI = d2Var;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                            }
                            i32 = 3670016 & i14;
                            if (i32 == 1048576) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = d2VarI.b();
                                c0VarR.Y(objI0);
                            }
                            y2Var = (y2) objI0;
                            h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                            if (i32 == 1048576) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean z16 = z12;
                            if ((29360128 & i14) == 8388608) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z17 = z16 | z13;
                            if ((i14 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z17 | z14;
                            objI1 = c0VarR.i0();
                            if (z15 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                obj = objI1;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                                d2VarI.a(y2Var, arrayList);
                                c0VarR.Y(arrayList);
                                obj = arrayList;
                            }
                            obj = objI1;
                            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e((List) obj);
                            zD = c0VarR.D(h1VarU);
                            objI2 = c0VarR.i0();
                            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI2;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                            androidx.compose.ui.a0 a0Var4 = a0Var3;
                            function0A = aVar.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                            function2B = aVar.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                            function2E.invoke(c0VarR, 0);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            c0Var2 = c0VarR;
                            eVar2 = eVarW;
                            i27 = i30;
                            i28 = i31;
                            a0Var2 = a0Var4;
                            d2Var2 = d2VarI;
                            mVar3 = mVarY;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            eVar2 = eVar;
                            mVar3 = mVar2;
                            c0Var2 = c0VarR;
                            i27 = i20;
                            i28 = i11;
                            d2Var2 = d2Var;
                        }
                        bVar2 = bVarU;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(d2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            eVarW = eVar;
                        }
                        if (i29 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            d2VarI = d2.f15960g.i();
                        } else {
                            d2VarI = d2Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z18 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z19 = z18 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z19 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList2);
                            c0VarR.Y(arrayList2);
                            obj = arrayList2;
                        } else {
                            obj = objI1;
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList3);
                            c0VarR.Y(arrayList3);
                            obj = arrayList3;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E2 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarU);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var5 = a0Var3;
                        function0A = aVar2.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var2, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                        function2E2.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        eVar2 = eVarW;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var5;
                        d2Var2 = d2VarI;
                        mVar3 = mVarY;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        eVar2 = eVar;
                        mVar3 = mVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        d2Var2 = d2Var;
                    }
                    bVar2 = bVarU;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 3072;
                bVarU = bVar;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(d2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            eVarW = eVar;
                        }
                        if (i29 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            d2VarI = d2.f15960g.i();
                        } else {
                            d2VarI = d2Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z110 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z111 = z110 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z111 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList4);
                            c0VarR.Y(arrayList4);
                            obj = arrayList4;
                        } else {
                            obj = objI1;
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList5);
                            c0VarR.Y(arrayList5);
                            obj = arrayList5;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E3 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarU);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        function0A = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var3, aVar3.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                        function2E3.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        eVar2 = eVarW;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var6;
                        d2Var2 = d2VarI;
                        mVar3 = mVarY;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        eVar2 = eVar;
                        mVar3 = mVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        d2Var2 = d2Var;
                    }
                    bVar2 = bVarU;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z112 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z113 = z112 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z113 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList6);
                        c0VarR.Y(arrayList6);
                        obj = arrayList6;
                    } else {
                        obj = objI1;
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList7);
                        c0VarR.Y(arrayList7);
                        obj = arrayList7;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E4 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var4, aVar4.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                    function2E4.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var7;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.media3.exoplayer.a5.S0;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    bVarU = bVar;
                    if (c0VarR.D(bVarU)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(d2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            eVarW = eVar;
                        }
                        if (i29 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            d2VarI = d2.f15960g.i();
                        } else {
                            d2VarI = d2Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z114 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z115 = z114 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z115 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList8);
                            c0VarR.Y(arrayList8);
                            obj = arrayList8;
                        } else {
                            obj = objI1;
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList9);
                            c0VarR.Y(arrayList9);
                            obj = arrayList9;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E5 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarU);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var5 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        function0A = aVar5.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var5, aVar5.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                        function2B = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                        function2E5.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        eVar2 = eVarW;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var8;
                        d2Var2 = d2VarI;
                        mVar3 = mVarY;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        eVar2 = eVar;
                        mVar3 = mVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        d2Var2 = d2Var;
                    }
                    bVar2 = bVarU;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z116 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z117 = z116 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z117 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList10);
                        c0VarR.Y(arrayList10);
                        obj = arrayList10;
                    } else {
                        obj = objI1;
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList11);
                        c0VarR.Y(arrayList11);
                        obj = arrayList11;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E6 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var6 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var9 = a0Var3;
                    function0A = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var6, aVar6.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                    function2E6.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var9;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            bVarU = bVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z118 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z119 = z118 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z119 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList12);
                        c0VarR.Y(arrayList12);
                        obj = arrayList12;
                    } else {
                        obj = objI1;
                        ArrayList arrayList13 = new ArrayList();
                        arrayList13.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList13);
                        c0VarR.Y(arrayList13);
                        obj = arrayList13;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E7 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var7 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    function0A = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var7, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                    function2E7.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var10;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(d2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                    i29 = i17;
                } else {
                    i29 = i17;
                    eVarW = eVar;
                }
                if (i29 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    d2VarI = d2.f15960g.i();
                } else {
                    d2VarI = d2Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z1110 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1111 = z1110 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z1111 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList14);
                    c0VarR.Y(arrayList14);
                    obj = arrayList14;
                } else {
                    obj = objI1;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList15);
                    c0VarR.Y(arrayList15);
                    obj = arrayList15;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E8 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarU);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var8 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                function0A = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var8, aVar8.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                function2E8.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                eVar2 = eVarW;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var11;
                d2Var2 = d2VarI;
                mVar3 = mVarY;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                eVar2 = eVar;
                mVar3 = mVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                d2Var2 = d2Var;
            }
            bVar2 = bVarU;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        mVar2 = mVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(eVar)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    bVarU = bVar;
                    if (c0VarR.D(bVarU)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(d2Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            eVarW = eVar;
                        }
                        if (i29 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            d2VarI = d2.f15960g.i();
                        } else {
                            d2VarI = d2Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = d2VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z1112 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z1113 = z1112 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z1113 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList16 = new ArrayList();
                            arrayList16.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList16);
                            c0VarR.Y(arrayList16);
                            obj = arrayList16;
                        } else {
                            obj = objI1;
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                            d2VarI.a(y2Var, arrayList17);
                            c0VarR.Y(arrayList17);
                            obj = arrayList17;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E9 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarU);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var9 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        function0A = aVar9.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var9, aVar9.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                        function2E9.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        eVar2 = eVarW;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var12;
                        d2Var2 = d2VarI;
                        mVar3 = mVarY;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        eVar2 = eVar;
                        mVar3 = mVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        d2Var2 = d2Var;
                    }
                    bVar2 = bVarU;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z1114 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1115 = z1114 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z1115 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList18);
                        c0VarR.Y(arrayList18);
                        obj = arrayList18;
                    } else {
                        obj = objI1;
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList19);
                        c0VarR.Y(arrayList19);
                        obj = arrayList19;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E10 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var10 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    function0A = aVar10.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var10, aVar10.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                    function2E10.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var13;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            bVarU = bVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z1116 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1117 = z1116 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z1117 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList110 = new ArrayList();
                        arrayList110.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList110);
                        c0VarR.Y(arrayList110);
                        obj = arrayList110;
                    } else {
                        obj = objI1;
                        ArrayList arrayList111 = new ArrayList();
                        arrayList111.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList111);
                        c0VarR.Y(arrayList111);
                        obj = arrayList111;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E11 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var11 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    function0A = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var11, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                    function2E11.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var14;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(d2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                    i29 = i17;
                } else {
                    i29 = i17;
                    eVarW = eVar;
                }
                if (i29 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    d2VarI = d2.f15960g.i();
                } else {
                    d2VarI = d2Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z1118 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1119 = z1118 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z1119 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList112 = new ArrayList();
                    arrayList112.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList112);
                    c0VarR.Y(arrayList112);
                    obj = arrayList112;
                } else {
                    obj = objI1;
                    ArrayList arrayList113 = new ArrayList();
                    arrayList113.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList113);
                    c0VarR.Y(arrayList113);
                    obj = arrayList113;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E12 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarU);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var12 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                function0A = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var12, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                function2E12.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                eVar2 = eVarW;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var15;
                d2Var2 = d2VarI;
                mVar3 = mVarY;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                eVar2 = eVar;
                mVar3 = mVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                d2Var2 = d2Var;
            }
            bVar2 = bVarU;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= androidx.media3.exoplayer.a5.S0;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                bVarU = bVar;
                if (c0VarR.D(bVarU)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(d2Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        eVarW = eVar;
                    }
                    if (i29 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        d2VarI = d2.f15960g.i();
                    } else {
                        d2VarI = d2Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = d2VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z11110 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z11111 = z11110 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z11111 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList114 = new ArrayList();
                        arrayList114.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList114);
                        c0VarR.Y(arrayList114);
                        obj = arrayList114;
                    } else {
                        obj = objI1;
                        ArrayList arrayList115 = new ArrayList();
                        arrayList115.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                        d2VarI.a(y2Var, arrayList115);
                        c0VarR.Y(arrayList115);
                        obj = arrayList115;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E13 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarU);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var13 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    function0A = aVar13.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var13, aVar13.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar13.g());
                    function2B = aVar13.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                    function2E13.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    eVar2 = eVarW;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var16;
                    d2Var2 = d2VarI;
                    mVar3 = mVarY;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    eVar2 = eVar;
                    mVar3 = mVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    d2Var2 = d2Var;
                }
                bVar2 = bVarU;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(d2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                    i29 = i17;
                } else {
                    i29 = i17;
                    eVarW = eVar;
                }
                if (i29 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    d2VarI = d2.f15960g.i();
                } else {
                    d2VarI = d2Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z11112 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11113 = z11112 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z11113 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList116 = new ArrayList();
                    arrayList116.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList116);
                    c0VarR.Y(arrayList116);
                    obj = arrayList116;
                } else {
                    obj = objI1;
                    ArrayList arrayList117 = new ArrayList();
                    arrayList117.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList117);
                    c0VarR.Y(arrayList117);
                    obj = arrayList117;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E14 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarU);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var14 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var17 = a0Var3;
                function0A = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var14, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                function2E14.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                eVar2 = eVarW;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var17;
                d2Var2 = d2VarI;
                mVar3 = mVarY;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                eVar2 = eVar;
                mVar3 = mVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                d2Var2 = d2Var;
            }
            bVar2 = bVarU;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        bVarU = bVar;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                i20 = i10;
                if (c0VarR.K(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(d2Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                    i29 = i17;
                } else {
                    i29 = i17;
                    eVarW = eVar;
                }
                if (i29 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    d2VarI = d2.f15960g.i();
                } else {
                    d2VarI = d2Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = d2VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z11114 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11115 = z11114 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z11115 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList118 = new ArrayList();
                    arrayList118.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList118);
                    c0VarR.Y(arrayList118);
                    obj = arrayList118;
                } else {
                    obj = objI1;
                    ArrayList arrayList119 = new ArrayList();
                    arrayList119.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                    d2VarI.a(y2Var, arrayList119);
                    c0VarR.Y(arrayList119);
                    obj = arrayList119;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E15 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarU);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var15 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                function0A = aVar15.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var15, aVar15.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                function2E15.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                eVar2 = eVarW;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var18;
                d2Var2 = d2VarI;
                mVar3 = mVarY;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                eVar2 = eVar;
                mVar3 = mVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                d2Var2 = d2Var;
            }
            bVar2 = bVarU;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.D(d2Var)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i13 & 128) != 0) {
            i14 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c0VarR.k0(nVar)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        if ((i14 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            if (i33 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var;
            }
            if (i34 != 0) {
                mVarY = q.f16330a.y();
            } else {
                mVarY = mVar2;
            }
            if (i15 != 0) {
                eVarW = q.f16330a.w();
                i29 = i17;
            } else {
                i29 = i17;
                eVarW = eVar;
            }
            if (i29 != 0) {
                bVarU = androidx.compose.ui.e.f37317a.u();
            }
            if (i19 != 0) {
                i30 = Integer.MAX_VALUE;
            } else {
                i30 = i20;
            }
            if (i22 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i24 != 0) {
                d2VarI = d2.f15960g.i();
            } else {
                d2VarI = d2Var;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1944405121, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:213)");
            }
            i32 = 3670016 & i14;
            if (i32 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = d2VarI.b();
                c0VarR.Y(objI0);
            } else {
                objI0 = d2VarI.b();
                c0VarR.Y(objI0);
            }
            y2Var = (y2) objI0;
            h1VarU = u(mVarY, eVarW, bVarU, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
            if (i32 == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z11116 = z12;
            if ((29360128 & i14) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z11117 = z11116 | z13;
            if ((i14 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z11117 | z14;
            objI1 = c0VarR.i0();
            if (z15) {
                obj = objI1;
                ArrayList arrayList1110 = new ArrayList();
                arrayList1110.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                d2VarI.a(y2Var, arrayList1110);
                c0VarR.Y(arrayList1110);
                obj = arrayList1110;
            } else {
                obj = objI1;
                ArrayList arrayList1111 = new ArrayList();
                arrayList1111.add(androidx.compose.runtime.internal.w.c(-1720407857, true, new a(nVar)));
                d2VarI.a(y2Var, arrayList1111);
                c0VarR.Y(arrayList1111);
                obj = arrayList1111;
            }
            obj = objI1;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E16 = androidx.compose.ui.layout.n0.e((List) obj);
            zD = c0VarR.D(h1VarU);
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                c0VarR.Y(objI2);
            } else {
                objI2 = androidx.compose.ui.layout.j1.a(h1VarU);
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.layout.a1 a1Var16 = (androidx.compose.ui.layout.a1) objI2;
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            function0A = aVar16.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var16, aVar16.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
            function2E16.invoke(c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var2 = c0VarR;
            eVar2 = eVarW;
            i27 = i30;
            i28 = i31;
            a0Var2 = a0Var19;
            d2Var2 = d2VarI;
            mVar3 = mVarY;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            eVar2 = eVar;
            mVar3 = mVar2;
            c0Var2 = c0VarR;
            i27 = i20;
            i28 = i11;
            d2Var2 = d2Var;
        }
        bVar2 = bVarU;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.m2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return t2.j(a0Var2, mVar3, eVar2, bVar2, i27, i28, d2Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0130  */
    /* JADX WARN: Code duplicated, block: B:101:0x0132  */
    /* JADX WARN: Code duplicated, block: B:104:0x0139  */
    /* JADX WARN: Code duplicated, block: B:107:0x0176  */
    /* JADX WARN: Code duplicated, block: B:110:0x0181  */
    /* JADX WARN: Code duplicated, block: B:113:0x0194  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:89:0x0108  */
    /* JADX WARN: Code duplicated, block: B:91:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.m mVar, @Nullable q.e eVar, @Nullable androidx.compose.ui.e.b bVar, int i10, int i11, @NotNull final pj.n<? super i2, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        androidx.compose.ui.a0 a0Var2;
        int i14;
        q.m mVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.e.b bVar2;
        final androidx.compose.ui.a0 a0Var3;
        final q.m mVar3;
        final int i26;
        final q.e eVar2;
        final int i27;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i28;
        q.m mVarY;
        q.e eVarW;
        int i29;
        androidx.compose.ui.e.b bVarU;
        int i30;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1371845627);
        int i31 = i13 & 1;
        if (i31 != 0) {
            i14 = i12 | 6;
            a0Var2 = a0Var;
        } else if ((i12 & 6) == 0) {
            a0Var2 = a0Var;
            i14 = (c0VarR.D(a0Var2) ? 4 : 2) | i12;
        } else {
            a0Var2 = a0Var;
            i14 = i12;
        }
        int i32 = i13 & 2;
        if (i32 == 0) {
            if ((i12 & 48) == 0) {
                mVar2 = mVar;
                i14 |= c0VarR.D(mVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(eVar)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        if (c0VarR.D(bVar)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            i20 = i10;
                            if (c0VarR.K(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            if ((196608 & i12) == 0) {
                                i23 = i11;
                                if (c0VarR.K(i23)) {
                                    i24 = 131072;
                                } else {
                                    i24 = 65536;
                                }
                                i14 |= i24;
                            }
                            if ((i13 & 64) != 0) {
                                i14 |= 1572864;
                            } else if ((i12 & 1572864) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i14 & 1)) {
                                if (i31 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i32 != 0) {
                                    mVarY = q.f16330a.y();
                                    i28 = i17;
                                } else {
                                    i28 = i17;
                                    mVarY = mVar2;
                                }
                                if (i15 != 0) {
                                    eVarW = q.f16330a.w();
                                } else {
                                    eVarW = eVar;
                                }
                                if (i28 != 0) {
                                    bVarU = androidx.compose.ui.e.f37317a.u();
                                    i29 = i19;
                                } else {
                                    i29 = i19;
                                    bVarU = bVar;
                                }
                                if (i29 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i23;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                                }
                                c0Var2 = c0VarR;
                                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                                mVar3 = mVarY;
                                eVar2 = eVarW;
                                bVar2 = bVarU;
                                i26 = i30;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                bVar2 = bVar;
                                a0Var3 = a0Var2;
                                mVar3 = mVar2;
                                i26 = i23;
                                eVar2 = eVar;
                            }
                            i27 = i20;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                        i23 = i11;
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                mVarY = q.f16330a.y();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar;
                            }
                            if (i28 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                bVarU = bVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                            }
                            c0Var2 = c0VarR;
                            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            bVar2 = bVarU;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            bVar2 = bVar;
                            a0Var3 = a0Var2;
                            mVar3 = mVar2;
                            i26 = i23;
                            eVar2 = eVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                mVarY = q.f16330a.y();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar;
                            }
                            if (i28 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                bVarU = bVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                            }
                            c0Var2 = c0VarR;
                            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            bVar2 = bVarU;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            bVar2 = bVar;
                            a0Var3 = a0Var2;
                            mVar3 = mVar2;
                            i26 = i23;
                            eVar2 = eVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 3072;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                mVarY = q.f16330a.y();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar;
                            }
                            if (i28 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                bVarU = bVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                            }
                            c0Var2 = c0VarR;
                            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            bVar2 = bVarU;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            bVar2 = bVar;
                            a0Var3 = a0Var2;
                            mVar3 = mVar2;
                            i26 = i23;
                            eVar2 = eVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.media3.exoplayer.a5.S0;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.D(bVar)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                mVarY = q.f16330a.y();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar;
                            }
                            if (i28 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                bVarU = bVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                            }
                            c0Var2 = c0VarR;
                            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            bVar2 = bVarU;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            bVar2 = bVar;
                            a0Var3 = a0Var2;
                            mVar3 = mVar2;
                            i26 = i23;
                            eVar2 = eVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    mVarY = q.f16330a.y();
                    i28 = i17;
                } else {
                    i28 = i17;
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar;
                }
                if (i28 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                    i29 = i19;
                } else {
                    i29 = i19;
                    bVarU = bVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                }
                c0Var2 = c0VarR;
                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                mVar3 = mVarY;
                eVar2 = eVarW;
                bVar2 = bVarU;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                bVar2 = bVar;
                a0Var3 = a0Var2;
                mVar3 = mVar2;
                i26 = i23;
                eVar2 = eVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        mVar2 = mVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(eVar)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.D(bVar)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                mVarY = q.f16330a.y();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                mVarY = mVar2;
                            }
                            if (i15 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar;
                            }
                            if (i28 != 0) {
                                bVarU = androidx.compose.ui.e.f37317a.u();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                bVarU = bVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                            }
                            c0Var2 = c0VarR;
                            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            mVar3 = mVarY;
                            eVar2 = eVarW;
                            bVar2 = bVarU;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            bVar2 = bVar;
                            a0Var3 = a0Var2;
                            mVar3 = mVar2;
                            i26 = i23;
                            eVar2 = eVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    mVarY = q.f16330a.y();
                    i28 = i17;
                } else {
                    i28 = i17;
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar;
                }
                if (i28 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                    i29 = i19;
                } else {
                    i29 = i19;
                    bVarU = bVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                }
                c0Var2 = c0VarR;
                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                mVar3 = mVarY;
                eVar2 = eVarW;
                bVar2 = bVarU;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                bVar2 = bVar;
                a0Var3 = a0Var2;
                mVar3 = mVar2;
                i26 = i23;
                eVar2 = eVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.media3.exoplayer.a5.S0;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                if (c0VarR.D(bVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            mVarY = q.f16330a.y();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            mVarY = mVar2;
                        }
                        if (i15 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar;
                        }
                        if (i28 != 0) {
                            bVarU = androidx.compose.ui.e.f37317a.u();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            bVarU = bVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                        }
                        c0Var2 = c0VarR;
                        h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        mVar3 = mVarY;
                        eVar2 = eVarW;
                        bVar2 = bVarU;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        bVar2 = bVar;
                        a0Var3 = a0Var2;
                        mVar3 = mVar2;
                        i26 = i23;
                        eVar2 = eVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    mVarY = q.f16330a.y();
                    i28 = i17;
                } else {
                    i28 = i17;
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar;
                }
                if (i28 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                    i29 = i19;
                } else {
                    i29 = i19;
                    bVarU = bVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                }
                c0Var2 = c0VarR;
                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                mVar3 = mVarY;
                eVar2 = eVarW;
                bVar2 = bVarU;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                bVar2 = bVar;
                a0Var3 = a0Var2;
                mVar3 = mVar2;
                i26 = i23;
                eVar2 = eVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                i20 = i10;
                if (c0VarR.K(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        mVarY = q.f16330a.y();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        mVarY = mVar2;
                    }
                    if (i15 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar;
                    }
                    if (i28 != 0) {
                        bVarU = androidx.compose.ui.e.f37317a.u();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        bVarU = bVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                    }
                    c0Var2 = c0VarR;
                    h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    mVar3 = mVarY;
                    eVar2 = eVarW;
                    bVar2 = bVarU;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    bVar2 = bVar;
                    a0Var3 = a0Var2;
                    mVar3 = mVar2;
                    i26 = i23;
                    eVar2 = eVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    mVarY = q.f16330a.y();
                    i28 = i17;
                } else {
                    i28 = i17;
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar;
                }
                if (i28 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                    i29 = i19;
                } else {
                    i29 = i19;
                    bVarU = bVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                }
                c0Var2 = c0VarR;
                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                mVar3 = mVarY;
                eVar2 = eVarW;
                bVar2 = bVarU;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                bVar2 = bVar;
                a0Var3 = a0Var2;
                mVar3 = mVar2;
                i26 = i23;
                eVar2 = eVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            if ((196608 & i12) == 0) {
                i23 = i11;
                if (c0VarR.K(i23)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i14 |= i24;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    mVarY = q.f16330a.y();
                    i28 = i17;
                } else {
                    i28 = i17;
                    mVarY = mVar2;
                }
                if (i15 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar;
                }
                if (i28 != 0) {
                    bVarU = androidx.compose.ui.e.f37317a.u();
                    i29 = i19;
                } else {
                    i29 = i19;
                    bVarU = bVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
                }
                c0Var2 = c0VarR;
                h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                mVar3 = mVarY;
                eVar2 = eVarW;
                bVar2 = bVarU;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                bVar2 = bVar;
                a0Var3 = a0Var2;
                mVar3 = mVar2;
                i26 = i23;
                eVar2 = eVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.profileinstaller.n.c.f73814m;
        i23 = i11;
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.k0(nVar)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i14 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            if (i31 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i32 != 0) {
                mVarY = q.f16330a.y();
                i28 = i17;
            } else {
                i28 = i17;
                mVarY = mVar2;
            }
            if (i15 != 0) {
                eVarW = q.f16330a.w();
            } else {
                eVarW = eVar;
            }
            if (i28 != 0) {
                bVarU = androidx.compose.ui.e.f37317a.u();
                i29 = i19;
            } else {
                i29 = i19;
                bVarU = bVar;
            }
            if (i29 != 0) {
                i20 = Integer.MAX_VALUE;
            }
            if (i22 != 0) {
                i30 = Integer.MAX_VALUE;
            } else {
                i30 = i23;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1371845627, i14, -1, "androidx.compose.foundation.layout.FlowColumn (FlowLayout.kt:271)");
            }
            c0Var2 = c0VarR;
            h(a0Var4, mVarY, eVarW, bVarU, i20, i30, d2.f15960g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            mVar3 = mVarY;
            eVar2 = eVarW;
            bVar2 = bVarU;
            i26 = i30;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            bVar2 = bVar;
            a0Var3 = a0Var2;
            mVar3 = mVar2;
            i26 = i23;
            eVar2 = eVar;
        }
        i27 = i20;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.n2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t2.k(a0Var3, mVar3, eVar2, bVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(androidx.compose.ui.a0 a0Var, q.m mVar, q.e eVar, androidx.compose.ui.e.b bVar, int i10, int i11, d2 d2Var, pj.n nVar, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        h(a0Var, mVar, eVar, bVar, i10, i11, d2Var, nVar, c0Var, androidx.compose.runtime.t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(androidx.compose.ui.a0 a0Var, q.m mVar, q.e eVar, androidx.compose.ui.e.b bVar, int i10, int i11, pj.n nVar, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        i(a0Var, mVar, eVar, bVar, i10, i11, nVar, c0Var, androidx.compose.runtime.t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:101:0x0137  */
    /* JADX WARN: Code duplicated, block: B:103:0x013f  */
    /* JADX WARN: Code duplicated, block: B:106:0x014c  */
    /* JADX WARN: Code duplicated, block: B:107:0x014e  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:112:0x0157  */
    /* JADX WARN: Code duplicated, block: B:113:0x015e  */
    /* JADX WARN: Code duplicated, block: B:116:0x0168  */
    /* JADX WARN: Code duplicated, block: B:119:0x0178  */
    /* JADX WARN: Code duplicated, block: B:120:0x017a  */
    /* JADX WARN: Code duplicated, block: B:123:0x0181  */
    /* JADX WARN: Code duplicated, block: B:125:0x0189  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:129:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:132:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:137:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:140:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:142:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:147:0x0206  */
    /* JADX WARN: Code duplicated, block: B:150:0x022e  */
    /* JADX WARN: Code duplicated, block: B:153:0x023a  */
    /* JADX WARN: Code duplicated, block: B:154:0x023e  */
    /* JADX WARN: Code duplicated, block: B:157:0x025f  */
    /* JADX WARN: Code duplicated, block: B:159:0x026d  */
    /* JADX WARN: Code duplicated, block: B:162:0x0294  */
    /* JADX WARN: Code duplicated, block: B:165:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:168:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:170:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0050  */
    /* JADX WARN: Code duplicated, block: B:28:0x0057  */
    /* JADX WARN: Code duplicated, block: B:30:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0063  */
    /* JADX WARN: Code duplicated, block: B:33:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x006d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0072  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:44:0x0081  */
    /* JADX WARN: Code duplicated, block: B:48:0x0088  */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:54:0x009b  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00af  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:65:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:70:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:82:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:89:0x010a  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    /* JADX WARN: Code duplicated, block: B:98:0x0128  */
    @kotlin.l(message = "The overflow parameter has been deprecated")
    @androidx.compose.runtime.o
    @u1
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void l(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.e eVar, @Nullable q.m mVar, @Nullable androidx.compose.ui.e.c cVar, int i10, int i11, @Nullable n3 n3Var, @NotNull final pj.n<? super s3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        int i14;
        q.e eVar2;
        int i15;
        int i16;
        int i17;
        androidx.compose.ui.e.c cVarW;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        boolean z10;
        final androidx.compose.ui.a0 a0Var2;
        final q.m mVar2;
        final q.e eVar3;
        androidx.compose.runtime.c0 c0Var2;
        final int i27;
        final int i28;
        final n3 n3Var2;
        final androidx.compose.ui.e.c cVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        q.e eVarW;
        int i29;
        q.m mVarY;
        int i30;
        int i31;
        n3 n3VarI;
        int i32;
        boolean z11;
        Object objI0;
        y2 y2Var;
        androidx.compose.ui.layout.h1 h1VarH;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        Object objI1;
        Object obj;
        boolean zD;
        Object objI2;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1956591841);
        int i33 = i13 & 1;
        if (i33 != 0) {
            i14 = i12 | 6;
        } else if ((i12 & 6) == 0) {
            i14 = (c0VarR.D(a0Var) ? 4 : 2) | i12;
        } else {
            i14 = i12;
        }
        int i34 = i13 & 2;
        if (i34 == 0) {
            if ((i12 & 48) == 0) {
                eVar2 = eVar;
                i14 |= c0VarR.D(eVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(mVar)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        cVarW = cVar;
                        if (c0VarR.D(cVarW)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            i20 = i10;
                            if (c0VarR.K(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            i14 |= androidx.profileinstaller.n.c.f73814m;
                        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.K(i11)) {
                                i23 = 131072;
                            } else {
                                i23 = 65536;
                            }
                            i14 |= i23;
                        }
                        i24 = i13 & 64;
                        if (i24 != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.D(n3Var)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i13 & 128) != 0) {
                            i14 |= 12582912;
                        } else if ((i12 & 12582912) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i26 = 8388608;
                            } else {
                                i26 = 4194304;
                            }
                            i14 |= i26;
                        }
                        if ((i14 & 4793491) != 4793490) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i33 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var;
                            }
                            if (i34 != 0) {
                                eVarW = q.f16330a.w();
                            } else {
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                                i29 = i17;
                            } else {
                                i29 = i17;
                                mVarY = mVar;
                            }
                            if (i29 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                            }
                            if (i19 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i20;
                            }
                            if (i22 != 0) {
                                i31 = Integer.MAX_VALUE;
                            } else {
                                i31 = i11;
                            }
                            if (i24 != 0) {
                                n3VarI = n3.f16241g.i();
                            } else {
                                n3VarI = n3Var;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                            }
                            i32 = 3670016 & i14;
                            if (i32 == 1048576) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI0 = c0VarR.i0();
                            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = n3VarI.b();
                                c0VarR.Y(objI0);
                            }
                            y2Var = (y2) objI0;
                            h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                            if (i32 == 1048576) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean z16 = z12;
                            if ((29360128 & i14) == 8388608) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            boolean z17 = z16 | z13;
                            if ((i14 & 458752) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            z15 = z17 | z14;
                            objI1 = c0VarR.i0();
                            if (z15 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                obj = objI1;
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                                n3VarI.a(y2Var, arrayList);
                                c0VarR.Y(arrayList);
                                obj = arrayList;
                            }
                            obj = objI1;
                            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E = androidx.compose.ui.layout.n0.e((List) obj);
                            zD = c0VarR.D(h1VarH);
                            objI2 = c0VarR.i0();
                            if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                                c0VarR.Y(objI2);
                            }
                            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI2;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
                            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                            androidx.compose.ui.a0 a0Var4 = a0Var3;
                            function0A = aVar.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                            androidx.compose.runtime.y7.n(c0VarD, a1Var, aVar.e());
                            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                            function2B = aVar.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                            function2E.invoke(c0VarR, 0);
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            c0Var2 = c0VarR;
                            mVar2 = mVarY;
                            i27 = i30;
                            i28 = i31;
                            a0Var2 = a0Var4;
                            n3Var2 = n3VarI;
                            eVar3 = eVarW;
                        } else {
                            c0VarR.u();
                            a0Var2 = a0Var;
                            mVar2 = mVar;
                            eVar3 = eVar2;
                            c0Var2 = c0VarR;
                            i27 = i20;
                            i28 = i11;
                            n3Var2 = n3Var;
                        }
                        cVar2 = cVarW;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj2, Object obj3) {
                                    return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                                }
                            });
                        }
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(n3Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            mVarY = mVar;
                        }
                        if (i29 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            n3VarI = n3.f16241g.i();
                        } else {
                            n3VarI = n3Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z18 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z19 = z18 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z19 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList2 = new ArrayList();
                            arrayList2.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList2);
                            c0VarR.Y(arrayList2);
                            obj = arrayList2;
                        } else {
                            obj = objI1;
                            ArrayList arrayList3 = new ArrayList();
                            arrayList3.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList3);
                            c0VarR.Y(arrayList3);
                            obj = arrayList3;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E2 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarH);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var5 = a0Var3;
                        function0A = aVar2.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var2, aVar2.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
                        function2B = aVar2.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                        function2E2.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        mVar2 = mVarY;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var5;
                        n3Var2 = n3VarI;
                        eVar3 = eVarW;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        mVar2 = mVar;
                        eVar3 = eVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        n3Var2 = n3Var;
                    }
                    cVar2 = cVarW;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 3072;
                cVarW = cVar;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(n3Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            mVarY = mVar;
                        }
                        if (i29 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            n3VarI = n3.f16241g.i();
                        } else {
                            n3VarI = n3Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z110 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z111 = z110 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z111 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList4 = new ArrayList();
                            arrayList4.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList4);
                            c0VarR.Y(arrayList4);
                            obj = arrayList4;
                        } else {
                            obj = objI1;
                            ArrayList arrayList5 = new ArrayList();
                            arrayList5.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList5);
                            c0VarR.Y(arrayList5);
                            obj = arrayList5;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E3 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarH);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        function0A = aVar3.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var3, aVar3.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                        function2B = aVar3.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                        function2E3.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        mVar2 = mVarY;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var6;
                        n3Var2 = n3VarI;
                        eVar3 = eVarW;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        mVar2 = mVar;
                        eVar3 = eVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        n3Var2 = n3Var;
                    }
                    cVar2 = cVarW;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z112 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z113 = z112 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z113 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList6 = new ArrayList();
                        arrayList6.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList6);
                        c0VarR.Y(arrayList6);
                        obj = arrayList6;
                    } else {
                        obj = objI1;
                        ArrayList arrayList7 = new ArrayList();
                        arrayList7.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList7);
                        c0VarR.Y(arrayList7);
                        obj = arrayList7;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E4 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var7 = a0Var3;
                    function0A = aVar4.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var4, aVar4.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                    function2B = aVar4.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                    function2E4.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var7;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.media3.exoplayer.a5.S0;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVarW = cVar;
                    if (c0VarR.D(cVarW)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(n3Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            mVarY = mVar;
                        }
                        if (i29 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            n3VarI = n3.f16241g.i();
                        } else {
                            n3VarI = n3Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z114 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z115 = z114 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z115 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList8 = new ArrayList();
                            arrayList8.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList8);
                            c0VarR.Y(arrayList8);
                            obj = arrayList8;
                        } else {
                            obj = objI1;
                            ArrayList arrayList9 = new ArrayList();
                            arrayList9.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList9);
                            c0VarR.Y(arrayList9);
                            obj = arrayList9;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E5 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarH);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var5 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var8 = a0Var3;
                        function0A = aVar5.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var5, aVar5.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                        function2B = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                        function2E5.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        mVar2 = mVarY;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var8;
                        n3Var2 = n3VarI;
                        eVar3 = eVarW;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        mVar2 = mVar;
                        eVar3 = eVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        n3Var2 = n3Var;
                    }
                    cVar2 = cVarW;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z116 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z117 = z116 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z117 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList10 = new ArrayList();
                        arrayList10.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList10);
                        c0VarR.Y(arrayList10);
                        obj = arrayList10;
                    } else {
                        obj = objI1;
                        ArrayList arrayList11 = new ArrayList();
                        arrayList11.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList11);
                        c0VarR.Y(arrayList11);
                        obj = arrayList11;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E6 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var6 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var9 = a0Var3;
                    function0A = aVar6.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var6, aVar6.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                    function2B = aVar6.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                    function2E6.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var9;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            cVarW = cVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z118 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z119 = z118 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z119 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList12 = new ArrayList();
                        arrayList12.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList12);
                        c0VarR.Y(arrayList12);
                        obj = arrayList12;
                    } else {
                        obj = objI1;
                        ArrayList arrayList13 = new ArrayList();
                        arrayList13.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList13);
                        c0VarR.Y(arrayList13);
                        obj = arrayList13;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E7 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var7 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var10 = a0Var3;
                    function0A = aVar7.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var7, aVar7.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                    function2B = aVar7.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                    function2E7.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var10;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(n3Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                    i29 = i17;
                } else {
                    i29 = i17;
                    mVarY = mVar;
                }
                if (i29 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    n3VarI = n3.f16241g.i();
                } else {
                    n3VarI = n3Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z1110 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1111 = z1110 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z1111 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList14 = new ArrayList();
                    arrayList14.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList14);
                    c0VarR.Y(arrayList14);
                    obj = arrayList14;
                } else {
                    obj = objI1;
                    ArrayList arrayList15 = new ArrayList();
                    arrayList15.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList15);
                    c0VarR.Y(arrayList15);
                    obj = arrayList15;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E8 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarH);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var8 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var11 = a0Var3;
                function0A = aVar8.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var8, aVar8.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
                function2B = aVar8.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
                function2E8.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                mVar2 = mVarY;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var11;
                n3Var2 = n3VarI;
                eVar3 = eVarW;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                mVar2 = mVar;
                eVar3 = eVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                n3Var2 = n3Var;
            }
            cVar2 = cVarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(mVar)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    cVarW = cVar;
                    if (c0VarR.D(cVarW)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                    } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(i11)) {
                            i23 = 131072;
                        } else {
                            i23 = 65536;
                        }
                        i14 |= i23;
                    }
                    i24 = i13 & 64;
                    if (i24 != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.D(n3Var)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i13 & 128) != 0) {
                        i14 |= 12582912;
                    } else if ((i12 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i26 = 8388608;
                        } else {
                            i26 = 4194304;
                        }
                        i14 |= i26;
                    }
                    if ((i14 & 4793491) != 4793490) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i33 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i34 != 0) {
                            eVarW = q.f16330a.w();
                        } else {
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                            i29 = i17;
                        } else {
                            i29 = i17;
                            mVarY = mVar;
                        }
                        if (i29 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                        }
                        if (i19 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i20;
                        }
                        if (i22 != 0) {
                            i31 = Integer.MAX_VALUE;
                        } else {
                            i31 = i11;
                        }
                        if (i24 != 0) {
                            n3VarI = n3.f16241g.i();
                        } else {
                            n3VarI = n3Var;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                        }
                        i32 = 3670016 & i14;
                        if (i32 == 1048576) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = n3VarI.b();
                            c0VarR.Y(objI0);
                        }
                        y2Var = (y2) objI0;
                        h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                        if (i32 == 1048576) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z1112 = z12;
                        if ((29360128 & i14) == 8388608) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z1113 = z1112 | z13;
                        if ((i14 & 458752) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        z15 = z1113 | z14;
                        objI1 = c0VarR.i0();
                        if (z15) {
                            obj = objI1;
                            ArrayList arrayList16 = new ArrayList();
                            arrayList16.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList16);
                            c0VarR.Y(arrayList16);
                            obj = arrayList16;
                        } else {
                            obj = objI1;
                            ArrayList arrayList17 = new ArrayList();
                            arrayList17.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                            n3VarI.a(y2Var, arrayList17);
                            c0VarR.Y(arrayList17);
                            obj = arrayList17;
                        }
                        obj = objI1;
                        Function2<androidx.compose.runtime.c0, Integer, Unit> function2E9 = androidx.compose.ui.layout.n0.e((List) obj);
                        zD = c0VarR.D(h1VarH);
                        objI2 = c0VarR.i0();
                        if (zD) {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        } else {
                            objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                            c0VarR.Y(objI2);
                        }
                        androidx.compose.ui.layout.a1 a1Var9 = (androidx.compose.ui.layout.a1) objI2;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                        androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                        androidx.compose.ui.a0 a0Var12 = a0Var3;
                        function0A = aVar9.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1Var9, aVar9.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK9, aVar9.g());
                        function2B = aVar9.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN9, aVar9.f());
                        function2E9.invoke(c0VarR, 0);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        c0Var2 = c0VarR;
                        mVar2 = mVarY;
                        i27 = i30;
                        i28 = i31;
                        a0Var2 = a0Var12;
                        n3Var2 = n3VarI;
                        eVar3 = eVarW;
                    } else {
                        c0VarR.u();
                        a0Var2 = a0Var;
                        mVar2 = mVar;
                        eVar3 = eVar2;
                        c0Var2 = c0VarR;
                        i27 = i20;
                        i28 = i11;
                        n3Var2 = n3Var;
                    }
                    cVar2 = cVarW;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj2, Object obj3) {
                                return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z1114 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1115 = z1114 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z1115 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList18 = new ArrayList();
                        arrayList18.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList18);
                        c0VarR.Y(arrayList18);
                        obj = arrayList18;
                    } else {
                        obj = objI1;
                        ArrayList arrayList19 = new ArrayList();
                        arrayList19.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList19);
                        c0VarR.Y(arrayList19);
                        obj = arrayList19;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E10 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var10 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    function0A = aVar10.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var10, aVar10.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK10, aVar10.g());
                    function2B = aVar10.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN10, aVar10.f());
                    function2E10.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var13;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            cVarW = cVar;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z1116 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z1117 = z1116 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z1117 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList110 = new ArrayList();
                        arrayList110.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList110);
                        c0VarR.Y(arrayList110);
                        obj = arrayList110;
                    } else {
                        obj = objI1;
                        ArrayList arrayList111 = new ArrayList();
                        arrayList111.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList111);
                        c0VarR.Y(arrayList111);
                        obj = arrayList111;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E11 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var11 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var14 = a0Var3;
                    function0A = aVar11.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var11, aVar11.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK11, aVar11.g());
                    function2B = aVar11.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN11, aVar11.f());
                    function2E11.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var14;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(n3Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                    i29 = i17;
                } else {
                    i29 = i17;
                    mVarY = mVar;
                }
                if (i29 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    n3VarI = n3.f16241g.i();
                } else {
                    n3VarI = n3Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z1118 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z1119 = z1118 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z1119 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList112 = new ArrayList();
                    arrayList112.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList112);
                    c0VarR.Y(arrayList112);
                    obj = arrayList112;
                } else {
                    obj = objI1;
                    ArrayList arrayList113 = new ArrayList();
                    arrayList113.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList113);
                    c0VarR.Y(arrayList113);
                    obj = arrayList113;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E12 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarH);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var12 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var15 = a0Var3;
                function0A = aVar12.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var12, aVar12.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK12, aVar12.g());
                function2B = aVar12.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN12, aVar12.f());
                function2E12.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                mVar2 = mVarY;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var15;
                n3Var2 = n3VarI;
                eVar3 = eVarW;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                mVar2 = mVar;
                eVar3 = eVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                n3Var2 = n3Var;
            }
            cVar2 = cVarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= androidx.media3.exoplayer.a5.S0;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                cVarW = cVar;
                if (c0VarR.D(cVarW)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(i11)) {
                        i23 = 131072;
                    } else {
                        i23 = 65536;
                    }
                    i14 |= i23;
                }
                i24 = i13 & 64;
                if (i24 != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.D(n3Var)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i13 & 128) != 0) {
                    i14 |= 12582912;
                } else if ((i12 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i26 = 8388608;
                    } else {
                        i26 = 4194304;
                    }
                    i14 |= i26;
                }
                if ((i14 & 4793491) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i33 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i34 != 0) {
                        eVarW = q.f16330a.w();
                    } else {
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                        i29 = i17;
                    } else {
                        i29 = i17;
                        mVarY = mVar;
                    }
                    if (i29 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                    }
                    if (i19 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i20;
                    }
                    if (i22 != 0) {
                        i31 = Integer.MAX_VALUE;
                    } else {
                        i31 = i11;
                    }
                    if (i24 != 0) {
                        n3VarI = n3.f16241g.i();
                    } else {
                        n3VarI = n3Var;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                    }
                    i32 = 3670016 & i14;
                    if (i32 == 1048576) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = n3VarI.b();
                        c0VarR.Y(objI0);
                    }
                    y2Var = (y2) objI0;
                    h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                    if (i32 == 1048576) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z11110 = z12;
                    if ((29360128 & i14) == 8388608) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z11111 = z11110 | z13;
                    if ((i14 & 458752) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    z15 = z11111 | z14;
                    objI1 = c0VarR.i0();
                    if (z15) {
                        obj = objI1;
                        ArrayList arrayList114 = new ArrayList();
                        arrayList114.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList114);
                        c0VarR.Y(arrayList114);
                        obj = arrayList114;
                    } else {
                        obj = objI1;
                        ArrayList arrayList115 = new ArrayList();
                        arrayList115.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                        n3VarI.a(y2Var, arrayList115);
                        c0VarR.Y(arrayList115);
                        obj = arrayList115;
                    }
                    obj = objI1;
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2E13 = androidx.compose.ui.layout.n0.e((List) obj);
                    zD = c0VarR.D(h1VarH);
                    objI2 = c0VarR.i0();
                    if (zD) {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    } else {
                        objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.layout.a1 a1Var13 = (androidx.compose.ui.layout.a1) objI2;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                    androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                    androidx.compose.ui.a0 a0Var16 = a0Var3;
                    function0A = aVar13.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1Var13, aVar13.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK13, aVar13.g());
                    function2B = aVar13.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN13, aVar13.f());
                    function2E13.invoke(c0VarR, 0);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    c0Var2 = c0VarR;
                    mVar2 = mVarY;
                    i27 = i30;
                    i28 = i31;
                    a0Var2 = a0Var16;
                    n3Var2 = n3VarI;
                    eVar3 = eVarW;
                } else {
                    c0VarR.u();
                    a0Var2 = a0Var;
                    mVar2 = mVar;
                    eVar3 = eVar2;
                    c0Var2 = c0VarR;
                    i27 = i20;
                    i28 = i11;
                    n3Var2 = n3Var;
                }
                cVar2 = cVarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(n3Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                    i29 = i17;
                } else {
                    i29 = i17;
                    mVarY = mVar;
                }
                if (i29 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    n3VarI = n3.f16241g.i();
                } else {
                    n3VarI = n3Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z11112 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11113 = z11112 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z11113 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList116 = new ArrayList();
                    arrayList116.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList116);
                    c0VarR.Y(arrayList116);
                    obj = arrayList116;
                } else {
                    obj = objI1;
                    ArrayList arrayList117 = new ArrayList();
                    arrayList117.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList117);
                    c0VarR.Y(arrayList117);
                    obj = arrayList117;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E14 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarH);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var14 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var17 = a0Var3;
                function0A = aVar14.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var14, aVar14.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK14, aVar14.g());
                function2B = aVar14.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN14, aVar14.f());
                function2E14.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                mVar2 = mVarY;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var17;
                n3Var2 = n3VarI;
                eVar3 = eVarW;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                mVar2 = mVar;
                eVar3 = eVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                n3Var2 = n3Var;
            }
            cVar2 = cVarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        cVarW = cVar;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                i20 = i10;
                if (c0VarR.K(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                i14 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(i11)) {
                    i23 = 131072;
                } else {
                    i23 = 65536;
                }
                i14 |= i23;
            }
            i24 = i13 & 64;
            if (i24 != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.D(n3Var)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i13 & 128) != 0) {
                i14 |= 12582912;
            } else if ((i12 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i26 = 8388608;
                } else {
                    i26 = 4194304;
                }
                i14 |= i26;
            }
            if ((i14 & 4793491) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i33 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i34 != 0) {
                    eVarW = q.f16330a.w();
                } else {
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                    i29 = i17;
                } else {
                    i29 = i17;
                    mVarY = mVar;
                }
                if (i29 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                }
                if (i19 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i20;
                }
                if (i22 != 0) {
                    i31 = Integer.MAX_VALUE;
                } else {
                    i31 = i11;
                }
                if (i24 != 0) {
                    n3VarI = n3.f16241g.i();
                } else {
                    n3VarI = n3Var;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
                }
                i32 = 3670016 & i14;
                if (i32 == 1048576) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                } else {
                    objI0 = n3VarI.b();
                    c0VarR.Y(objI0);
                }
                y2Var = (y2) objI0;
                h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
                if (i32 == 1048576) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z11114 = z12;
                if ((29360128 & i14) == 8388608) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z11115 = z11114 | z13;
                if ((i14 & 458752) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                z15 = z11115 | z14;
                objI1 = c0VarR.i0();
                if (z15) {
                    obj = objI1;
                    ArrayList arrayList118 = new ArrayList();
                    arrayList118.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList118);
                    c0VarR.Y(arrayList118);
                    obj = arrayList118;
                } else {
                    obj = objI1;
                    ArrayList arrayList119 = new ArrayList();
                    arrayList119.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                    n3VarI.a(y2Var, arrayList119);
                    c0VarR.Y(arrayList119);
                    obj = arrayList119;
                }
                obj = objI1;
                Function2<androidx.compose.runtime.c0, Integer, Unit> function2E15 = androidx.compose.ui.layout.n0.e((List) obj);
                zD = c0VarR.D(h1VarH);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                } else {
                    objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.layout.a1 a1Var15 = (androidx.compose.ui.layout.a1) objI2;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0Var3);
                androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                androidx.compose.ui.a0 a0Var18 = a0Var3;
                function0A = aVar15.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1Var15, aVar15.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK15, aVar15.g());
                function2B = aVar15.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN15, aVar15.f());
                function2E15.invoke(c0VarR, 0);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0Var2 = c0VarR;
                mVar2 = mVarY;
                i27 = i30;
                i28 = i31;
                a0Var2 = a0Var18;
                n3Var2 = n3VarI;
                eVar3 = eVarW;
            } else {
                c0VarR.u();
                a0Var2 = a0Var;
                mVar2 = mVar;
                eVar3 = eVar2;
                c0Var2 = c0VarR;
                i27 = i20;
                i28 = i11;
                n3Var2 = n3Var;
            }
            cVar2 = cVarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            i14 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i12 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.K(i11)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i14 |= i23;
        }
        i24 = i13 & 64;
        if (i24 != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.D(n3Var)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i13 & 128) != 0) {
            i14 |= 12582912;
        } else if ((i12 & 12582912) == 0) {
            if (c0VarR.k0(nVar)) {
                i26 = 8388608;
            } else {
                i26 = 4194304;
            }
            i14 |= i26;
        }
        if ((i14 & 4793491) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            if (i33 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var;
            }
            if (i34 != 0) {
                eVarW = q.f16330a.w();
            } else {
                eVarW = eVar2;
            }
            if (i15 != 0) {
                mVarY = q.f16330a.y();
                i29 = i17;
            } else {
                i29 = i17;
                mVarY = mVar;
            }
            if (i29 != 0) {
                cVarW = androidx.compose.ui.e.f37317a.w();
            }
            if (i19 != 0) {
                i30 = Integer.MAX_VALUE;
            } else {
                i30 = i20;
            }
            if (i22 != 0) {
                i31 = Integer.MAX_VALUE;
            } else {
                i31 = i11;
            }
            if (i24 != 0) {
                n3VarI = n3.f16241g.i();
            } else {
                n3VarI = n3Var;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1956591841, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:99)");
            }
            i32 = 3670016 & i14;
            if (i32 == 1048576) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = n3VarI.b();
                c0VarR.Y(objI0);
            } else {
                objI0 = n3VarI.b();
                c0VarR.Y(objI0);
            }
            y2Var = (y2) objI0;
            h1VarH = H(eVarW, mVarY, cVarW, i30, i31, y2Var, c0VarR, (i14 >> 3) & androidx.media3.extractor.y0.f69665l);
            if (i32 == 1048576) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z11116 = z12;
            if ((29360128 & i14) == 8388608) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z11117 = z11116 | z13;
            if ((i14 & 458752) == 131072) {
                z14 = true;
            } else {
                z14 = false;
            }
            z15 = z11117 | z14;
            objI1 = c0VarR.i0();
            if (z15) {
                obj = objI1;
                ArrayList arrayList1110 = new ArrayList();
                arrayList1110.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                n3VarI.a(y2Var, arrayList1110);
                c0VarR.Y(arrayList1110);
                obj = arrayList1110;
            } else {
                obj = objI1;
                ArrayList arrayList1111 = new ArrayList();
                arrayList1111.add(androidx.compose.runtime.internal.w.c(-1192950673, true, new b(nVar)));
                n3VarI.a(y2Var, arrayList1111);
                c0VarR.Y(arrayList1111);
                obj = arrayList1111;
            }
            obj = objI1;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2E16 = androidx.compose.ui.layout.n0.e((List) obj);
            zD = c0VarR.D(h1VarH);
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                c0VarR.Y(objI2);
            } else {
                objI2 = androidx.compose.ui.layout.j1.a(h1VarH);
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.layout.a1 a1Var16 = (androidx.compose.ui.layout.a1) objI2;
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0Var3);
            androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
            androidx.compose.ui.a0 a0Var19 = a0Var3;
            function0A = aVar16.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1Var16, aVar16.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK16, aVar16.g());
            function2B = aVar16.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN16, aVar16.f());
            function2E16.invoke(c0VarR, 0);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var2 = c0VarR;
            mVar2 = mVarY;
            i27 = i30;
            i28 = i31;
            a0Var2 = a0Var19;
            n3Var2 = n3VarI;
            eVar3 = eVarW;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            mVar2 = mVar;
            eVar3 = eVar2;
            c0Var2 = c0VarR;
            i27 = i20;
            i28 = i11;
            n3Var2 = n3Var;
        }
        cVar2 = cVarW;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.r2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return t2.n(a0Var2, eVar3, mVar2, cVar2, i27, i28, n3Var2, nVar, i12, i13, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0131  */
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:107:0x017c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0187  */
    /* JADX WARN: Code duplicated, block: B:113:0x019d  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0095  */
    /* JADX WARN: Code duplicated, block: B:55:0x0098  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:89:0x0105  */
    /* JADX WARN: Code duplicated, block: B:91:0x0109  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x0125  */
    /* JADX WARN: Code duplicated, block: B:98:0x012e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void m(@Nullable androidx.compose.ui.a0 a0Var, @Nullable q.e eVar, @Nullable q.m mVar, @Nullable androidx.compose.ui.e.c cVar, int i10, int i11, @NotNull final pj.n<? super s3, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i12, final int i13) {
        androidx.compose.ui.a0 a0Var2;
        int i14;
        q.e eVar2;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.e.c cVar2;
        final androidx.compose.ui.a0 a0Var3;
        final q.e eVar3;
        final int i26;
        final q.m mVar2;
        final int i27;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i28;
        q.e eVarW;
        q.m mVarY;
        int i29;
        androidx.compose.ui.e.c cVarW;
        int i30;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1303174015);
        int i31 = i13 & 1;
        if (i31 != 0) {
            i14 = i12 | 6;
            a0Var2 = a0Var;
        } else if ((i12 & 6) == 0) {
            a0Var2 = a0Var;
            i14 = (c0VarR.D(a0Var2) ? 4 : 2) | i12;
        } else {
            a0Var2 = a0Var;
            i14 = i12;
        }
        int i32 = i13 & 2;
        if (i32 == 0) {
            if ((i12 & 48) == 0) {
                eVar2 = eVar;
                i14 |= c0VarR.D(eVar2) ? 32 : 16;
            }
            i15 = i13 & 4;
            if (i15 != 0) {
                if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                    if (c0VarR.D(mVar)) {
                        i16 = 256;
                    } else {
                        i16 = 128;
                    }
                    i14 |= i16;
                }
                i17 = i13 & 8;
                if (i17 != 0) {
                    if ((i12 & 3072) == 0) {
                        if (c0VarR.D(cVar)) {
                            i18 = 2048;
                        } else {
                            i18 = 1024;
                        }
                        i14 |= i18;
                    }
                    i19 = i13 & 16;
                    if (i19 != 0) {
                        if ((i12 & 24576) == 0) {
                            i20 = i10;
                            if (c0VarR.K(i20)) {
                                i21 = 16384;
                            } else {
                                i21 = 8192;
                            }
                            i14 |= i21;
                        }
                        i22 = i13 & 32;
                        if (i22 != 0) {
                            if ((196608 & i12) == 0) {
                                i23 = i11;
                                if (c0VarR.K(i23)) {
                                    i24 = 131072;
                                } else {
                                    i24 = 65536;
                                }
                                i14 |= i24;
                            }
                            if ((i13 & 64) != 0) {
                                i14 |= 1572864;
                            } else if ((i12 & 1572864) == 0) {
                                if (c0VarR.k0(nVar)) {
                                    i25 = 1048576;
                                } else {
                                    i25 = 524288;
                                }
                                i14 |= i25;
                            }
                            if ((i14 & 599187) != 599186) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (c0VarR.h(z10, i14 & 1)) {
                                if (i31 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i32 != 0) {
                                    eVarW = q.f16330a.w();
                                    i28 = i17;
                                } else {
                                    i28 = i17;
                                    eVarW = eVar2;
                                }
                                if (i15 != 0) {
                                    mVarY = q.f16330a.y();
                                } else {
                                    mVarY = mVar;
                                }
                                if (i28 != 0) {
                                    cVarW = androidx.compose.ui.e.f37317a.w();
                                    i29 = i19;
                                } else {
                                    i29 = i19;
                                    cVarW = cVar;
                                }
                                if (i29 != 0) {
                                    i20 = Integer.MAX_VALUE;
                                }
                                if (i22 != 0) {
                                    i30 = Integer.MAX_VALUE;
                                } else {
                                    i30 = i23;
                                }
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                                }
                                c0Var2 = c0VarR;
                                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                                eVar3 = eVarW;
                                mVar2 = mVarY;
                                cVar2 = cVarW;
                                i26 = i30;
                            } else {
                                c0Var2 = c0VarR;
                                c0Var2.u();
                                cVar2 = cVar;
                                a0Var3 = a0Var2;
                                eVar3 = eVar2;
                                i26 = i23;
                                mVar2 = mVar;
                            }
                            i27 = i20;
                            s5VarT = c0Var2.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i14 |= androidx.profileinstaller.n.c.f73814m;
                        i23 = i11;
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                eVarW = q.f16330a.w();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar;
                            }
                            if (i28 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                cVarW = cVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            c0Var2 = c0VarR;
                            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            cVar2 = cVarW;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cVar2 = cVar;
                            a0Var3 = a0Var2;
                            eVar3 = eVar2;
                            i26 = i23;
                            mVar2 = mVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= 24576;
                    i20 = i10;
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                eVarW = q.f16330a.w();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar;
                            }
                            if (i28 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                cVarW = cVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            c0Var2 = c0VarR;
                            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            cVar2 = cVarW;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cVar2 = cVar;
                            a0Var3 = a0Var2;
                            eVar3 = eVar2;
                            i26 = i23;
                            mVar2 = mVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 3072;
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                eVarW = q.f16330a.w();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar;
                            }
                            if (i28 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                cVarW = cVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            c0Var2 = c0VarR;
                            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            cVar2 = cVarW;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cVar2 = cVar;
                            a0Var3 = a0Var2;
                            eVar3 = eVar2;
                            i26 = i23;
                            mVar2 = mVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.media3.exoplayer.a5.S0;
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.D(cVar)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                eVarW = q.f16330a.w();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar;
                            }
                            if (i28 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                cVarW = cVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            c0Var2 = c0VarR;
                            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            cVar2 = cVarW;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cVar2 = cVar;
                            a0Var3 = a0Var2;
                            eVar3 = eVar2;
                            i26 = i23;
                            mVar2 = mVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    eVarW = q.f16330a.w();
                    i28 = i17;
                } else {
                    i28 = i17;
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar;
                }
                if (i28 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                    i29 = i19;
                } else {
                    i29 = i19;
                    cVarW = cVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                c0Var2 = c0VarR;
                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                eVar3 = eVarW;
                mVar2 = mVarY;
                cVar2 = cVarW;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cVar2 = cVar;
                a0Var3 = a0Var2;
                eVar3 = eVar2;
                i26 = i23;
                mVar2 = mVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 48;
        eVar2 = eVar;
        i15 = i13 & 4;
        if (i15 != 0) {
            if ((i12 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.D(mVar)) {
                    i16 = 256;
                } else {
                    i16 = 128;
                }
                i14 |= i16;
            }
            i17 = i13 & 8;
            if (i17 != 0) {
                if ((i12 & 3072) == 0) {
                    if (c0VarR.D(cVar)) {
                        i18 = 2048;
                    } else {
                        i18 = 1024;
                    }
                    i14 |= i18;
                }
                i19 = i13 & 16;
                if (i19 != 0) {
                    if ((i12 & 24576) == 0) {
                        i20 = i10;
                        if (c0VarR.K(i20)) {
                            i21 = 16384;
                        } else {
                            i21 = 8192;
                        }
                        i14 |= i21;
                    }
                    i22 = i13 & 32;
                    if (i22 != 0) {
                        if ((196608 & i12) == 0) {
                            i23 = i11;
                            if (c0VarR.K(i23)) {
                                i24 = 131072;
                            } else {
                                i24 = 65536;
                            }
                            i14 |= i24;
                        }
                        if ((i13 & 64) != 0) {
                            i14 |= 1572864;
                        } else if ((i12 & 1572864) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i25 = 1048576;
                            } else {
                                i25 = 524288;
                            }
                            i14 |= i25;
                        }
                        if ((i14 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i14 & 1)) {
                            if (i31 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i32 != 0) {
                                eVarW = q.f16330a.w();
                                i28 = i17;
                            } else {
                                i28 = i17;
                                eVarW = eVar2;
                            }
                            if (i15 != 0) {
                                mVarY = q.f16330a.y();
                            } else {
                                mVarY = mVar;
                            }
                            if (i28 != 0) {
                                cVarW = androidx.compose.ui.e.f37317a.w();
                                i29 = i19;
                            } else {
                                i29 = i19;
                                cVarW = cVar;
                            }
                            if (i29 != 0) {
                                i20 = Integer.MAX_VALUE;
                            }
                            if (i22 != 0) {
                                i30 = Integer.MAX_VALUE;
                            } else {
                                i30 = i23;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                            }
                            c0Var2 = c0VarR;
                            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            eVar3 = eVarW;
                            mVar2 = mVarY;
                            cVar2 = cVarW;
                            i26 = i30;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            cVar2 = cVar;
                            a0Var3 = a0Var2;
                            eVar3 = eVar2;
                            i26 = i23;
                            mVar2 = mVar;
                        }
                        i27 = i20;
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i14 |= androidx.profileinstaller.n.c.f73814m;
                    i23 = i11;
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= 24576;
                i20 = i10;
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 3072;
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    eVarW = q.f16330a.w();
                    i28 = i17;
                } else {
                    i28 = i17;
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar;
                }
                if (i28 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                    i29 = i19;
                } else {
                    i29 = i19;
                    cVarW = cVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                c0Var2 = c0VarR;
                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                eVar3 = eVarW;
                mVar2 = mVarY;
                cVar2 = cVarW;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cVar2 = cVar;
                a0Var3 = a0Var2;
                eVar3 = eVar2;
                i26 = i23;
                mVar2 = mVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.media3.exoplayer.a5.S0;
        i17 = i13 & 8;
        if (i17 != 0) {
            if ((i12 & 3072) == 0) {
                if (c0VarR.D(cVar)) {
                    i18 = 2048;
                } else {
                    i18 = 1024;
                }
                i14 |= i18;
            }
            i19 = i13 & 16;
            if (i19 != 0) {
                if ((i12 & 24576) == 0) {
                    i20 = i10;
                    if (c0VarR.K(i20)) {
                        i21 = 16384;
                    } else {
                        i21 = 8192;
                    }
                    i14 |= i21;
                }
                i22 = i13 & 32;
                if (i22 != 0) {
                    if ((196608 & i12) == 0) {
                        i23 = i11;
                        if (c0VarR.K(i23)) {
                            i24 = 131072;
                        } else {
                            i24 = 65536;
                        }
                        i14 |= i24;
                    }
                    if ((i13 & 64) != 0) {
                        i14 |= 1572864;
                    } else if ((i12 & 1572864) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i25 = 1048576;
                        } else {
                            i25 = 524288;
                        }
                        i14 |= i25;
                    }
                    if ((i14 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i14 & 1)) {
                        if (i31 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i32 != 0) {
                            eVarW = q.f16330a.w();
                            i28 = i17;
                        } else {
                            i28 = i17;
                            eVarW = eVar2;
                        }
                        if (i15 != 0) {
                            mVarY = q.f16330a.y();
                        } else {
                            mVarY = mVar;
                        }
                        if (i28 != 0) {
                            cVarW = androidx.compose.ui.e.f37317a.w();
                            i29 = i19;
                        } else {
                            i29 = i19;
                            cVarW = cVar;
                        }
                        if (i29 != 0) {
                            i20 = Integer.MAX_VALUE;
                        }
                        if (i22 != 0) {
                            i30 = Integer.MAX_VALUE;
                        } else {
                            i30 = i23;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                        }
                        c0Var2 = c0VarR;
                        l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        eVar3 = eVarW;
                        mVar2 = mVarY;
                        cVar2 = cVarW;
                        i26 = i30;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        cVar2 = cVar;
                        a0Var3 = a0Var2;
                        eVar3 = eVar2;
                        i26 = i23;
                        mVar2 = mVar;
                    }
                    i27 = i20;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i14 |= androidx.profileinstaller.n.c.f73814m;
                i23 = i11;
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= 24576;
            i20 = i10;
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    eVarW = q.f16330a.w();
                    i28 = i17;
                } else {
                    i28 = i17;
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar;
                }
                if (i28 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                    i29 = i19;
                } else {
                    i29 = i19;
                    cVarW = cVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                c0Var2 = c0VarR;
                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                eVar3 = eVarW;
                mVar2 = mVarY;
                cVar2 = cVarW;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cVar2 = cVar;
                a0Var3 = a0Var2;
                eVar3 = eVar2;
                i26 = i23;
                mVar2 = mVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 3072;
        i19 = i13 & 16;
        if (i19 != 0) {
            if ((i12 & 24576) == 0) {
                i20 = i10;
                if (c0VarR.K(i20)) {
                    i21 = 16384;
                } else {
                    i21 = 8192;
                }
                i14 |= i21;
            }
            i22 = i13 & 32;
            if (i22 != 0) {
                if ((196608 & i12) == 0) {
                    i23 = i11;
                    if (c0VarR.K(i23)) {
                        i24 = 131072;
                    } else {
                        i24 = 65536;
                    }
                    i14 |= i24;
                }
                if ((i13 & 64) != 0) {
                    i14 |= 1572864;
                } else if ((i12 & 1572864) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i25 = 1048576;
                    } else {
                        i25 = 524288;
                    }
                    i14 |= i25;
                }
                if ((i14 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i14 & 1)) {
                    if (i31 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i32 != 0) {
                        eVarW = q.f16330a.w();
                        i28 = i17;
                    } else {
                        i28 = i17;
                        eVarW = eVar2;
                    }
                    if (i15 != 0) {
                        mVarY = q.f16330a.y();
                    } else {
                        mVarY = mVar;
                    }
                    if (i28 != 0) {
                        cVarW = androidx.compose.ui.e.f37317a.w();
                        i29 = i19;
                    } else {
                        i29 = i19;
                        cVarW = cVar;
                    }
                    if (i29 != 0) {
                        i20 = Integer.MAX_VALUE;
                    }
                    if (i22 != 0) {
                        i30 = Integer.MAX_VALUE;
                    } else {
                        i30 = i23;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                    }
                    c0Var2 = c0VarR;
                    l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    eVar3 = eVarW;
                    mVar2 = mVarY;
                    cVar2 = cVarW;
                    i26 = i30;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    cVar2 = cVar;
                    a0Var3 = a0Var2;
                    eVar3 = eVar2;
                    i26 = i23;
                    mVar2 = mVar;
                }
                i27 = i20;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i14 |= androidx.profileinstaller.n.c.f73814m;
            i23 = i11;
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    eVarW = q.f16330a.w();
                    i28 = i17;
                } else {
                    i28 = i17;
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar;
                }
                if (i28 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                    i29 = i19;
                } else {
                    i29 = i19;
                    cVarW = cVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                c0Var2 = c0VarR;
                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                eVar3 = eVarW;
                mVar2 = mVarY;
                cVar2 = cVarW;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cVar2 = cVar;
                a0Var3 = a0Var2;
                eVar3 = eVar2;
                i26 = i23;
                mVar2 = mVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= 24576;
        i20 = i10;
        i22 = i13 & 32;
        if (i22 != 0) {
            if ((196608 & i12) == 0) {
                i23 = i11;
                if (c0VarR.K(i23)) {
                    i24 = 131072;
                } else {
                    i24 = 65536;
                }
                i14 |= i24;
            }
            if ((i13 & 64) != 0) {
                i14 |= 1572864;
            } else if ((i12 & 1572864) == 0) {
                if (c0VarR.k0(nVar)) {
                    i25 = 1048576;
                } else {
                    i25 = 524288;
                }
                i14 |= i25;
            }
            if ((i14 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i14 & 1)) {
                if (i31 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i32 != 0) {
                    eVarW = q.f16330a.w();
                    i28 = i17;
                } else {
                    i28 = i17;
                    eVarW = eVar2;
                }
                if (i15 != 0) {
                    mVarY = q.f16330a.y();
                } else {
                    mVarY = mVar;
                }
                if (i28 != 0) {
                    cVarW = androidx.compose.ui.e.f37317a.w();
                    i29 = i19;
                } else {
                    i29 = i19;
                    cVarW = cVar;
                }
                if (i29 != 0) {
                    i20 = Integer.MAX_VALUE;
                }
                if (i22 != 0) {
                    i30 = Integer.MAX_VALUE;
                } else {
                    i30 = i23;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
                }
                c0Var2 = c0VarR;
                l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                eVar3 = eVarW;
                mVar2 = mVarY;
                cVar2 = cVarW;
                i26 = i30;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                cVar2 = cVar;
                a0Var3 = a0Var2;
                eVar3 = eVar2;
                i26 = i23;
                mVar2 = mVar;
            }
            i27 = i20;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i14 |= androidx.profileinstaller.n.c.f73814m;
        i23 = i11;
        if ((i13 & 64) != 0) {
            i14 |= 1572864;
        } else if ((i12 & 1572864) == 0) {
            if (c0VarR.k0(nVar)) {
                i25 = 1048576;
            } else {
                i25 = 524288;
            }
            i14 |= i25;
        }
        if ((i14 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i14 & 1)) {
            if (i31 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (i32 != 0) {
                eVarW = q.f16330a.w();
                i28 = i17;
            } else {
                i28 = i17;
                eVarW = eVar2;
            }
            if (i15 != 0) {
                mVarY = q.f16330a.y();
            } else {
                mVarY = mVar;
            }
            if (i28 != 0) {
                cVarW = androidx.compose.ui.e.f37317a.w();
                i29 = i19;
            } else {
                i29 = i19;
                cVarW = cVar;
            }
            if (i29 != 0) {
                i20 = Integer.MAX_VALUE;
            }
            if (i22 != 0) {
                i30 = Integer.MAX_VALUE;
            } else {
                i30 = i23;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1303174015, i14, -1, "androidx.compose.foundation.layout.FlowRow (FlowLayout.kt:162)");
            }
            c0Var2 = c0VarR;
            l(a0Var4, eVarW, mVarY, cVarW, i20, i30, n3.f16241g.i(), nVar, c0Var2, (i14 & 14) | 1572864 | (i14 & com.planner5d.library.engine.input.f.b.B) | (i14 & 896) | (i14 & 7168) | (57344 & i14) | (458752 & i14) | ((i14 << 3) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            eVar3 = eVarW;
            mVar2 = mVarY;
            cVar2 = cVarW;
            i26 = i30;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            cVar2 = cVar;
            a0Var3 = a0Var2;
            eVar3 = eVar2;
            i26 = i23;
            mVar2 = mVar;
        }
        i27 = i20;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.s2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t2.o(a0Var3, eVar3, mVar2, cVar2, i27, i26, nVar, i12, i13, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.ui.a0 a0Var, q.e eVar, q.m mVar, androidx.compose.ui.e.c cVar, int i10, int i11, n3 n3Var, pj.n nVar, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        l(a0Var, eVar, mVar, cVar, i10, i11, n3Var, nVar, c0Var, androidx.compose.runtime.t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o(androidx.compose.ui.a0 a0Var, q.e eVar, q.m mVar, androidx.compose.ui.e.c cVar, int i10, int i11, pj.n nVar, int i12, int i13, androidx.compose.runtime.c0 c0Var, int i14) {
        m(a0Var, eVar, mVar, cVar, i10, i11, nVar, c0Var, androidx.compose.runtime.t4.a(i12 | 1), i13);
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final androidx.compose.ui.layout.b1 q(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull b3 b3Var, @NotNull Iterator<? extends androidx.compose.ui.layout.z0> it, float f10, float f11, long j10, int i10, int i11, @NotNull y2 y2Var) {
        int i12;
        k2.a aVarA;
        androidx.collection.t1 t1Var;
        int i13;
        int i14;
        int height;
        int width;
        androidx.collection.t1 t1Var2;
        androidx.collection.e0 e0VarA;
        int i15;
        androidx.collection.r1 r1Var;
        androidx.collection.r1 r1Var2;
        k2.a aVar;
        int i16;
        int i17;
        l2 l2VarI;
        androidx.compose.ui.layout.c1 c1Var2 = c1Var;
        b3 b3Var2 = b3Var;
        Iterator<? extends androidx.compose.ui.layout.z0> it2 = it;
        androidx.compose.runtime.collection.d dVar = new androidx.compose.runtime.collection.d(new androidx.compose.ui.layout.b1[16], 0);
        int iP = androidx.compose.ui.unit.b.p(j10);
        int iR = androidx.compose.ui.unit.b.r(j10);
        int iO = androidx.compose.ui.unit.b.o(j10);
        androidx.collection.t1 t1VarJ = androidx.collection.k0.j();
        ArrayList arrayList = new ArrayList();
        int iCeil = (int) Math.ceil(c1Var2.S7(f10));
        int iCeil2 = (int) Math.ceil(c1Var2.S7(f11));
        long jB = x4.b(0, iP, 0, iO);
        long jQ = x4.q(x4.f(jB, 0, 0, 0, 0, 14, null), b3Var2.i() ? i4.Horizontal : i4.Vertical);
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        z2 z2Var = it2 instanceof y0 ? new z2(0, 0, c1Var2.D3(iP), c1Var2.D3(iO), null) : null;
        androidx.compose.ui.layout.z0 z0VarI = !it2.hasNext() ? null : I(it2, z2Var);
        androidx.collection.e0 e0VarA2 = z0VarI != null ? androidx.collection.e0.a(C(z0VarI, b3Var2, jQ, new Function1() { // from class: androidx.compose.foundation.layout.p2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return t2.r(hVar, (androidx.compose.ui.layout.i2) obj);
            }
        })) : null;
        Integer numValueOf = e0VarA2 != null ? Integer.valueOf(androidx.collection.e0.h(e0VarA2.l())) : null;
        Integer numValueOf2 = e0VarA2 != null ? Integer.valueOf(androidx.collection.e0.i(e0VarA2.l())) : null;
        Integer num = numValueOf;
        androidx.compose.ui.layout.z0 z0Var = z0VarI;
        androidx.collection.r1 r1Var3 = new androidx.collection.r1(0, 1, null);
        androidx.collection.r1 r1Var4 = new androidx.collection.r1(0, 1, null);
        androidx.collection.u1 u1VarK = androidx.collection.m0.k();
        z2 z2Var2 = z2Var;
        k2 k2Var = new k2(i10, y2Var, j10, i11, iCeil, iCeil2, null);
        int i18 = iCeil;
        k2.b bVarB = k2Var.b(it2.hasNext(), 0, androidx.collection.e0.d(iP, iO), e0VarA2, 0, 0, 0, false, false);
        if (bVarB.a()) {
            aVarA = k2Var.a(bVarB, e0VarA2 != null, -1, 0, iP, 0);
            i12 = iP;
        } else {
            i12 = iP;
            aVarA = null;
        }
        Integer numValueOf3 = num;
        k2.a aVar2 = aVarA;
        androidx.collection.r1 r1Var5 = r1Var3;
        int i19 = 0;
        int i20 = 0;
        boolean z10 = false;
        int i21 = 0;
        k2.b bVar = bVarB;
        androidx.compose.ui.layout.z0 z0VarI2 = z0Var;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = i12;
        int i26 = iR;
        androidx.collection.u1 u1Var = u1VarK;
        int i27 = iO;
        while (!bVar.a() && z0VarI2 != null) {
            Intrinsics.checkNotNull(numValueOf3);
            int iIntValue = numValueOf3.intValue();
            Intrinsics.checkNotNull(numValueOf2);
            androidx.collection.r1 r1Var6 = r1Var4;
            int i28 = i12;
            int i29 = i20 + iIntValue;
            int iMax = Math.max(i23, numValueOf2.intValue());
            int i30 = i25 - iIntValue;
            int i31 = i19 + 1;
            int i32 = i26;
            y2Var.r(i31);
            arrayList.add(z0VarI2);
            t1VarJ.j0(i19, hVar.f312751a);
            Object objC = z0VarI2.c();
            t5 t5Var = objC instanceof t5 ? (t5) objC : null;
            if (((t5Var == null || (l2VarI = t5Var.i()) == null) ? null : Float.valueOf(l2VarI.d())) != null) {
                z10 = true;
            }
            int i33 = i31 - i24;
            boolean z11 = i33 < i10;
            if (z2Var2 != null) {
                int i34 = z11 ? i22 : i22 + 1;
                int i35 = z11 ? i33 : 0;
                if (z11) {
                    int i36 = i30 - i18;
                    i16 = i36 < 0 ? 0 : i36;
                } else {
                    i16 = i28;
                }
                float fD3 = c1Var2.D3(i16);
                if (z11) {
                    t1Var2 = t1VarJ;
                    i17 = i27;
                } else {
                    int i37 = (i27 - iMax) - iCeil2;
                    t1Var2 = t1VarJ;
                    i17 = i37 < 0 ? 0 : i37;
                }
                z2Var2.i(i34, i35, fD3, c1Var2.D3(i17));
                Unit unit = Unit.f312394a;
            } else {
                i33 = i33;
                t1Var2 = t1VarJ;
            }
            z0VarI2 = !it2.hasNext() ? null : I(it2, z2Var2);
            hVar.f312751a = null;
            androidx.collection.e0 e0VarA3 = z0VarI2 != null ? androidx.collection.e0.a(C(z0VarI2, b3Var2, jQ, new Function1() { // from class: androidx.compose.foundation.layout.q2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t2.s(hVar, (androidx.compose.ui.layout.i2) obj);
                }
            })) : null;
            Integer numValueOf4 = e0VarA3 != null ? Integer.valueOf(androidx.collection.e0.h(e0VarA3.l()) + i18) : null;
            numValueOf2 = e0VarA3 != null ? Integer.valueOf(androidx.collection.e0.i(e0VarA3.l())) : null;
            boolean zHasNext = it2.hasNext();
            int i38 = i22;
            long jD = androidx.collection.e0.d(i30, i27);
            if (e0VarA3 == null) {
                e0VarA = null;
            } else {
                Intrinsics.checkNotNull(numValueOf4);
                int iIntValue2 = numValueOf4.intValue();
                Intrinsics.checkNotNull(numValueOf2);
                e0VarA = androidx.collection.e0.a(androidx.collection.e0.d(iIntValue2, numValueOf2.intValue()));
            }
            k2.b bVarB2 = k2Var.b(zHasNext, i33, jD, e0VarA, i38, i21, iMax, false, false);
            if (bVarB2.b()) {
                int iMin = Math.min(Math.max(i32, i29), i28);
                int i39 = i21 + iMax;
                k2.a aVarA2 = k2Var.a(bVarB2, e0VarA3 != null, i38, i39, i30, i33);
                r1Var = r1Var6;
                r1Var.b0(iMax);
                androidx.collection.u1 u1Var2 = u1Var;
                if (z10) {
                    u1Var2.U(i38);
                }
                int i40 = (iO - i39) - iCeil2;
                u1Var = u1Var2;
                r1Var2 = r1Var5;
                r1Var2.b0(i31);
                i22 = i38 + 1;
                i21 = i39 + iCeil2;
                i28 = i28;
                i24 = i31;
                numValueOf3 = numValueOf4 != null ? Integer.valueOf(numValueOf4.intValue() - i18) : null;
                i29 = 0;
                z10 = false;
                i15 = 0;
                i26 = iMin;
                aVar = aVarA2;
                i27 = i40;
                i25 = i28;
            } else {
                i15 = iMax;
                r1Var = r1Var6;
                r1Var2 = r1Var5;
                numValueOf3 = numValueOf4;
                i25 = i30;
                i22 = i38;
                i26 = i32;
                aVar = aVar2;
            }
            r1Var5 = r1Var2;
            aVar2 = aVar;
            u1Var = u1Var;
            i19 = i31;
            bVar = bVarB2;
            i23 = i15;
            it2 = it;
            r1Var4 = r1Var;
            t1VarJ = t1Var2;
            i20 = i29;
            i12 = i28;
        }
        androidx.collection.t1 t1Var3 = t1VarJ;
        androidx.collection.r1 r1Var7 = r1Var4;
        int i41 = i26;
        androidx.collection.r1 r1Var8 = r1Var5;
        androidx.collection.u1 u1Var3 = u1Var;
        if (aVar2 != null) {
            arrayList.add(aVar2.a());
            t1Var = t1Var3;
            t1Var.j0(arrayList.size() - 1, aVar2.d());
            int i42 = r1Var8.f12216b - 1;
            if (aVar2.c()) {
                int i43 = r1Var8.f12216b - 1;
                r1Var7.w0(i42, Math.max(r1Var7.w(i42), androidx.collection.e0.i(aVar2.b())));
                r1Var8.w0(i43, r1Var8.V() + 1);
                Unit unit2 = Unit.f312394a;
            } else {
                r1Var7.b0(androidx.collection.e0.i(aVar2.b()));
                r1Var8.b0(r1Var8.V() + 1);
            }
        } else {
            t1Var = t1Var3;
        }
        int size = arrayList.size();
        androidx.compose.ui.layout.i2[] i2VarArr = new androidx.compose.ui.layout.i2[size];
        for (int i44 = 0; i44 < size; i44++) {
            i2VarArr[i44] = t1Var.n(i44);
        }
        int i45 = r1Var8.f12216b;
        int[] iArr = new int[i45];
        int[] iArr2 = new int[i45];
        int[] iArr3 = r1Var8.f12215a;
        int iMax2 = i41;
        int i46 = 0;
        int i47 = 0;
        int i48 = 0;
        while (i47 < i45) {
            int i49 = iArr3[i47];
            int iW = r1Var7.w(i47);
            if (!u1Var3.d(i47)) {
                iW = androidx.compose.ui.unit.b.o(jB) == Integer.MAX_VALUE ? Integer.MAX_VALUE : androidx.compose.ui.unit.b.o(jB) - i48;
            }
            androidx.collection.u1 u1Var4 = u1Var3;
            androidx.collection.r1 r1Var9 = r1Var7;
            int i50 = iW;
            b3 b3Var3 = b3Var2;
            ArrayList arrayList2 = arrayList;
            int i51 = i18;
            androidx.compose.ui.layout.b1 b1VarA = s5.a(b3Var3, iMax2, androidx.compose.ui.unit.b.q(jB), androidx.compose.ui.unit.b.p(jB), i50, i51, c1Var2, arrayList2, i2VarArr, i46, i49, iArr, i47);
            if (b3Var.i()) {
                height = b1VarA.getWidth();
                width = b1VarA.getHeight();
            } else {
                height = b1VarA.getHeight();
                width = b1VarA.getWidth();
            }
            iArr2[i47] = width;
            i48 += width;
            iMax2 = Math.max(iMax2, height);
            dVar.d(b1VarA);
            i47++;
            arrayList = arrayList2;
            i46 = i49;
            r1Var7 = r1Var9;
            i18 = i51;
            u1Var3 = u1Var4;
            c1Var2 = c1Var;
            b3Var2 = b3Var;
        }
        if (dVar.R() == 0) {
            i13 = 0;
            i14 = 0;
        } else {
            i13 = iMax2;
            i14 = i48;
        }
        return E(c1Var, j10, i13, i14, iArr2, dVar, b3Var, iArr);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit r(kotlin.jvm.internal.i1.h hVar, androidx.compose.ui.layout.i2 i2Var) {
        hVar.f312751a = i2Var;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit s(kotlin.jvm.internal.i1.h hVar, androidx.compose.ui.layout.i2 i2Var) {
        hVar.f312751a = i2Var;
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @kotlin.a1
    @NotNull
    public static final androidx.compose.ui.layout.a1 t(@NotNull q.m mVar, @NotNull q.e eVar, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2013098357, i11, -1, "androidx.compose.foundation.layout.columnMeasurementHelper (FlowLayout.kt:500)");
        }
        boolean z10 = ((((i11 & 14) ^ 6) > 4 && c0Var.D(mVar)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(eVar)) || (i11 & 48) == 32) | ((((i11 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.K(i10)) || (i11 & androidx.media3.exoplayer.a5.S0) == 256);
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new c(new j3(false, eVar, mVar, mVar.a(), f16428b, eVar.a(), i10, Integer.MAX_VALUE, n3.f16241g.k().b(), null));
            c0Var.Y(objI0);
        }
        androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a1Var;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.layout.h1 u(@NotNull q.m mVar, @NotNull q.e eVar, @NotNull androidx.compose.ui.e.b bVar, int i10, int i11, @NotNull y2 y2Var, @Nullable androidx.compose.runtime.c0 c0Var, int i12) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-308635847, i12, -1, "androidx.compose.foundation.layout.columnMeasurementMultiContentHelper (FlowLayout.kt:528)");
        }
        boolean zD = ((((i12 & 14) ^ 6) > 4 && c0Var.D(mVar)) || (i12 & 6) == 4) | ((((i12 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(eVar)) || (i12 & 48) == 32) | ((((i12 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(bVar)) || (i12 & androidx.media3.exoplayer.a5.S0) == 256) | ((((i12 & 7168) ^ 3072) > 2048 && c0Var.K(i10)) || (i12 & 3072) == 2048) | ((((57344 & i12) ^ 24576) > 16384 && c0Var.K(i11)) || (i12 & 24576) == 16384) | c0Var.D(y2Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            j3 j3Var = new j3(false, eVar, mVar, mVar.a(), k1.f16162a.i(bVar), eVar.a(), i10, i11, y2Var, null);
            c0Var.Y(j3Var);
            objI0 = j3Var;
        }
        j3 j3Var2 = (j3) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return j3Var2;
    }

    public static final int v(@NotNull androidx.compose.ui.layout.y yVar, boolean z10, int i10) {
        return z10 ? yVar.D0(i10) : yVar.L0(i10);
    }

    @NotNull
    public static final k1 w() {
        return f16428b;
    }

    @NotNull
    public static final k1 x() {
        return f16427a;
    }

    private static final long y(List<? extends androidx.compose.ui.layout.y> list, pj.n<? super androidx.compose.ui.layout.y, ? super Integer, ? super Integer, Integer> nVar, pj.n<? super androidx.compose.ui.layout.y, ? super Integer, ? super Integer, Integer> nVar2, int i10, int i11, int i12, int i13, int i14, y2 y2Var) {
        int i15;
        if (list.isEmpty()) {
            return androidx.collection.e0.d(0, 0);
        }
        k2 k2Var = new k2(i13, y2Var, x4.b(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        androidx.compose.ui.layout.y yVar = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, 0);
        int iIntValue = yVar != null ? nVar2.invoke(yVar, 0, Integer.valueOf(i10)).intValue() : 0;
        int iIntValue2 = yVar != null ? nVar.invoke(yVar, 0, Integer.valueOf(iIntValue)).intValue() : 0;
        int i16 = 0;
        int iMax = 0;
        if (k2Var.b(list.size() > 1, 0, androidx.collection.e0.d(i10, Integer.MAX_VALUE), yVar == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(iIntValue2, iIntValue)), 0, 0, 0, false, false).a()) {
            androidx.collection.e0 e0VarI = y2Var.i(yVar != null, 0, 0);
            return androidx.collection.e0.d(e0VarI != null ? androidx.collection.e0.i(e0VarI.l()) : 0, 0);
        }
        int size = list.size();
        int i17 = i10;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        while (true) {
            int i22 = iMax;
            if (i18 >= size) {
                i15 = i19;
                break;
            }
            int i23 = i17 - iIntValue2;
            int i24 = i18 + 1;
            iMax = Math.max(i22, iIntValue);
            androidx.compose.ui.layout.y yVar2 = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, i24);
            int iIntValue3 = yVar2 != null ? nVar2.invoke(yVar2, Integer.valueOf(i24), Integer.valueOf(i10)).intValue() : 0;
            int iIntValue4 = yVar2 != null ? nVar.invoke(yVar2, Integer.valueOf(i24), Integer.valueOf(iIntValue3)).intValue() + i11 : 0;
            int i25 = i24 - i20;
            i15 = i24;
            int i26 = i21;
            k2.b bVarB = k2Var.b(i18 + 2 < list.size(), i25, androidx.collection.e0.d(i23, Integer.MAX_VALUE), yVar2 == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(iIntValue4, iIntValue3)), i26, i16, iMax, false, false);
            if (bVarB.b()) {
                int i27 = i16 + iMax + i12;
                k2.a aVarA = k2Var.a(bVarB, yVar2 != null, i26, i27, i23, i25);
                iIntValue4 -= i11;
                i21 = i26 + 1;
                if (bVarB.a()) {
                    if (aVarA != null) {
                        long jB = aVarA.b();
                        if (!aVarA.c()) {
                            i27 += androidx.collection.e0.i(jB) + i12;
                        }
                    }
                    i16 = i27;
                    break;
                }
                i17 = i10;
                i20 = i15;
                i16 = i27;
                iMax = 0;
            } else {
                i17 = i23;
                i21 = i26;
            }
            iIntValue2 = iIntValue4;
            iIntValue = iIntValue3;
            i18 = i15;
            i19 = i18;
        }
        return androidx.collection.e0.d(i16 - i12, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long z(List<? extends androidx.compose.ui.layout.y> list, int[] iArr, int[] iArr2, int i10, int i11, int i12, int i13, int i14, y2 y2Var) {
        if (list.isEmpty()) {
            return androidx.collection.e0.d(0, 0);
        }
        k2 k2Var = new k2(i13, y2Var, x4.b(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
        androidx.compose.ui.layout.y yVar = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, 0);
        int i15 = yVar != null ? iArr2[0] : 0;
        int i16 = yVar != null ? iArr[0] : 0;
        int i17 = 0;
        if (k2Var.b(list.size() > 1, 0, androidx.collection.e0.d(i10, Integer.MAX_VALUE), yVar == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(i16, i15)), 0, 0, 0, false, false).a()) {
            androidx.collection.e0 e0VarI = y2Var.i(yVar != null, 0, 0);
            return androidx.collection.e0.d(e0VarI != null ? androidx.collection.e0.i(e0VarI.l()) : 0, 0);
        }
        int size = list.size();
        int i18 = i10;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i19 < size) {
            int i24 = i18 - i16;
            int i25 = i19 + 1;
            int iMax = Math.max(i23, i15);
            androidx.compose.ui.layout.y yVar2 = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, i25);
            int i26 = yVar2 != null ? iArr2[i25] : 0;
            int i27 = yVar2 != null ? iArr[i25] + i11 : 0;
            int i28 = i25 - i21;
            int i29 = i22;
            int i30 = i26;
            int i31 = i27;
            k2.b bVarB = k2Var.b(i19 + 2 < list.size(), i28, androidx.collection.e0.d(i24, Integer.MAX_VALUE), yVar2 == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(i27, i26)), i29, i17, iMax, false, false);
            if (bVarB.b()) {
                int i32 = i17 + iMax + i12;
                k2.a aVarA = k2Var.a(bVarB, yVar2 != null, i29, i32, i24, i28);
                int i33 = i31 - i11;
                i22 = i29 + 1;
                if (bVarB.a()) {
                    if (aVarA != null) {
                        long jB = aVarA.b();
                        if (!aVarA.c()) {
                            i32 += androidx.collection.e0.i(jB) + i12;
                        }
                    }
                    i17 = i32;
                    i20 = i25;
                    break;
                }
                i23 = 0;
                i17 = i32;
                i16 = i33;
                i21 = i25;
                i18 = i10;
            } else {
                i18 = i24;
                i22 = i29;
                i23 = iMax;
                i16 = i31;
            }
            i19 = i25;
            i20 = i19;
            i15 = i30;
        }
        return androidx.collection.e0.d(i17 - i12, i20);
    }
}
