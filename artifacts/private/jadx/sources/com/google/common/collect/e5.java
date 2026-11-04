package com.google.common.collect;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class e5<E> extends c5<E> implements ListIterator<E> {
    protected e5() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.c5
    /* JADX INFO: renamed from: N0, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator<E> i1();

    @Override // java.util.ListIterator
    public void add(@b9 E element) {
        i1().add(element);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return i1().hasPrevious();
    }

    @Override // java.util.ListIterator
    public int nextIndex() {
        return i1().nextIndex();
    }

    @Override // java.util.ListIterator
    @z7.a
    @b9
    public E previous() {
        return i1().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return i1().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@b9 E element) {
        i1().set(element);
    }
}
