package androidx.compose.foundation.lazy.layout;

import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyLayoutMeasuredItem.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n35#2,5:93\n1#3:98\n*S KotlinDebug\n*F\n+ 1 LazyLayoutMeasuredItem.kt\nandroidx/compose/foundation/lazy/layout/LazyLayoutMeasuredItemKt\n*L\n78#1:93,5\n*E\n"})
public final class a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Comparator<y0> f17311a = new Comparator() { // from class: androidx.compose.foundation.lazy.layout.z0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return a1.b((y0) obj, (y0) obj2);
        }
    };

    /* JADX INFO: Access modifiers changed from: private */
    public static final int b(y0 y0Var, y0 y0Var2) {
        return Intrinsics.compare(y0Var.getIndex(), y0Var2.getIndex());
    }

    private static final int c(y0 y0Var) {
        long jO = y0Var.o(0);
        return y0Var.j() ? androidx.compose.ui.unit.q.p(jO) : androidx.compose.ui.unit.q.n(jO);
    }

    @NotNull
    public static final <T extends y0> List<T> d(int i10, int i11, @NotNull List<? extends T> list, @NotNull List<? extends T> list2) {
        if (list.isEmpty()) {
            return CollectionsKt.emptyList();
        }
        List<T> mutableList = CollectionsKt.toMutableList((Collection) list2);
        int size = list.size();
        for (int i12 = 0; i12 < size; i12++) {
            T t10 = list.get(i12);
            int index = t10.getIndex();
            if (i10 <= index && index <= i11) {
                mutableList.add(t10);
            }
        }
        CollectionsKt.sortWith(mutableList, f17311a);
        return mutableList;
    }
}
