package androidx.compose.foundation.layout;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n+ 2 Constraints.kt\nandroidx/compose/ui/unit/Constraints\n+ 3 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,332:1\n202#2:333\n71#3,5:334\n71#3,5:339\n13474#4,3:344\n*S KotlinDebug\n*F\n+ 1 Box.kt\nandroidx/compose/foundation/layout/BoxMeasurePolicy\n*L\n136#1:333\n166#1:334,5\n187#1:339,5\n196#1:344,3\n*E\n"})
final class b0 implements androidx.compose.ui.layout.a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final androidx.compose.ui.e f15923a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f15924b;

    public b0(@NotNull androidx.compose.ui.e eVar, boolean z10) {
        this.f15923a = eVar;
        this.f15924b = z10;
    }

    private final androidx.compose.ui.e i() {
        return this.f15923a;
    }

    private final boolean j() {
        return this.f15924b;
    }

    public static /* synthetic */ b0 l(b0 b0Var, androidx.compose.ui.e eVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            eVar = b0Var.f15923a;
        }
        if ((i10 & 2) != 0) {
            z10 = b0Var.f15924b;
        }
        return b0Var.k(eVar, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(androidx.compose.ui.layout.i2.a aVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.ui.layout.i2 i2Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.layout.c1 c1Var, int i10, int i11, b0 b0Var, androidx.compose.ui.layout.i2.a aVar) {
        x.l(aVar, i2Var, z0Var, c1Var.getLayoutDirection(), i10, i11, b0Var.f15923a);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.layout.i2[] i2VarArr, List list, androidx.compose.ui.layout.c1 c1Var, kotlin.jvm.internal.i1.f fVar, kotlin.jvm.internal.i1.f fVar2, b0 b0Var, androidx.compose.ui.layout.i2.a aVar) {
        int length = i2VarArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            androidx.compose.ui.layout.i2 i2Var = i2VarArr[i10];
            Intrinsics.checkNotNull(i2Var, "null cannot be cast to non-null type androidx.compose.ui.layout.Placeable");
            x.l(aVar, i2Var, (androidx.compose.ui.layout.z0) list.get(i11), c1Var.getLayoutDirection(), fVar.f312749a, fVar2.f312749a, b0Var.f15923a);
            i10++;
            i11++;
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull final androidx.compose.ui.layout.c1 c1Var, @NotNull final List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        int iR;
        int iQ;
        androidx.compose.ui.layout.i2 i2VarP0;
        if (list.isEmpty()) {
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, new Function1() { // from class: androidx.compose.foundation.layout.y
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0.n((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        long jB = this.f15924b ? j10 : androidx.compose.ui.unit.b.b(j10 & androidx.compose.ui.unit.c.f42680o);
        if (list.size() == 1) {
            final androidx.compose.ui.layout.z0 z0Var = list.get(0);
            if (x.j(z0Var)) {
                iR = androidx.compose.ui.unit.b.r(j10);
                iQ = androidx.compose.ui.unit.b.q(j10);
                i2VarP0 = z0Var.P0(androidx.compose.ui.unit.b.f42658b.c(androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10)));
            } else {
                i2VarP0 = z0Var.P0(jB);
                iR = Math.max(androidx.compose.ui.unit.b.r(j10), i2VarP0.h1());
                iQ = Math.max(androidx.compose.ui.unit.b.q(j10), i2VarP0.c1());
            }
            final int i10 = iR;
            final int i11 = iQ;
            final androidx.compose.ui.layout.i2 i2Var = i2VarP0;
            return androidx.compose.ui.layout.c1.h6(c1Var, i10, i11, null, new Function1() { // from class: androidx.compose.foundation.layout.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0.p(i2Var, z0Var, c1Var, i10, i11, this, (androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
        final androidx.compose.ui.layout.i2[] i2VarArr = new androidx.compose.ui.layout.i2[list.size()];
        final kotlin.jvm.internal.i1.f fVar = new kotlin.jvm.internal.i1.f();
        fVar.f312749a = androidx.compose.ui.unit.b.r(j10);
        final kotlin.jvm.internal.i1.f fVar2 = new kotlin.jvm.internal.i1.f();
        fVar2.f312749a = androidx.compose.ui.unit.b.q(j10);
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size = list2.size();
        boolean z10 = false;
        for (int i12 = 0; i12 < size; i12++) {
            androidx.compose.ui.layout.z0 z0Var2 = list.get(i12);
            if (x.j(z0Var2)) {
                z10 = true;
            } else {
                androidx.compose.ui.layout.i2 i2VarP1 = z0Var2.P0(jB);
                i2VarArr[i12] = i2VarP1;
                fVar.f312749a = Math.max(fVar.f312749a, i2VarP1.h1());
                fVar2.f312749a = Math.max(fVar2.f312749a, i2VarP1.c1());
            }
        }
        if (z10) {
            int i13 = fVar.f312749a;
            int i14 = i13 != Integer.MAX_VALUE ? i13 : 0;
            int i15 = fVar2.f312749a;
            long jA = androidx.compose.ui.unit.c.a(i14, i13, i15 != Integer.MAX_VALUE ? i15 : 0, i15);
            int size2 = list2.size();
            for (int i16 = 0; i16 < size2; i16++) {
                androidx.compose.ui.layout.z0 z0Var3 = list.get(i16);
                if (x.j(z0Var3)) {
                    i2VarArr[i16] = z0Var3.P0(jA);
                }
            }
        }
        return androidx.compose.ui.layout.c1.h6(c1Var, fVar.f312749a, fVar2.f312749a, null, new Function1() { // from class: androidx.compose.foundation.layout.a0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return b0.q(i2VarArr, list, c1Var, fVar, fVar2, this, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b0)) {
            return false;
        }
        b0 b0Var = (b0) obj;
        return Intrinsics.areEqual(this.f15923a, b0Var.f15923a) && this.f15924b == b0Var.f15924b;
    }

    public int hashCode() {
        return (this.f15923a.hashCode() * 31) + Boolean.hashCode(this.f15924b);
    }

    @NotNull
    public final b0 k(@NotNull androidx.compose.ui.e eVar, boolean z10) {
        return new b0(eVar, z10);
    }

    @NotNull
    public String toString() {
        return "BoxMeasurePolicy(alignment=" + this.f15923a + ", propagateMinConstraints=" + this.f15924b + ')';
    }
}
