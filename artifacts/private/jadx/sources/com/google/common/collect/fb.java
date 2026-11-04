package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class fb<F, T> extends eb<F, T> implements ListIterator<T> {
    fb(ListIterator<? extends F> backingIterator) {
        super(backingIterator);
    }

    private ListIterator<? extends F> c() {
        return (ListIterator) this.f117375a;
    }

    @Override // java.util.ListIterator
    public void add(@b9 T element) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return c().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return c().nextIndex();
    }

    @Override // java.util.ListIterator
    @b9
    public final T previous() {
        return b(c().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return c().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@b9 T element) {
        throw new UnsupportedOperationException();
    }
}
