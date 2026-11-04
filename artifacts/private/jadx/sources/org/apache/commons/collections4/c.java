package org.apache.commons.collections4;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes14.dex */
public interface c<E> extends Collection<E> {
    boolean H(E e10, int i10);

    int U0(Object obj);

    @Override // java.util.Collection
    boolean add(E e10);

    @Override // java.util.Collection
    boolean containsAll(Collection<?> collection);

    boolean f0(Object obj, int i10);

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
