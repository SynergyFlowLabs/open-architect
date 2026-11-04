package androidx.compose.ui.node;

import java.util.Map;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNodeCoordinator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinatorKt\n+ 2 ObjectIntMap.kt\nandroidx/collection/ObjectIntMap\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n*L\n1#1,1618:1\n395#2,4:1619\n367#2,6:1623\n377#2,3:1630\n380#2,9:1634\n399#2:1643\n1399#3:1629\n1270#3:1633\n*S KotlinDebug\n*F\n+ 1 NodeCoordinator.kt\nandroidx/compose/ui/node/NodeCoordinatorKt\n*L\n1547#1:1619,4\n1547#1:1623,6\n1547#1:1630,3\n1547#1:1634,9\n1547#1:1643\n1547#1:1629\n1547#1:1633\n*E\n"})
public final class l1 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(androidx.collection.f2<androidx.compose.ui.layout.a> f2Var, Map<androidx.compose.ui.layout.a, Integer> map) {
        if (f2Var == null || f2Var.t() != map.size()) {
            return false;
        }
        Object[] objArr = f2Var.f12437b;
        int[] iArr = f2Var.f12438c;
        long[] jArr = f2Var.f12436a;
        int length = jArr.length - 2;
        if (length < 0) {
            return true;
        }
        int i10 = 0;
        loop0: while (true) {
            long j10 = jArr[i10];
            if ((((~j10) << 7) & j10 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8 - ((~(i10 - length)) >>> 31);
                for (int i12 = 0; i12 < i11; i12++) {
                    if ((255 & j10) < 128) {
                        int i13 = (i10 << 3) + i12;
                        Object obj = objArr[i13];
                        int i14 = iArr[i13];
                        Integer num = map.get((androidx.compose.ui.layout.a) obj);
                        if (num == null || num.intValue() != i14) {
                            break loop0;
                        }
                    }
                    j10 >>= 8;
                }
                if (i11 != 8) {
                    return true;
                }
            }
            if (i10 == length) {
                return true;
            }
            i10++;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.a0.d d(j jVar, int i10, int i11) {
        androidx.compose.ui.a0.d dVarO8 = jVar.w().O8();
        if (dVarO8 == null || (dVarO8.N8() & i10) == 0) {
            return null;
        }
        while (dVarO8 != null) {
            int iT8 = dVarO8.T8();
            if ((iT8 & i11) != 0) {
                return null;
            }
            if ((iT8 & i10) != 0) {
                return dVarO8;
            }
            dVarO8 = dVarO8.O8();
        }
        return null;
    }
}
