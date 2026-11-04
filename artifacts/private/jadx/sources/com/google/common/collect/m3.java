package com.google.common.collect;

import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public final class m3 {
    private m3() {
    }

    @d6
    public static <T> Collector<T, ?, List<T>> b(int k10, Comparator<? super T> comparator) {
        return e(k10, comparator.reversed());
    }

    public static <T> boolean c(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.j0.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                T next2 = it.next();
                if (comparator.compare(next, next2) > 0) {
                    return false;
                }
                next = next2;
            }
        }
        return true;
    }

    public static <T> boolean d(Iterable<? extends T> iterable, Comparator<T> comparator) {
        com.google.common.base.j0.E(comparator);
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return true;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) >= 0) {
                return false;
            }
            next = next2;
        }
        return true;
    }

    @d6
    public static <T> Collector<T, ?, List<T>> e(final int k10, final Comparator<? super T> comparator) {
        a3.b(k10, "k");
        com.google.common.base.j0.E(comparator);
        return Collector.of(new Supplier() { // from class: com.google.common.collect.i3
            @Override // java.util.function.Supplier
            public final Object get() {
                return db.e(k10, comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.j3
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((db) obj).f(obj2);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.k3
            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ((db) obj).a((db) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.l3
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((db) obj).k();
            }
        }, Collector.Characteristics.UNORDERED);
    }

    public static <T, S extends T> Comparator<Iterable<S>> f(Comparator<T> comparator) {
        return new r7((Comparator) com.google.common.base.j0.E(comparator));
    }

    public static <T extends Comparable<? super T>> T g(T a10, T b10) {
        return a10.compareTo(b10) >= 0 ? a10 : b10;
    }

    @b9
    public static <T> T h(@b9 T a10, @b9 T b10, Comparator<? super T> comparator) {
        return comparator.compare(a10, b10) >= 0 ? a10 : b10;
    }

    public static <T extends Comparable<? super T>> T i(T a10, T b10) {
        return a10.compareTo(b10) <= 0 ? a10 : b10;
    }

    @b9
    public static <T> T j(@b9 T a10, @b9 T b10, Comparator<? super T> comparator) {
        return comparator.compare(a10, b10) <= 0 ? a10 : b10;
    }
}
