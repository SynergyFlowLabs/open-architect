package kotlin.collections;

import java.util.Collections;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.builders.SetBuilder;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class SetsKt__SetsJVMKt {
    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> Set<E> build(@NotNull Set<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((SetBuilder) builder).build();
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final <E> Set<E> buildSetInternal(Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = createSetBuilder();
        builderAction.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> Set<E> createSetBuilder() {
        return new SetBuilder();
    }

    @NotNull
    public static <T> Set<T> setOf(T t10) {
        Set<T> setSingleton = Collections.singleton(t10);
        Intrinsics.checkNotNullExpressionValue(setSingleton, "singleton(...)");
        return setSingleton;
    }

    @NotNull
    public static <T> TreeSet<T> sortedSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet());
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final <E> Set<E> buildSetInternal(int i10, Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = createSetBuilder(i10);
        builderAction.invoke(setCreateSetBuilder);
        return build(setCreateSetBuilder);
    }

    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> Set<E> createSetBuilder(int i10) {
        return new SetBuilder(i10);
    }

    @NotNull
    public static final <T> TreeSet<T> sortedSetOf(@NotNull Comparator<? super T> comparator, @NotNull T... elements) {
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (TreeSet) ArraysKt___ArraysKt.toCollection(elements, new TreeSet(comparator));
    }
}
