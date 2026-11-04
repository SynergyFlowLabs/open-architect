package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class ob<E> extends nb<E> implements ListIterator<E> {
    protected ob() {
    }

    @Override // java.util.ListIterator
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(@b9 E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void set(@b9 E e10) {
        throw new UnsupportedOperationException();
    }
}
