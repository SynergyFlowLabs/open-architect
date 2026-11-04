package org.apache.commons.collections4.list;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import org.apache.commons.collections4.iterators.o0;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> extends c<E> implements org.apache.commons.collections4.f<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f335931e = -2218010673611160319L;

    private class a extends org.apache.commons.collections4.iterators.d<E> {
        protected a(ListIterator<E> listIterator) {
            super(listIterator);
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator
        public void add(Object obj) {
            throw new UnsupportedOperationException("List is fixed size");
        }

        @Override // org.apache.commons.collections4.iterators.d, java.util.ListIterator, java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("List is fixed size");
        }
    }

    protected e(List<E> list) {
        super(list);
    }

    public static <E> e<E> k(List<E> list) {
        return new e<>(list);
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean add(E e10) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E get(int i10) {
        return c().get(i10);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public int indexOf(Object obj) {
        return c().indexOf(obj);
    }

    @Override // org.apache.commons.collections4.f
    public boolean isFull() {
        return true;
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, java.lang.Iterable, org.apache.commons.collections4.c
    public Iterator<E> iterator() {
        return o0.b(c().iterator());
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public int lastIndexOf(Object obj) {
        return c().lastIndexOf(obj);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator() {
        return new a(c().listIterator(0));
    }

    @Override // org.apache.commons.collections4.f
    public int o0() {
        return size();
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E remove(int i10) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public E set(int i10, E e10) {
        return c().set(i10, e10);
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public List<E> subList(int i10, int i11) {
        return new e(c().subList(i10, i11));
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public void add(int i10, E e10) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("List is fixed size");
    }

    @Override // org.apache.commons.collections4.list.b, java.util.List
    public ListIterator<E> listIterator(int i10) {
        return new a(c().listIterator(i10));
    }

    @Override // org.apache.commons.collections4.collection.a, java.util.Collection, org.apache.commons.collections4.c
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("List is fixed size");
    }
}
