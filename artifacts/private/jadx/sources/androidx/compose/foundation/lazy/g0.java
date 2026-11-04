package androidx.compose.foundation.lazy;

import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyListLayoutInfo.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,95:1\n134#2,2:96\n35#2,5:98\n136#2:103\n*S KotlinDebug\n*F\n+ 1 LazyListLayoutInfo.kt\nandroidx/compose/foundation/lazy/LazyListLayoutInfoKt\n*L\n92#1:96,2\n92#1:98,5\n92#1:103\n*E\n"})
public final class g0 {
    public static final int a(@NotNull f0 f0Var) {
        List<v> listH = f0Var.h();
        int size = listH.size();
        int size2 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            size2 += listH.get(i10).getSize();
        }
        return (size2 / listH.size()) + f0Var.g();
    }
}
