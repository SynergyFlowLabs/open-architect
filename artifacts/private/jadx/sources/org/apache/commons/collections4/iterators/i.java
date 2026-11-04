package org.apache.commons.collections4.iterators;

import java.lang.reflect.Array;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes14.dex */
public class i<E> extends h<E> implements org.apache.commons.collections4.q0<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f335809e;

    public i(Object obj) {
        super(obj);
        this.f335809e = -1;
    }

    @Override // java.util.ListIterator
    public void add(Object obj) {
        throw new UnsupportedOperationException("add() method is not supported");
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public boolean hasPrevious() {
        return this.f335806d > this.f335804b;
    }

    @Override // org.apache.commons.collections4.iterators.h, java.util.Iterator
    public E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f335806d;
        this.f335809e = i10;
        Object obj = this.f335803a;
        this.f335806d = i10 + 1;
        return (E) Array.get(obj, i10);
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return this.f335806d - this.f335804b;
    }

    @Override // java.util.ListIterator, org.apache.commons.collections4.i0
    public E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f335806d - 1;
        this.f335806d = i10;
        this.f335809e = i10;
        return (E) Array.get(this.f335803a, i10);
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return (this.f335806d - this.f335804b) - 1;
    }

    @Override // org.apache.commons.collections4.iterators.h, org.apache.commons.collections4.p0
    public void reset() {
        super.reset();
        this.f335809e = -1;
    }

    @Override // java.util.ListIterator
    public void set(Object obj) {
        int i10 = this.f335809e;
        if (i10 == -1) {
            throw new IllegalStateException("must call next() or previous() before a call to set()");
        }
        Array.set(this.f335803a, i10, obj);
    }

    public i(Object obj, int i10) {
        super(obj, i10);
        this.f335809e = -1;
    }

    public i(Object obj, int i10, int i11) {
        super(obj, i10, i11);
        this.f335809e = -1;
    }
}
