package androidx.compose.material3;

import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nChip.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipLayoutMeasurePolicy\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,2969:1\n117#2,2:2970\n34#2,6:2972\n119#2:2978\n117#2,2:2979\n34#2,6:2981\n119#2:2987\n563#2,2:2988\n34#2,6:2990\n565#2:2996\n320#2,8:2997\n320#2,8:3005\n133#2,3:3013\n34#2,6:3016\n136#2:3022\n133#2,3:3023\n34#2,6:3026\n136#2:3032\n*S KotlinDebug\n*F\n+ 1 Chip.kt\nandroidx/compose/material3/ChipLayoutMeasurePolicy\n*L\n2264#1:2970,2\n2264#1:2972,6\n2264#1:2978\n2271#1:2979,2\n2271#1:2981,6\n2271#1:2987\n2278#1:2988,2\n2278#1:2990,6\n2278#1:2996\n2300#1:2997,8\n2305#1:3005,8\n2310#1:3013,3\n2310#1:3016,6\n2310#1:3022\n2315#1:3023,3\n2315#1:3026,6\n2315#1:3032\n*E\n"})
final class z5 implements androidx.compose.ui.layout.a1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.layout.i2 i2Var, int i10, int i11, androidx.compose.ui.layout.i2 i2Var2, int i12, androidx.compose.ui.layout.i2 i2Var3, int i13, androidx.compose.ui.layout.i2.a aVar) {
        if (i2Var != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var, 0, androidx.compose.ui.e.f37317a.q().a(i10, i11), 0.0f, 4, null);
        }
        androidx.compose.ui.layout.i2.a.e0(aVar, i2Var2, i12, 0, 0.0f, 4, null);
        if (i2Var3 != null) {
            androidx.compose.ui.layout.i2.a.e0(aVar, i2Var3, i12 + i2Var2.h1(), androidx.compose.ui.e.f37317a.q().a(i13, i11), 0.0f, 4, null);
        }
        return Unit.f312394a;
    }

    @Override // androidx.compose.ui.layout.a1
    @NotNull
    public androidx.compose.ui.layout.b1 a(@NotNull androidx.compose.ui.layout.c1 c1Var, @NotNull List<? extends androidx.compose.ui.layout.z0> list, long j10) {
        androidx.compose.ui.layout.z0 z0Var;
        androidx.compose.ui.layout.z0 z0Var2;
        List<? extends androidx.compose.ui.layout.z0> list2 = list;
        int size = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size) {
                z0Var = null;
                break;
            }
            z0Var = list.get(i10);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var), "leadingIcon")) {
                break;
            }
            i10++;
        }
        androidx.compose.ui.layout.z0 z0Var3 = z0Var;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var3 != null ? z0Var3.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null)) : null;
        final int iC = androidx.compose.material3.internal.u2.c(i2VarP0);
        final int iA = androidx.compose.material3.internal.u2.a(i2VarP0);
        int size2 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size2) {
                z0Var2 = null;
                break;
            }
            z0Var2 = list.get(i11);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var2), "trailingIcon")) {
                break;
            }
            i11++;
        }
        androidx.compose.ui.layout.z0 z0Var4 = z0Var2;
        androidx.compose.ui.layout.i2 i2VarP1 = z0Var4 != null ? z0Var4.P0(androidx.compose.ui.unit.b.d(j10, 0, 0, 0, 0, 10, null)) : null;
        int iC2 = androidx.compose.material3.internal.u2.c(i2VarP1);
        final int iA2 = androidx.compose.material3.internal.u2.a(i2VarP1);
        int size3 = list2.size();
        for (int i12 = 0; i12 < size3; i12++) {
            androidx.compose.ui.layout.z0 z0Var5 = list.get(i12);
            if (Intrinsics.areEqual(androidx.compose.ui.layout.i0.a(z0Var5), com.google.firebase.messaging.e.f.f123534d)) {
                final androidx.compose.ui.layout.i2 i2VarP2 = z0Var5.P0(androidx.compose.ui.unit.c.r(j10, -(iC + iC2), 0, 2, null));
                int iH1 = i2VarP2.h1() + iC + iC2;
                final int iMax = Math.max(iA, Math.max(i2VarP2.c1(), iA2));
                final androidx.compose.ui.layout.i2 i2Var = i2VarP1;
                return androidx.compose.ui.layout.c1.h6(c1Var, iH1, iMax, null, new Function1() { // from class: androidx.compose.material3.y5
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return z5.g(i2VarP0, iA, iMax, i2VarP2, iC, i2Var, iA2, (androidx.compose.ui.layout.i2.a) obj);
                    }
                }, 4, null);
            }
        }
        androidx.compose.ui.util.d.G("Collection contains no element matching the predicate.");
        throw new kotlin.a0();
    }

    @Override // androidx.compose.ui.layout.a1
    public int b(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).D0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).D0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int c(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        int size = list.size();
        int iL0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iL0 += list.get(i11).L0(i10);
        }
        return iL0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int d(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        Integer numValueOf;
        if (!list.isEmpty()) {
            numValueOf = Integer.valueOf(list.get(0).p0(i10));
            int lastIndex = CollectionsKt.getLastIndex(list);
            int i11 = 1;
            if (1 <= lastIndex) {
                while (true) {
                    Integer numValueOf2 = Integer.valueOf(list.get(i11).p0(i10));
                    if (numValueOf2.compareTo(numValueOf) > 0) {
                        numValueOf = numValueOf2;
                    }
                    if (i11 == lastIndex) {
                        break;
                    }
                    i11++;
                }
            }
        } else {
            numValueOf = null;
        }
        if (numValueOf != null) {
            return numValueOf.intValue();
        }
        return 0;
    }

    @Override // androidx.compose.ui.layout.a1
    public int e(@NotNull androidx.compose.ui.layout.z zVar, @NotNull List<? extends androidx.compose.ui.layout.y> list, int i10) {
        int size = list.size();
        int iM0 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            iM0 += list.get(i11).M0(i10);
        }
        return iM0;
    }
}
