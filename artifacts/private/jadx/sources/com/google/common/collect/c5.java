package com.google.common.collect;

import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class c5<T> extends m5 implements Iterator<T> {
    protected c5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.m5
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public abstract Iterator<T> i1();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return i1().hasNext();
    }

    @Override // java.util.Iterator
    @z7.a
    @b9
    public T next() {
        return i1().next();
    }

    @Override // java.util.Iterator
    public void remove() {
        i1().remove();
    }
}
