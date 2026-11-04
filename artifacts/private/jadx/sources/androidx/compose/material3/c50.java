package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1663:1\n117#2,2:1664\n34#2,6:1666\n119#2:1672\n117#2,2:1673\n34#2,6:1675\n119#2:1681\n117#2,2:1682\n34#2,6:1684\n119#2:1690\n117#2,2:1691\n34#2,6:1693\n119#2:1699\n117#2,2:1700\n34#2,6:1702\n119#2:1708\n117#2,2:1709\n34#2,6:1711\n119#2:1717\n563#2,2:1718\n34#2,6:1720\n565#2:1726\n117#2,2:1727\n34#2,6:1729\n119#2:1735\n563#2,2:1736\n34#2,6:1738\n565#2:1744\n563#2,2:1745\n34#2,6:1747\n565#2:1753\n117#2,2:1754\n34#2,6:1756\n119#2:1762\n117#2,2:1764\n34#2,6:1766\n119#2:1772\n117#2,2:1773\n34#2,6:1775\n119#2:1781\n117#2,2:1782\n34#2,6:1784\n119#2:1790\n117#2,2:1791\n34#2,6:1793\n119#2:1799\n117#2,2:1800\n34#2,6:1802\n119#2:1808\n117#2,2:1809\n34#2,6:1811\n119#2:1817\n117#2,2:1818\n34#2,6:1820\n119#2:1826\n117#2,2:1827\n34#2,6:1829\n119#2:1835\n117#2,2:1836\n34#2,6:1838\n119#2:1844\n117#2,2:1845\n34#2,6:1847\n119#2:1853\n563#2,2:1854\n34#2,6:1856\n565#2:1862\n117#2,2:1863\n34#2,6:1865\n119#2:1871\n117#2,2:1872\n34#2,6:1874\n119#2:1880\n1#3:1763\n49#4:1881\n68#4:1882\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material3/TextFieldMeasurePolicy\n*L\n833#1:1664,2\n833#1:1666,6\n833#1:1672\n840#1:1673,2\n840#1:1675,6\n840#1:1681\n848#1:1682,2\n848#1:1684,6\n848#1:1690\n856#1:1691,2\n856#1:1693,6\n856#1:1699\n862#1:1700,2\n862#1:1702,6\n862#1:1708\n882#1:1709,2\n882#1:1711,6\n882#1:1717\n899#1:1718,2\n899#1:1720,6\n899#1:1726\n905#1:1727,2\n905#1:1729,6\n905#1:1735\n961#1:1736,2\n961#1:1738,6\n961#1:1744\n1069#1:1745,2\n1069#1:1747,6\n1069#1:1753\n1072#1:1754,2\n1072#1:1756,6\n1072#1:1762\n1076#1:1764,2\n1076#1:1766,6\n1076#1:1772\n1080#1:1773,2\n1080#1:1775,6\n1080#1:1781\n1084#1:1782,2\n1084#1:1784,6\n1084#1:1790\n1088#1:1791,2\n1088#1:1793,6\n1088#1:1799\n1092#1:1800,2\n1092#1:1802,6\n1092#1:1808\n1114#1:1809,2\n1114#1:1811,6\n1114#1:1817\n1124#1:1818,2\n1124#1:1820,6\n1124#1:1826\n1134#1:1827,2\n1134#1:1829,6\n1134#1:1835\n1139#1:1836,2\n1139#1:1838,6\n1139#1:1844\n1150#1:1845,2\n1150#1:1847,6\n1150#1:1853\n1161#1:1854,2\n1161#1:1856,6\n1161#1:1862\n1164#1:1863,2\n1164#1:1865,6\n1164#1:1871\n1169#1:1872,2\n1169#1:1874,6\n1169#1:1880\n1223#1:1881\n1243#1:1882\n*E\n"})
final class c50 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f26474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final v40 f26475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.o2 f26476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f26477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final float f26478e;

    public /* synthetic */ c50(boolean z10, v40 v40Var, androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.g5 g5Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, v40Var, o2Var, g5Var, f10);
    }

    private final int k(androidx.compose.ui.unit.d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j10, boolean z10, float f10) {
        int iG6 = dVar.g6(androidx.compose.ui.unit.h.r(this.f26477d.d() + this.f26477d.a())) + ((i11 <= 0 || z10) ? 0 : Math.max(dVar.g6(androidx.compose.ui.unit.h.r(this.f26478e * 2)), androidx.compose.ui.util.e.s(0, i11, d0.i1.f268232a.a().a(f10)))) + kotlin.comparisons.a.T(i10, i16, i14, i15, z10 ? 0 : androidx.compose.ui.util.e.s(i11, 0, f10));
        if (!z10) {
            i11 = 0;
        }
        return androidx.compose.ui.unit.c.h(j10, i11 + Math.max(i12, Math.max(i13, iG6)) + i17);
    }

    private final int l(int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10) {
        int i17 = i12 + i13;
        return androidx.compose.ui.unit.c.i(j10, i10 + Math.max(i14 + i17, Math.max(i16 + i17, i15)) + i11);
    }

    private final int n(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        int i11;
        int iD;
        int iIntValue;
        androidx.compose.ui.layout.y yVar2;
        int iIntValue2;
        androidx.compose.ui.layout.y yVar3;
        androidx.compose.ui.layout.y yVar4;
        int iD2;
        int i12;
        androidx.compose.ui.layout.y yVar5;
        int iIntValue3;
        int i13;
        androidx.compose.ui.layout.y yVar6;
        androidx.compose.ui.layout.y yVar7;
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size) {
                yVar = null;
                break;
            }
            yVar = list.get(i14);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar), "Leading")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.y yVar8 = yVar;
        if (yVar8 != null) {
            i11 = i10;
            iD = androidx.compose.material3.internal.u2.d(i11, yVar8.M0(Integer.MAX_VALUE));
            iIntValue = function2.invoke(yVar8, Integer.valueOf(i11)).intValue();
        } else {
            i11 = i10;
            iD = i11;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size2) {
                yVar2 = null;
                break;
            }
            yVar2 = list.get(i15);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), "Trailing")) {
                break;
            }
            i15++;
        }
        androidx.compose.ui.layout.y yVar9 = yVar2;
        if (yVar9 != null) {
            iD = androidx.compose.material3.internal.u2.d(iD, yVar9.M0(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(yVar9, Integer.valueOf(i11)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size3) {
                yVar3 = null;
                break;
            }
            yVar3 = list.get(i16);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar3), "Label")) {
                break;
            }
            i16++;
        }
        androidx.compose.ui.layout.y yVar10 = yVar3;
        int iIntValue4 = yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(iD)).intValue() : 0;
        int size4 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size4) {
                yVar4 = null;
                break;
            }
            yVar4 = list.get(i17);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar4), androidx.compose.material3.internal.b4.f28676f)) {
                break;
            }
            i17++;
        }
        androidx.compose.ui.layout.y yVar11 = yVar4;
        if (yVar11 != null) {
            int iIntValue5 = function2.invoke(yVar11, Integer.valueOf(iD)).intValue();
            int iD3 = androidx.compose.material3.internal.u2.d(iD, yVar11.M0(Integer.MAX_VALUE));
            i12 = iIntValue5;
            iD2 = iD3;
        } else {
            iD2 = iD;
            i12 = 0;
        }
        int size5 = list2.size();
        int i18 = 0;
        while (true) {
            if (i18 >= size5) {
                yVar5 = null;
                break;
            }
            yVar5 = list.get(i18);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar5), androidx.compose.material3.internal.b4.f28677g)) {
                break;
            }
            i18++;
        }
        androidx.compose.ui.layout.y yVar12 = yVar5;
        if (yVar12 != null) {
            iIntValue3 = function2.invoke(yVar12, Integer.valueOf(iD2)).intValue();
            iD2 = androidx.compose.material3.internal.u2.d(iD2, yVar12.M0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size6 = list2.size();
        for (int i19 = 0; i19 < size6; i19++) {
            androidx.compose.ui.layout.y yVar13 = list.get(i19);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar13), "TextField")) {
                int iIntValue6 = function2.invoke(yVar13, Integer.valueOf(iD2)).intValue();
                List<? extends androidx.compose.ui.layout.y> list3 = list;
                int size7 = list3.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size7) {
                        i13 = iIntValue6;
                        yVar6 = null;
                        break;
                    }
                    yVar6 = list.get(i20);
                    i13 = iIntValue6;
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar6), "Hint")) {
                        break;
                    }
                    i20++;
                    iIntValue6 = i13;
                }
                androidx.compose.ui.layout.y yVar14 = yVar6;
                int iIntValue7 = yVar14 != null ? function2.invoke(yVar14, Integer.valueOf(iD2)).intValue() : 0;
                int size8 = list3.size();
                int i21 = 0;
                while (true) {
                    if (i21 >= size8) {
                        yVar7 = null;
                        break;
                    }
                    yVar7 = list.get(i21);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar7), androidx.compose.material3.internal.b4.f28678h)) {
                        break;
                    }
                    i21++;
                }
                androidx.compose.ui.layout.y yVar15 = yVar7;
                return k(zVar, i13, iIntValue4, iIntValue, iIntValue2, i12, iIntValue3, iIntValue7, yVar15 != null ? function2.invoke(yVar15, Integer.valueOf(i11)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), this.f26475b instanceof v40.a, this.f26476c.invoke());
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    private final int p(List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        androidx.compose.ui.layout.y yVar2;
        androidx.compose.ui.layout.y yVar3;
        androidx.compose.ui.layout.y yVar4;
        androidx.compose.ui.layout.y yVar5;
        androidx.compose.ui.layout.y yVar6;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.y yVar7 = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar7), "TextField")) {
                int iIntValue = function2.invoke(yVar7, Integer.valueOf(i10)).intValue();
                List<? extends androidx.compose.ui.layout.y> list2 = list;
                int size2 = list2.size();
                int i12 = 0;
                while (true) {
                    yVar = null;
                    if (i12 >= size2) {
                        yVar2 = null;
                        break;
                    }
                    yVar2 = list.get(i12);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), "Label")) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.layout.y yVar8 = yVar2;
                int iIntValue2 = yVar8 != null ? function2.invoke(yVar8, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        yVar3 = null;
                        break;
                    }
                    yVar3 = list.get(i13);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                androidx.compose.ui.layout.y yVar9 = yVar3;
                int iIntValue3 = yVar9 != null ? function2.invoke(yVar9, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        yVar4 = null;
                        break;
                    }
                    yVar4 = list.get(i14);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar4), androidx.compose.material3.internal.b4.f28676f)) {
                        break;
                    }
                    i14++;
                }
                androidx.compose.ui.layout.y yVar10 = yVar4;
                int iIntValue4 = yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list2.size();
                int i15 = 0;
                while (true) {
                    if (i15 >= size5) {
                        yVar5 = null;
                        break;
                    }
                    yVar5 = list.get(i15);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar5), androidx.compose.material3.internal.b4.f28677g)) {
                        break;
                    }
                    i15++;
                }
                androidx.compose.ui.layout.y yVar11 = yVar5;
                int iIntValue5 = yVar11 != null ? function2.invoke(yVar11, Integer.valueOf(i10)).intValue() : 0;
                int size6 = list2.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size6) {
                        yVar6 = null;
                        break;
                    }
                    yVar6 = list.get(i16);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar6), "Leading")) {
                        break;
                    }
                    i16++;
                }
                androidx.compose.ui.layout.y yVar12 = yVar6;
                int iIntValue6 = yVar12 != null ? function2.invoke(yVar12, Integer.valueOf(i10)).intValue() : 0;
                int size7 = list2.size();
                for (int i17 = 0; i17 < size7; i17++) {
                    androidx.compose.ui.layout.y yVar13 = list.get(i17);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar13), "Hint")) {
                        yVar = yVar13;
                        break;
                    }
                }
                androidx.compose.ui.layout.y yVar14 = yVar;
                return l(iIntValue6, iIntValue3, iIntValue4, iIntValue5, iIntValue, iIntValue2, yVar14 != null ? function2.invoke(yVar14, Integer.valueOf(i10)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null));
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int q(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit t(kotlin.jvm.internal.i1.h hVar, boolean z10, c50 c50Var, int i10, int i11, androidx.compose.ui.layout.c1 c1Var, int i12, int i13, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, androidx.compose.ui.layout.i2 i2Var6, androidx.compose.ui.layout.i2 i2Var7, androidx.compose.ui.layout.i2 i2Var8, float f10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.c1 c1Var2;
        int iG6;
        int i14;
        if (hVar.f312751a != 0) {
            if (z10) {
                c1Var2 = c1Var;
                i14 = 0;
            } else {
                if (c50Var.f26474a) {
                    iG6 = androidx.compose.ui.e.f37317a.q().a(((androidx.compose.ui.layout.i2) hVar.f312751a).c1(), i10);
                    c1Var2 = c1Var;
                } else {
                    c1Var2 = c1Var;
                    iG6 = i11 + c1Var2.g6(c50Var.f26478e);
                }
                i14 = iG6;
            }
            int i15 = z10 ? 0 : i11;
            T t10 = hVar.f312751a;
            c50Var.x(aVar, i12, i13, i2Var, (androidx.compose.ui.layout.i2) t10, i2Var2, i2Var3, i2Var4, i2Var5, i2Var6, i2Var7, i2Var8, i14, i15, z10, f10, i11 + (z10 ? 0 : ((androidx.compose.ui.layout.i2) t10).c1()), c1Var2.getLayoutDirection());
        } else {
            c50Var.y(aVar, i12, i13, i2Var, i2Var2, i2Var3, i2Var4, i2Var5, i2Var6, i2Var7, i2Var8, c1Var.getDensity());
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int u(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.L0(i10);
    }

    private final void x(androidx.compose.ui.layout.i2.a aVar, int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, androidx.compose.ui.layout.i2 i2Var6, androidx.compose.ui.layout.i2 i2Var7, androidx.compose.ui.layout.i2 i2Var8, androidx.compose.ui.layout.i2 i2Var9, int i12, int i13, boolean z10, float f10, int i14, androidx.compose.ui.unit.w wVar) {
        int iC1 = z10 ? i2Var2.c1() : 0;
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var8, 0, iC1, 0.0f, 4, null);
        int iA = (i11 - androidx.compose.material3.internal.u2.a(i2Var9)) - (z10 ? i2Var2.c1() : 0);
        if (i2Var4 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, 0, iC1 + androidx.compose.ui.e.f37317a.q().a(i2Var4.c1(), iA), 0.0f, 4, null);
        }
        int iS = androidx.compose.ui.util.e.s(i12, i13, f10);
        if (z10) {
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, androidx.compose.material3.internal.b4.I(this.f26475b).a(i2Var2.h1(), i10, wVar), iS, 0.0f, 4, null);
        } else {
            int iC = wVar == androidx.compose.ui.unit.w.Ltr ? androidx.compose.material3.internal.u2.c(i2Var4) : androidx.compose.material3.internal.u2.c(i2Var5);
            androidx.compose.ui.layout.i2.a.P(aVar, i2Var2, androidx.compose.ui.util.e.s(androidx.compose.material3.internal.b4.E(this.f26475b).a(i2Var2.h1(), (i10 - androidx.compose.material3.internal.u2.c(i2Var4)) - androidx.compose.material3.internal.u2.c(i2Var5), wVar) + iC, androidx.compose.material3.internal.b4.I(this.f26475b).a(i2Var2.h1(), (i10 - androidx.compose.material3.internal.u2.c(i2Var4)) - androidx.compose.material3.internal.u2.c(i2Var5), wVar) + iC, f10), iS, 0.0f, 4, null);
        }
        if (i2Var6 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var6, androidx.compose.material3.internal.u2.c(i2Var4), iC1 + i14, 0.0f, 4, null);
        }
        int iC2 = androidx.compose.material3.internal.u2.c(i2Var4) + androidx.compose.material3.internal.u2.c(i2Var6);
        int i15 = iC1 + i14;
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, iC2, i15, 0.0f, 4, null);
        if (i2Var3 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, iC2, i15, 0.0f, 4, null);
        }
        if (i2Var7 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var7, (i10 - androidx.compose.material3.internal.u2.c(i2Var5)) - i2Var7.h1(), i15, 0.0f, 4, null);
        }
        if (i2Var5 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var5, i10 - i2Var5.h1(), iC1 + androidx.compose.ui.e.f37317a.q().a(i2Var5.c1(), iA), 0.0f, 4, null);
        }
        if (i2Var9 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var9, 0, iC1 + iA, 0.0f, 4, null);
        }
    }

    private final void y(androidx.compose.ui.layout.i2.a aVar, int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, androidx.compose.ui.layout.i2 i2Var6, androidx.compose.ui.layout.i2 i2Var7, androidx.compose.ui.layout.i2 i2Var8, float f10) {
        androidx.compose.ui.layout.i2.a.V(aVar, i2Var7, androidx.compose.ui.unit.q.f42709b.b(), 0.0f, 2, null);
        int iA = i11 - androidx.compose.material3.internal.u2.a(i2Var8);
        int iL0 = kotlin.math.b.L0(this.f26477d.d() * f10);
        if (i2Var3 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, 0, androidx.compose.ui.e.f37317a.q().a(i2Var3.c1(), iA), 0.0f, 4, null);
        }
        if (i2Var5 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var5, androidx.compose.material3.internal.u2.c(i2Var3), z(this, iA, iL0, i2Var5), 0.0f, 4, null);
        }
        int iC = androidx.compose.material3.internal.u2.c(i2Var5) + androidx.compose.material3.internal.u2.c(i2Var3);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, iC, z(this, iA, iL0, i2Var), 0.0f, 4, null);
        if (i2Var2 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, iC, z(this, iA, iL0, i2Var2), 0.0f, 4, null);
        }
        if (i2Var6 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var6, (i10 - androidx.compose.material3.internal.u2.c(i2Var4)) - i2Var6.h1(), z(this, iA, iL0, i2Var6), 0.0f, 4, null);
        }
        if (i2Var4 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, i10 - i2Var4.h1(), androidx.compose.ui.e.f37317a.q().a(i2Var4.c1(), iA), 0.0f, 4, null);
        }
        if (i2Var8 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var8, 0, iA, 0.0f, 4, null);
        }
    }

    private static final int z(c50 c50Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var) {
        return c50Var.f26474a ? androidx.compose.ui.e.f37317a.q().a(i2Var.c1(), i10) : i11;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        androidx.compose.ui.layout.z0 z0Var;
        androidx.compose.ui.layout.z0 z0Var2;
        long j11;
        androidx.compose.ui.layout.i2 i2VarP0;
        androidx.compose.ui.layout.z0 z0Var3;
        androidx.compose.ui.layout.z0 z0Var4;
        androidx.compose.ui.layout.z0 z0Var5;
        int iD0;
        androidx.compose.ui.layout.z0 z0Var6;
        int i10;
        androidx.compose.ui.layout.z0 z0Var7;
        androidx.compose.ui.layout.z0 z0Var8;
        long j12;
        final float fInvoke = this.f26476c.invoke();
        int iG6 = c1Var.g6(this.f26477d.d());
        int iG7 = c1Var.g6(this.f26477d.a());
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z0Var = null;
                break;
            }
            z0Var = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Leading")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.z0 z0Var9 = z0Var;
        androidx.compose.ui.layout.i2 i2VarP1 = z0Var9 != null ? z0Var9.P0(jD) : null;
        int iC = androidx.compose.material3.internal.u2.c(i2VarP1);
        int iMax = Math.max(0, androidx.compose.material3.internal.u2.a(i2VarP1));
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                z0Var2 = null;
                break;
            }
            z0Var2 = list.get(i12);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Trailing")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.z0 z0Var10 = z0Var2;
        if (z0Var10 != null) {
            j11 = jD;
            i2VarP0 = z0Var10.P0(androidx.compose.ui.unit.c.r(j11, -iC, 0, 2, null));
        } else {
            j11 = jD;
            i2VarP0 = null;
        }
        int iC2 = iC + androidx.compose.material3.internal.u2.c(i2VarP0);
        int iMax2 = Math.max(iMax, androidx.compose.material3.internal.u2.a(i2VarP0));
        int size3 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                z0Var3 = null;
                break;
            }
            z0Var3 = list.get(i13);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), androidx.compose.material3.internal.b4.f28676f)) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.z0 z0Var11 = z0Var3;
        androidx.compose.ui.layout.i2 i2VarP2 = z0Var11 != null ? z0Var11.P0(androidx.compose.ui.unit.c.r(j11, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + androidx.compose.material3.internal.u2.c(i2VarP2);
        int iMax3 = Math.max(iMax2, androidx.compose.material3.internal.u2.a(i2VarP2));
        int size4 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size4) {
                z0Var4 = null;
                break;
            }
            z0Var4 = list.get(i14);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), androidx.compose.material3.internal.b4.f28677g)) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.z0 z0Var12 = z0Var4;
        androidx.compose.ui.layout.i2 i2VarP3 = z0Var12 != null ? z0Var12.P0(androidx.compose.ui.unit.c.r(j11, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + androidx.compose.material3.internal.u2.c(i2VarP3);
        int iMax4 = Math.max(iMax3, androidx.compose.material3.internal.u2.a(i2VarP3));
        boolean z10 = this.f26475b instanceof v40.a;
        int size5 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                z0Var5 = null;
                break;
            }
            z0Var5 = list.get(i15);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var5), "Label")) {
                break;
            }
            i15++;
        }
        androidx.compose.ui.layout.z0 z0Var13 = z0Var5;
        final kotlin.jvm.internal.i1.h hVar = new kotlin.jvm.internal.i1.h();
        if (z10) {
            iD0 = z0Var13 != null ? z0Var13.D0(androidx.compose.ui.unit.b.r(j10)) : 0;
        } else {
            hVar.f312751a = z0Var13 != null ? z0Var13.P0(androidx.compose.ui.unit.c.q(j11, -iC4, -iG7)) : 0;
            iD0 = 0;
        }
        int size6 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                z0Var6 = z0Var13;
                i10 = iG7;
                z0Var7 = null;
                break;
            }
            z0Var7 = list.get(i16);
            z0Var6 = z0Var13;
            i10 = iG7;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var7), androidx.compose.material3.internal.b4.f28678h)) {
                break;
            }
            i16++;
            z0Var13 = z0Var6;
            iG7 = i10;
        }
        androidx.compose.ui.layout.z0 z0Var14 = z0Var7;
        int iD1 = z0Var14 != null ? z0Var14.D0(androidx.compose.ui.unit.b.r(j10)) : 0;
        int iA = androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar.f312751a) + iD0 + iG6;
        long jQ = androidx.compose.ui.unit.c.q(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null), -iC4, ((-iA) - i10) - iD1);
        int size7 = list2.size();
        int i17 = 0;
        while (i17 < size7) {
            androidx.compose.ui.layout.z0 z0Var15 = list.get(i17);
            int i18 = size7;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var15), "TextField")) {
                final androidx.compose.ui.layout.i2 i2VarP4 = z0Var15.P0(jQ);
                long jD2 = androidx.compose.ui.unit.b.d(jQ, 0, 0, 0, 0, 14, null);
                List<? extends androidx.compose.ui.layout.z0> list3 = list;
                int size8 = list3.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        z0Var8 = null;
                        break;
                    }
                    z0Var8 = list.get(i19);
                    int i20 = size8;
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var8), "Hint")) {
                        break;
                    }
                    i19++;
                    size8 = i20;
                }
                androidx.compose.ui.layout.z0 z0Var16 = z0Var8;
                androidx.compose.ui.layout.i2 i2VarP5 = z0Var16 != null ? z0Var16.P0(jD2) : null;
                int iMax5 = Math.max(iMax4, Math.max(androidx.compose.material3.internal.u2.a(i2VarP4), androidx.compose.material3.internal.u2.a(i2VarP5)) + iA + i10);
                boolean z11 = z10;
                long j13 = j11;
                final int i21 = iG6;
                androidx.compose.ui.layout.z0 z0Var17 = z0Var6;
                final int iL = l(androidx.compose.material3.internal.u2.c(i2VarP1), androidx.compose.material3.internal.u2.c(i2VarP0), androidx.compose.material3.internal.u2.c(i2VarP2), androidx.compose.material3.internal.u2.c(i2VarP3), i2VarP4.h1(), androidx.compose.material3.internal.u2.c((androidx.compose.ui.layout.i2) hVar.f312751a), androidx.compose.material3.internal.u2.c(i2VarP5), j10);
                if (z11) {
                    j12 = j13;
                    hVar.f312751a = z0Var17 != null ? z0Var17.P0(androidx.compose.ui.unit.b.d(j12, 0, iL, 0, iD0, 5, null)) : 0;
                } else {
                    j12 = j13;
                }
                final androidx.compose.ui.layout.i2 i2VarP6 = z0Var14 != null ? z0Var14.P0(androidx.compose.ui.unit.b.d(androidx.compose.ui.unit.c.r(j12, 0, -iMax5, 1, null), 0, iL, 0, 0, 9, null)) : null;
                int iA2 = androidx.compose.material3.internal.u2.a(i2VarP6);
                boolean z12 = z11;
                int iK = k(c1Var, i2VarP4.c1(), androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar.f312751a), androidx.compose.material3.internal.u2.a(i2VarP1), androidx.compose.material3.internal.u2.a(i2VarP0), androidx.compose.material3.internal.u2.a(i2VarP2), androidx.compose.material3.internal.u2.a(i2VarP3), androidx.compose.material3.internal.u2.a(i2VarP5), androidx.compose.material3.internal.u2.a(i2VarP6), j10, z12, fInvoke);
                final int iA3 = (iK - iA2) - (z12 ? androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar.f312751a) : 0);
                int size9 = list3.size();
                int i22 = 0;
                while (i22 < size9) {
                    androidx.compose.ui.layout.z0 z0Var18 = list.get(i22);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var18), androidx.compose.material3.internal.b4.f28679i)) {
                        final androidx.compose.ui.layout.i2 i2VarP7 = z0Var18.P0(androidx.compose.ui.unit.c.a(iL != Integer.MAX_VALUE ? iL : 0, iL, iA3 != Integer.MAX_VALUE ? iA3 : 0, iA3));
                        final int i23 = iK;
                        final boolean z13 = z12;
                        final androidx.compose.ui.layout.i2 i2Var = i2VarP1;
                        final androidx.compose.ui.layout.i2 i2Var2 = i2VarP0;
                        final androidx.compose.ui.layout.i2 i2Var3 = i2VarP2;
                        final androidx.compose.ui.layout.i2 i2Var4 = i2VarP3;
                        final androidx.compose.ui.layout.i2 i2Var5 = i2VarP5;
                        return androidx.compose.ui.layout.c1.h6(c1Var, iL, i23, null, new Function1() { // from class: androidx.compose.material3.z40
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return c50.t(hVar, z13, this, iA3, i21, c1Var, iL, i23, i2VarP4, i2Var5, i2Var, i2Var2, i2Var3, i2Var4, i2VarP7, i2VarP6, fInvoke, (androidx.compose.ui.layout.i2.a) obj);
                            }
                        }, 4, null);
                    }
                    i22++;
                    iK = iK;
                    z12 = z12;
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
            i17++;
            size7 = i18;
            j11 = j11;
            z10 = z10;
            jQ = jQ;
            iG6 = iG6;
            z0Var6 = z0Var6;
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return n(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.a50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(c50.u((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return p(list, i10, new Function2() { // from class: androidx.compose.material3.x40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(c50.w((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return n(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.b50
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(c50.q((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return p(list, i10, new Function2() { // from class: androidx.compose.material3.y40
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(c50.r((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    private c50(boolean z10, v40 v40Var, androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.g5 g5Var, float f10) {
        this.f26474a = z10;
        this.f26475b = v40Var;
        this.f26476c = o2Var;
        this.f26477d = g5Var;
        this.f26478e = f10;
    }
}
