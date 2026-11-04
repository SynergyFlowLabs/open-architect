package org.apache.commons.collections4.queue;

import java.util.Queue;
import org.apache.commons.collections4.w0;

/* JADX INFO: loaded from: classes14.dex */
public class e<E> extends org.apache.commons.collections4.collection.f<E> implements Queue<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f336249e = -7901091318986132033L;

    protected e(Queue<E> queue, w0<? super E, ? extends E> w0Var) {
        super(queue, w0Var);
    }

    public static <E> e<E> p(Queue<E> queue, w0<? super E, ? extends E> w0Var) {
        e<E> eVar = new e<>(queue, w0Var);
        if (queue.size() > 0) {
            Object[] array = queue.toArray();
            queue.clear();
            for (Object obj : array) {
                eVar.c().add(w0Var.a(obj));
            }
        }
        return eVar;
    }

    public static <E> e<E> r(Queue<E> queue, w0<? super E, ? extends E> w0Var) {
        return new e<>(queue, w0Var);
    }

    @Override // java.util.Queue
    public E element() {
        return n().element();
    }

    protected Queue<E> n() {
        return (Queue) c();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        return n().offer(i(e10));
    }

    @Override // java.util.Queue
    public E peek() {
        return n().peek();
    }

    @Override // java.util.Queue
    public E poll() {
        return n().poll();
    }

    @Override // java.util.Queue
    public E remove() {
        return n().remove();
    }
}
