package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
final class da {
    private da() {
    }

    public static <E> Comparator<? super E> a(SortedSet<E> sortedSet) {
        Comparator<? super E> comparator = sortedSet.comparator();
        return comparator == null ? a9.z() : comparator;
    }

    public static boolean b(Comparator<?> comparator, Iterable<?> elements) {
        Comparator comparator2;
        com.google.common.base.j0.E(comparator);
        com.google.common.base.j0.E(elements);
        if (elements instanceof SortedSet) {
            comparator2 = a((SortedSet) elements);
        } else {
            if (!(elements instanceof ca)) {
                return false;
            }
            comparator2 = ((ca) elements).comparator();
        }
        return comparator.equals(comparator2);
    }
}
