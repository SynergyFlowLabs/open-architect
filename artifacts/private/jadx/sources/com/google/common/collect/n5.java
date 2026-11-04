package com.google.common.collect;

import java.util.NoSuchElementException;
import java.util.Queue;

/* JADX INFO: loaded from: classes5.dex */
@a4
@com.google.common.annotations.b
public abstract class n5<E> extends v4<E> implements Queue<E> {
    protected n5() {
    }

    @Override // java.util.Queue
    @b9
    public E element() {
        return i1().element();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.v4
    public abstract Queue<E> L0();

    protected boolean k1(@b9 E e10) {
        try {
            return add(e10);
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    @fj.a
    protected E m1() {
        try {
            return element();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @fj.a
    protected E n1() {
        try {
            return remove();
        } catch (NoSuchElementException unused) {
            return null;
        }
    }

    @z7.a
    public boolean offer(@b9 E o10) {
        return i1().offer(o10);
    }

    @Override // java.util.Queue
    @fj.a
    public E peek() {
        return i1().peek();
    }

    @Override // java.util.Queue
    @z7.a
    @fj.a
    public E poll() {
        return i1().poll();
    }

    @Override // java.util.Queue
    @z7.a
    @b9
    public E remove() {
        return i1().remove();
    }
}
