package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nOrderedScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OrderedScatterSet.kt\nandroidx/collection/OrderedScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1511:1\n1#2:1512\n*E\n"})
public final class x2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final i2<Object> f12515a = new i2<>(0);

    @NotNull
    public static final <E> w2<E> a() {
        i2<Object> i2Var = f12515a;
        Intrinsics.checkNotNull(i2Var, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.emptyOrderedScatterSet>");
        return i2Var;
    }

    @NotNull
    public static final <E> i2<E> b() {
        return new i2<>(0, 1, null);
    }

    @NotNull
    public static final <E> i2<E> c(E e10) {
        i2<E> i2Var = new i2<>(1);
        i2Var.q0(e10);
        return i2Var;
    }

    @NotNull
    public static final <E> i2<E> d(E e10, E e11) {
        i2<E> i2Var = new i2<>(2);
        i2Var.q0(e10);
        i2Var.q0(e11);
        return i2Var;
    }

    @NotNull
    public static final <E> i2<E> e(E e10, E e11, E e12) {
        i2<E> i2Var = new i2<>(3);
        i2Var.q0(e10);
        i2Var.q0(e11);
        i2Var.q0(e12);
        return i2Var;
    }

    @NotNull
    public static final <E> i2<E> f(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i2<E> i2Var = new i2<>(elements.length);
        i2Var.s0(elements);
        return i2Var;
    }

    @NotNull
    public static final <E> w2<E> g() {
        i2<Object> i2Var = f12515a;
        Intrinsics.checkNotNull(i2Var, "null cannot be cast to non-null type androidx.collection.OrderedScatterSet<E of androidx.collection.OrderedScatterSetKt.orderedScatterSetOf>");
        return i2Var;
    }

    @NotNull
    public static final <E> w2<E> h(E e10) {
        return c(e10);
    }

    @NotNull
    public static final <E> w2<E> i(E e10, E e11) {
        return d(e10, e11);
    }

    @NotNull
    public static final <E> w2<E> j(E e10, E e11, E e12) {
        return e(e10, e11, e12);
    }

    @NotNull
    public static final <E> w2<E> k(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        i2 i2Var = new i2(elements.length);
        i2Var.s0(elements);
        return i2Var;
    }
}
