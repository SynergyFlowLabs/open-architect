package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
abstract class eb<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final Iterator<? extends F> f117375a;

    eb(Iterator<? extends F> backingIterator) {
        this.f117375a = (Iterator) com.google.common.base.j0.E(backingIterator);
    }

    @b9
    abstract T b(@b9 F from);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f117375a.hasNext();
    }

    @Override // java.util.Iterator
    @b9
    public final T next() {
        return b(this.f117375a.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f117375a.remove();
    }
}
