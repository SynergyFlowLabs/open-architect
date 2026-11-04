package org.apache.commons.collections4.queue;

import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public abstract class a<E> extends org.apache.commons.collections4.collection.a<E> implements Queue<E> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f336236c = -2629815475789577029L;

    protected a() {
    }

    @Override // java.util.Queue
    public E element() {
        return c().element();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.a
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Queue<E> c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
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

    protected a(Queue<E> queue) {
        super(queue);
    }
}
