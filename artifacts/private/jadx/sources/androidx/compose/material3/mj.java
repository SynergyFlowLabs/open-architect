package androidx.compose.material3;

import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nListItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n+ 2 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,769:1\n49#2:770\n68#2:771\n68#2:772\n49#2:773\n49#2:774\n68#2:775\n*S KotlinDebug\n*F\n+ 1 ListItem.kt\nandroidx/compose/material3/ListItemMeasurePolicy\n*L\n208#1:770\n238#1:771\n294#1:772\n371#1:773\n390#1:774\n428#1:775\n*E\n"})
final class mj implements androidx.compose.ui.layout.h1 {

    /* synthetic */ class a extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.ui.layout.y, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f30633a = new a();

        a() {
            super(2, androidx.compose.ui.layout.y.class, "maxIntrinsicHeight", "maxIntrinsicHeight(I)I", 0);
        }

        public final Integer X(androidx.compose.ui.layout.y yVar, int i10) {
            return Integer.valueOf(yVar.p0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.y yVar, Integer num) {
            return X(yVar, num.intValue());
        }
    }

    /* synthetic */ class b extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.ui.layout.y, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f30634a = new b();

        b() {
            super(2, androidx.compose.ui.layout.y.class, "maxIntrinsicWidth", "maxIntrinsicWidth(I)I", 0);
        }

        public final Integer X(androidx.compose.ui.layout.y yVar, int i10) {
            return Integer.valueOf(yVar.M0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.y yVar, Integer num) {
            return X(yVar, num.intValue());
        }
    }

    /* synthetic */ class c extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.ui.layout.y, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f30635a = new c();

        c() {
            super(2, androidx.compose.ui.layout.y.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
        }

        public final Integer X(androidx.compose.ui.layout.y yVar, int i10) {
            return Integer.valueOf(yVar.D0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.y yVar, Integer num) {
            return X(yVar, num.intValue());
        }
    }

    /* synthetic */ class d extends kotlin.jvm.internal.g0 implements Function2<androidx.compose.ui.layout.y, Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f30636a = new d();

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d() {
            super(2, androidx.compose.ui.layout.y.class, "minIntrinsicWidth", "minIntrinsicWidth(I)I", 0);
            int i10 = 5 & 2;
        }

        public final Integer X(androidx.compose.ui.layout.y yVar, int i10) {
            return Integer.valueOf(yVar.L0(i10));
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Integer invoke(androidx.compose.ui.layout.y yVar, Integer num) {
            return X(yVar, num.intValue());
        }
    }

    private final int f(androidx.compose.ui.layout.z zVar, List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        int iIntValue;
        int iIntValue2;
        List<? extends androidx.compose.ui.layout.y> list2 = list.get(0);
        List<? extends androidx.compose.ui.layout.y> list3 = list.get(1);
        List<? extends androidx.compose.ui.layout.y> list4 = list.get(2);
        List<? extends androidx.compose.ui.layout.y> list5 = list.get(3);
        List<? extends androidx.compose.ui.layout.y> list6 = list.get(4);
        int iD = androidx.compose.material3.internal.u2.d(i10, zVar.g6(androidx.compose.ui.unit.h.r(lj.z() + lj.x())));
        androidx.compose.ui.layout.y yVar = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list5);
        if (yVar != null) {
            iIntValue = function2.invoke(yVar, Integer.valueOf(iD)).intValue();
            iD = androidx.compose.material3.internal.u2.d(iD, yVar.M0(Integer.MAX_VALUE));
        } else {
            iIntValue = 0;
        }
        androidx.compose.ui.layout.y yVar2 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list6);
        if (yVar2 != null) {
            iIntValue2 = function2.invoke(yVar2, Integer.valueOf(iD)).intValue();
            iD = androidx.compose.material3.internal.u2.d(iD, yVar2.M0(Integer.MAX_VALUE));
        } else {
            iIntValue2 = 0;
        }
        androidx.compose.ui.layout.y yVar3 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list3);
        int iIntValue3 = yVar3 != null ? function2.invoke(yVar3, Integer.valueOf(iD)).intValue() : 0;
        androidx.compose.ui.layout.y yVar4 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list2);
        int iIntValue4 = yVar4 != null ? function2.invoke(yVar4, Integer.valueOf(iD)).intValue() : 0;
        androidx.compose.ui.layout.y yVar5 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list4);
        int iIntValue5 = yVar5 != null ? function2.invoke(yVar5, Integer.valueOf(iD)).intValue() : 0;
        int iD2 = nj.f31043b.d(iIntValue3 > 0, iIntValue5 > 0, lj.H(zVar, iIntValue5));
        return lj.t(zVar, iIntValue, iIntValue2, iIntValue4, iIntValue3, iIntValue5, iD2, zVar.g6(androidx.compose.ui.unit.h.r(lj.K(iD2) * 2)), androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null));
    }

    private final int g(androidx.compose.ui.layout.z zVar, List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10, Function2<? super androidx.compose.ui.layout.y, ? super Integer, Integer> function2) {
        List<? extends androidx.compose.ui.layout.y> list2 = list.get(0);
        List<? extends androidx.compose.ui.layout.y> list3 = list.get(1);
        List<? extends androidx.compose.ui.layout.y> list4 = list.get(2);
        List<? extends androidx.compose.ui.layout.y> list5 = list.get(3);
        List<? extends androidx.compose.ui.layout.y> list6 = list.get(4);
        androidx.compose.ui.layout.y yVar = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list5);
        int iIntValue = yVar != null ? function2.invoke(yVar, Integer.valueOf(i10)).intValue() : 0;
        androidx.compose.ui.layout.y yVar2 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list6);
        int iIntValue2 = yVar2 != null ? function2.invoke(yVar2, Integer.valueOf(i10)).intValue() : 0;
        androidx.compose.ui.layout.y yVar3 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list2);
        int iIntValue3 = yVar3 != null ? function2.invoke(yVar3, Integer.valueOf(i10)).intValue() : 0;
        androidx.compose.ui.layout.y yVar4 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list3);
        int iIntValue4 = yVar4 != null ? function2.invoke(yVar4, Integer.valueOf(i10)).intValue() : 0;
        androidx.compose.ui.layout.y yVar5 = (androidx.compose.ui.layout.y) CollectionsKt.firstOrNull((List) list4);
        return lj.u(zVar, iIntValue, iIntValue2, iIntValue3, iIntValue4, yVar5 != null ? function2.invoke(yVar5, Integer.valueOf(i10)).intValue() : 0, zVar.g6(androidx.compose.ui.unit.h.r(lj.z() + lj.x())), androidx.compose.ui.unit.c.b(0, 0, 0, 0, 15, null));
    }

    @Override // androidx.compose.ui.layout.h1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends List<? extends androidx.compose.ui.layout.z0>> list, long j10) {
        long j11;
        androidx.compose.ui.layout.i2 i2VarP0;
        List<? extends androidx.compose.ui.layout.z0> list2;
        androidx.compose.ui.layout.i2 i2VarP1;
        List<? extends androidx.compose.ui.layout.z0> list3 = list.get(0);
        List<? extends androidx.compose.ui.layout.z0> list4 = list.get(1);
        List<? extends androidx.compose.ui.layout.z0> list5 = list.get(2);
        List<? extends androidx.compose.ui.layout.z0> list6 = list.get(3);
        List<? extends androidx.compose.ui.layout.z0> list7 = list.get(4);
        long jD = androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null);
        float fZ = lj.z();
        float fX = lj.x();
        int iG6 = c1Var.g6(androidx.compose.ui.unit.h.r(fZ + fX));
        androidx.compose.ui.layout.z0 z0Var = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list6);
        int iL0 = z0Var != null ? z0Var.L0(androidx.compose.ui.unit.b.o(j10)) : 0;
        androidx.compose.ui.layout.z0 z0Var2 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list7);
        int iD = androidx.compose.material3.internal.u2.d(androidx.compose.ui.unit.b.p(jD), iL0 + (z0Var2 != null ? z0Var2.L0(androidx.compose.ui.unit.b.o(j10)) : 0) + iG6);
        androidx.compose.ui.layout.z0 z0Var3 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list5);
        boolean zH = lj.H(c1Var, z0Var3 != null ? z0Var3.D0(iD) : 0);
        nj.a aVar = nj.f31043b;
        float f10 = 2;
        long jQ = androidx.compose.ui.unit.c.q(jD, -iG6, -c1Var.g6(androidx.compose.ui.unit.h.r(lj.K(aVar.d(CollectionsKt.firstOrNull((List) list4) != null, CollectionsKt.firstOrNull((List) list5) != null, zH)) * f10)));
        androidx.compose.ui.layout.z0 z0Var4 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list6);
        androidx.compose.ui.layout.i2 i2VarP2 = z0Var4 != null ? z0Var4.P0(jQ) : null;
        int iC = androidx.compose.material3.internal.u2.c(i2VarP2);
        androidx.compose.ui.layout.z0 z0Var5 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list7);
        if (z0Var5 != null) {
            j11 = jQ;
            i2VarP0 = z0Var5.P0(androidx.compose.ui.unit.c.r(j11, -iC, 0, 2, null));
        } else {
            j11 = jQ;
            i2VarP0 = null;
        }
        int iC2 = iC + androidx.compose.material3.internal.u2.c(i2VarP0);
        androidx.compose.ui.layout.z0 z0Var6 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list3);
        if (z0Var6 != null) {
            list2 = list5;
            i2VarP1 = z0Var6.P0(androidx.compose.ui.unit.c.r(j11, -iC2, 0, 2, null));
        } else {
            list2 = list5;
            i2VarP1 = null;
        }
        int iA = androidx.compose.material3.internal.u2.a(i2VarP1);
        androidx.compose.ui.layout.z0 z0Var7 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list2);
        androidx.compose.ui.layout.i2 i2VarP3 = z0Var7 != null ? z0Var7.P0(androidx.compose.ui.unit.c.q(j11, -iC2, -iA)) : null;
        int iA2 = iA + androidx.compose.material3.internal.u2.a(i2VarP3);
        boolean z10 = (i2VarP3 == null || i2VarP3.M(androidx.compose.ui.layout.b.a()) == i2VarP3.M(androidx.compose.ui.layout.b.b())) ? false : true;
        androidx.compose.ui.layout.z0 z0Var8 = (androidx.compose.ui.layout.z0) CollectionsKt.firstOrNull((List) list4);
        androidx.compose.ui.layout.i2 i2VarP4 = z0Var8 != null ? z0Var8.P0(androidx.compose.ui.unit.c.q(j11, -iC2, -iA2)) : null;
        int iD2 = aVar.d(i2VarP4 != null, i2VarP3 != null, z10);
        float fK = lj.K(iD2);
        return lj.I(c1Var, lj.u(c1Var, androidx.compose.material3.internal.u2.c(i2VarP2), androidx.compose.material3.internal.u2.c(i2VarP0), androidx.compose.material3.internal.u2.c(i2VarP1), androidx.compose.material3.internal.u2.c(i2VarP4), androidx.compose.material3.internal.u2.c(i2VarP3), iG6, j10), lj.t(c1Var, androidx.compose.material3.internal.u2.a(i2VarP2), androidx.compose.material3.internal.u2.a(i2VarP0), androidx.compose.material3.internal.u2.a(i2VarP1), androidx.compose.material3.internal.u2.a(i2VarP4), androidx.compose.material3.internal.u2.a(i2VarP3), iD2, c1Var.g6(androidx.compose.ui.unit.h.r(fK * f10)), j10), i2VarP2, i2VarP0, i2VarP1, i2VarP4, i2VarP3, nj.t(iD2, aVar.b()), c1Var.g6(fZ), c1Var.g6(fX), c1Var.g6(fK));
    }

    @Override // androidx.compose.ui.layout.h1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        return f(zVar, list, i10, c.f30635a);
    }

    @Override // androidx.compose.ui.layout.h1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        return g(zVar, list, i10, d.f30636a);
    }

    @Override // androidx.compose.ui.layout.h1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        return f(zVar, list, i10, a.f30633a);
    }

    @Override // androidx.compose.ui.layout.h1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends List<? extends androidx.compose.ui.layout.y>> list, int i10) {
        return g(zVar, list, i10, b.f30634a);
    }
}
