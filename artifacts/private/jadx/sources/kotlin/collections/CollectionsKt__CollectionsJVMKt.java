package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.a1;
import kotlin.collections.builders.ListBuilder;
import kotlin.e1;
import kotlin.internal.f;
import kotlin.internal.m;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.v;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nCollectionsJVM.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CollectionsJVM.kt\nkotlin/collections/CollectionsKt__CollectionsJVMKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,131:1\n1#2:132\n*E\n"})
public class CollectionsKt__CollectionsJVMKt {
    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> List<E> build(@NotNull List<E> builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        return ((ListBuilder) builder).build();
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final <E> List<E> buildListInternal(Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder();
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final int checkCountOverflow(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        if (!m.a(1, 3, 0)) {
            throw new ArithmeticException("Count overflow has happened.");
        }
        CollectionsKt__CollectionsKt.throwCountOverflow();
        return i10;
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final int checkIndexOverflow(int i10) {
        if (i10 >= 0) {
            return i10;
        }
        if (!m.a(1, 3, 0)) {
            throw new ArithmeticException("Index overflow has happened.");
        }
        CollectionsKt__CollectionsKt.throwIndexOverflow();
        return i10;
    }

    @f
    private static final Object[] collectionToArray(Collection<?> collection) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        return v.a(collection);
    }

    @NotNull
    public static final <T> Object[] copyToArrayOfAny(@NotNull T[] tArr, boolean z10) {
        Intrinsics.checkNotNullParameter(tArr, "<this>");
        if (z10 && Intrinsics.areEqual(tArr.getClass(), Object[].class)) {
            return tArr;
        }
        Object[] objArrCopyOf = Arrays.copyOf(tArr, tArr.length, Object[].class);
        Intrinsics.checkNotNullExpressionValue(objArrCopyOf, "copyOf(...)");
        return objArrCopyOf;
    }

    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> List<E> createListBuilder() {
        return new ListBuilder(0, 1, null);
    }

    @NotNull
    public static <T> List<T> listOf(T t10) {
        List<T> listSingletonList = Collections.singletonList(t10);
        Intrinsics.checkNotNullExpressionValue(listSingletonList, "singletonList(...)");
        return listSingletonList;
    }

    @e1(version = "1.2")
    @NotNull
    public static <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList);
        return mutableList;
    }

    @NotNull
    public static <T> T[] terminateCollectionToArray(int i10, @NotNull T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        if (i10 < array.length) {
            array[i10] = null;
        }
        return array;
    }

    @f
    private static final <T> List<T> toList(Enumeration<T> enumeration) {
        Intrinsics.checkNotNullParameter(enumeration, "<this>");
        ArrayList list = Collections.list(enumeration);
        Intrinsics.checkNotNullExpressionValue(list, "list(...)");
        return list;
    }

    @a1
    @e1(version = "1.3")
    @f
    private static final <E> List<E> buildListInternal(int i10, Function1<? super List<E>, Unit> builderAction) {
        Intrinsics.checkNotNullParameter(builderAction, "builderAction");
        List listCreateListBuilder = createListBuilder(i10);
        builderAction.invoke(listCreateListBuilder);
        return build(listCreateListBuilder);
    }

    @f
    private static final <T> T[] collectionToArray(Collection<?> collection, T[] array) {
        Intrinsics.checkNotNullParameter(collection, "collection");
        Intrinsics.checkNotNullParameter(array, "array");
        return (T[]) v.b(collection, array);
    }

    @a1
    @e1(version = "1.3")
    @NotNull
    public static <E> List<E> createListBuilder(int i10) {
        return new ListBuilder(i10);
    }

    @e1(version = "1.2")
    @NotNull
    public static <T> List<T> shuffled(@NotNull Iterable<? extends T> iterable, @NotNull Random random) {
        Intrinsics.checkNotNullParameter(iterable, "<this>");
        Intrinsics.checkNotNullParameter(random, "random");
        List<T> mutableList = CollectionsKt___CollectionsKt.toMutableList(iterable);
        Collections.shuffle(mutableList, random);
        return mutableList;
    }
}
