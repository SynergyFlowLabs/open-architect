package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface e0<E> extends Collection<E> {

    public interface a<E> {
        E X0();

        boolean equals(Object obj);

        int getCount();

        int hashCode();
    }

    int H(E e10, int i10);

    int U0(Object obj);

    @Override // java.util.Collection
    boolean add(E e10);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    Set<a<E>> entrySet();

    @Override // java.util.Collection
    boolean equals(Object obj);

    int f0(Object obj, int i10);

    int g1(E e10, int i10);

    @Override // java.util.Collection
    int hashCode();

    @Override // java.util.Collection, java.lang.Iterable
    Iterator<E> iterator();

    Set<E> r0();

    @Override // java.util.Collection
    boolean remove(Object obj);

    @Override // java.util.Collection
    boolean removeAll(Collection<?> collection);

    @Override // java.util.Collection
    boolean retainAll(Collection<?> collection);

    @Override // java.util.Collection
    int size();
}
