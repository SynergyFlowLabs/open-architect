package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class k0<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f335826a = true;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f335827b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f335828c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private E f335829d;

    public k0(E e10) {
        this.f335829d = e10;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("add() is not supported by this iterator");
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public boolean hasNext() {
        return this.f335826a && !this.f335828c;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return (this.f335826a || this.f335828c) ? false : true;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public E next() {
        if (!this.f335826a || this.f335828c) {
            throw new NoSuchElementException();
        }
        this.f335826a = false;
        this.f335827b = true;
        return this.f335829d;
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return !this.f335826a ? 1 : 0;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() {
        if (this.f335826a || this.f335828c) {
            throw new NoSuchElementException();
        }
        this.f335826a = true;
        return this.f335829d;
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return this.f335826a ? -1 : 0;
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public void remove() {
        if (!this.f335827b || this.f335828c) {
            throw new IllegalStateException();
        }
        this.f335829d = null;
        this.f335828c = true;
    }

    @Override // org.apache.commons.collections4.p0
    public void reset() {
        this.f335826a = true;
        this.f335827b = false;
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        if (!this.f335827b || this.f335828c) {
            throw new IllegalStateException();
        }
        this.f335829d = e10;
    }
}
