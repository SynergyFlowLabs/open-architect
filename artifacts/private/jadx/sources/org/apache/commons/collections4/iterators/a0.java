package org.apache.commons.collections4.iterators;

import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class a0<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<E> f335775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListIterator<E> f335776b;

    public a0(List<E> list) {
        if (list == null) {
            throw new NullPointerException("The list must not be null");
        }
        this.f335775a = list;
        b();
    }

    private void b() {
        this.f335776b = this.f335775a.listIterator();
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        this.f335776b.add(e10);
    }

    public int c() {
        return this.f335775a.size();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return !this.f335775a.isEmpty();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return !this.f335775a.isEmpty();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (this.f335775a.isEmpty()) {
            throw new NoSuchElementException("There are no elements for this iterator to loop on");
        }
        if (!this.f335776b.hasNext()) {
            reset();
        }
        return this.f335776b.next();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        if (this.f335775a.isEmpty()) {
            throw new NoSuchElementException("There are no elements for this iterator to loop on");
        }
        if (this.f335776b.hasNext()) {
            return this.f335776b.nextIndex();
        }
        return 0;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() {
        if (this.f335775a.isEmpty()) {
            throw new NoSuchElementException("There are no elements for this iterator to loop on");
        }
        if (this.f335776b.hasPrevious()) {
            return this.f335776b.previous();
        }
        E next = null;
        int i10 = 3 ^ 0;
        while (this.f335776b.hasNext()) {
            next = this.f335776b.next();
        }
        this.f335776b.previous();
        return next;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        if (this.f335775a.isEmpty()) {
            throw new NoSuchElementException("There are no elements for this iterator to loop on");
        }
        return !this.f335776b.hasPrevious() ? this.f335775a.size() - 1 : this.f335776b.previousIndex();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        this.f335776b.remove();
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        b();
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        this.f335776b.set(e10);
    }
}
