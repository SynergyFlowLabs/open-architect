package kotlin.collections;

import com.rabbitmq.tools.jsonrpc.j;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.b;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.m2;
import kotlin.s;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
public class SetsKt__SetsKt extends SetsKt__SetsJVMKt {
    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @f
    private static final <E> Set<E> buildSet(@b Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder();
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    @NotNull
    public static <T> Set<T> emptySet() {
        return EmptySet.INSTANCE;
    }

    @e1(version = j.f266120g)
    @f
    private static final <T> HashSet<T> hashSetOf() {
        return new HashSet<>();
    }

    @e1(version = j.f266120g)
    @f
    private static final <T> LinkedHashSet<T> linkedSetOf() {
        return new LinkedHashSet<>();
    }

    @e1(version = j.f266120g)
    @f
    private static final <T> Set<T> mutableSetOf() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final <T> Set<T> optimizeReadOnlySet(@NotNull Set<? extends T> set) {
        Intrinsics.checkNotNullParameter(set, "<this>");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : SetsKt__SetsJVMKt.setOf(set.iterator().next());
        }
        return emptySet();
    }

    @f
    private static final <T> Set<T> orEmpty(Set<? extends T> set) {
        if (set == null) {
            set = (Set<T>) emptySet();
        }
        return (Set<T>) set;
    }

    @NotNull
    public static <T> Set<T> setOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return ArraysKt___ArraysKt.toSet(elements);
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@Nullable T t10) {
        return t10 != null ? SetsKt__SetsJVMKt.setOf(t10) : emptySet();
    }

    @m2(markerClass = {s.class})
    @e1(version = "1.6")
    @f
    private static final <E> Set<E> buildSet(int i10, @b Function1<? super Set<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        Set setCreateSetBuilder = SetsKt__SetsJVMKt.createSetBuilder(i10);
        builderAction.invoke(setCreateSetBuilder);
        return SetsKt__SetsJVMKt.build(setCreateSetBuilder);
    }

    @NotNull
    public static <T> HashSet<T> hashSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (HashSet) ArraysKt___ArraysKt.toCollection(elements, new HashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @NotNull
    public static final <T> LinkedHashSet<T> linkedSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (LinkedHashSet) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @NotNull
    public static <T> Set<T> mutableSetOf(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.toCollection(elements, new LinkedHashSet(MapsKt__MapsJVMKt.mapCapacity(elements.length)));
    }

    @f
    private static final <T> Set<T> setOf() {
        return emptySet();
    }

    @e1(version = "1.4")
    @NotNull
    public static final <T> Set<T> setOfNotNull(@NotNull T... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return (Set) ArraysKt___ArraysKt.filterNotNullTo(elements, new LinkedHashSet());
    }
}
