package androidx.compose.foundation.layout;

import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nFlowLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n+ 2 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowLayoutKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,1585:1\n967#2,33:1586\n1000#2,40:1620\n932#2,4:1660\n936#2,11:1667\n947#2:1679\n1085#2,111:1680\n1#3:1619\n71#4,3:1664\n75#4:1678\n*S KotlinDebug\n*F\n+ 1 FlowLayout.kt\nandroidx/compose/foundation/layout/FlowMeasurePolicy\n*L\n868#1:1586,33\n868#1:1620,40\n885#1:1660,4\n885#1:1667,11\n885#1:1679\n902#1:1680,111\n868#1:1619\n885#1:1664,3\n885#1:1678\n*E\n"})
final class j3 implements androidx.compose.ui.layout.h1, b3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final q.e f16145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final q.m f16146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f16147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final k1 f16148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final float f16149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int f16150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f16151h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final y2 f16152i;

    public /* synthetic */ j3(boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, y2 y2Var, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, eVar, mVar, f10, k1Var, f11, i10, i11, y2Var);
    }

    private final int A() {
        return this.f16150g;
    }

    private final int B() {
        return this.f16151h;
    }

    private final y2 C() {
        return this.f16152i;
    }

    public static /* synthetic */ j3 E(j3 j3Var, boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, y2 y2Var, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            z10 = j3Var.f16144a;
        }
        if ((i12 & 2) != 0) {
            eVar = j3Var.f16145b;
        }
        if ((i12 & 4) != 0) {
            mVar = j3Var.f16146c;
        }
        if ((i12 & 8) != 0) {
            f10 = j3Var.f16147d;
        }
        if ((i12 & 16) != 0) {
            k1Var = j3Var.f16148e;
        }
        if ((i12 & 32) != 0) {
            f11 = j3Var.f16149f;
        }
        if ((i12 & 64) != 0) {
            i10 = j3Var.f16150g;
        }
        if ((i12 & 128) != 0) {
            i11 = j3Var.f16151h;
        }
        if ((i12 & 256) != 0) {
            y2Var = j3Var.f16152i;
        }
        int i13 = i11;
        y2 y2Var2 = y2Var;
        float f12 = f11;
        int i14 = i10;
        k1 k1Var2 = k1Var;
        q.m mVar2 = mVar;
        return j3Var.D(z10, eVar, mVar2, f10, k1Var2, f12, i14, i13, y2Var2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    private final float x() {
        return this.f16147d;
    }

    private final float z() {
        return this.f16149f;
    }

    @NotNull
    public final j3 D(boolean z10, @NotNull q.e eVar, @NotNull q.m mVar, float f10, @NotNull k1 k1Var, float f11, int i10, int i11, @NotNull y2 y2Var) {
        return new j3(z10, eVar, mVar, f10, k1Var, f11, i10, i11, y2Var, null);
    }

    public final int F(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11, int i12, int i13, int i14, @NotNull y2 y2Var) {
        long jD;
        int i15 = 0;
        if (list.isEmpty()) {
            jD = androidx.collection.e0.d(0, 0);
        } else {
            k2 k2Var = new k2(i13, y2Var, x4.b(0, i10, 0, Integer.MAX_VALUE), i14, i11, i12, null);
            androidx.compose.ui.layout.y yVar = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, 0);
            int iK = yVar != null ? K(yVar, i10) : 0;
            int iM = yVar != null ? M(yVar, iK) : 0;
            int i16 = 0;
            if (k2Var.b(list.size() > 1, 0, androidx.collection.e0.d(i10, Integer.MAX_VALUE), yVar == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(iM, iK)), 0, 0, 0, false, false).a()) {
                androidx.collection.e0 e0VarI = y2Var.i(yVar != null, 0, 0);
                jD = androidx.collection.e0.d(e0VarI != null ? androidx.collection.e0.i(e0VarI.l()) : 0, 0);
            } else {
                int size = list.size();
                int i17 = i10;
                int i18 = 0;
                int i19 = 0;
                int i20 = 0;
                int i21 = 0;
                int i22 = 0;
                while (i18 < size) {
                    int i23 = i17 - iM;
                    int i24 = i18 + 1;
                    int iMax = Math.max(i22, iK);
                    androidx.compose.ui.layout.y yVar2 = (androidx.compose.ui.layout.y) CollectionsKt.getOrNull(list, i24);
                    int iK2 = yVar2 != null ? K(yVar2, i10) : i15;
                    int iM2 = yVar2 != null ? M(yVar2, iK2) + i11 : i15;
                    boolean z10 = i18 + 2 < list.size();
                    int i25 = i24 - i20;
                    int i26 = i21;
                    int i27 = iM2;
                    int i28 = iK2;
                    k2.b bVarB = k2Var.b(z10, i25, androidx.collection.e0.d(i23, Integer.MAX_VALUE), yVar2 == null ? null : androidx.collection.e0.a(androidx.collection.e0.d(iM2, iK2)), i26, i16, iMax, false, false);
                    if (bVarB.b()) {
                        int i29 = i16 + iMax + i12;
                        k2.a aVarA = k2Var.a(bVarB, yVar2 != null, i26, i29, i23, i25);
                        int i30 = i27 - i11;
                        i21 = i26 + 1;
                        if (bVarB.a()) {
                            if (aVarA != null) {
                                long jB = aVarA.b();
                                if (!aVarA.c()) {
                                    i29 += androidx.collection.e0.i(jB) + i12;
                                }
                            }
                            i16 = i29;
                            i19 = i24;
                            break;
                        }
                        i16 = i29;
                        iM = i30;
                        i20 = i24;
                        i22 = 0;
                        i17 = i10;
                    } else {
                        i17 = i23;
                        i21 = i26;
                        i22 = iMax;
                        iM = i27;
                    }
                    iK = i28;
                    i18 = i24;
                    i19 = i18;
                    i15 = 0;
                }
                jD = androidx.collection.e0.d(i16 - i12, i19);
            }
        }
        return androidx.collection.e0.h(jD);
    }

    public final int G(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11) {
        int i12 = this.f16150g;
        int size = list.size();
        int i13 = 0;
        int iMax = 0;
        int i14 = 0;
        int i15 = 0;
        while (i13 < size) {
            int iH = H(list.get(i13), i10) + i11;
            int i16 = i13 + 1;
            if (i16 - i14 == i12 || i16 == list.size()) {
                iMax = Math.max(iMax, (i15 + iH) - i11);
                i15 = 0;
                i14 = i13;
            } else {
                i15 += iH;
            }
            i13 = i16;
        }
        return iMax;
    }

    public final int H(@NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i() ? yVar.M0(i10) : yVar.p0(i10);
    }

    public final int K(@NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i() ? yVar.D0(i10) : yVar.L0(i10);
    }

    public final int L(@NotNull List<? extends androidx.compose.ui.layout.y> list, int i10, int i11, int i12, int i13, int i14, @NotNull y2 y2Var) {
        int i15 = i13;
        int i16 = i14;
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        int[] iArr = new int[size];
        int size2 = list.size();
        int[] iArr2 = new int[size2];
        int size3 = list.size();
        for (int i17 = 0; i17 < size3; i17++) {
            androidx.compose.ui.layout.y yVar = list.get(i17);
            int iM = M(yVar, i10);
            iArr[i17] = iM;
            iArr2[i17] = K(yVar, iM);
        }
        int i18 = Integer.MAX_VALUE;
        if (i16 != Integer.MAX_VALUE && i15 != Integer.MAX_VALUE) {
            i18 = i15 * i16;
        }
        int i19 = 1;
        int iMin = Math.min(i18 - (((i18 >= list.size() || !(y2Var.p() == u2.a.ExpandIndicator || y2Var.p() == u2.a.ExpandOrCollapseIndicator)) && (i18 < list.size() || i16 < y2Var.m() || y2Var.p() != u2.a.ExpandOrCollapseIndicator)) ? 0 : 1), list.size());
        int iSum = ArraysKt.sum(iArr) + ((list.size() - 1) * i11);
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
            long jZ = t2.z(list, iArr, iArr2, i26, i11, i12, i15, i16, y2Var);
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
            i15 = i13;
            i16 = i14;
            iSum = i26;
        }
        return iSum;
    }

    public final int M(@NotNull androidx.compose.ui.layout.y yVar, int i10) {
        return i() ? yVar.L0(i10) : yVar.D0(i10);
    }

    @Override // androidx.compose.ui.layout.h1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
        if (this.f16151h == 0 || this.f16150g == 0 || list.isEmpty() || (androidx.compose.ui.unit.b.o(j10) == 0 && this.f16152i.p() != u2.a.Visible)) {
            return androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.h3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j3.I((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        List list2 = (List) CollectionsKt.first((List) list);
        if (list2.isEmpty()) {
            return androidx.compose.ui.layout.c1.h6(c1Var, 0, 0, null, new Function1() { // from class: androidx.compose.foundation.layout.i3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return j3.J((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        List list3 = (List) CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.z0 z0Var = list3 != null ? (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull(list3) : null;
        List list4 = (List) CollectionsKt.getOrNull(list, 2);
        androidx.compose.ui.layout.z0 z0Var2 = list4 != null ? (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull(list4) : null;
        this.f16152i.q(list2.size());
        this.f16152i.s(this, z0Var, z0Var2, j10);
        return t2.q(c1Var, this, list2.iterator(), this.f16147d, this.f16149f, x4.d(j10, i() ? i4.Horizontal : i4.Vertical), this.f16150g, this.f16151h, this.f16152i);
    }

    @Override // androidx.compose.ui.layout.h1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        y2 y2Var = this.f16152i;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.y yVar = list2 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        y2Var.t(yVar, list3 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list3) : null, i(), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null));
        if (i()) {
            List<? extends androidx.compose.ui.layout.y> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return F(listEmptyList, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
        }
        List<? extends androidx.compose.ui.layout.y> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return L(listEmptyList2, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
    }

    @Override // androidx.compose.ui.layout.h1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        y2 y2Var = this.f16152i;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.y yVar = list2 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        y2Var.t(yVar, list3 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list3) : null, i(), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null));
        if (i()) {
            List<? extends androidx.compose.ui.layout.y> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return L(listEmptyList, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
        }
        List<? extends androidx.compose.ui.layout.y> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return F(listEmptyList2, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
    }

    @Override // androidx.compose.ui.layout.h1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        y2 y2Var = this.f16152i;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.y yVar = list2 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        y2Var.t(yVar, list3 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list3) : null, i(), androidx.compose.ui.unit.c.b(0, i10, 0, 0, 13, null));
        if (i()) {
            List<? extends androidx.compose.ui.layout.y> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return F(listEmptyList, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
        }
        List<? extends androidx.compose.ui.layout.y> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return G(listEmptyList2, i10, zVar.g6(this.f16147d));
    }

    @Override // androidx.compose.ui.layout.h1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        y2 y2Var = this.f16152i;
        List list2 = (List) CollectionsKt.getOrNull(list, 1);
        androidx.compose.ui.layout.y yVar = list2 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list2) : null;
        List list3 = (List) CollectionsKt.getOrNull(list, 2);
        y2Var.t(yVar, list3 != null ? (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull(list3) : null, i(), androidx.compose.ui.unit.c.b(0, 0, 0, i10, 7, null));
        if (i()) {
            List<? extends androidx.compose.ui.layout.y> listEmptyList = (List) CollectionsKt.firstOrNull((List) list);
            if (listEmptyList == null) {
                listEmptyList = CollectionsKt.emptyList();
            }
            return G(listEmptyList, i10, zVar.g6(this.f16147d));
        }
        List<? extends androidx.compose.ui.layout.y> listEmptyList2 = (List) CollectionsKt.firstOrNull((List) list);
        if (listEmptyList2 == null) {
            listEmptyList2 = CollectionsKt.emptyList();
        }
        return F(listEmptyList2, i10, zVar.g6(this.f16147d), zVar.g6(this.f16149f), this.f16150g, this.f16151h, this.f16152i);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j3)) {
            return false;
        }
        j3 j3Var = (j3) obj;
        return this.f16144a == j3Var.f16144a && Intrinsics.areEqual(this.f16145b, j3Var.f16145b) && Intrinsics.areEqual(this.f16146c, j3Var.f16146c) && androidx.compose.ui.unit.h.x(this.f16147d, j3Var.f16147d) && Intrinsics.areEqual(this.f16148e, j3Var.f16148e) && androidx.compose.ui.unit.h.x(this.f16149f, j3Var.f16149f) && this.f16150g == j3Var.f16150g && this.f16151h == j3Var.f16151h && Intrinsics.areEqual(this.f16152i, j3Var.f16152i);
    }

    public int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.f16144a) * 31) + this.f16145b.hashCode()) * 31) + this.f16146c.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f16147d)) * 31) + this.f16148e.hashCode()) * 31) + androidx.compose.ui.unit.h.D(this.f16149f)) * 31) + Integer.hashCode(this.f16150g)) * 31) + Integer.hashCode(this.f16151h)) * 31) + this.f16152i.hashCode();
    }

    @Override // androidx.compose.foundation.layout.b3
    public boolean i() {
        return this.f16144a;
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public k1 l() {
        return this.f16148e;
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public q.m q() {
        return this.f16146c;
    }

    public final boolean s() {
        return this.f16144a;
    }

    @NotNull
    public String toString() {
        return "FlowMeasurePolicy(isHorizontal=" + this.f16144a + ", horizontalArrangement=" + this.f16145b + ", verticalArrangement=" + this.f16146c + ", mainAxisSpacing=" + ((Object) androidx.compose.ui.unit.h.M(this.f16147d)) + ", crossAxisAlignment=" + this.f16148e + ", crossAxisArrangementSpacing=" + ((Object) androidx.compose.ui.unit.h.M(this.f16149f)) + ", maxItemsInMainAxis=" + this.f16150g + ", maxLines=" + this.f16151h + ", overflow=" + this.f16152i + ')';
    }

    @Override // androidx.compose.foundation.layout.b3
    @NotNull
    public q.e u() {
        return this.f16145b;
    }

    @NotNull
    public final q.e v() {
        return this.f16145b;
    }

    @NotNull
    public final q.m w() {
        return this.f16146c;
    }

    @NotNull
    public final k1 y() {
        return this.f16148e;
    }

    private j3(boolean z10, q.e eVar, q.m mVar, float f10, k1 k1Var, float f11, int i10, int i11, y2 y2Var) {
        this.f16144a = z10;
        this.f16145b = eVar;
        this.f16146c = mVar;
        this.f16147d = f10;
        this.f16148e = k1Var;
        this.f16149f = f11;
        this.f16150g = i10;
        this.f16151h = i11;
        this.f16152i = y2Var;
    }
}
