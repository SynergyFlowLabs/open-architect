package org.apache.commons.collections4.queue;

import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public class d<E> extends org.apache.commons.collections4.collection.e<E> implements Queue<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f336248d = 1;

    protected d(Queue<E> queue) {
        super(queue);
    }

    public static <E> d<E> k(Queue<E> queue) {
        return new d<>(queue);
    }

    @Override // java.util.Queue
    public E element() {
        E eElement;
        synchronized (this.f335613b) {
            try {
                eElement = c().element();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return eElement;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public boolean equals(Object obj) {
        boolean zEquals;
        if (obj == this) {
            return true;
        }
        synchronized (this.f335613b) {
            try {
                zEquals = c().equals(obj);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zEquals;
    }

    @Override // org.apache.commons.collections4.collection.e, java.util.Collection
    public int hashCode() {
        int iHashCode;
        synchronized (this.f335613b) {
            iHashCode = c().hashCode();
        }
        return iHashCode;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // org.apache.commons.collections4.collection.e
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public Queue<E> c() {
        return (Queue) super.c();
    }

    @Override // java.util.Queue
    public boolean offer(E e10) {
        boolean zOffer;
        synchronized (this.f335613b) {
            try {
                zOffer = c().offer(e10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return zOffer;
    }

    @Override // java.util.Queue
    public E peek() {
        E ePeek;
        synchronized (this.f335613b) {
            ePeek = c().peek();
        }
        return ePeek;
    }

    @Override // java.util.Queue
    public E poll() {
        E ePoll;
        synchronized (this.f335613b) {
            try {
                ePoll = c().poll();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ePoll;
    }

    @Override // java.util.Queue
    public E remove() {
        E eRemove;
        synchronized (this.f335613b) {
            eRemove = c().remove();
        }
        return eRemove;
    }

    protected d(Queue<E> queue, Object obj) {
        super(queue, obj);
    }
}
