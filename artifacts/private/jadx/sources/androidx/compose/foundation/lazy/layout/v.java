package androidx.compose.foundation.lazy.layout;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutBeyondBoundsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,63:1\n35#2,5:64\n*S KotlinDebug\n*F\n+ 1 LazyLayoutBeyondBoundsState.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutBeyondBoundsStateKt\n*L\n51#1:64,5\n*E\n"})
public final class v {
    @NotNull
    public static final List<Integer> a(@NotNull l0 l0Var, @NotNull h1 h1Var, @NotNull q qVar) {
        if (!qVar.d() && h1Var.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        IntRange intRange = qVar.d() ? new IntRange(qVar.c(), Math.min(qVar.b(), l0Var.a() - 1)) : IntRange.f312907e.a();
        int size = h1Var.size();
        for (int i10 = 0; i10 < size; i10++) {
            h1.a aVar = h1Var.get(i10);
            int iA = m0.a(l0Var, aVar.getKey(), aVar.getIndex());
            int iL = intRange.l();
            if ((iA > intRange.m() || iL > iA) && iA >= 0 && iA < l0Var.a()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int iL2 = intRange.l();
        int iM = intRange.m();
        if (iL2 <= iM) {
            while (true) {
                arrayList.add(Integer.valueOf(iL2));
                if (iL2 == iM) {
                    break;
                }
                iL2++;
            }
        }
        return arrayList;
    }
}
