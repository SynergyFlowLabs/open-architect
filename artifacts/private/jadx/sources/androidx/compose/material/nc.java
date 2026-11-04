package androidx.compose.material;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOutlinedTextField.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1200:1\n117#2,2:1201\n34#2,6:1203\n119#2:1209\n117#2,2:1210\n34#2,6:1212\n119#2:1218\n117#2,2:1219\n34#2,6:1221\n119#2:1227\n563#2,2:1233\n34#2,6:1235\n565#2:1241\n117#2,2:1242\n34#2,6:1244\n119#2:1250\n563#2,2:1251\n34#2,6:1253\n565#2:1259\n563#2,2:1260\n34#2,6:1262\n565#2:1268\n117#2,2:1269\n34#2,6:1271\n119#2:1277\n117#2,2:1278\n34#2,6:1280\n119#2:1286\n117#2,2:1287\n34#2,6:1289\n119#2:1295\n117#2,2:1296\n34#2,6:1298\n119#2:1304\n117#2,2:1305\n34#2,6:1307\n119#2:1313\n117#2,2:1314\n34#2,6:1316\n119#2:1322\n117#2,2:1323\n34#2,6:1325\n119#2:1331\n563#2,2:1332\n34#2,6:1334\n565#2:1340\n117#2,2:1341\n34#2,6:1343\n119#2:1349\n1#3:1228\n33#4:1229\n53#5,3:1230\n*S KotlinDebug\n*F\n+ 1 OutlinedTextField.kt\nandroidx/compose/material/OutlinedTextFieldMeasurePolicy\n*L\n777#1:1201,2\n777#1:1203,6\n777#1:1209\n783#1:1210,2\n783#1:1212,6\n783#1:1218\n802#1:1219,2\n802#1:1221,6\n802#1:1227\n820#1:1233,2\n820#1:1235,6\n820#1:1241\n826#1:1242,2\n826#1:1244,6\n826#1:1250\n856#1:1251,2\n856#1:1253,6\n856#1:1259\n926#1:1260,2\n926#1:1262,6\n926#1:1268\n929#1:1269,2\n929#1:1271,6\n929#1:1277\n933#1:1278,2\n933#1:1280,6\n933#1:1286\n937#1:1287,2\n937#1:1289,6\n937#1:1295\n941#1:1296,2\n941#1:1298,6\n941#1:1304\n964#1:1305,2\n964#1:1307,6\n964#1:1313\n974#1:1314,2\n974#1:1316,6\n974#1:1322\n985#1:1323,2\n985#1:1325,6\n985#1:1331\n989#1:1332,2\n989#1:1334,6\n989#1:1340\n992#1:1341,2\n992#1:1343,6\n992#1:1349\n804#1:1229\n804#1:1230,3\n*E\n"})
final class nc implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<n0.n, Unit> f23952a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f23953b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f23954c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.layout.g5 f23955d;

    /* JADX WARN: Multi-variable type inference failed */
    public nc(@NotNull Function1<? super n0.n, Unit> function1, boolean z10, float f10, @NotNull androidx.compose.foundation.layout.g5 g5Var) {
        this.f23952a = function1;
        this.f23953b = z10;
        this.f23954c = f10;
        this.f23955d = g5Var;
    }

    private final int k(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        androidx.compose.ui.layout.y yVar;
        androidx.compose.ui.layout.y yVar2;
        int iA;
        int iIntValue;
        androidx.compose.ui.layout.y yVar3;
        int iIntValue2;
        androidx.compose.ui.layout.y yVar4;
        List<? extends androidx.compose.ui.layout.y> list2 = list;
        int size = list2.size();
        int i11 = 0;
        while (true) {
            yVar = null;
            if (i11 >= size) {
                yVar2 = null;
                break;
            }
            yVar2 = list.get(i11);
            if (Intrinsics.areEqual(tj.k(yVar2), "Leading")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.y yVar5 = yVar2;
        if (yVar5 != null) {
            iA = androidx.compose.material.internal.o.a(i10, yVar5.M0(Integer.MAX_VALUE));
            iIntValue = function2.invoke(yVar5, Integer.valueOf(i10)).intValue();
        } else {
            iA = i10;
            iIntValue = 0;
        }
        int size2 = list2.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size2) {
                yVar3 = null;
                break;
            }
            yVar3 = list.get(i12);
            if (Intrinsics.areEqual(tj.k(yVar3), "Trailing")) {
                break;
            }
            i12++;
        }
        androidx.compose.ui.layout.y yVar6 = yVar3;
        if (yVar6 != null) {
            iA = androidx.compose.material.internal.o.a(iA, yVar6.M0(Integer.MAX_VALUE));
            iIntValue2 = function2.invoke(yVar6, Integer.valueOf(i10)).intValue();
        } else {
            iIntValue2 = 0;
        }
        int size3 = list2.size();
        int i13 = 0;
        while (true) {
            if (i13 >= size3) {
                yVar4 = null;
                break;
            }
            yVar4 = list.get(i13);
            if (Intrinsics.areEqual(tj.k(yVar4), "Label")) {
                break;
            }
            i13++;
        }
        androidx.compose.ui.layout.y yVar7 = yVar4;
        int iIntValue3 = yVar7 != null ? function2.invoke(yVar7, Integer.valueOf(androidx.compose.ui.util.e.s(iA, i10, this.f23954c))).intValue() : 0;
        int size4 = list2.size();
        for (int i14 = 0; i14 < size4; i14++) {
            androidx.compose.ui.layout.y yVar8 = list.get(i14);
            if (Intrinsics.areEqual(tj.k(yVar8), "TextField")) {
                int iIntValue4 = function2.invoke(yVar8, Integer.valueOf(iA)).intValue();
                int size5 = list.size();
                for (int i15 = 0; i15 < size5; i15++) {
                    androidx.compose.ui.layout.y yVar9 = list.get(i15);
                    if (Intrinsics.areEqual(tj.k(yVar9), "Hint")) {
                        yVar = yVar9;
                        break;
                    }
                }
                androidx.compose.ui.layout.y yVar10 = yVar;
                return gc.C(iIntValue, iIntValue2, iIntValue4, iIntValue3, yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(iA)).intValue() : 0, this.f23954c, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), zVar.getDensity(), this.f23955d);
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    private final int l(androidx.compose.ui.layout.z zVar, List<? extends androidx.compose.ui.layout.y> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
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
                return gc.D(iIntValue4, iIntValue3, iIntValue, iIntValue2, yVar10 != null ? function2.invoke(yVar10, Integer.valueOf(i10)).intValue() : 0, this.f23954c, androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null), zVar.getDensity(), this.f23955d);
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
    public static final Unit q(int i10, int i11, androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.i2 i2Var2, androidx.compose.ui.layout.i2 i2Var3, androidx.compose.ui.layout.i2 i2Var4, androidx.compose.ui.layout.i2 i2Var5, androidx.compose.ui.layout.i2 i2Var6, nc ncVar, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.i2.a aVar) {
        gc.H(aVar, i10, i11, i2Var, i2Var2, i2Var3, i2Var4, i2Var5, i2Var6, ncVar.f23954c, ncVar.f23953b, c1Var.getDensity(), c1Var.getLayoutDirection(), ncVar.f23955d);
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
    public androidx.compose.ui.layout.b1 a(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        androidx.compose.ui.layout.z0 z0Var;
        androidx.compose.ui.layout.z0 z0Var2;
        androidx.compose.ui.layout.z0 z0Var3;
        long jC;
        androidx.compose.ui.layout.z0 z0Var4;
        final nc ncVar = this;
        androidx.compose.ui.layout.c1 c1Var2 = c1Var;
        int iG6 = c1Var2.g6(ncVar.f23955d.a());
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z0Var = null;
                break;
            }
            z0Var = list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "Leading")) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.layout.z0 z0Var5 = z0Var;
        androidx.compose.ui.layout.i2 i2VarP0 = z0Var5 != null ? z0Var5.P0(jD) : null;
        int iN = tj.n(i2VarP0);
        int size2 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z0Var2 = null;
                break;
            }
            z0Var2 = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "Trailing")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.z0 z0Var6 = z0Var2;
        androidx.compose.ui.layout.i2 i2VarP1 = z0Var6 != null ? z0Var6.P0(androidx.compose.ui.unit.c.r(jD, -iN, 0, 2, null)) : null;
        int iN2 = iN + tj.n(i2VarP1);
        int iG7 = c1Var2.g6(ncVar.f23955d.b(c1Var2.getLayoutDirection())) + c1Var2.g6(ncVar.f23955d.c(c1Var2.getLayoutDirection()));
        int i12 = -iN2;
        int i13 = -iG6;
        long jQ = androidx.compose.ui.unit.c.q(jD, androidx.compose.ui.util.e.s(i12 - iG7, -iG7, ncVar.f23954c), i13);
        int size3 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size3) {
                z0Var3 = null;
                break;
            }
            z0Var3 = list.get(i14);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var3), "Label")) {
                break;
            }
            i14++;
        }
        androidx.compose.ui.layout.z0 z0Var7 = z0Var3;
        final androidx.compose.ui.layout.i2 i2VarP2 = z0Var7 != null ? z0Var7.P0(jQ) : null;
        if (i2VarP2 != null) {
            jC = n0.n.f((((long) Float.floatToRawIntBits(i2VarP2.c1())) & com.rabbitmq.client.k0.f265952a) | (((long) Float.floatToRawIntBits(i2VarP2.h1())) << 32));
        } else {
            jC = n0.n.f332724b.c();
        }
        ncVar.f23952a.invoke(n0.n.c(jC));
        long j11 = j10;
        long jD2 = androidx.compose.ui.unit.b.d(androidx.compose.ui.unit.c.q(j11, i12, i13 - Math.max(tj.m(i2VarP2) / 2, c1Var2.g6(ncVar.f23955d.d()))), 0, 0, 0, 0, 11, null);
        int size4 = list2.size();
        int i15 = 0;
        while (i15 < size4) {
            androidx.compose.ui.layout.z0 z0Var8 = list.get(i15);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var8), "TextField")) {
                androidx.compose.ui.layout.i2 i2VarP3 = z0Var8.P0(jD2);
                long jD3 = androidx.compose.ui.unit.b.d(jD2, 0, 0, 0, 0, 14, null);
                List<? extends androidx.compose.ui.layout.z0> list3 = list;
                int size5 = list3.size();
                int i16 = 0;
                while (true) {
                    if (i16 >= size5) {
                        z0Var4 = null;
                        break;
                    }
                    z0Var4 = list.get(i16);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var4), "Hint")) {
                        break;
                    }
                    i16++;
                }
                androidx.compose.ui.layout.z0 z0Var9 = z0Var4;
                final androidx.compose.ui.layout.i2 i2VarP4 = z0Var9 != null ? z0Var9.P0(jD3) : null;
                int iD = gc.D(tj.n(i2VarP0), tj.n(i2VarP1), i2VarP3.h1(), tj.n(i2VarP2), tj.n(i2VarP4), ncVar.f23954c, j11, c1Var2.getDensity(), ncVar.f23955d);
                int iC = gc.C(tj.m(i2VarP0), tj.m(i2VarP1), i2VarP3.c1(), tj.m(i2VarP2), tj.m(i2VarP4), ncVar.f23954c, j10, c1Var2.getDensity(), ncVar.f23955d);
                int size6 = list3.size();
                int i17 = 0;
                while (i17 < size6) {
                    androidx.compose.ui.layout.z0 z0Var10 = list.get(i17);
                    if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var10), gc.f22899c)) {
                        final androidx.compose.ui.layout.i2 i2VarP5 = z0Var10.P0(androidx.compose.ui.unit.c.a(iD != Integer.MAX_VALUE ? iD : 0, iD, iC != Integer.MAX_VALUE ? iC : 0, iC));
                        final int i18 = iC;
                        final androidx.compose.ui.layout.i2 i2Var = i2VarP1;
                        final androidx.compose.ui.layout.i2 i2Var2 = i2VarP3;
                        final int i19 = iD;
                        final androidx.compose.ui.layout.i2 i2Var3 = i2VarP0;
                        return androidx.compose.ui.layout.c1.h6(c1Var, i19, i18, null, new Function1() { // from class: androidx.compose.material.kc
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return nc.q(i18, i19, i2Var3, i2Var, i2Var2, i2VarP2, i2VarP4, i2VarP5, ncVar, c1Var, (androidx.compose.ui.layout.i2.a) obj);
                            }
                        }, 4, null);
                    }
                    i17++;
                    ncVar = this;
                    iD = iD;
                    i2VarP3 = i2VarP3;
                    i2VarP1 = i2VarP1;
                    iC = iC;
                }
                androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
                throw new kotlin.a0();
            }
            i15++;
            ncVar = this;
            c1Var2 = c1Var;
            j11 = j10;
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return k(zVar, list, i10, new Function2() { // from class: androidx.compose.material.ic
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(nc.r((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return l(zVar, list, i10, new Function2() { // from class: androidx.compose.material.lc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(nc.t((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return k(zVar, list, i10, new Function2() { // from class: androidx.compose.material.mc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(nc.n((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        return l(zVar, list, i10, new Function2() { // from class: androidx.compose.material.jc
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(nc.p((androidx.compose.ui.layout.y) obj, ((Integer) obj2).intValue()));
            }
        });
    }
}
