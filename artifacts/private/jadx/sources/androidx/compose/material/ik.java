package androidx.compose.material;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1114:1\n117#2,2:1115\n34#2,6:1117\n119#2:1123\n117#2,2:1124\n34#2,6:1126\n119#2:1132\n117#2,2:1133\n34#2,6:1135\n119#2:1141\n563#2,2:1142\n34#2,6:1144\n565#2:1150\n117#2,2:1151\n34#2,6:1153\n119#2:1159\n563#2,2:1160\n34#2,6:1162\n565#2:1168\n117#2,2:1169\n34#2,6:1171\n119#2:1177\n117#2,2:1179\n34#2,6:1181\n119#2:1187\n117#2,2:1188\n34#2,6:1190\n119#2:1196\n117#2,2:1197\n34#2,6:1199\n119#2:1205\n117#2,2:1206\n34#2,6:1208\n119#2:1214\n117#2,2:1215\n34#2,6:1217\n119#2:1223\n117#2,2:1224\n34#2,6:1226\n119#2:1232\n563#2,2:1233\n34#2,6:1235\n565#2:1241\n117#2,2:1242\n34#2,6:1244\n119#2:1250\n1#3:1178\n*S KotlinDebug\n*F\n+ 1 TextField.kt\nandroidx/compose/material/TextFieldMeasurePolicy\n*L\n730#1:1115,2\n730#1:1117,6\n730#1:1123\n736#1:1124,2\n736#1:1126,6\n736#1:1132\n747#1:1133,2\n747#1:1135,6\n747#1:1141\n770#1:1142,2\n770#1:1144,6\n770#1:1150\n776#1:1151,2\n776#1:1153,6\n776#1:1159\n877#1:1160,2\n877#1:1162,6\n877#1:1168\n880#1:1169,2\n880#1:1171,6\n880#1:1177\n884#1:1179,2\n884#1:1181,6\n884#1:1187\n888#1:1188,2\n888#1:1190,6\n888#1:1196\n892#1:1197,2\n892#1:1199,6\n892#1:1205\n912#1:1206,2\n912#1:1208,6\n912#1:1214\n922#1:1215,2\n922#1:1217,6\n922#1:1223\n933#1:1224,2\n933#1:1226,6\n933#1:1232\n937#1:1233,2\n937#1:1235,6\n937#1:1241\n940#1:1242,2\n940#1:1244,6\n940#1:1250\n*E\n"})
final class ik implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f23182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f23183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f23184c;

    public ik(boolean z10, float f10, @NotNull androidx.compose.foundation.layout.g5 g5Var) {
        this.f23182a = z10;
        this.f23183b = f10;
        this.f23184c = g5Var;
    }

    private final int k(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        androidx.compose.ui.layout.y yVar2;
        int i11;
        int iIntValue;
        int iA;
        androidx.compose.ui.layout.y yVar3;
        int iIntValue2;
        androidx.compose.ui.layout.y yVar4;
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int i12 = 0;
        while (true) {
            yVar = null;
            if (i12 >= size) {
                yVar2 = null;
                break;
            }
            yVar2 = list.get(i12);
            if (Intrinsics.areEqual(tj.k(yVar2), "Leading")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.y yVar5 = yVar2;
        if (yVar5 != null) {
            i11 = i10;
            iA = androidx.compose.material.internal.o.a(i11, yVar5.M0(Integer.MAX_VALUE));
            iIntValue = function2.invoke(yVar5, Integer.valueOf(i11)).intValue();
        } else {
            i11 = i10;
            iIntValue = 0;
            iA = i11;
        }
        int size2 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size2) {
                yVar3 = null;
                break;
            }
            yVar3 = list.get(i13);
            if (Intrinsics.areEqual(tj.k(yVar3), "Trailing")) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.y yVar6 = yVar3;
        if (yVar6 != null) {
            iA = androidx.compose.material.internal.o.a(iA, yVar6.M0(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(yVar6, Integer.valueOf(i11)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                yVar4 = null;
                break;
            }
            yVar4 = list.get(i14);
            if (Intrinsics.areEqual(tj.k(yVar4), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.y yVar7 = yVar4;
        int iIntValue3 = yVar7 != null ? function2.invoke(yVar7, Integer.valueOf(iA)).intValue() : 0;
        int size4 = list2.size();
        for (int i15 = 0; i15 < size4; i15++) {
            androidx.compose.ui.layout.y yVar8 = list.get(i15);
            if (Intrinsics.areEqual(tj.k(yVar8), "TextField")) {
                int iIntValue4 = function2.invoke(yVar8, Integer.valueOf(iA)).intValue();
                int size5 = list.size();
                for (int i16 = 0; i16 < size5; i16++) {
                    androidx.compose.ui.layout.y yVar9 = list.get(i16);
                    if (Intrinsics.areEqual(tj.k(yVar9), "Hint")) {
                        yVar = yVar9;
                        break;
                    }
                }
                androidx.compose.ui.layout.y yVar10 = yVar;
                return ck.x(iIntValue4, iIntValue3 > 0, iIntValue3, iIntValue, iIntValue2, yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(iA)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), zVar.getDensity(), this.f23184c);
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    private final int l(List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        androidx.compose.ui.layout.y yVar2;
        androidx.compose.ui.layout.y yVar3;
        androidx.compose.ui.layout.y yVar4;
        int size = list.size();
        for (int i11 = 0; i11 < size; i11++) {
            androidx.compose.ui.layout.y yVar5 = list.get(i11);
            if (Intrinsics.areEqual(tj.k(yVar5), "TextField")) {
                int iIntValue = function2.invoke(yVar5, Integer.valueOf(i10)).intValue();
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
                    if (Intrinsics.areEqual(tj.k(yVar2), "Label")) {
                        break;
                    }
                    i12++;
                }
                androidx.compose.ui.layout.y yVar6 = yVar2;
                int iIntValue2 = yVar6 != null ? function2.invoke(yVar6, Integer.valueOf(i10)).intValue() : 0;
                int size3 = list2.size();
                int i13 = 0;
                while (true) {
                    if (i13 >= size3) {
                        yVar3 = null;
                        break;
                    }
                    yVar3 = list.get(i13);
                    if (Intrinsics.areEqual(tj.k(yVar3), "Trailing")) {
                        break;
                    }
                    i13++;
                }
                androidx.compose.ui.layout.y yVar7 = yVar3;
                int iIntValue3 = yVar7 != null ? function2.invoke(yVar7, Integer.valueOf(i10)).intValue() : 0;
                int size4 = list2.size();
                int i14 = 0;
                while (true) {
                    if (i14 >= size4) {
                        yVar4 = null;
                        break;
                    }
                    yVar4 = list.get(i14);
                    if (Intrinsics.areEqual(tj.k(yVar4), "Leading")) {
                        break;
                    }
                    i14++;
                }
                androidx.compose.ui.layout.y yVar8 = yVar4;
                int iIntValue4 = yVar8 != null ? function2.invoke(yVar8, Integer.valueOf(i10)).intValue() : 0;
                int size5 = list2.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    androidx.compose.ui.layout.y yVar9 = list.get(i15);
                    if (Intrinsics.areEqual(tj.k(yVar9), "Hint")) {
                        yVar = yVar9;
                        break;
                    }
                }
                androidx.compose.ui.layout.y yVar10 = yVar;
                return ck.y(iIntValue4, iIntValue3, iIntValue, iIntValue2, yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(i10)).intValue() : 0, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null));
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int n(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.p0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int p(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.M0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, int i12, int i13, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, ik ikVar, int i14, int i15, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            ck.E(aVar, i12, i13, i2Var2, i2Var, i2Var3, i2Var4, i2Var5, ikVar.f23182a, kotlin.ranges.r.u(i10 - i11, 0), i14 + i15, ikVar.f23183b, c1Var.getDensity());
        } else {
            ck.F(aVar, i12, i13, i2Var2, i2Var3, i2Var4, i2Var5, ikVar.f23182a, c1Var.getDensity(), ikVar.f23184c);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int r(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.D0(i10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(androidx.compose.ui.layout.y yVar, int i10) {
        return yVar.L0(i10);
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        androidx.compose.ui.layout.z0 z0Var;
        androidx.compose.ui.layout.z0 z0Var2;
        int i10;
        androidx.compose.ui.layout.z0 z0Var3;
        final int iM;
        androidx.compose.ui.layout.z0 z0Var4;
        final ik ikVar = this;
        final androidx.compose.ui.layout.c1 c1Var2 = c1Var;
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        final int iG6 = c1Var2.g6(ikVar.f23184c.d());
        int iG7 = c1Var2.g6(ikVar.f23184c.a());
        final int iG8 = c1Var2.g6(ck.D());
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        List<? extends androidx.compose.ui.layout.z0> list3 = list2;
        int size = list3.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size) {
                z0Var = null;
                break;
            }
            z0Var = list2.get(i11);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Leading")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.z0 z0Var5 = z0Var;
        androidx.compose.ui.layout.i2 i2VarP0 = z0Var5 != null ? z0Var5.P0(jD) : null;
        int iN = tj.n(i2VarP0);
        int size2 = list3.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                z0Var2 = null;
                break;
            }
            z0Var2 = list2.get(i12);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Trailing")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.z0 z0Var6 = z0Var2;
        androidx.compose.ui.layout.i2 i2VarP1 = z0Var6 != null ? z0Var6.P0(androidx.compose.ui.unit.c.r(jD, -iN, 0, 2, null)) : null;
        int i13 = -iG7;
        int i14 = -(iN + tj.n(i2VarP1));
        long jQ = androidx.compose.ui.unit.c.q(jD, i14, i13);
        int size3 = list3.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size3) {
                i10 = iG7;
                z0Var3 = null;
                break;
            }
            z0Var3 = list2.get(i15);
            i10 = iG7;
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "Label")) {
                break;
            }
            i15++;
            iG7 = i10;
        }
        androidx.compose.ui.layout.z0 z0Var7 = z0Var3;
        androidx.compose.ui.layout.i2 i2VarP2 = z0Var7 != null ? z0Var7.P0(jQ) : null;
        if (i2VarP2 != null) {
            iM = i2VarP2.M(androidx.compose.ui.layout.b.b());
            if (iM == Integer.MIN_VALUE) {
                iM = i2VarP2.c1();
            }
        } else {
            iM = 0;
        }
        final int iMax = Math.max(iM, iG6);
        androidx.compose.ui.layout.i2 i2Var = i2VarP2;
        long jQ2 = androidx.compose.ui.unit.c.q(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 11, null), i14, i2VarP2 != null ? (i13 - iG8) - iMax : (-iG6) - i10);
        int size4 = list3.size();
        int i16 = 0;
        while (i16 < size4) {
            androidx.compose.ui.layout.z0 z0Var8 = list2.get(i16);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var8), "TextField")) {
                final androidx.compose.ui.layout.i2 i2VarP3 = z0Var8.P0(jQ2);
                long jD2 = androidx.compose.ui.unit.b.d(jQ2, 0, 0, 0, 0, 14, null);
                int size5 = list2.size();
                int i17 = 0;
                while (true) {
                    if (i17 >= size5) {
                        z0Var4 = null;
                        break;
                    }
                    z0Var4 = list2.get(i17);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), "Hint")) {
                        break;
                    }
                    i17++;
                    list2 = list;
                }
                androidx.compose.ui.layout.z0 z0Var9 = z0Var4;
                final androidx.compose.ui.layout.i2 i2VarP4 = z0Var9 != null ? z0Var9.P0(jD2) : null;
                final int iY = ck.y(tj.n(i2VarP0), tj.n(i2VarP1), i2VarP3.h1(), tj.n(i2Var), tj.n(i2VarP4), j10);
                final int iX = ck.x(i2VarP3.c1(), i2Var != null, iMax, tj.m(i2VarP0), tj.m(i2VarP1), tj.m(i2VarP4), j10, c1Var2.getDensity(), ikVar.f23184c);
                final androidx.compose.ui.layout.i2 i2Var2 = i2VarP1;
                final androidx.compose.ui.layout.i2 i2Var3 = i2Var;
                final androidx.compose.ui.layout.i2 i2Var4 = i2VarP0;
                return androidx.compose.ui.layout.c1.h6(c1Var, iY, iX, null, new Function1() { // from class: androidx.compose.material.ek
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ik.q(i2Var3, iG6, iM, iY, iX, i2VarP3, i2VarP4, i2Var4, i2Var2, ikVar, iMax, iG8, c1Var2, (androidx.compose.ui.layout.i2.a) obj);
                    }
                }, 4, null);
            }
            i16++;
            ikVar = this;
            c1Var2 = c1Var;
            i2Var = i2Var;
            list2 = list;
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return k(zVar, list, i10, new Function2() { // from class: androidx.compose.material.fk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ik.r((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return l(list, i10, new Function2() { // from class: androidx.compose.material.hk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ik.t((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return k(zVar, list, i10, new Function2() { // from class: androidx.compose.material.gk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ik.n((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return l(list, i10, new Function2() { // from class: androidx.compose.material.dk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(ik.p((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }
}
