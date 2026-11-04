package rx.internal.util;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: loaded from: classes14.dex */
public class SynchronizedQueue<T> implements Queue<T>, Cloneable {
    private final Queue<T> list;
    private final int size;

    public SynchronizedQueue() {
        this.list = new LinkedList();
        int i10 = 2 & (-1);
        this.size = -1;
    }

    @Override // java.util.Queue, java.util.Collection
    public synchronized boolean add(T t10) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.add(t10);
    }

    @Override // java.util.Collection
    public synchronized boolean addAll(Collection<? extends T> collection) {
        return this.list.addAll(collection);
    }

    @Override // java.util.Collection
    public synchronized void clear() {
        this.list.clear();
    }

    public synchronized Object clone() {
        SynchronizedQueue synchronizedQueue;
        try {
            synchronizedQueue = new SynchronizedQueue(this.size);
            synchronizedQueue.addAll(this.list);
        } catch (Throwable th2) {
            throw th2;
        }
        return synchronizedQueue;
    }

    @Override // java.util.Collection
    public synchronized boolean contains(Object obj) {
        return this.list.contains(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean containsAll(Collection<?> collection) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.containsAll(collection);
    }

    @Override // java.util.Queue
    public synchronized T element() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.element();
    }

    @Override // java.util.Collection
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return this.list.equals(((SynchronizedQueue) obj).list);
        }
        return false;
    }

    @Override // java.util.Collection
    public int hashCode() {
        return this.list.hashCode();
    }

    @Override // java.util.Collection
    public synchronized boolean isEmpty() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.isEmpty();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public synchronized Iterator<T> iterator() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.iterator();
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0023  */
    @Override // java.util.Queue
    public synchronized boolean offer(T t10) {
        boolean z10;
        try {
            if (this.size <= -1 || this.list.size() + 1 <= this.size) {
                z10 = this.list.offer(t10);
            }
        } finally {
        }
        return z10;
    }

    @Override // java.util.Queue
    public synchronized T peek() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.peek();
    }

    @Override // java.util.Queue
    public synchronized T poll() {
        return this.list.poll();
    }

    @Override // java.util.Collection
    public synchronized boolean remove(Object obj) {
        return this.list.remove(obj);
    }

    @Override // java.util.Collection
    public synchronized boolean removeAll(Collection<?> collection) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.removeAll(collection);
    }

    @Override // java.util.Collection
    public synchronized boolean retainAll(Collection<?> collection) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.retainAll(collection);
    }

    @Override // java.util.Collection
    public synchronized int size() {
        return this.list.size();
    }

    @Override // java.util.Collection
    public synchronized Object[] toArray() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.toArray();
    }

    public synchronized String toString() {
        return this.list.toString();
    }

    @Override // java.util.Queue
    public synchronized T remove() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.list.remove();
    }

    @Override // java.util.Collection
    public synchronized <R> R[] toArray(R[] rArr) {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return (R[]) this.list.toArray(rArr);
    }

    public SynchronizedQueue(int i10) {
        this.list = new LinkedList();
        this.size = i10;
    }
}
