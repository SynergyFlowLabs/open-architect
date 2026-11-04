package org.apache.commons.collections4.iterators;

import java.util.ListIterator;
import org.apache.commons.collections4.a1;

/* JADX INFO: loaded from: classes14.dex */
public final class p0<E> implements ListIterator<E>, a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListIterator<? extends E> f335842a;

    private p0(ListIterator<? extends E> listIterator) {
        this.f335842a = listIterator;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> ListIterator<E> b(ListIterator<? extends E> listIterator) {
        if (listIterator != 0) {
            return listIterator instanceof a1 ? listIterator : new p0(listIterator);
        }
        throw new NullPointerException("ListIterator must not be null");
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("add() is not supported");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f335842a.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f335842a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.f335842a.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335842a.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.f335842a.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f335842a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("remove() is not supported");
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        throw new UnsupportedOperationException("set() is not supported");
    }
}
