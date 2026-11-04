package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public interface q8<E> extends Collection<E> {

    public interface a<E> {
        @b9
        E X0();

        boolean equals(@fj.a Object o10);

        int getCount();

        int hashCode();

        String toString();
    }

    @z7.a
    int H(@b9 E element, int occurrences);

    int P3(@fj.a @z7.c(androidx.exifinterface.media.a.T4) Object element);

    @z7.a
    boolean Q2(@b9 E element, int oldCount, int newCount);

    @z7.a
    boolean add(@b9 E element);

    boolean contains(@fj.a Object element);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> elements);

    Set<a<E>> entrySet();

    boolean equals(@fj.a Object object);

    @z7.a
    int f0(@fj.a @z7.c(androidx.exifinterface.media.a.T4) Object element, int occurrences);

    @z7.a
    int g1(@b9 E element, int count);

    int hashCode();

    Iterator<E> iterator();

    Set<E> o();

    @z7.a
    boolean remove(@fj.a Object element);

    @z7.a
    boolean removeAll(Collection<?> c10);

    @z7.a
    boolean retainAll(Collection<?> c10);

    int size();

    String toString();
}
