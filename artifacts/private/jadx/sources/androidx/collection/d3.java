package androidx.collection;

import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScatterSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ScatterSet.kt\nandroidx/collection/ScatterSetKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1210:1\n1#2:1211\n*E\n"})
public final class d3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final l2<Object> f12189a = new l2<>(0);

    @NotNull
    public static final <E> c3<E> a() {
        l2<Object> l2Var = f12189a;
        Intrinsics.checkNotNull(l2Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.emptyScatterSet>");
        return l2Var;
    }

    @NotNull
    public static final <E> l2<E> b() {
        return new l2<>(0, 1, null);
    }

    @NotNull
    public static final <E> l2<E> c(E e10) {
        l2<E> l2Var = new l2<>(1);
        l2Var.d0(e10);
        return l2Var;
    }

    @NotNull
    public static final <E> l2<E> d(E e10, E e11) {
        l2<E> l2Var = new l2<>(2);
        l2Var.d0(e10);
        l2Var.d0(e11);
        return l2Var;
    }

    @NotNull
    public static final <E> l2<E> e(E e10, E e11, E e12) {
        l2<E> l2Var = new l2<>(3);
        l2Var.d0(e10);
        l2Var.d0(e11);
        l2Var.d0(e12);
        return l2Var;
    }

    @NotNull
    public static final <E> l2<E> f(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l2<E> l2Var = new l2<>(elements.length);
        l2Var.f0(elements);
        return l2Var;
    }

    @NotNull
    public static final <E> c3<E> g() {
        l2<Object> l2Var = f12189a;
        Intrinsics.checkNotNull(l2Var, "null cannot be cast to non-null type androidx.collection.ScatterSet<E of androidx.collection.ScatterSetKt.scatterSetOf>");
        return l2Var;
    }

    @NotNull
    public static final <E> c3<E> h(E e10) {
        return c(e10);
    }

    @NotNull
    public static final <E> c3<E> i(E e10, E e11) {
        return d(e10, e11);
    }

    @NotNull
    public static final <E> c3<E> j(E e10, E e11, E e12) {
        return e(e10, e11, e12);
    }

    @NotNull
    public static final <E> c3<E> k(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        l2 l2Var = new l2(elements.length);
        l2Var.f0(elements);
        return l2Var;
    }
}
