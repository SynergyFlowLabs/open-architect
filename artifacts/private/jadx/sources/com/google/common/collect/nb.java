package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class nb<E> implements Iterator<E> {
    protected nb() {
    }

    @Override // java.util.Iterator
    @z7.e("Always throws UnsupportedOperationException")
    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
