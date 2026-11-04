package androidx.compose.foundation.text.selection;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTextSelectionDelegate.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,69:1\n54#2:70\n59#2:72\n85#3:71\n90#3:73\n53#3,3:75\n30#4:74\n*S KotlinDebug\n*F\n+ 1 TextSelectionDelegate.kt\nandroidx/compose/foundation/text/selection/TextSelectionDelegateKt\n*L\n47#1:70\n49#1:72\n47#1:71\n49#1:73\n50#1:75,3\n50#1:74\n*E\n"})
public final class z4 {
    public static final float a(@NotNull androidx.compose.ui.text.p3 p3Var, int i10, boolean z10, boolean z11) {
        return p3Var.j(i10, p3Var.c(((!z10 || z11) && (z10 || !z11)) ? Math.max(i10 + (-1), 0) : i10) == p3Var.z(i10));
    }

    public static final long b(@NotNull androidx.compose.ui.text.p3 p3Var, int i10, boolean z10, boolean z11) {
        int iR = p3Var.r(i10);
        if (iR >= p3Var.o()) {
            return n0.g.f332700b.c();
        }
        return n0.g.g((((long) Float.floatToRawIntBits(kotlin.ranges.r.H(a(p3Var, i10, z10, z11), 0.0f, (int) (p3Var.C() >> 32)))) << 32) | (((long) Float.floatToRawIntBits(kotlin.ranges.r.H(p3Var.n(iR), 0.0f, (int) (p3Var.C() & com.rabbitmq.client.k0.f265952a)))) & com.rabbitmq.client.k0.f265952a));
    }
}
