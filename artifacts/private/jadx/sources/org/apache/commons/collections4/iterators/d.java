package org.apache.commons.collections4.iterators;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> implements ListIterator<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ListIterator<E> f335783a;

    public d(ListIterator<E> listIterator) {
        if (listIterator == null) {
            throw new NullPointerException("ListIterator must not be null");
        }
        this.f335783a = listIterator;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        this.f335783a.add(e10);
    }

    protected ListIterator<E> b() {
        return this.f335783a;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f335783a.hasNext();
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return this.f335783a.hasPrevious();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        return this.f335783a.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335783a.nextIndex();
    }

    @Override // java.util.ListIterator
    public E previous() {
        return this.f335783a.previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f335783a.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f335783a.remove();
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        this.f335783a.set(e10);
    }
}
