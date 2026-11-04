package androidx.compose.foundation.pager;

import androidx.compose.foundation.gestures.q3;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,97:1\n59#2:98\n54#2:100\n90#3:99\n85#3:101\n*S KotlinDebug\n*F\n+ 1 PagerLayoutInfo.kt\nandroidx/compose/foundation/pager/PagerLayoutInfoKt\n*L\n96#1:98\n96#1:100\n96#1:99\n96#1:101\n*E\n"})
public final class i0 {
    public static final int a(@NotNull h0 h0Var) {
        return (int) (h0Var.getOrientation() == q3.Vertical ? h0Var.a() & com.rabbitmq.client.k0.f265952a : h0Var.a() >> 32);
    }
}
