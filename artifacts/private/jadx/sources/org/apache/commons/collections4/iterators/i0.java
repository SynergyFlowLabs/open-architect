package org.apache.commons.collections4.iterators;

import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes14.dex */
public class i0<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<E> f335810a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListIterator<E> f335811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335812c = true;

    public i0(List<E> list) {
        if (list == null) {
            throw new NullPointerException("List must not be null.");
        }
        this.f335810a = list;
        this.f335811b = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        if (!this.f335812c) {
            throw new IllegalStateException("Cannot add to list until next() or previous() called");
        }
        this.f335812c = false;
        this.f335811b.add(e10);
        this.f335811b.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f335811b.hasPrevious();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return this.f335811b.hasNext();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        E ePrevious = this.f335811b.previous();
        this.f335812c = true;
        return ePrevious;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335811b.previousIndex();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() {
        E next = this.f335811b.next();
        this.f335812c = true;
        return next;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f335811b.nextIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (!this.f335812c) {
            throw new IllegalStateException("Cannot remove from list until next() or previous() called");
        }
        this.f335811b.remove();
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        List<E> list = this.f335810a;
        this.f335811b = list.listIterator(list.size());
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        if (!this.f335812c) {
            throw new IllegalStateException("Cannot set to list until next() or previous() called");
        }
        this.f335811b.set(e10);
    }
}
