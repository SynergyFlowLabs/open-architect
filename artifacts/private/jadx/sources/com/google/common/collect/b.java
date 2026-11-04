package com.google.common.collect;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class b<E> extends ob<E> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f117100a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f117101b;

    protected b(int size) {
        this(size, 0);
    }

    @b9
    protected abstract E b(int index);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f117101b < this.f117100a;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f117101b > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @b9
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f117101b;
        this.f117101b = i10 + 1;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f117101b;
    }

    @Override // java.util.ListIterator
    @b9
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f117101b - 1;
        this.f117101b = i10;
        return b(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f117101b - 1;
    }

    protected b(int size, int position) {
        com.google.common.base.j0.d0(position, size);
        this.f117100a = size;
        this.f117101b = position;
    }
}
