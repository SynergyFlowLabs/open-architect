package org.apache.commons.collections4.iterators;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class d0<E> extends c0<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f335784e;

    public d0(E... eArr) {
        super(eArr);
        this.f335784e = -1;
    }

    @Override // java.util.ListIterator
    public void add(E e10) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return this.f335782d > d();
    }

    @Override // org.apache.commons.collections4.iterators.c0, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f335782d;
        this.f335784e = i10;
        E[] eArr = this.f335779a;
        this.f335782d = i10 + 1;
        return eArr[i10];
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335782d - d();
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f335782d - 1;
        this.f335782d = i10;
        this.f335784e = i10;
        return this.f335779a[i10];
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.f335782d - d()) - 1;
    }

    @Override // org.apache.commons.collections4.iterators.c0, org.apache.commons.collections4.p0
    public void reset() {
        super.reset();
        this.f335784e = -1;
    }

    @Override // java.util.ListIterator
    public void set(E e10) {
        int i10 = this.f335784e;
        if (i10 == -1) {
            throw new IllegalStateException("must call next() or previous() before a call to set()");
        }
        this.f335779a[i10] = e10;
    }

    public d0(E[] eArr, int i10) {
        super(eArr, i10);
        this.f335784e = -1;
    }

    public d0(E[] eArr, int i10, int i11) {
        super(eArr, i10, i11);
        this.f335784e = -1;
    }
}
