package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;
import kotlin.b1;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.l;
import kotlin.l0;
import kotlin.n;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class CollectionsKt__MutableCollectionsJVMKt extends CollectionsKt__IteratorsKt {
    @e1(version = "1.2")
    @f
    private static final <T> void fill(List<T> list, T t10) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.fill(list, t10);
    }

    @e1(version = "1.2")
    @f
    private static final <T> void shuffle(List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Collections.shuffle(list);
    }

    @l(level = n.ERROR, message = "Use sortWith(comparator) instead.", replaceWith = @b1(expression = "this.sortWith(comparator)", imports = {}))
    @f
    private static final <T> void sort(List<T> list, Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        throw new l0(null, 1, null);
    }

    public static <T> void sortWith(@NotNull List<T> list, @NotNull Comparator<? super T> comparator) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        if (list.size() > 1) {
            Collections.sort(list, comparator);
        }
    }

    @e1(version = "1.2")
    @f
    private static final <T> void shuffle(List<T> list, Random random) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        Collections.shuffle(list, random);
    }

    @l(level = n.ERROR, message = "Use sortWith(Comparator(comparison)) instead.", replaceWith = @b1(expression = "this.sortWith(Comparator(comparison))", imports = {}))
    @f
    private static final <T> void sort(List<T> list, Function2<? super T, ? super T, Integer> comparison) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(comparison, "comparison");
        throw new l0(null, 1, null);
    }

    public static <T extends Comparable<? super T>> void sort(@NotNull List<T> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        if (list.size() > 1) {
            Collections.sort(list);
        }
    }
}
