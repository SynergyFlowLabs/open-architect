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
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,1438:1\n117#2,2:1439\n34#2,6:1441\n119#2:1447\n117#2,2:1448\n34#2,6:1450\n119#2:1456\n117#2,2:1457\n34#2,6:1459\n119#2:1465\n117#2,2:1466\n34#2,6:1468\n119#2:1474\n117#2,2:1475\n34#2,6:1477\n119#2:1483\n117#2,2:1489\n34#2,6:1491\n119#2:1497\n563#2,2:1498\n34#2,6:1500\n565#2:1506\n117#2,2:1507\n34#2,6:1509\n119#2:1515\n563#2,2:1520\n34#2,6:1522\n565#2:1528\n563#2,2:1529\n34#2,6:1531\n565#2:1537\n117#2,2:1538\n34#2,6:1540\n119#2:1546\n117#2,2:1547\n34#2,6:1549\n119#2:1555\n117#2,2:1556\n34#2,6:1558\n119#2:1564\n117#2,2:1565\n34#2,6:1567\n119#2:1573\n117#2,2:1574\n34#2,6:1576\n119#2:1582\n117#2,2:1583\n34#2,6:1585\n119#2:1591\n117#2,2:1592\n34#2,6:1594\n119#2:1600\n117#2,2:1601\n34#2,6:1603\n119#2:1609\n117#2,2:1610\n34#2,6:1612\n119#2:1618\n117#2,2:1619\n34#2,6:1621\n119#2:1627\n117#2,2:1628\n34#2,6:1630\n119#2:1636\n563#2,2:1637\n34#2,6:1639\n565#2:1645\n117#2,2:1646\n34#2,6:1648\n119#2:1654\n117#2,2:1655\n34#2,6:1657\n119#2:1663\n1#3:1484\n33#4:1485\n33#4:1516\n53#5,3:1486\n53#5,3:1517\n49#6:1664\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material3/OutlinedTextFieldMeasurePolicy\n*L\n819#1:1439,2\n819#1:1441,6\n819#1:1447\n826#1:1448,2\n826#1:1450,6\n826#1:1456\n834#1:1457,2\n834#1:1459,6\n834#1:1465\n842#1:1466,2\n842#1:1468,6\n842#1:1474\n849#1:1475,2\n849#1:1477,6\n849#1:1483\n881#1:1489,2\n881#1:1491,6\n881#1:1497\n907#1:1498,2\n907#1:1500,6\n907#1:1506\n913#1:1507,2\n913#1:1509,6\n913#1:1515\n974#1:1520,2\n974#1:1522,6\n974#1:1528\n1047#1:1529,2\n1047#1:1531,6\n1047#1:1537\n1050#1:1538,2\n1050#1:1540,6\n1050#1:1546\n1054#1:1547,2\n1054#1:1549,6\n1054#1:1555\n1058#1:1556,2\n1058#1:1558,6\n1058#1:1564\n1062#1:1565,2\n1062#1:1567,6\n1062#1:1573\n1066#1:1574,2\n1066#1:1576,6\n1066#1:1582\n1070#1:1583,2\n1070#1:1585,6\n1070#1:1591\n1094#1:1592,2\n1094#1:1594,6\n1094#1:1600\n1104#1:1601,2\n1104#1:1603,6\n1104#1:1609\n1115#1:1610,2\n1115#1:1612,6\n1115#1:1618\n1120#1:1619,2\n1120#1:1621,6\n1120#1:1627\n1131#1:1628,2\n1131#1:1630,6\n1131#1:1636\n1142#1:1637,2\n1142#1:1639,6\n1142#1:1645\n1146#1:1646,2\n1146#1:1648,6\n1146#1:1654\n1151#1:1655,2\n1151#1:1657,6\n1151#1:1663\n870#1:1485\n943#1:1516\n870#1:1486,3\n943#1:1517,3\n1196#1:1664\n*E\n"})
final class cr implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<n0.n, Unit> f26867a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f26868b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final v40 f26869c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.material3.internal.o2 f26870d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f26871e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f26872f;

    public /* synthetic */ cr(Function1 function1, boolean z10, v40 v40Var, androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.g5 g5Var, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(function1, z10, v40Var, o2Var, g5Var, f10);
    }

    private final int k(androidx.compose.ui.unit.d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, long j10, boolean z10, float f10) {
        int iT = kotlin.comparisons.a.T(i14, i16, i12, i13, z10 ? 0 : androidx.compose.ui.util.e.s(i15, 0, f10));
        float fS7 = dVar.S7(this.f26871e.d());
        if (!z10) {
            fS7 = androidx.compose.ui.util.e.r(fS7, Math.max(fS7, i15 / 2.0f), f10);
        }
        float fS8 = fS7 + iT + dVar.S7(this.f26871e.a());
        if (!z10) {
            i15 = 0;
        }
        return androidx.compose.ui.unit.c.h(j10, i15 + Math.max(i10, Math.max(i11, kotlin.math.b.L0(fS8))) + i17);
    }

    private final int l(androidx.compose.ui.unit.d dVar, int i10, int i11, int i12, int i13, int i14, int i15, int i16, long j10, float f10) {
        int i17 = i12 + i13;
        int iMax = i10 + Math.max(i14 + i17, Math.max(i16 + i17, androidx.compose.ui.util.e.s(i15, 0, f10))) + i11;
        androidx.compose.foundation.layout.g5 g5Var = this.f26871e;
        androidx.compose.ui.unit.w wVar = androidx.compose.ui.unit.w.Ltr;
        return androidx.compose.ui.unit.c.i(j10, Math.max(iMax, kotlin.math.b.L0((i15 + dVar.S7(androidx.compose.ui.unit.h.r(g5Var.b(wVar) + this.f26871e.c(wVar)))) * f10)));
    }

    private final int n(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        int iD;
        int iIntValue;
        androidx.compose.ui.layout.y yVar2;
        int iIntValue2;
        androidx.compose.ui.layout.y yVar3;
        androidx.compose.ui.layout.y yVar4;
        int iIntValue3;
        androidx.compose.ui.layout.y yVar5;
        int iIntValue4;
        int i11;
        androidx.compose.ui.layout.y yVar6;
        androidx.compose.ui.layout.y yVar7;
        cr crVar = this;
        float fInvoke = crVar.f26870d.invoke();
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size) {
                yVar = null;
                break;
            }
            yVar = list.get(i12);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar), "Leading")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.y yVar8 = yVar;
        if (yVar8 != null) {
            iD = androidx.compose.material3.internal.u2.d(i10, yVar8.M0(Integer.MAX_VALUE));
            iIntValue = function2.invoke(yVar8, Integer.valueOf(i10)).intValue();
        } else {
            iD = i10;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                yVar2 = null;
                break;
            }
            yVar2 = list.get(i13);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar2), "Trailing")) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.y yVar9 = yVar2;
        if (yVar9 != null) {
            iD = androidx.compose.material3.internal.u2.d(iD, yVar9.M0(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(yVar9, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                yVar3 = null;
                break;
            }
            yVar3 = list.get(i14);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar3), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.y yVar10 = yVar3;
        int iIntValue5 = yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(androidx.compose.ui.util.e.s(iD, i10, fInvoke))).intValue() : 0;
        int size4 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size4) {
                yVar4 = null;
                break;
            }
            yVar4 = list.get(i15);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar4), androidx.compose.material3.internal.b4.f28676f)) {
                break;
            }
            i15++;
        }
        androidx.compose.ui.layout.y yVar11 = yVar4;
        if (yVar11 != null) {
            iIntValue3 = function2.invoke(yVar11, Integer.valueOf(iD)).intValue();
            iD = androidx.compose.material3.internal.u2.d(iD, yVar11.M0(Integer.MAX_VALUE));
        } else {
            iIntValue3 = 0;
        }
        int size5 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size5) {
                yVar5 = null;
                break;
            }
            yVar5 = list.get(i16);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar5), androidx.compose.material3.internal.b4.f28677g)) {
                break;
            }
            i16++;
        }
        androidx.compose.ui.layout.y yVar12 = yVar5;
        if (yVar12 != null) {
            iIntValue4 = function2.invoke(yVar12, Integer.valueOf(iD)).intValue();
            iD = androidx.compose.material3.internal.u2.d(iD, yVar12.M0(Integer.MAX_VALUE));
        } else {
            iIntValue4 = 0;
        }
        int size6 = list2.size();
        int i17 = 0;
        while (i17 < size6) {
            androidx.compose.ui.layout.y yVar13 = list.get(i17);
            if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar13), "TextField")) {
                int iIntValue6 = function2.invoke(yVar13, Integer.valueOf(iD)).intValue();
                List<? extends androidx.compose.ui.layout.y> list3 = list;
                int size7 = list3.size();
                int i18 = 0;
                while (true) {
                    if (i18 >= size7) {
                        i11 = iIntValue6;
                        yVar6 = null;
                        break;
                    }
                    yVar6 = list.get(i18);
                    i11 = iIntValue6;
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar6), "Hint")) {
                        break;
                    }
                    i18++;
                    iIntValue6 = i11;
                }
                androidx.compose.ui.layout.y yVar14 = yVar6;
                int iIntValue7 = yVar14 != null ? function2.invoke(yVar14, Integer.valueOf(iD)).intValue() : 0;
                int size8 = list3.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        yVar7 = null;
                        break;
                    }
                    yVar7 = list.get(i19);
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar7), androidx.compose.material3.internal.b4.f28678h)) {
                        break;
                    }
                    i19++;
                }
                androidx.compose.ui.layout.y yVar15 = yVar7;
                return crVar.k(zVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, i11, iIntValue5, iIntValue7, yVar15 != null ? function2.invoke(yVar15, Integer.valueOf(i10)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), crVar.f26869c instanceof v40.a, fInvoke);
            }
            i17++;
            iIntValue5 = iIntValue5;
            crVar = this;
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    private final int p(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
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
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar4), "Leading")) {
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
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar5), androidx.compose.material3.internal.b4.f28676f)) {
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
                    if (Intrinsics.areEqual(androidx.compose.material3.internal.u2.b(yVar6), androidx.compose.material3.internal.b4.f28677g)) {
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
                return l(zVar, iIntValue4, iIntValue3, iIntValue5, iIntValue6, iIntValue, iIntValue2, yVar14 != null ? function2.invoke(yVar14, Integer.valueOf(i10)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), this.f26870d.invoke());
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
    public static final Unit t(cr crVar, int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, kotlin.jvm.internal.i1.h hVar, androidx.compose.ui.layout.i2 i2Var6, androidx.compose.ui.layout.i2 i2Var7, androidx.compose.ui.layout.i2 i2Var8, androidx.compose.ui.layout.c1 c1Var, boolean z10, float f10, androidx.compose.ui.layout.i2.a aVar) {
        crVar.x(aVar, i10, i11, i2Var, i2Var2, i2Var3, i2Var4, i2Var5, (androidx.compose.ui.layout.i2) hVar.f312751a, i2Var6, i2Var7, i2Var8, c1Var.getDensity(), c1Var.getLayoutDirection(), z10, f10, c1Var.S7(crVar.f26872f));
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

    private final void x(androidx.compose.ui.layout.i2.a aVar, int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, androidx.compose.ui.layout.i2 i2Var6, androidx.compose.ui.layout.i2 i2Var7, androidx.compose.ui.layout.i2 i2Var8, androidx.compose.ui.layout.i2 i2Var9, float f10, androidx.compose.ui.unit.w wVar, boolean z10, float f11, float f12) {
        int i12;
        int i13;
        int i14;
        int iA;
        int iA2 = z10 ? androidx.compose.material3.internal.u2.a(i2Var6) : 0;
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var8, 0, iA2, 0.0f, 4, null);
        int iA3 = (i10 - androidx.compose.material3.internal.u2.a(i2Var9)) - (z10 ? androidx.compose.material3.internal.u2.a(i2Var6) : 0);
        int iL0 = kotlin.math.b.L0(this.f26871e.d() * f10);
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, iA2 + androidx.compose.ui.e.f37317a.q().a(i2Var.c1(), iA3), 0.0f, 4, null);
        }
        if (i2Var6 != null) {
            if (z10) {
                iA = 0;
            } else {
                iA = this.f26868b ? androidx.compose.ui.e.f37317a.q().a(i2Var6.c1(), iA3) : iL0;
            }
            int iS = androidx.compose.ui.util.e.s(iA, z10 ? 0 : -(i2Var6.c1() / 2), f11);
            if (z10) {
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var6, androidx.compose.material3.internal.b4.I(this.f26869c).a(i2Var6.h1(), i11, wVar), iS, 0.0f, 4, null);
            } else {
                float fO = androidx.compose.foundation.layout.d5.o(this.f26871e, wVar) * f10;
                float fN = androidx.compose.foundation.layout.d5.n(this.f26871e, wVar) * f10;
                float fH1 = i2Var == null ? fO : i2Var.h1() + kotlin.ranges.r.t(fO - f12, 0.0f);
                float fH2 = i2Var2 == null ? fN : i2Var2.h1() + kotlin.ranges.r.t(fN - f12, 0.0f);
                androidx.compose.ui.unit.w wVar2 = androidx.compose.ui.unit.w.Ltr;
                androidx.compose.ui.layout.i2.a.P(aVar, i2Var6, kotlin.math.b.L0(androidx.compose.ui.util.e.r(androidx.compose.material3.internal.b4.E(this.f26869c).a(i2Var6.h1(), i11 - kotlin.math.b.L0(fH1 + fH2), wVar) + (wVar == wVar2 ? fH1 : fH2), androidx.compose.material3.internal.b4.I(this.f26869c).a(i2Var6.h1(), i11 - kotlin.math.b.L0(fO + fN), wVar) + (wVar == wVar2 ? fO : fN), f11)), iS, 0.0f, 4, null);
            }
        }
        if (i2Var3 != null) {
            i12 = iA3;
            i13 = iL0;
            i14 = iA2;
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, androidx.compose.material3.internal.u2.c(i2Var), y(i14, this, i12, i13, i2Var6, i2Var3), 0.0f, 4, null);
        } else {
            i12 = iA3;
            i13 = iL0;
            i14 = iA2;
        }
        int iC = androidx.compose.material3.internal.u2.c(i2Var) + androidx.compose.material3.internal.u2.c(i2Var3);
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var5, iC, y(i14, this, i12, i13, i2Var6, i2Var5), 0.0f, 4, null);
        if (i2Var7 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var7, iC, y(i14, this, i12, i13, i2Var6, i2Var7), 0.0f, 4, null);
        }
        if (i2Var4 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var4, (i11 - androidx.compose.material3.internal.u2.c(i2Var2)) - i2Var4.h1(), y(i14, this, i12, i13, i2Var6, i2Var4), 0.0f, 4, null);
        }
        if (i2Var2 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i11 - i2Var2.h1(), i14 + androidx.compose.ui.e.f37317a.q().a(i2Var2.c1(), i12), 0.0f, 4, null);
        }
        if (i2Var9 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var9, 0, i14 + i12, 0.0f, 4, null);
        }
    }

    private static final int y(int i10, cr crVar, int i11, int i12, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2) {
        if (crVar.f26868b) {
            i12 = androidx.compose.ui.e.f37317a.q().a(i2Var2.c1(), i11);
        }
        int i13 = i10 + i12;
        return crVar.f26869c instanceof v40.a ? i13 : Math.max(i13, androidx.compose.material3.internal.u2.a(i2Var) / 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18, types: [T, androidx.compose.ui.layout.i2] */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /* JADX WARN: Type inference failed for: r6v43, types: [T, androidx.compose.ui.layout.i2] */
    /* JADX WARN: Type inference failed for: r6v62 */
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
        List<? extends androidx.compose.ui.layout.z0> list2;
        androidx.compose.ui.layout.z0 z0Var6;
        androidx.compose.ui.layout.z0 z0Var7;
        kotlin.jvm.internal.i1.h hVar;
        long j12;
        long jC;
        long jC2;
        List<? extends androidx.compose.ui.layout.z0> list3 = list;
        final float fInvoke = this.f26870d.invoke();
        int iG6 = c1Var.g6(this.f26871e.a());
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        List<? extends androidx.compose.ui.layout.z0> list4 = list3;
        int size = list4.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z0Var = null;
                break;
            }
            z0Var = list3.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Leading")) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.layout.z0 z0Var8 = z0Var;
        androidx.compose.ui.layout.i2 i2VarP1 = z0Var8 != null ? z0Var8.P0(jD) : null;
        int iC = androidx.compose.material3.internal.u2.c(i2VarP1);
        int iMax = Math.max(0, androidx.compose.material3.internal.u2.a(i2VarP1));
        int size2 = list4.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z0Var2 = null;
                break;
            }
            z0Var2 = list3.get(i11);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Trailing")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.z0 z0Var9 = z0Var2;
        if (z0Var9 != null) {
            j11 = jD;
            i2VarP0 = z0Var9.P0(androidx.compose.ui.unit.c.r(j11, -iC, 0, 2, null));
        } else {
            j11 = jD;
            i2VarP0 = null;
        }
        int iC2 = iC + androidx.compose.material3.internal.u2.c(i2VarP0);
        int iMax2 = Math.max(iMax, androidx.compose.material3.internal.u2.a(i2VarP0));
        int size3 = list4.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size3) {
                z0Var3 = null;
                break;
            }
            z0Var3 = list3.get(i12);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), androidx.compose.material3.internal.b4.f28676f)) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.z0 z0Var10 = z0Var3;
        androidx.compose.ui.layout.i2 i2VarP2 = z0Var10 != null ? z0Var10.P0(androidx.compose.ui.unit.c.r(j11, -iC2, 0, 2, null)) : null;
        int iC3 = iC2 + androidx.compose.material3.internal.u2.c(i2VarP2);
        int iMax3 = Math.max(iMax2, androidx.compose.material3.internal.u2.a(i2VarP2));
        int size4 = list4.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size4) {
                z0Var4 = null;
                break;
            }
            z0Var4 = list3.get(i13);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), androidx.compose.material3.internal.b4.f28677g)) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.z0 z0Var11 = z0Var4;
        androidx.compose.ui.layout.i2 i2VarP3 = z0Var11 != null ? z0Var11.P0(androidx.compose.ui.unit.c.r(j11, -iC3, 0, 2, null)) : null;
        int iC4 = iC3 + androidx.compose.material3.internal.u2.c(i2VarP3);
        int iMax4 = Math.max(iMax3, androidx.compose.material3.internal.u2.a(i2VarP3));
        boolean z10 = this.f26869c instanceof v40.a;
        int size5 = list4.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                z0Var5 = null;
                break;
            }
            z0Var5 = list3.get(i14);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var5), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.z0 z0Var12 = z0Var5;
        kotlin.jvm.internal.i1.h hVar2 = new kotlin.jvm.internal.i1.h();
        if (z10) {
            iD0 = z0Var12 != null ? z0Var12.D0(androidx.compose.ui.unit.b.r(j10)) : 0;
        } else {
            int iG7 = c1Var.g6(this.f26871e.b(c1Var.getLayoutDirection())) + c1Var.g6(this.f26871e.c(c1Var.getLayoutDirection()));
            ?? P0 = z0Var12 != null ? z0Var12.P0(androidx.compose.ui.unit.c.q(j11, -androidx.compose.ui.util.e.s(iC4 + iG7, iG7, fInvoke), -iG6)) : 0;
            hVar2.f312751a = P0;
            if (P0 != 0) {
                jC2 = n0.n.f((((long) Float.floatToRawIntBits(P0.h1())) << 32) | (((long) Float.floatToRawIntBits(P0.c1())) & com.rabbitmq.client.k0.f265952a));
            } else {
                jC2 = n0.n.f332724b.c();
            }
            this.f26867a.invoke(n0.n.c(jC2));
            iD0 = 0;
        }
        int size6 = list4.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size6) {
                list2 = list4;
                z0Var6 = null;
                break;
            }
            z0Var6 = list3.get(i15);
            list2 = list4;
            int i16 = size6;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var6), androidx.compose.material3.internal.b4.f28678h)) {
                break;
            }
            i15++;
            size6 = i16;
            list4 = list2;
        }
        androidx.compose.ui.layout.z0 z0Var13 = z0Var6;
        int iD1 = z0Var13 != null ? z0Var13.D0(androidx.compose.ui.unit.b.r(j10)) : 0;
        int iG8 = z10 ? c1Var.g6(this.f26871e.d()) : Math.max(androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar2.f312751a) / 2, c1Var.g6(this.f26871e.d()));
        long jD2 = androidx.compose.ui.unit.b.d(androidx.compose.ui.unit.c.q(j10, -iC4, (((-iG6) - iG8) - iD0) - iD1), 0, 0, 0, 0, 11, null);
        int size7 = list2.size();
        int i17 = 0;
        while (i17 < size7) {
            androidx.compose.ui.layout.z0 z0Var14 = list3.get(i17);
            int i18 = iG6;
            androidx.compose.ui.layout.z0 z0Var15 = z0Var13;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var14), "TextField")) {
                final androidx.compose.ui.layout.i2 i2VarP4 = z0Var14.P0(jD2);
                long jD3 = androidx.compose.ui.unit.b.d(jD2, 0, 0, 0, 0, 14, null);
                List<? extends androidx.compose.ui.layout.z0> list5 = list3;
                int size8 = list5.size();
                int i19 = 0;
                while (true) {
                    if (i19 >= size8) {
                        z0Var7 = null;
                        break;
                    }
                    z0Var7 = list3.get(i19);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var7), "Hint")) {
                        break;
                    }
                    i19++;
                }
                androidx.compose.ui.layout.z0 z0Var16 = z0Var7;
                androidx.compose.ui.layout.i2 i2VarP5 = z0Var16 != null ? z0Var16.P0(jD3) : null;
                int iMax5 = Math.max(iMax4, Math.max(androidx.compose.material3.internal.u2.a(i2VarP4), androidx.compose.material3.internal.u2.a(i2VarP5)) + iG8 + i18);
                boolean z11 = z10;
                long j13 = j11;
                int iL = l(c1Var, androidx.compose.material3.internal.u2.c(i2VarP1), androidx.compose.material3.internal.u2.c(i2VarP0), androidx.compose.material3.internal.u2.c(i2VarP2), androidx.compose.material3.internal.u2.c(i2VarP3), i2VarP4.h1(), androidx.compose.material3.internal.u2.c((androidx.compose.ui.layout.i2) hVar2.f312751a), androidx.compose.material3.internal.u2.c(i2VarP5), j10, fInvoke);
                if (z11) {
                    hVar = hVar2;
                    j12 = j13;
                    ?? P1 = z0Var12 != null ? z0Var12.P0(androidx.compose.ui.unit.b.d(j12, 0, iL, 0, iD0, 5, null)) : 0;
                    hVar.f312751a = P1;
                    if (P1 != 0) {
                        jC = n0.n.f((((long) Float.floatToRawIntBits(P1.h1())) << 32) | (((long) Float.floatToRawIntBits(P1.c1())) & com.rabbitmq.client.k0.f265952a));
                    } else {
                        jC = n0.n.f332724b.c();
                    }
                    this.f26867a.invoke(n0.n.c(jC));
                } else {
                    hVar = hVar2;
                    j12 = j13;
                }
                int i20 = iL;
                androidx.compose.ui.layout.i2 i2VarP6 = z0Var15 != null ? z0Var15.P0(androidx.compose.ui.unit.b.d(androidx.compose.ui.unit.c.r(j12, 0, -iMax5, 1, null), 0, iL, 0, 0, 9, null)) : null;
                int iA = androidx.compose.material3.internal.u2.a(i2VarP6);
                boolean z12 = z11;
                final kotlin.jvm.internal.i1.h hVar3 = hVar;
                final int iK = k(c1Var, androidx.compose.material3.internal.u2.a(i2VarP1), androidx.compose.material3.internal.u2.a(i2VarP0), androidx.compose.material3.internal.u2.a(i2VarP2), androidx.compose.material3.internal.u2.a(i2VarP3), i2VarP4.c1(), androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar.f312751a), androidx.compose.material3.internal.u2.a(i2VarP5), androidx.compose.material3.internal.u2.a(i2VarP6), j10, z12, fInvoke);
                int iA2 = (iK - iA) - (z12 ? androidx.compose.material3.internal.u2.a((androidx.compose.ui.layout.i2) hVar3.f312751a) : 0);
                int size9 = list5.size();
                int i21 = 0;
                while (i21 < size9) {
                    androidx.compose.ui.layout.z0 z0Var17 = list.get(i21);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var17), androidx.compose.material3.internal.b4.f28679i)) {
                        final androidx.compose.ui.layout.i2 i2VarP7 = z0Var17.P0(androidx.compose.ui.unit.c.a(i20 != Integer.MAX_VALUE ? i20 : 0, i20, iA2 != Integer.MAX_VALUE ? iA2 : 0, iA2));
                        final int i22 = i20;
                        final androidx.compose.ui.layout.i2 i2Var = i2VarP0;
                        final androidx.compose.ui.layout.i2 i2Var2 = i2VarP2;
                        final androidx.compose.ui.layout.i2 i2Var3 = i2VarP3;
                        final androidx.compose.ui.layout.i2 i2Var4 = i2VarP5;
                        final boolean z13 = z12;
                        final androidx.compose.ui.layout.i2 i2Var5 = i2VarP6;
                        final androidx.compose.ui.layout.i2 i2Var6 = i2VarP1;
                        return androidx.compose.ui.layout.c1.h6(c1Var, i22, iK, null, new Function1() { // from class: androidx.compose.material3.zq
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return cr.t(this.f35199a, iK, i22, i2Var6, i2Var, i2Var2, i2Var3, i2VarP4, hVar3, i2Var4, i2VarP7, i2Var5, c1Var, z13, fInvoke, (androidx.compose.ui.layout.i2.a) obj);
                            }
                        }, 4, null);
                    }
                    i21++;
                    iK = iK;
                    i20 = i20;
                    i2VarP6 = i2VarP6;
                    z12 = z12;
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
            i17++;
            z0Var13 = z0Var15;
            iG6 = i18;
            z10 = z10;
            j11 = j11;
            list3 = list3;
            jD2 = jD2;
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return n(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.xq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(cr.u((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return p(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.br
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(cr.w((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return n(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.ar
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(cr.q((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return p(zVar, list, i10, new Function2() { // from class: androidx.compose.material3.yq
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(cr.r((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    private cr(Function1<? super n0.n, Unit> function1, boolean z10, v40 v40Var, androidx.compose.material3.internal.o2 o2Var, androidx.compose.foundation.layout.g5 g5Var, float f10) {
        this.f26867a = function1;
        this.f26868b = z10;
        this.f26869c = v40Var;
        this.f26870d = o2Var;
        this.f26871e = g5Var;
        this.f26872f = f10;
    }
}
