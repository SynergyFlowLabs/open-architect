package org.apache.commons.collections4.iterators;

import java.util.Iterator;

/* JADX INFO: loaded from: classes14.dex */
public abstract class c<E> extends g<E, E> {
    protected c(Iterator<E> it) {
        super(it);
    }

    @Override // java.util.Iterator
    public E next() {
        return b().next();
    }
}
