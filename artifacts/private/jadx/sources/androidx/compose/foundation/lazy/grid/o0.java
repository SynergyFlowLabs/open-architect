package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.gestures.q3;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyGridLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,136:1\n59#2:137\n54#2:139\n59#2:141\n54#2:143\n90#3:138\n85#3:140\n90#3:142\n85#3:144\n*S KotlinDebug\n*F\n+ 1 LazyGridLayoutInfo.kt\nandroidx/compose/foundation/lazy/grid/LazyGridLayoutInfoKt\n*L\n117#1:137\n119#1:139\n135#1:141\n135#1:143\n117#1:138\n119#1:140\n135#1:142\n135#1:144\n*E\n"})
public final class o0 {
    public static final int a(@NotNull n0 n0Var) {
        return (int) (n0Var.getOrientation() == q3.Vertical ? n0Var.a() & com.rabbitmq.client.k0.f265952a : n0Var.a() >> 32);
    }

    public static final int b(@NotNull n0 n0Var) {
        boolean z10 = n0Var.getOrientation() == q3.Vertical;
        List<x> listH = n0Var.h();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i10 < listH.size()) {
            int iC = c(z10, n0Var, i10);
            if (iC == -1) {
                i10++;
            } else {
                int iMax = 0;
                while (i10 < listH.size() && c(z10, n0Var, i10) == iC) {
                    iMax = Math.max(iMax, (int) (z10 ? listH.get(i10).a() & com.rabbitmq.client.k0.f265952a : listH.get(i10).a() >> 32));
                    i10++;
                }
                i11 += iMax;
                i12++;
            }
        }
        return (i11 / i12) + n0Var.g();
    }

    private static final int c(boolean z10, n0 n0Var, int i10) {
        return z10 ? n0Var.h().get(i10).l() : n0Var.h().get(i10).f();
    }
}
