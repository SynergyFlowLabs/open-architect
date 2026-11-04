package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.a1;
import org.apache.commons.collections4.iterators.o0;
import org.apache.commons.collections4.iterators.p0;

/* JADX INFO: loaded from: classes14.dex */
public final class m<E> extends c<E> implements a1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335966e = 6595182819922443652L;

    public m(List<? extends E> list) {
        super(list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> List<E> k(List<? extends E> list) {
        return list instanceof a1 ? list : new m(list);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator() {
        return p0.b(c().listIterator());
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public List<E> subList(int i10, int i11) {
        return new m(c().subList(i10, i11));
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return p0.b(c().listIterator(i10));
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException();
    }
}
