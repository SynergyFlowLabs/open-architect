package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@z7.f("Use Iterators.peekingIterator")
@com.google.common.annotations.b
public interface c9<E> extends Iterator<E> {
    @Override // java.util.Iterator
    @z7.a
    @b9
    E next();

    @b9
    E peek();

    @Override // java.util.Iterator
    void remove();
}
