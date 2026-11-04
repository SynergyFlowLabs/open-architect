package androidx.collection;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nObjectList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ObjectList.kt\nandroidx/collection/MutableObjectList\n*L\n1#1,1548:1\n1#2:1549\n919#3,2:1550\n919#3,2:1552\n919#3,2:1554\n919#3,2:1556\n919#3,2:1558\n919#3,2:1560\n*S KotlinDebug\n*F\n+ 1 ObjectList.kt\nandroidx/collection/ObjectListKt\n*L\n1521#1:1550,2\n1528#1:1552,2\n1529#1:1554,2\n1539#1:1556,2\n1540#1:1558,2\n1541#1:1560,2\n*E\n"})
public final class t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final Object[] f12459a = new Object[0];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final s2<Object> f12460b = new g2(0);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(List<?> list, int i10) {
        int size = list.size();
        if (i10 < 0 || i10 >= size) {
            t.f.e("Index " + i10 + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(List<?> list, int i10, int i11) {
        int size = list.size();
        if (i10 > i11) {
            t.f.c("Indices are out of order. fromIndex (" + i10 + ") is greater than toIndex (" + i11 + ").");
        }
        if (i10 < 0) {
            t.f.e("fromIndex (" + i10 + ") is less than 0.");
        }
        if (i11 > size) {
            t.f.e("toIndex (" + i11 + ") is more than than the list size (" + size + ')');
        }
    }

    @NotNull
    public static final <E> s2<E> f() {
        s2<E> s2Var = (s2<E>) f12460b;
        Intrinsics.checkNotNull(s2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return s2Var;
    }

    @NotNull
    public static final <E> g2<E> g() {
        return new g2<>(0, 1, null);
    }

    @NotNull
    public static final <E> g2<E> h(E e10) {
        g2<E> g2Var = new g2<>(1);
        g2Var.a0(e10);
        return g2Var;
    }

    @NotNull
    public static final <E> g2<E> i(E e10, E e11) {
        g2<E> g2Var = new g2<>(2);
        g2Var.a0(e10);
        g2Var.a0(e11);
        return g2Var;
    }

    @NotNull
    public static final <E> g2<E> j(E e10, E e11, E e12) {
        g2<E> g2Var = new g2<>(3);
        g2Var.a0(e10);
        g2Var.a0(e11);
        g2Var.a0(e12);
        return g2Var;
    }

    @NotNull
    public static final <E> g2<E> k(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g2<E> g2Var = new g2<>(elements.length);
        g2Var.B0(elements);
        return g2Var;
    }

    @NotNull
    public static final <E> s2<E> l() {
        s2<E> s2Var = (s2<E>) f12460b;
        Intrinsics.checkNotNull(s2Var, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return s2Var;
    }

    @NotNull
    public static final <E> s2<E> m(E e10) {
        return h(e10);
    }

    @NotNull
    public static final <E> s2<E> n(E e10, E e11) {
        return i(e10, e11);
    }

    @NotNull
    public static final <E> s2<E> o(E e10, E e11, E e12) {
        return j(e10, e11, e12);
    }

    @NotNull
    public static final <E> s2<E> p(@NotNull E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        g2 g2Var = new g2(elements.length);
        g2Var.B0(elements);
        return g2Var;
    }
}
