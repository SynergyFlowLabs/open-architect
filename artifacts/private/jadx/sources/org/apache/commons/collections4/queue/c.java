package org.apache.commons.collections4.queue;

import java.util.Queue;
import org.apache.commons.collections4.l0;

/* JADX INFO: loaded from: classes14.dex */
public class c<E> extends org.apache.commons.collections4.collection.d<E> implements Queue<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336247e = 2307609000539943581L;

    protected c(Queue<E> queue, l0<? super E> l0Var) {
        super(queue, l0Var);
    }

    public static <E> c<E> p(Queue<E> queue, l0<? super E> l0Var) {
        return new c<>(queue, l0Var);
    }

    @Override // java.util.Queue
    public E element() {
        return c().element();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Queue<E> c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        m(e10);
        return c().offer(e10);
    }

    @Override // java.util.Queue
    public E peek() {
        return c().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return c().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return c().remove();
    }
}
